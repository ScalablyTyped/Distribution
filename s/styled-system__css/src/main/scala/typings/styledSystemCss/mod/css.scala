package typings.styledSystemCss.mod

import typings.styledSystemCss.AnonTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@styled-system/css", "css")
@js.native
object css extends js.Object {
  def apply(): js.Function1[/* props */ js.UndefOr[Theme | AnonTheme], CSSObject] = js.native
  def apply(input: SystemStyleObject): js.Function1[/* props */ js.UndefOr[Theme | AnonTheme], CSSObject] = js.native
}

