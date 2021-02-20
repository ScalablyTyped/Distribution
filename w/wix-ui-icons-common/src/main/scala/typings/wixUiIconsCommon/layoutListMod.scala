package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayoutList", JSImport.Default)
  @js.native
  val default: SFC[LayoutListProps] = js.native
  
  @js.native
  trait LayoutListProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayoutListProps {
    
    @scala.inline
    def apply(): LayoutListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutListProps]
    }
    
    @scala.inline
    implicit class LayoutListPropsMutableBuilder[Self <: LayoutListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[LayoutListProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutListMod.foo` */
  override def _to: SFC[LayoutListProps] = default
}
