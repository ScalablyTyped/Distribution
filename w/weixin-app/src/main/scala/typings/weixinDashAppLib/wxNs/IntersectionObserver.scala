package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionObserver extends js.Object {
  def disconnect(): scala.Unit = js.native
  def observe(): IntersectionObserver = js.native
  def observe(selector: java.lang.String): IntersectionObserver = js.native
  def observe(selector: java.lang.String, callback: js.Function1[/* response */ ObserveResponse, scala.Unit]): IntersectionObserver = js.native
  def relativeTo(): IntersectionObserver = js.native
  def relativeTo(selector: java.lang.String): IntersectionObserver = js.native
  def relativeTo(selector: java.lang.String, margins: Margins): IntersectionObserver = js.native
  def relativeToViewport(): IntersectionObserver = js.native
  def relativeToViewport(margins: Margins): IntersectionObserver = js.native
}

