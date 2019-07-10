package typings
package atStyledDashSystemCssLib.atStyledDashSystemCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@styled-system/css", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def css(): js.Function1[
    /* props */ js.UndefOr[Theme[scala.Nothing] | atStyledDashSystemCssLib.Anon_Theme], 
    CSSObject
  ] = js.native
  def css(
    input: SystemStyleObject with (atStyledDashSystemCssLib.Anon_Variant | (js.Function1[
      /* theme */ Theme[scala.Nothing], 
      SystemStyleObject with atStyledDashSystemCssLib.Anon_Variant
    ]))
  ): js.Function1[
    /* props */ js.UndefOr[Theme[scala.Nothing] | atStyledDashSystemCssLib.Anon_Theme], 
    CSSObject
  ] = js.native
  def default(): js.Function1[
    /* props */ js.UndefOr[Theme[scala.Nothing] | atStyledDashSystemCssLib.Anon_Theme], 
    CSSObject
  ] = js.native
  def default(
    input: SystemStyleObject with (atStyledDashSystemCssLib.Anon_Variant | (js.Function1[
      /* theme */ Theme[scala.Nothing], 
      SystemStyleObject with atStyledDashSystemCssLib.Anon_Variant
    ]))
  ): js.Function1[
    /* props */ js.UndefOr[Theme[scala.Nothing] | atStyledDashSystemCssLib.Anon_Theme], 
    CSSObject
  ] = js.native
  def get(`object`: js.Object, key: java.lang.String): js.Any = js.native
  def get(`object`: js.Object, key: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def get(`object`: js.Object, key: js.Array[java.lang.String]): js.Any = js.native
  def get(`object`: js.Object, key: js.Array[java.lang.String], defaultValue: js.Any): js.Any = js.native
  def responsive(styles: js.Object): js.Function1[/* theme */ js.Object, js.Array[_]] = js.native
}

