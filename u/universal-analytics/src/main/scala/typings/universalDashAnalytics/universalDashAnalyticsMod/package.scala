package typings.universalDashAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object universalDashAnalyticsMod {
  import typings.std.Error

  type Callback = js.Function2[/* error */ Error | Null, /* count */ Double, Unit]
}
