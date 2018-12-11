package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadableStreamDefaultController[R] extends js.Object {
  val desiredSize: scala.Double | scala.Null = js.native
  def close(): scala.Unit = js.native
  def enqueue(chunk: R): scala.Unit = js.native
  def error(): scala.Unit = js.native
  def error(error: js.Any): scala.Unit = js.native
}

