package typings.atUirouterCore.atUirouterCoreMod

import typings.atUirouterCore.libCommonCommonMod.Predicate
import typings.atUirouterCore.libCommonCommonMod.TypedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "find")
@js.native
object find extends js.Object {
  def apply[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def apply[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
}

