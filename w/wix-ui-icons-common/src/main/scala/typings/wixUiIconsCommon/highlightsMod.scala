package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Highlights", JSImport.Default)
  @js.native
  val default: SFC[HighlightsProps] = js.native
  
  trait HighlightsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HighlightsProps {
    
    @scala.inline
    def apply(): HighlightsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightsProps]
    }
    
    @scala.inline
    implicit class HighlightsPropsMutableBuilder[Self <: HighlightsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HighlightsProps]
  
  /* This means you don't have to write `default`, but can instead just say `highlightsMod.foo` */
  override def _to: SFC[HighlightsProps] = default
}
