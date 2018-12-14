package typings
package tsmonadLib.tsmonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Maybe")
@js.native
class Maybe[T] protected ()
  extends tsmonadLib.libSrcMaybeMod.Maybe[T] {
  def this(`type`: tsmonadLib.libSrcMaybeMod.MaybeType) = this()
  def this(`type`: tsmonadLib.libSrcMaybeMod.MaybeType, value: T) = this()
}

@JSImport("tsmonad", "Maybe")
@js.native
object Maybe extends js.Object {
  def all(t: org.scalablytyped.runtime.StringDictionary[tsmonadLib.libSrcMaybeMod.Maybe[_]]): tsmonadLib.libSrcMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def isJust[T](t: tsmonadLib.libSrcMaybeMod.Maybe[T]): scala.Boolean = js.native
  def isNothing[T](t: tsmonadLib.libSrcMaybeMod.Maybe[T]): scala.Boolean = js.native
  def just[T](t: T): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def maybe[T](): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def maybe[T](t: T): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def nothing[T](): tsmonadLib.libSrcMaybeMod.Maybe[T] = js.native
  def sequence[T](t: org.scalablytyped.runtime.StringDictionary[tsmonadLib.libSrcMaybeMod.Maybe[T]]): tsmonadLib.libSrcMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[T]] = js.native
}

