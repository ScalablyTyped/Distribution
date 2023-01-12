package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsIntegrationsSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/IntegrationsSmall", JSImport.Default)
  @js.native
  val default: FC[IntegrationsSmallProps] = js.native
  
  trait IntegrationsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IntegrationsSmallProps {
    
    inline def apply(): IntegrationsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationsSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntegrationsSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IntegrationsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsIntegrationsSmallMod.foo` */
  override def _to: FC[IntegrationsSmallProps] = default
}
