package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.calendarMod.CalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageCalendarMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/Calendar", JSImport.Default)
  @js.native
  val default: FC[CalendarProps] = js.native
  
  type _To = FC[CalendarProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageCalendarMod.foo` */
  override def _to: FC[CalendarProps] = default
}
