package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsCalendarLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/CalendarLarge", JSImport.Default)
  @js.native
  val default: FC[CalendarLargeProps] = js.native
  
  trait CalendarLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CalendarLargeProps {
    
    inline def apply(): CalendarLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarLargeProps]
    }
    
    extension [Self <: CalendarLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CalendarLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsCalendarLargeMod.foo` */
  override def _to: FC[CalendarLargeProps] = default
}
