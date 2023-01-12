package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Git extends StObject {
  
  var git: scala.Double
  
  var tfvc: scala.Double
}
object Git {
  
  inline def apply(git: scala.Double, tfvc: scala.Double): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Git] (val x: Self) extends AnyVal {
    
    inline def setGit(value: scala.Double): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setTfvc(value: scala.Double): Self = StObject.set(x, "tfvc", value.asInstanceOf[js.Any])
  }
}
