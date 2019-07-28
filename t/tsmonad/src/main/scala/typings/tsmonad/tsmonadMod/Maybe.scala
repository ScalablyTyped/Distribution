package typings.tsmonad.tsmonadMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Maybe")
@js.native
class Maybe[T] protected ()
  extends typings.tsmonad.libSrcMaybeMod.Maybe[T] {
  def this(`type`: typings.tsmonad.libSrcMaybeMod.MaybeType) = this()
  def this(`type`: typings.tsmonad.libSrcMaybeMod.MaybeType, value: T) = this()
}

/* static members */
@JSImport("tsmonad", "Maybe")
@js.native
object Maybe extends js.Object {
  def all(t: StringDictionary[typings.tsmonad.libSrcMaybeMod.Maybe[_]]): typings.tsmonad.libSrcMaybeMod.Maybe[StringDictionary[_]] = js.native
  def isJust[T](t: typings.tsmonad.libSrcMaybeMod.Maybe[T]): Boolean = js.native
  def isNothing[T](t: typings.tsmonad.libSrcMaybeMod.Maybe[T]): Boolean = js.native
  def just[T](t: T): typings.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
  def maybe[T](): typings.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
  def maybe[T](t: T): typings.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
  def nothing[T](): typings.tsmonad.libSrcMaybeMod.Maybe[T] = js.native
  def sequence[T](t: StringDictionary[typings.tsmonad.libSrcMaybeMod.Maybe[T]]): typings.tsmonad.libSrcMaybeMod.Maybe[StringDictionary[T]] = js.native
}

