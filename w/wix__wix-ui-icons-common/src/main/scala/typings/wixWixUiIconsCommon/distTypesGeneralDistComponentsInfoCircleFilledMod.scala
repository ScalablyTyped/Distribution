package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsInfoCircleFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/InfoCircleFilled", JSImport.Default)
  @js.native
  val default: FC[InfoCircleFilledProps] = js.native
  
  trait InfoCircleFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InfoCircleFilledProps {
    
    inline def apply(): InfoCircleFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoCircleFilledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfoCircleFilledProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InfoCircleFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsInfoCircleFilledMod.foo` */
  override def _to: FC[InfoCircleFilledProps] = default
}
