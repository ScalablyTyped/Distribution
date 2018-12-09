package typings
package touchLib.touchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("touch", JSImport.Namespace)
@js.native
object touchModMembers extends js.Object {
  def apply[T](filename: java.lang.String): js.Promise[T] = js.native
  def apply[T](
    filename: java.lang.String,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]
  ): js.Promise[T] = js.native
  def apply[T](filename: java.lang.String, options: touchLib.touchMod.touchNs.Options): js.Promise[T] = js.native
  def apply[T](
    filename: java.lang.String,
    options: touchLib.touchMod.touchNs.Options,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]
  ): js.Promise[T] = js.native
  def ftouch[T](fd: scala.Double): js.Promise[T] = js.native
  def ftouch[T](fd: scala.Double, cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]): js.Promise[T] = js.native
  def ftouch[T](fd: scala.Double, options: touchLib.touchMod.touchNs.Options): js.Promise[T] = js.native
  def ftouch[T](
    fd: scala.Double,
    options: touchLib.touchMod.touchNs.Options,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], T]
  ): js.Promise[T] = js.native
  def ftouchSync(fd: scala.Double): scala.Unit = js.native
  def ftouchSync(fd: scala.Double, options: touchLib.touchMod.touchNs.Options): scala.Unit = js.native
  def sync(filename: java.lang.String): scala.Unit = js.native
  def sync(filename: java.lang.String, options: touchLib.touchMod.touchNs.Options): scala.Unit = js.native
}

