package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusCompletetFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusCompletetFilled", JSImport.Default)
  @js.native
  val default: SFC[StatusCompletetFilledProps] = js.native
  
  @js.native
  trait StatusCompletetFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object StatusCompletetFilledProps {
    
    @scala.inline
    def apply(): StatusCompletetFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusCompletetFilledProps]
    }
    
    @scala.inline
    implicit class StatusCompletetFilledPropsMutableBuilder[Self <: StatusCompletetFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusCompletetFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusCompletetFilledMod.foo` */
  override def _to: SFC[StatusCompletetFilledProps] = default
}
