package typings.tsmonad.tsmonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsmonad", "Writer")
@js.native
class Writer[S, T] protected ()
  extends typings.tsmonad.libSrcWriterMod.Writer[S, T] {
  def this(story: js.Array[S], value: T) = this()
}

/* static members */
@JSImport("tsmonad", "Writer")
@js.native
object Writer extends js.Object {
  def tell[S](s: S): typings.tsmonad.libSrcWriterMod.Writer[S, Double] = js.native
  def writer[S, T](story: js.Array[S], value: T): typings.tsmonad.libSrcWriterMod.Writer[S, T] = js.native
}

