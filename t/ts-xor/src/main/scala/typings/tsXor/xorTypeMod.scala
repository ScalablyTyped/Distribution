package typings.tsXor

import typings.tsXor.withoutTypeMod.Without
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-xor/dist/types/Xor.type", JSImport.Namespace)
@js.native
object xorTypeMod extends js.Object {
  
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}
