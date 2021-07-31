package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chevronLeftCircleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ChevronLeftCircle", JSImport.Default)
  @js.native
  val default: SFC[ChevronLeftCircleProps] = js.native
  
  trait ChevronLeftCircleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ChevronLeftCircleProps {
    
    @scala.inline
    def apply(): ChevronLeftCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronLeftCircleProps]
    }
    
    @scala.inline
    implicit class ChevronLeftCirclePropsMutableBuilder[Self <: ChevronLeftCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ChevronLeftCircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `chevronLeftCircleMod.foo` */
  override def _to: SFC[ChevronLeftCircleProps] = default
}
