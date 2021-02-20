package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Git extends StObject {
  
  var git: scala.Double = js.native
  
  var tfvc: scala.Double = js.native
}
object Git {
  
  @scala.inline
  def apply(git: scala.Double, tfvc: scala.Double): Git = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Git]
  }
  
  @scala.inline
  implicit class GitMutableBuilder[Self <: Git] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGit(value: scala.Double): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc(value: scala.Double): Self = StObject.set(x, "tfvc", value.asInstanceOf[js.Any])
  }
}
