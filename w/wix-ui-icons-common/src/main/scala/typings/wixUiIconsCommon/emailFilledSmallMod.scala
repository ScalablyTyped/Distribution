package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailFilledSmall", JSImport.Default)
  @js.native
  val default: FC[EmailFilledSmallProps] = js.native
  
  trait EmailFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EmailFilledSmallProps {
    
    inline def apply(): EmailFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailFilledSmallProps]
    }
    
    extension [Self <: EmailFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EmailFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailFilledSmallMod.foo` */
  override def _to: FC[EmailFilledSmallProps] = default
}
