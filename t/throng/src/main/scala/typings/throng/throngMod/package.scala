package typings.throng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object throngMod {
  type ProcessCallback = js.Function1[/* id */ Double, js.Any]
  type WorkerCount = Double | String
}
