package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsVideoCameraDisabledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VideoCameraDisabled", JSImport.Default)
  @js.native
  val default: FC[VideoCameraDisabledProps] = js.native
  
  trait VideoCameraDisabledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VideoCameraDisabledProps {
    
    inline def apply(): VideoCameraDisabledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoCameraDisabledProps]
    }
    
    extension [Self <: VideoCameraDisabledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VideoCameraDisabledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsVideoCameraDisabledMod.foo` */
  override def _to: FC[VideoCameraDisabledProps] = default
}
