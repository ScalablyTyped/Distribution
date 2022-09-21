package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.eventsSmallMod.EventsSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onStageEventsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/EventsSmall", JSImport.Default)
  @js.native
  val default: FC[EventsSmallProps] = js.native
  
  type _To = FC[EventsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `onStageEventsSmallMod.foo` */
  override def _to: FC[EventsSmallProps] = default
}
