package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsVideoCameraDisabledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/VideoCameraDisabledSmall", JSImport.Default)
  @js.native
  val default: FC[VideoCameraDisabledSmallProps] = js.native
  
  trait VideoCameraDisabledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VideoCameraDisabledSmallProps {
    
    inline def apply(): VideoCameraDisabledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoCameraDisabledSmallProps]
    }
    
    extension [Self <: VideoCameraDisabledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VideoCameraDisabledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsVideoCameraDisabledSmallMod.foo` */
  override def _to: FC[VideoCameraDisabledSmallProps] = default
}
