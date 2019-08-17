package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsCoreMod {
  import typings.std.Partial
  import typings.sweetalert.typingsModulesOptionsMod.SwalOptions

  type SwalParams = js.Array[String | Partial[SwalOptions]]
}
