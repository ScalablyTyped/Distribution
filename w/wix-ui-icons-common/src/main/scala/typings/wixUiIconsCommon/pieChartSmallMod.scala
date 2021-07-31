package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pieChartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PieChartSmall", JSImport.Default)
  @js.native
  val default: SFC[PieChartSmallProps] = js.native
  
  trait PieChartSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PieChartSmallProps {
    
    @scala.inline
    def apply(): PieChartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PieChartSmallProps]
    }
    
    @scala.inline
    implicit class PieChartSmallPropsMutableBuilder[Self <: PieChartSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PieChartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `pieChartSmallMod.foo` */
  override def _to: SFC[PieChartSmallProps] = default
}
