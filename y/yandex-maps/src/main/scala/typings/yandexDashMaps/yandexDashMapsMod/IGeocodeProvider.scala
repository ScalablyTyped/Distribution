package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.Anon_BoundedBy
import typings.yandexDashMaps.Anon_BoundedByResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeProvider extends js.Object {
  def geocode(request: String): js.Promise[js.Object] = js.native
  def geocode(request: String, options: Anon_BoundedBy): js.Promise[js.Object] = js.native
  def suggest(request: String): js.Promise[js.Object] = js.native
  def suggest(request: String, options: Anon_BoundedByResults): js.Promise[js.Object] = js.native
}

