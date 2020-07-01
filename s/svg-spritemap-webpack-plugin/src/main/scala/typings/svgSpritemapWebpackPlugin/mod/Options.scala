package typings.svgSpritemapWebpackPlugin.mod

import typings.svgSpritemapWebpackPlugin.anon.Chunk
import typings.svgSpritemapWebpackPlugin.anon.Filename
import typings.svgSpritemapWebpackPlugin.anon.Generate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/cascornelissen/svg-spritemap-webpack-plugin/blob/master/docs/options.md#options}
  */
trait Options extends js.Object {
  /**
    * The input object contains the configuration for the input of the plugin.
    */
  var input: js.UndefOr[typings.svgSpritemapWebpackPlugin.anon.Options] = js.undefined
  /**
    * The output object contains the configuration for the main output (SVG) of the plugin.
    */
  var output: js.UndefOr[Chunk] = js.undefined
  /**
    * The sprite object contains the configuration for the generated sprites in the output spritemap.
    */
  var sprite: js.UndefOr[Generate] = js.undefined
  var styles: js.UndefOr[Boolean | String | Filename] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    input: typings.svgSpritemapWebpackPlugin.anon.Options = null,
    output: Chunk = null,
    sprite: Generate = null,
    styles: Boolean | String | Filename = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

