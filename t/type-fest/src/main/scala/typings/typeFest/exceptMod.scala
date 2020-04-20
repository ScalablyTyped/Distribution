package typings.typeFest

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/except", JSImport.Namespace)
@js.native
object exceptMod extends js.Object {
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = Pick[ObjectType, Exclude[/* keyof ObjectType */ String, KeysType]]
}

