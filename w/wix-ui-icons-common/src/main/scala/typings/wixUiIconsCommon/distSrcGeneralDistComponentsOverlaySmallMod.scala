package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsOverlaySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/OverlaySmall", JSImport.Default)
  @js.native
  val default: FC[OverlaySmallProps] = js.native
  
  trait OverlaySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object OverlaySmallProps {
    
    inline def apply(): OverlaySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlaySmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlaySmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[OverlaySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsOverlaySmallMod.foo` */
  override def _to: FC[OverlaySmallProps] = default
}
