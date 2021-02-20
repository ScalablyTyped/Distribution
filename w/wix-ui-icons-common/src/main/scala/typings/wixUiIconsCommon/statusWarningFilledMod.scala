package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusWarningFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusWarningFilled", JSImport.Default)
  @js.native
  val default: SFC[StatusWarningFilledProps] = js.native
  
  @js.native
  trait StatusWarningFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusWarningFilledProps {
    
    @scala.inline
    def apply(): StatusWarningFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusWarningFilledProps]
    }
    
    @scala.inline
    implicit class StatusWarningFilledPropsMutableBuilder[Self <: StatusWarningFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusWarningFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusWarningFilledMod.foo` */
  override def _to: SFC[StatusWarningFilledProps] = default
}
