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
@js.native
trait Options extends js.Object {
  /**
    * The input object contains the configuration for the input of the plugin.
    */
  var input: js.UndefOr[typings.svgSpritemapWebpackPlugin.anon.Options] = js.native
  /**
    * The output object contains the configuration for the main output (SVG) of the plugin.
    */
  var output: js.UndefOr[Chunk] = js.native
  /**
    * The sprite object contains the configuration for the generated sprites in the output spritemap.
    */
  var sprite: js.UndefOr[Generate] = js.native
  var styles: js.UndefOr[Boolean | String | Filename] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInput(value: typings.svgSpritemapWebpackPlugin.anon.Options): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setOutput(value: Chunk): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setSprite(value: Generate): Self = this.set("sprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    @scala.inline
    def setStyles(value: Boolean | String | Filename): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

