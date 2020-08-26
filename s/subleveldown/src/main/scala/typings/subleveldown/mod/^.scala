package typings.subleveldown.mod

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subleveldown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a `levelup` instance that uses subleveldown to prefix the keys of the underlying store of `db`.
    * Any layers that this instance may have (like `encoding-down` or `subleveldown` itself) are peeled off to get to the innermost `abstract-leveldown` compliant store (like `leveldown`).
    * This ensures there is no double encoding step.
    * @param db
    * @param prefix If omitted, the effective prefix is two separators, e.g. `'!!'`. If `db` is already a subleveldown-powered instance, the effective prefix is a combined prefix, e.g. `'!one!!two!'`.
    * @param opts
    * @see {@link https://github.com/Level/subleveldown#api subleveldown API}
    */
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  def apply[K, V](
    db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]],
    prefix: js.UndefOr[scala.Nothing],
    opts: String
  ): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  def apply[K, V](
    db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]],
    prefix: js.UndefOr[scala.Nothing],
    opts: SubDownOptions
  ): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], prefix: String): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], prefix: String, opts: String): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], prefix: String, opts: SubDownOptions): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
}

