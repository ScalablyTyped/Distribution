package typings.atTestingDashLibraryDom

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  type ConfigFn = js.Function1[/* existingConfig */ Config, Partial[Config]]
}
