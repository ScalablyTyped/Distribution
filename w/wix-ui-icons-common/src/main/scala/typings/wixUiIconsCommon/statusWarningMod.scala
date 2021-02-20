package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusWarningMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusWarning", JSImport.Default)
  @js.native
  val default: SFC[StatusWarningProps] = js.native
  
  @js.native
  trait StatusWarningProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusWarningProps {
    
    @scala.inline
    def apply(): StatusWarningProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusWarningProps]
    }
    
    @scala.inline
    implicit class StatusWarningPropsMutableBuilder[Self <: StatusWarningProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusWarningProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusWarningMod.foo` */
  override def _to: SFC[StatusWarningProps] = default
}
