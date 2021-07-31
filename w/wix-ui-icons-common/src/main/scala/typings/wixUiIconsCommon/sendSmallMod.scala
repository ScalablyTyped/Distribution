package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SendSmall", JSImport.Default)
  @js.native
  val default: SFC[SendSmallProps] = js.native
  
  trait SendSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SendSmallProps {
    
    @scala.inline
    def apply(): SendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendSmallProps]
    }
    
    @scala.inline
    implicit class SendSmallPropsMutableBuilder[Self <: SendSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `sendSmallMod.foo` */
  override def _to: SFC[SendSmallProps] = default
}
