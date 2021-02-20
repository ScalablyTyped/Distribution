package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BingSmall", JSImport.Default)
  @js.native
  val default: SFC[BingSmallProps] = js.native
  
  @js.native
  trait BingSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BingSmallProps {
    
    @scala.inline
    def apply(): BingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BingSmallProps]
    }
    
    @scala.inline
    implicit class BingSmallPropsMutableBuilder[Self <: BingSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `bingSmallMod.foo` */
  override def _to: SFC[BingSmallProps] = default
}
