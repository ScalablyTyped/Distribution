package typings.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  import typings.std.Partial

  type ConfigFn = js.Function1[/* existingConfig */ Config, Partial[Config]]
}
