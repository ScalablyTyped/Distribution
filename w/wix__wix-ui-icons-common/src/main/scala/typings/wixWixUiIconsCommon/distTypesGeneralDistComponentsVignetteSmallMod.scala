package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsVignetteSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/VignetteSmall", JSImport.Default)
  @js.native
  val default: FC[VignetteSmallProps] = js.native
  
  trait VignetteSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VignetteSmallProps {
    
    inline def apply(): VignetteSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VignetteSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VignetteSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VignetteSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsVignetteSmallMod.foo` */
  override def _to: FC[VignetteSmallProps] = default
}
