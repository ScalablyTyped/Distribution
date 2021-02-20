package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalRatioCheckedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VerticalRatioCheckedSmall", JSImport.Default)
  @js.native
  val default: SFC[VerticalRatioCheckedSmallProps] = js.native
  
  @js.native
  trait VerticalRatioCheckedSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VerticalRatioCheckedSmallProps {
    
    @scala.inline
    def apply(): VerticalRatioCheckedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioCheckedSmallProps]
    }
    
    @scala.inline
    implicit class VerticalRatioCheckedSmallPropsMutableBuilder[Self <: VerticalRatioCheckedSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VerticalRatioCheckedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalRatioCheckedSmallMod.foo` */
  override def _to: SFC[VerticalRatioCheckedSmallProps] = default
}
