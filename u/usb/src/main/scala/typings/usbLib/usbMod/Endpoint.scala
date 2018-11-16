package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint
  extends nodeLib.eventsMod.EventEmitter {
  var descriptor: EndpointDescriptor = js.native
  var direction: java.lang.String = js.native
  var timeout: scala.Double = js.native
  var transferType: scala.Double = js.native
}

