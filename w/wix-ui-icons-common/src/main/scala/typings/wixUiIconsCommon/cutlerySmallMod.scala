package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cutlerySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CutlerySmall", JSImport.Default)
  @js.native
  val default: SFC[CutlerySmallProps] = js.native
  
  trait CutlerySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CutlerySmallProps {
    
    @scala.inline
    def apply(): CutlerySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutlerySmallProps]
    }
    
    @scala.inline
    implicit class CutlerySmallPropsMutableBuilder[Self <: CutlerySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CutlerySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cutlerySmallMod.foo` */
  override def _to: SFC[CutlerySmallProps] = default
}
