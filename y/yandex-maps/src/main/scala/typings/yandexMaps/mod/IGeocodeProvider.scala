package typings.yandexMaps.mod

import typings.yandexMaps.AnonResults
import typings.yandexMaps.AnonStrictBounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeProvider extends js.Object {
  def geocode(request: String): js.Promise[js.Object] = js.native
  def geocode(request: String, options: AnonResults): js.Promise[js.Object] = js.native
  def suggest(request: String): js.Promise[js.Object] = js.native
  def suggest(request: String, options: AnonStrictBounds): js.Promise[js.Object] = js.native
}

