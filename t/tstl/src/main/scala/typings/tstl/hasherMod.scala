package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/functional/Hasher", JSImport.Namespace)
@js.native
object hasherMod extends js.Object {
  type Hasher[Key] = js.Function1[/* key */ Key, Double]
}

