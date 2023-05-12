package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsInfoCircleFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/InfoCircleFilledSmall", JSImport.Default)
  @js.native
  val default: FC[InfoCircleFilledSmallProps] = js.native
  
  trait InfoCircleFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InfoCircleFilledSmallProps {
    
    inline def apply(): InfoCircleFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCircleFilledSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoCircleFilledSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InfoCircleFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsInfoCircleFilledSmallMod.foo` */
  override def _to: FC[InfoCircleFilledSmallProps] = default
}
