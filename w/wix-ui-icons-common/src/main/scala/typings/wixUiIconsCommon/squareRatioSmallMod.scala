package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object squareRatioSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SquareRatioSmall", JSImport.Default)
  @js.native
  val default: SFC[SquareRatioSmallProps] = js.native
  
  trait SquareRatioSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SquareRatioSmallProps {
    
    @scala.inline
    def apply(): SquareRatioSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquareRatioSmallProps]
    }
    
    @scala.inline
    implicit class SquareRatioSmallPropsMutableBuilder[Self <: SquareRatioSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SquareRatioSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `squareRatioSmallMod.foo` */
  override def _to: SFC[SquareRatioSmallProps] = default
}
