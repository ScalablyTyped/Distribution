package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cutleryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Cutlery", JSImport.Default)
  @js.native
  val default: SFC[CutleryProps] = js.native
  
  trait CutleryProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CutleryProps {
    
    @scala.inline
    def apply(): CutleryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutleryProps]
    }
    
    @scala.inline
    implicit class CutleryPropsMutableBuilder[Self <: CutleryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CutleryProps]
  
  /* This means you don't have to write `default`, but can instead just say `cutleryMod.foo` */
  override def _to: SFC[CutleryProps] = default
}
