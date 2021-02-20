package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squareRatioCheckedSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SquareRatioCheckedSmall", JSImport.Default)
  @js.native
  val default: SFC[SquareRatioCheckedSmallProps] = js.native
  
  @js.native
  trait SquareRatioCheckedSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SquareRatioCheckedSmallProps {
    
    @scala.inline
    def apply(): SquareRatioCheckedSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareRatioCheckedSmallProps]
    }
    
    @scala.inline
    implicit class SquareRatioCheckedSmallPropsMutableBuilder[Self <: SquareRatioCheckedSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SquareRatioCheckedSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `squareRatioCheckedSmallMod.foo` */
  override def _to: SFC[SquareRatioCheckedSmallProps] = default
}
