package typings.xDashRayDashCrawler.xDashRayDashCrawlerMod

import typings.httpDashContext.httpDashContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  def apply(url: String, callback: Callback[Context]): Unit = js.native
  def concurrency(): Double = js.native
  def concurrency(n: Double): this.type = js.native
  def delay(): RandomDelay = js.native
  def delay(from: String): this.type = js.native
  def delay(from: String, to: String): this.type = js.native
  def delay(from: String, to: Double): this.type = js.native
  def delay(from: Double): this.type = js.native
  def delay(from: Double, to: String): this.type = js.native
  def delay(from: Double, to: Double): this.type = js.native
  def driver(): Driver = js.native
  def driver(driver: Driver): this.type = js.native
  def limit(): Double = js.native
  def limit(n: Double): this.type = js.native
  def request(): RequestHook = js.native
  def request(fn: RequestHook): this.type = js.native
  def response(): ResponseHook = js.native
  def response(fn: ResponseHook): this.type = js.native
  def throttle(): Double = js.native
  def throttle(requests: String, rate: String): this.type = js.native
  def throttle(requests: String, rate: Double): this.type = js.native
  def throttle(requests: Double, rate: String): this.type = js.native
  def throttle(requests: Double, rate: Double): this.type = js.native
  def timeout(): Double = js.native
  def timeout(n: String): this.type = js.native
  def timeout(n: Double): this.type = js.native
}

