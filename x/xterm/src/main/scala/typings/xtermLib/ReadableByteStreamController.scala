package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableByteStreamController extends js.Object {
  val byobRequest: js.UndefOr[ReadableStreamBYOBRequest] = js.native
  val desiredSize: scala.Double | scala.Null = js.native
  def close(): scala.Unit = js.native
  def enqueue(chunk: stdLib.ArrayBufferView): scala.Unit = js.native
  def error(): scala.Unit = js.native
  def error(error: js.Any): scala.Unit = js.native
}

