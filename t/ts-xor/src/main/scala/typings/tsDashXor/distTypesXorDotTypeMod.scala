package typings.tsDashXor

import typings.tsDashXor.distTypesWithoutDotTypeMod.Without
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-xor/dist/types/Xor.type", JSImport.Namespace)
@js.native
object distTypesXorDotTypeMod extends js.Object {
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}

