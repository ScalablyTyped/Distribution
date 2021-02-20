package typings.w3cScreenOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Screen extends StObject {
  
  val orientation: ScreenOrientation = js.native
}
object Screen {
  
  @scala.inline
  def apply(orientation: ScreenOrientation): Screen = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  
  @scala.inline
  implicit class ScreenMutableBuilder[Self <: Screen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrientation(value: ScreenOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
