package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalRatioCheckedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HorizontalRatioChecked", JSImport.Default)
  @js.native
  val default: SFC[HorizontalRatioCheckedProps] = js.native
  
  trait HorizontalRatioCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HorizontalRatioCheckedProps {
    
    @scala.inline
    def apply(): HorizontalRatioCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioCheckedProps]
    }
    
    @scala.inline
    implicit class HorizontalRatioCheckedPropsMutableBuilder[Self <: HorizontalRatioCheckedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HorizontalRatioCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalRatioCheckedMod.foo` */
  override def _to: SFC[HorizontalRatioCheckedProps] = default
}
