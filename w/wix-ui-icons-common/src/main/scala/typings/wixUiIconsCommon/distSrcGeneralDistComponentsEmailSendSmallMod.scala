package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsEmailSendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailSendSmall", JSImport.Default)
  @js.native
  val default: FC[EmailSendSmallProps] = js.native
  
  trait EmailSendSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EmailSendSmallProps {
    
    inline def apply(): EmailSendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailSendSmallProps]
    }
    
    extension [Self <: EmailSendSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EmailSendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsEmailSendSmallMod.foo` */
  override def _to: FC[EmailSendSmallProps] = default
}
