package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtlsTransport
  extends EventTarget
     with RTCTransport {
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]) | scala.Null = js.native
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val state: RTCDtlsTransportState = js.native
  val transport: RTCIceTransport = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: xtermLib.xtermLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: xtermLib.xtermLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: xtermLib.xtermLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getRemoteCertificates(): js.Array[stdLib.ArrayBuffer] = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: xtermLib.xtermLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: xtermLib.xtermLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: xtermLib.xtermLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: xtermLib.xtermLibStrings.statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("RTCDtlsTransport")
@js.native
object RTCDtlsTransport
  extends org.scalablytyped.runtime.Instantiable0[RTCDtlsTransport]

