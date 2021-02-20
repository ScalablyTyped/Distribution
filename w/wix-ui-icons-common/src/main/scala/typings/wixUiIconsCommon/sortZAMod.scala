package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortZAMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SortZA", JSImport.Default)
  @js.native
  val default: SFC[SortZAProps] = js.native
  
  @js.native
  trait SortZAProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SortZAProps {
    
    @scala.inline
    def apply(): SortZAProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortZAProps]
    }
    
    @scala.inline
    implicit class SortZAPropsMutableBuilder[Self <: SortZAProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SortZAProps]
  
  /* This means you don't have to write `default`, but can instead just say `sortZAMod.foo` */
  override def _to: SFC[SortZAProps] = default
}
