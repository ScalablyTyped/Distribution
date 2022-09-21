package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.eventsLargeMod.EventsLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemEventsLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/EventsLarge", JSImport.Default)
  @js.native
  val default: FC[EventsLargeProps] = js.native
  
  type _To = FC[EventsLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemEventsLargeMod.foo` */
  override def _to: FC[EventsLargeProps] = default
}
