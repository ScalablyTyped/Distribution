package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Integrations", JSImport.Default)
  @js.native
  val default: FC[IntegrationsProps] = js.native
  
  trait IntegrationsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IntegrationsProps {
    
    inline def apply(): IntegrationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationsProps]
    }
    
    extension [Self <: IntegrationsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IntegrationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `integrationsMod.foo` */
  override def _to: FC[IntegrationsProps] = default
}
