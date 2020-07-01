package typings.svgSpritemapWebpackPlugin.anon

import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generate extends js.Object {
  var generate: js.UndefOr[Symbol] = js.undefined
  /**
    * Amount of pixels added between each sprite to prevent overlap.
    * @default 0
    */
  var gutter: js.UndefOr[Double | `false`] = js.undefined
  /**
    * Function that will be used to transform the filename of each sprite into a valid HTML id
    */
  var idify: js.UndefOr[js.Function1[/* file */ String | `false`, String]] = js.undefined
  var prefix: js.UndefOr[String | (js.Function1[/* file */ String, String]) | `false`] = js.undefined
}

object Generate {
  @scala.inline
  def apply(
    generate: Symbol = null,
    gutter: Double | `false` = null,
    idify: /* file */ String | `false` => String = null,
    prefix: String | (js.Function1[/* file */ String, String]) | `false` = null
  ): Generate = {
    val __obj = js.Dynamic.literal()
    if (generate != null) __obj.updateDynamic("generate")(generate.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (idify != null) __obj.updateDynamic("idify")(js.Any.fromFunction1(idify))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generate]
  }
}

