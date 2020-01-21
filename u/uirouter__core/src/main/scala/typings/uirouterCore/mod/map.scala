package typings.uirouterCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.Mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "map")
@js.native
object map extends js.Object {
  def apply[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  def apply[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  def apply[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = js.native
  def apply[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): StringDictionary[U] = js.native
}

