package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Integrations", JSImport.Default)
  @js.native
  val default: SFC[IntegrationsProps] = js.native
  
  trait IntegrationsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object IntegrationsProps {
    
    @scala.inline
    def apply(): IntegrationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationsProps]
    }
    
    @scala.inline
    implicit class IntegrationsPropsMutableBuilder[Self <: IntegrationsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[IntegrationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `integrationsMod.foo` */
  override def _to: SFC[IntegrationsProps] = default
}
