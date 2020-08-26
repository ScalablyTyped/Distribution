package typings.svgSpritemapWebpackPlugin.anon

import typings.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generate extends js.Object {
  var generate: js.UndefOr[Symbol] = js.native
  /**
    * Amount of pixels added between each sprite to prevent overlap.
    * @default 0
    */
  var gutter: js.UndefOr[Double | `false`] = js.native
  /**
    * Function that will be used to transform the filename of each sprite into a valid HTML id
    */
  var idify: js.UndefOr[js.Function1[/* file */ String | `false`, String]] = js.native
  var prefix: js.UndefOr[String | (js.Function1[/* file */ String, String]) | `false`] = js.native
}

object Generate {
  @scala.inline
  def apply(): Generate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generate]
  }
  @scala.inline
  implicit class GenerateOps[Self <: Generate] (val x: Self) extends AnyVal {
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
    def setGenerate(value: Symbol): Self = this.set("generate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    @scala.inline
    def setGutter(value: Double | `false`): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setIdify(value: /* file */ String | `false` => String): Self = this.set("idify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIdify: Self = this.set("idify", js.undefined)
    @scala.inline
    def setPrefixFunction1(value: /* file */ String => String): Self = this.set("prefix", js.Any.fromFunction1(value))
    @scala.inline
    def setPrefix(value: String | (js.Function1[/* file */ String, String]) | `false`): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

