package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalRatioMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VerticalRatio", JSImport.Default)
  @js.native
  val default: SFC[VerticalRatioProps] = js.native
  
  trait VerticalRatioProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object VerticalRatioProps {
    
    @scala.inline
    def apply(): VerticalRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalRatioProps]
    }
    
    @scala.inline
    implicit class VerticalRatioPropsMutableBuilder[Self <: VerticalRatioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VerticalRatioProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalRatioMod.foo` */
  override def _to: SFC[VerticalRatioProps] = default
}
