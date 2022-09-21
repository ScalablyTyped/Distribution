package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonGroupSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RadioButtonGroupSmall", JSImport.Default)
  @js.native
  val default: FC[RadioButtonGroupSmallProps] = js.native
  
  trait RadioButtonGroupSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonGroupSmallProps {
    
    inline def apply(): RadioButtonGroupSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonGroupSmallProps]
    }
    
    extension [Self <: RadioButtonGroupSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RadioButtonGroupSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `radioButtonGroupSmallMod.foo` */
  override def _to: FC[RadioButtonGroupSmallProps] = default
}
