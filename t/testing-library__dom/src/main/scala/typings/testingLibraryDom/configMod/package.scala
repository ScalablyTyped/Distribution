package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  type ConfigFn = js.Function1[
    /* existingConfig */ typings.testingLibraryDom.configMod.Config, 
    typings.std.Partial[typings.testingLibraryDom.configMod.Config]
  ]
}
