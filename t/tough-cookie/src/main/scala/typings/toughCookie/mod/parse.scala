package typings.toughCookie.mod

import typings.toughCookie.mod.Cookie.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "parse")
@js.native
object parse extends js.Object {
  def apply(cookieString: String): js.UndefOr[Cookie] = js.native
  def apply(cookieString: String, options: ParseOptions): js.UndefOr[Cookie] = js.native
}

