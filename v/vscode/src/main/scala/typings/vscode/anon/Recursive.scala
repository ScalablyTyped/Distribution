package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recursive extends StObject {
  
  var recursive: Boolean = js.native
}
object Recursive {
  
  @scala.inline
  def apply(recursive: Boolean): Recursive = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recursive]
  }
  
  @scala.inline
  implicit class RecursiveMutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
