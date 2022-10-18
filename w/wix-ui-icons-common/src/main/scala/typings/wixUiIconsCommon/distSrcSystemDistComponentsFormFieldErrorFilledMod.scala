package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsFormFieldErrorFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/FormFieldErrorFilled", JSImport.Default)
  @js.native
  val default: FC[FormFieldErrorFilledProps] = js.native
  
  trait FormFieldErrorFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FormFieldErrorFilledProps {
    
    inline def apply(): FormFieldErrorFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldErrorFilledProps]
    }
    
    extension [Self <: FormFieldErrorFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FormFieldErrorFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsFormFieldErrorFilledMod.foo` */
  override def _to: FC[FormFieldErrorFilledProps] = default
}
