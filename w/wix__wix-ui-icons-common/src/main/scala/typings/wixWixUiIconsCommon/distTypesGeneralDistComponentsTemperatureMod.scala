package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsTemperatureMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Temperature", JSImport.Default)
  @js.native
  val default: FC[TemperatureProps] = js.native
  
  trait TemperatureProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object TemperatureProps {
    
    inline def apply(): TemperatureProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemperatureProps]
    }
    
    extension [Self <: TemperatureProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[TemperatureProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsTemperatureMod.foo` */
  override def _to: FC[TemperatureProps] = default
}
