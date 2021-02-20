package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignBottomMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignBottom", JSImport.Default)
  @js.native
  val default: SFC[AlignBottomProps] = js.native
  
  @js.native
  trait AlignBottomProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignBottomProps {
    
    @scala.inline
    def apply(): AlignBottomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignBottomProps]
    }
    
    @scala.inline
    implicit class AlignBottomPropsMutableBuilder[Self <: AlignBottomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AlignBottomProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignBottomMod.foo` */
  override def _to: SFC[AlignBottomProps] = default
}
