package typings.validUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("valid-url", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isHttpUri(value: String): js.UndefOr[String] = js.native
  def isHttpsUri(value: String): js.UndefOr[String] = js.native
  def isUri(value: String): js.UndefOr[String] = js.native
  def isWebUri(value: String): js.UndefOr[String] = js.native
}

