package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hintMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Hint", JSImport.Default)
  @js.native
  val default: SFC[HintProps] = js.native
  
  @js.native
  trait HintProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HintProps {
    
    @scala.inline
    def apply(): HintProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HintProps]
    }
    
    @scala.inline
    implicit class HintPropsMutableBuilder[Self <: HintProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HintProps]
  
  /* This means you don't have to write `default`, but can instead just say `hintMod.foo` */
  override def _to: SFC[HintProps] = default
}
