package typings.atUirouterCore.atUirouterCoreMod

import typings.atUirouterCore.libCommonCommonMod.TypedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "filter")
@js.native
object filter extends js.Object {
  def apply[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = js.native
  def apply[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = js.native
}

