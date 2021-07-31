package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusAlertFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusAlertFilled", JSImport.Default)
  @js.native
  val default: SFC[StatusAlertFilledProps] = js.native
  
  trait StatusAlertFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StatusAlertFilledProps {
    
    @scala.inline
    def apply(): StatusAlertFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusAlertFilledProps]
    }
    
    @scala.inline
    implicit class StatusAlertFilledPropsMutableBuilder[Self <: StatusAlertFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusAlertFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusAlertFilledMod.foo` */
  override def _to: SFC[StatusAlertFilledProps] = default
}
