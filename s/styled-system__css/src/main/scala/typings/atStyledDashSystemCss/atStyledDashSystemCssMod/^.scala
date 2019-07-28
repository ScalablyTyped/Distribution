package typings.atStyledDashSystemCss.atStyledDashSystemCssMod

import typings.atStyledDashSystemCss.Anon_Theme
import typings.atStyledDashSystemCss.Anon_Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@styled-system/css", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def css(): js.Function1[/* props */ js.UndefOr[Theme[scala.Nothing] | Anon_Theme], CSSObject] = js.native
  def css(input: SystemStyleObject with Anon_Variant): js.Function1[/* props */ js.UndefOr[Theme[scala.Nothing] | Anon_Theme], CSSObject] = js.native
  def css(input: js.Function1[/* theme */ Theme[scala.Nothing], SystemStyleObject with Anon_Variant]): js.Function1[/* props */ js.UndefOr[Theme[scala.Nothing] | Anon_Theme], CSSObject] = js.native
  def default(): js.Function1[/* props */ js.UndefOr[Theme[scala.Nothing] | Anon_Theme], CSSObject] = js.native
  def default(input: SystemStyleObject with Anon_Variant): js.Function1[/* props */ js.UndefOr[Theme[scala.Nothing] | Anon_Theme], CSSObject] = js.native
  def default(input: js.Function1[/* theme */ Theme[scala.Nothing], SystemStyleObject with Anon_Variant]): js.Function1[/* props */ js.UndefOr[Theme[scala.Nothing] | Anon_Theme], CSSObject] = js.native
  def get(`object`: js.Object, key: String): js.Any = js.native
  def get(`object`: js.Object, key: String, defaultValue: js.Any): js.Any = js.native
  def get(`object`: js.Object, key: js.Array[String]): js.Any = js.native
  def get(`object`: js.Object, key: js.Array[String], defaultValue: js.Any): js.Any = js.native
  def responsive(styles: js.Object): js.Function1[/* theme */ js.Object, js.Array[_]] = js.native
}

