package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronDownCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronDownCircle", JSImport.Default)
  @js.native
  val default: SFC[ChevronDownCircleProps] = js.native
  
  trait ChevronDownCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronDownCircleProps {
    
    @scala.inline
    def apply(): ChevronDownCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronDownCircleProps]
    }
    
    @scala.inline
    implicit class ChevronDownCirclePropsMutableBuilder[Self <: ChevronDownCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronDownCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronDownCircleMod.foo` */
  override def _to: SFC[ChevronDownCircleProps] = default
}
