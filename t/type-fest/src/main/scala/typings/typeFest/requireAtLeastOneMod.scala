package typings.typeFest

import typings.typeFest.exceptMod.Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/require-at-least-one", JSImport.Namespace)
@js.native
object requireAtLeastOneMod extends js.Object {
  type RequireAtLeastOne[ObjectType, KeysType /* <: String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: // …by picking that Key's type and making it required
  std.Required<std.Pick<ObjectType, Key>>}[KeysType] */ js.Any) with (Except[ObjectType, KeysType])
}

