package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeMenuButtonProps extends StObject {
  
  /**
    * The direction where Volume Bar popup, default: `false`
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object VolumeMenuButtonProps {
  
  inline def apply(): VolumeMenuButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeMenuButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeMenuButtonProps] (val x: Self) extends AnyVal {
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
