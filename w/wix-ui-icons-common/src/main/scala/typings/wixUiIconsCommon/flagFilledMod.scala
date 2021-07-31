package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flagFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FlagFilled", JSImport.Default)
  @js.native
  val default: SFC[FlagFilledProps] = js.native
  
  trait FlagFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FlagFilledProps {
    
    @scala.inline
    def apply(): FlagFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagFilledProps]
    }
    
    @scala.inline
    implicit class FlagFilledPropsMutableBuilder[Self <: FlagFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FlagFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `flagFilledMod.foo` */
  override def _to: SFC[FlagFilledProps] = default
}
