package typings.universalDashAnalytics

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object universalDashAnalyticsMod {
  type Callback = js.Function2[/* error */ Error | Null, /* count */ Double, Unit]
}
