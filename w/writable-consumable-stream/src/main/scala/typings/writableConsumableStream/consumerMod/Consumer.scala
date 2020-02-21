package typings.writableConsumableStream.consumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consumer[T]
  extends typings.consumableStream.mod.Consumer[T] {
  var currentNode: Node[T] = js.native
  var id: Double = js.native
  var stream: typings.writableConsumableStream.mod.^[T] = js.native
  var timeout: Double = js.native
  def getBackpressure(): Double = js.native
  def getStats(): ConsumerStats = js.native
  def kill(): Unit = js.native
  def kill(value: js.Any): Unit = js.native
  def releaseBackpressure(packet: js.Any): Unit = js.native
  def resetBackpressure(): Unit = js.native
  def write(packet: js.Any): Unit = js.native
}

