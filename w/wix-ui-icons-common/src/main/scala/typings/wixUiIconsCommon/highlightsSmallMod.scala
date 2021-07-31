package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HighlightsSmall", JSImport.Default)
  @js.native
  val default: SFC[HighlightsSmallProps] = js.native
  
  trait HighlightsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HighlightsSmallProps {
    
    @scala.inline
    def apply(): HighlightsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightsSmallProps]
    }
    
    @scala.inline
    implicit class HighlightsSmallPropsMutableBuilder[Self <: HighlightsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HighlightsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `highlightsSmallMod.foo` */
  override def _to: SFC[HighlightsSmallProps] = default
}
