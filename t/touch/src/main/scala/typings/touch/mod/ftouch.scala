package typings.touch.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("touch", "ftouch")
@js.native
object ftouch extends js.Object {
  def apply[T](fd: Double): js.Promise[T] = js.native
  def apply[T](fd: Double, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
  def apply[T](
    fd: Double,
    options: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]
  ): js.Promise[T] = js.native
  def apply[T](fd: Double, options: Options): js.Promise[T] = js.native
  def apply[T](fd: Double, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
}

