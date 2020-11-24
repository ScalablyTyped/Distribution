package typings.touch.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("touch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T](filename: String): js.Promise[T] = js.native
  def apply[T](filename: String, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
  def apply[T](
    filename: String,
    options: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]
  ): js.Promise[T] = js.native
  def apply[T](filename: String, options: Options): js.Promise[T] = js.native
  def apply[T](filename: String, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = js.native
}
