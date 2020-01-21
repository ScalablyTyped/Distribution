package typings.toughCookie.mod.Cookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "Cookie")
@js.native
object ^ extends js.Object {
  def fromJSON(strOrObj: String): typings.toughCookie.mod.Cookie | Null = js.native
  def fromJSON(strOrObj: js.Object): typings.toughCookie.mod.Cookie | Null = js.native
  def parse(cookieString: String): js.UndefOr[typings.toughCookie.mod.Cookie] = js.native
  def parse(cookieString: String, options: ParseOptions): js.UndefOr[typings.toughCookie.mod.Cookie] = js.native
}

