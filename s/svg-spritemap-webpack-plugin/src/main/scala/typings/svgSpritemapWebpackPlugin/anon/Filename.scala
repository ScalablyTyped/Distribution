package typings.svgSpritemapWebpackPlugin.anon

import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.data
import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filename extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[data | fragment] = js.undefined
  var variables: js.UndefOr[Mixin] = js.undefined
}

object Filename {
  @scala.inline
  def apply(filename: String = null, format: data | fragment = null, variables: Mixin = null): Filename = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
}

