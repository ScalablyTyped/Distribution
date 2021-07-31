package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludes extends StObject {
  
  var excludes: js.Array[String]
  
  var recursive: Boolean
}
object Excludes {
  
  @scala.inline
  def apply(excludes: js.Array[String], recursive: Boolean): Excludes = {
    val __obj = js.Dynamic.literal(excludes = excludes.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludes]
  }
  
  @scala.inline
  implicit class ExcludesMutableBuilder[Self <: Excludes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
