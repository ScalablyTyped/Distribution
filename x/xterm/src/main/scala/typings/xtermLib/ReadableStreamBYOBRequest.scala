package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableStreamBYOBRequest extends js.Object {
  val view: stdLib.ArrayBufferView
  def respond(bytesWritten: scala.Double): scala.Unit
  def respondWithNewView(view: stdLib.ArrayBufferView): scala.Unit
}

