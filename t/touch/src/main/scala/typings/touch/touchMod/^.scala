package typings.touch.touchMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("touch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](filename: String): js.Promise[T] = js.native
  def apply[T](filename: String, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
  def apply[T](filename: String, options: Options): js.Promise[T] = js.native
  def apply[T](filename: String, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
  def ftouch[T](fd: Double): js.Promise[T] = js.native
  def ftouch[T](fd: Double, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
  def ftouch[T](fd: Double, options: Options): js.Promise[T] = js.native
  def ftouch[T](fd: Double, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
  def ftouchSync(fd: Double): Unit = js.native
  def ftouchSync(fd: Double, options: Options): Unit = js.native
  def sync(filename: String): Unit = js.native
  def sync(filename: String, options: Options): Unit = js.native
}

