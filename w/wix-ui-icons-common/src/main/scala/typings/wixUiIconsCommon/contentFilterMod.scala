package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentFilterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ContentFilter", JSImport.Default)
  @js.native
  val default: SFC[ContentFilterProps] = js.native
  
  @js.native
  trait ContentFilterProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ContentFilterProps {
    
    @scala.inline
    def apply(): ContentFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentFilterProps]
    }
    
    @scala.inline
    implicit class ContentFilterPropsMutableBuilder[Self <: ContentFilterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ContentFilterProps]
  
  /* This means you don't have to write `default`, but can instead just say `contentFilterMod.foo` */
  override def _to: SFC[ContentFilterProps] = default
}
