package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.calendarLargeMod.CalendarLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCalendarLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/CalendarLarge", JSImport.Default)
  @js.native
  val default: FC[CalendarLargeProps] = js.native
  
  type _To = FC[CalendarLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCalendarLargeMod.foo` */
  override def _to: FC[CalendarLargeProps] = default
}
