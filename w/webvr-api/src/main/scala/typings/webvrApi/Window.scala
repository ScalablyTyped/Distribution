package typings.webvrApi

import typings.std.Event
import typings.webvrApi.webvrApiStrings.vrdisplayactivate
import typings.webvrApi.webvrApiStrings.vrdisplayblur
import typings.webvrApi.webvrApiStrings.vrdisplayconnect
import typings.webvrApi.webvrApiStrings.vrdisplaydeactivate
import typings.webvrApi.webvrApiStrings.vrdisplaydisconnect
import typings.webvrApi.webvrApiStrings.vrdisplayfocus
import typings.webvrApi.webvrApiStrings.vrdisplaypointerrestricted
import typings.webvrApi.webvrApiStrings.vrdisplaypointerunrestricted
import typings.webvrApi.webvrApiStrings.vrdisplaypresentchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
}
