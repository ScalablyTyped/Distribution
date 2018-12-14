package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String
  val `type`: RTCSdpType
  def toJSON(): js.Any
}

@JSGlobal("RTCSessionDescription")
@js.native
object RTCSessionDescription
  extends org.scalablytyped.runtime.Instantiable1[/* descriptionInitDict */ RTCSessionDescriptionInit, RTCSessionDescription]

