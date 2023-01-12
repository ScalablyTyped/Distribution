package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsVideoCameraSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/VideoCameraSmall", JSImport.Default)
  @js.native
  val default: FC[VideoCameraSmallProps] = js.native
  
  trait VideoCameraSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VideoCameraSmallProps {
    
    inline def apply(): VideoCameraSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoCameraSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoCameraSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VideoCameraSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsVideoCameraSmallMod.foo` */
  override def _to: FC[VideoCameraSmallProps] = default
}
