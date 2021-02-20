package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Flag", JSImport.Default)
  @js.native
  val default: SFC[FlagProps] = js.native
  
  @js.native
  trait FlagProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FlagProps {
    
    @scala.inline
    def apply(): FlagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagProps]
    }
    
    @scala.inline
    implicit class FlagPropsMutableBuilder[Self <: FlagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FlagProps]
  
  /* This means you don't have to write `default`, but can instead just say `flagMod.foo` */
  override def _to: SFC[FlagProps] = default
}
