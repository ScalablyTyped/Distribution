package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeProvider extends js.Object {
  def geocode(request: java.lang.String): js.Promise[js.Object] = js.native
  def geocode(request: java.lang.String, options: yandexDashMapsLib.Anon_BoundedBy): js.Promise[js.Object] = js.native
  def suggest(request: java.lang.String): js.Promise[js.Object] = js.native
  def suggest(request: java.lang.String, options: yandexDashMapsLib.Anon_BoundedByResults): js.Promise[js.Object] = js.native
}

