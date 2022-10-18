package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsEmailMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Email", JSImport.Default)
  @js.native
  val default: FC[EmailProps] = js.native
  
  trait EmailProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EmailProps {
    
    inline def apply(): EmailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailProps]
    }
    
    extension [Self <: EmailProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EmailProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsEmailMod.foo` */
  override def _to: FC[EmailProps] = default
}
