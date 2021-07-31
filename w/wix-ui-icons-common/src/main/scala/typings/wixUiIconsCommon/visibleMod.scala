package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Visible", JSImport.Default)
  @js.native
  val default: SFC[VisibleProps] = js.native
  
  trait VisibleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object VisibleProps {
    
    @scala.inline
    def apply(): VisibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibleProps]
    }
    
    @scala.inline
    implicit class VisiblePropsMutableBuilder[Self <: VisibleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VisibleProps]
  
  /* This means you don't have to write `default`, but can instead just say `visibleMod.foo` */
  override def _to: SFC[VisibleProps] = default
}
