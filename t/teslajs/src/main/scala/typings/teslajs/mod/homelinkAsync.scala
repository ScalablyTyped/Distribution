package typings.teslajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("teslajs", "homelinkAsync")
@js.native
object homelinkAsync extends js.Object {
  def apply(options: optionsType, lat: Double, long: Double, token: String): js.Promise[Result] = js.native
}

