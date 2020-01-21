package typings.yandexMaps.mod

import typings.yandexMaps.AnonBoundedBy
import typings.yandexMaps.AnonBoundedByResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeProvider extends js.Object {
  def geocode(request: String): js.Promise[js.Object] = js.native
  def geocode(request: String, options: AnonBoundedBy): js.Promise[js.Object] = js.native
  def suggest(request: String): js.Promise[js.Object] = js.native
  def suggest(request: String, options: AnonBoundedByResults): js.Promise[js.Object] = js.native
}

