package typings
package xDashRayDashCrawlerLib.xDashRayDashCrawlerMod.XRayCrawlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  def apply(
    url: java.lang.String,
    callback: Callback[httpDashContextLib.httpDashContextMod.HttpContextNs.Context]
  ): scala.Unit = js.native
  def concurrency(): scala.Double = js.native
  def concurrency(n: scala.Double): this.type = js.native
  def delay(): RandomDelay = js.native
  def delay(from: java.lang.String): this.type = js.native
  def delay(from: java.lang.String, to: java.lang.String): this.type = js.native
  def delay(from: java.lang.String, to: scala.Double): this.type = js.native
  def delay(from: scala.Double): this.type = js.native
  def delay(from: scala.Double, to: java.lang.String): this.type = js.native
  def delay(from: scala.Double, to: scala.Double): this.type = js.native
  def driver(): Driver = js.native
  def driver(driver: Driver): this.type = js.native
  def limit(): scala.Double = js.native
  def limit(n: scala.Double): this.type = js.native
  def request(): RequestHook = js.native
  def request(fn: RequestHook): this.type = js.native
  def response(): ResponseHook = js.native
  def response(fn: ResponseHook): this.type = js.native
  def throttle(): scala.Double = js.native
  def throttle(requests: java.lang.String, rate: java.lang.String): this.type = js.native
  def throttle(requests: java.lang.String, rate: scala.Double): this.type = js.native
  def throttle(requests: scala.Double, rate: java.lang.String): this.type = js.native
  def throttle(requests: scala.Double, rate: scala.Double): this.type = js.native
  def timeout(): scala.Double = js.native
  def timeout(n: java.lang.String): this.type = js.native
  def timeout(n: scala.Double): this.type = js.native
}

