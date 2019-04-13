package typings
package touchLib.touchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("touch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](filename: java.lang.String): js.Promise[T] = js.native
  def apply[T](
    filename: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]
  ): js.Promise[T] = js.native
  def apply[T](filename: java.lang.String, options: Options): js.Promise[T] = js.native
  def apply[T](
    filename: java.lang.String,
    options: Options,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]
  ): js.Promise[T] = js.native
  def ftouch[T](fd: scala.Double): js.Promise[T] = js.native
  def ftouch[T](fd: scala.Double, cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]): js.Promise[T] = js.native
  def ftouch[T](fd: scala.Double, options: Options): js.Promise[T] = js.native
  def ftouch[T](
    fd: scala.Double,
    options: Options,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]
  ): js.Promise[T] = js.native
  def ftouchSync(fd: scala.Double): scala.Unit = js.native
  def ftouchSync(fd: scala.Double, options: Options): scala.Unit = js.native
  def sync(filename: java.lang.String): scala.Unit = js.native
  def sync(filename: java.lang.String, options: Options): scala.Unit = js.native
}

