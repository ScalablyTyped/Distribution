package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Replace", JSImport.Default)
  @js.native
  val default: SFC[ReplaceProps] = js.native
  
  @js.native
  trait ReplaceProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ReplaceProps {
    
    @scala.inline
    def apply(): ReplaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceProps]
    }
    
    @scala.inline
    implicit class ReplacePropsMutableBuilder[Self <: ReplaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ReplaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `replaceMod.foo` */
  override def _to: SFC[ReplaceProps] = default
}
