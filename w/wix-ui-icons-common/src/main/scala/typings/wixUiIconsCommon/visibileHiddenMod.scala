package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibileHiddenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/VisibileHidden", JSImport.Default)
  @js.native
  val default: SFC[VisibileHiddenProps] = js.native
  
  @js.native
  trait VisibileHiddenProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object VisibileHiddenProps {
    
    @scala.inline
    def apply(): VisibileHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibileHiddenProps]
    }
    
    @scala.inline
    implicit class VisibileHiddenPropsMutableBuilder[Self <: VisibileHiddenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[VisibileHiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `visibileHiddenMod.foo` */
  override def _to: SFC[VisibileHiddenProps] = default
}
