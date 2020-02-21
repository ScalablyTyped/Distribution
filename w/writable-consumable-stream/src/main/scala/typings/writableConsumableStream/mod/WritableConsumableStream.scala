package typings.writableConsumableStream.mod

import typings.consumableStream.mod.ConsumableStream
import typings.writableConsumableStream.consumerMod.ConsumerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableConsumableStream[T] extends ConsumableStream[T] {
  var nextConsumerId: Double = js.native
  def close(): Unit = js.native
  def close(value: T): Unit = js.native
  def closeConsumer(consumerId: Double): Unit = js.native
  def closeConsumer(consumerId: Double, value: T): Unit = js.native
  def getBackpressure(): Double = js.native
  def getConsumerBackpressure(consumerId: Double): Double = js.native
  def getConsumerStats(consumerId: Double): ConsumerStats = js.native
  def getConsumerStatsList(): js.Array[ConsumerStats] = js.native
  def hasConsumer(consumerId: Double): Boolean = js.native
  def kill(): Unit = js.native
  def kill(value: T): Unit = js.native
  def killConsumer(consumerId: Double): Unit = js.native
  def killConsumer(consumerId: Double, value: T): Unit = js.native
  def removeConsumer(consumerId: Double): Unit = js.native
  def setConsumer(consumerId: Double, consumer: typings.writableConsumableStream.consumerMod.^[T]): Unit = js.native
  def write(value: T): Unit = js.native
  def writeToConsumer(consumerId: Double, value: T): Unit = js.native
}

