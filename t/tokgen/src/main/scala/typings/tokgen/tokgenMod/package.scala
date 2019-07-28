package typings.tokgen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tokgenMod {
  type Callback = js.Function2[/* error */ js.Any, /* token */ String, Unit]
  type Options = Double | String | OptionsObject
}
