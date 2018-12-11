package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeyMessageEvent extends Event {
  val message: stdLib.ArrayBuffer = js.native
  val messageType: MediaKeyMessageType = js.native
}

@JSGlobal("MediaKeyMessageEvent")
@js.native
object MediaKeyMessageEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, MediaKeyMessageEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaKeyMessageEventInit, 
      MediaKeyMessageEvent
    ]

