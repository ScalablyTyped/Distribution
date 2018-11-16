package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeocodeProvider extends js.Object {
  def geocode(request: java.lang.String): stdLib.Promise[js.Object] = js.native
  def geocode(request: java.lang.String, options: yandexDashMapsLib.Anon_ResultsStrictBounds): stdLib.Promise[js.Object] = js.native
  def suggest(request: java.lang.String): stdLib.Promise[js.Object] = js.native
  def suggest(request: java.lang.String, options: yandexDashMapsLib.Anon_Results): stdLib.Promise[js.Object] = js.native
}

