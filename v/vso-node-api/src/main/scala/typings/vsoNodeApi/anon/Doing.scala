package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doing extends StObject {
  
  var doing: scala.Double = js.native
  
  var done: scala.Double = js.native
  
  var followed: scala.Double = js.native
}
object Doing {
  
  @scala.inline
  def apply(doing: scala.Double, done: scala.Double, followed: scala.Double): Doing = {
    val __obj = js.Dynamic.literal(doing = doing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], followed = followed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doing]
  }
  
  @scala.inline
  implicit class DoingMutableBuilder[Self <: Doing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoing(value: scala.Double): Self = StObject.set(x, "doing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: scala.Double): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowed(value: scala.Double): Self = StObject.set(x, "followed", value.asInstanceOf[js.Any])
  }
}
