package typings.webscreensWindowPlacement

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventTarget
import typings.webscreensWindowPlacement.webscreensWindowPlacementStrings.currentscreenchange
import typings.webscreensWindowPlacement.webscreensWindowPlacementStrings.screenschange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenDetailsEventHandlers
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_currentscreenchange(
    `type`: currentscreenchange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentscreenchange(
    `type`: currentscreenchange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentscreenchange(
    `type`: currentscreenchange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_screenschange(`type`: screenschange, listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_screenschange(
    `type`: screenschange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_screenschange(
    `type`: screenschange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var oncurrentscreenchange: (js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]) | Null = js.native
  
  var onscreenschange: (js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]) | Null = js.native
}
