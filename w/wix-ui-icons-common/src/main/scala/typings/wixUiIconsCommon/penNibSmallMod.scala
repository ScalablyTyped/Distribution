package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PenNibSmall", JSImport.Default)
  @js.native
  val default: SFC[PenNibSmallProps] = js.native
  
  @js.native
  trait PenNibSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PenNibSmallProps {
    
    @scala.inline
    def apply(): PenNibSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibSmallProps]
    }
    
    @scala.inline
    implicit class PenNibSmallPropsMutableBuilder[Self <: PenNibSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PenNibSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibSmallMod.foo` */
  override def _to: SFC[PenNibSmallProps] = default
}
