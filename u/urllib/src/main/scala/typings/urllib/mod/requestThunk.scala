package typings.urllib.mod

import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urllib", "requestThunk")
@js.native
object requestThunk extends js.Object {
  def apply[T](url: String): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def apply[T](url: String, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def apply[T](url: URL_): js.Function1[/* callback */ Callback[T], Unit] = js.native
  def apply[T](url: URL_, options: RequestOptions): js.Function1[/* callback */ Callback[T], Unit] = js.native
}

