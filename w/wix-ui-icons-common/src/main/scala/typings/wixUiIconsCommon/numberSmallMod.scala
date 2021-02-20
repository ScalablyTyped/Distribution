package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/NumberSmall", JSImport.Default)
  @js.native
  val default: SFC[NumberSmallProps] = js.native
  
  @js.native
  trait NumberSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object NumberSmallProps {
    
    @scala.inline
    def apply(): NumberSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberSmallProps]
    }
    
    @scala.inline
    implicit class NumberSmallPropsMutableBuilder[Self <: NumberSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[NumberSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `numberSmallMod.foo` */
  override def _to: SFC[NumberSmallProps] = default
}
