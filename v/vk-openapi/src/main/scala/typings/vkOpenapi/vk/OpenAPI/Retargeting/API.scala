package typings.vkOpenapi.vk.OpenAPI.Retargeting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def Add(audienceId: Double): Unit = js.native
  def Event(eventName: String): Unit = js.native
  def Hit(): Unit = js.native
  def Init(code: String): Unit = js.native
  def ProductEvent(priceListId: Double, eventName: typings.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent): Unit = js.native
  def ProductEvent(
    priceListId: Double,
    eventName: typings.vkOpenapi.vk.OpenAPI.Retargeting.ProductEvent,
    eventParams: ProductEventParams
  ): Unit = js.native
}

