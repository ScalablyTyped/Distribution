package typings.whatwgUrl.urlImplMod

import typings.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-url/lib/URL-impl", "implementation")
@js.native
class implementation protected () extends URLImpl {
  def this(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]]) = this()
  def this(globalObject: js.Object, hasUrlBase: js.Tuple2[String, js.UndefOr[String]], privateData: js.Object) = this()
  /* CompleteClass */
  override var hash: String = js.native
  /* CompleteClass */
  override var host: String = js.native
  /* CompleteClass */
  override var hostname: String = js.native
  /* CompleteClass */
  override var href: String = js.native
  /* CompleteClass */
  override val origin: String = js.native
  /* CompleteClass */
  override var password: String = js.native
  /* CompleteClass */
  override var pathname: String = js.native
  /* CompleteClass */
  override var port: String = js.native
  /* CompleteClass */
  override var protocol: String = js.native
  /* CompleteClass */
  override var search: String = js.native
  /* CompleteClass */
  override val searchParams: URLSearchParams = js.native
  /* CompleteClass */
  override var username: String = js.native
  /* CompleteClass */
  override def toJSON(): String = js.native
}

