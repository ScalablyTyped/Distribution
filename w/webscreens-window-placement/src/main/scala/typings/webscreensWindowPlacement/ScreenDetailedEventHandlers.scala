package typings.webscreensWindowPlacement

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventTarget
import typings.webscreensWindowPlacement.webscreensWindowPlacementStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenDetailedEventHandlers
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var onchange: (js.ThisFunction1[/* this */ ScreenDetailed, /* ev */ Event, Any]) | Null = js.native
}
