package typings.svgSprite.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModeConfig extends js.Object {
  /**
    * Add a content based hash to the name of the sprite file so that clients reliably reload the sprite
    * when it's content changes («cache busting»). Defaults to false except for «css» and «view» sprites.
    * @default true∣false
    */
  var bust: js.UndefOr[Boolean] = js.undefined
  /**
    * Base directory for sprite and CSS file output. If not absolute, the path will be resolved using the main output directory (see global dest option).
    * @default "<mode>"
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * A non-empty string value will trigger the creation of additional CSS rules specifying the dimensions of each shape in the sprite.
    * The string will be used as suffix to mode.<mode>.prefix during CSS selector construction and may contain the placeholder "%s",
    * which will get replaced by the value of mode.<mode>.prefix.
    * A boolean TRUE will cause the dimensions to be included directly into each shape's CSS rule (only available for «css» and «view» sprites).
    * @default "-dims"
    */
  var dimensions: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Enabling this will trigger the creation of an HTML document demoing the usage of the sprite. Please see below for details on [rendering configurations](#rendering-configurations).
    * @default false
    */
  var example: js.UndefOr[RenderingConfiguration | Boolean] = js.undefined
  /**
    * Specify svg-sprite which output mode to use with this configuration
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * Used for prefixing the [shape ID](#shape-ids) during CSS selector construction. If the value is empty,
    * no prefix will be used. The prefix may contain the placeholder "%s" (e.g. ".svg %s-svg"),
    * which will then get replaced by the shape ID. Please be aware that "%" is a special character
    * in this context and that you'll have to escape it by another percent sign ("%%") in case you want
    * to output it to your stylesheets (e.g. for a [Sass placeholder selector](http://sass-lang.com/documentation/file.SASS_REFERENCE.html#placeholder_selectors_)).
    * @default ".svg-%s"
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Collection of [stylesheet rendering configurations](#rendering-configurations).
    * The keys are used as file extensions as well as file return keys. At present,
    * there are default templates for the file extensions css ([CSS](http://www.w3.org/Style/CSS/)),
    * scss ([Sass](http://sass-lang.com/)), less ([Less](http://lesscss.org/)) and styl ([Stylus](http://learnboost.github.io/stylus/)),
    * which all reside in the directory tmpl/css. Example: {css: true, scss: {dest: '_sprite.scss'}}
    * @default {}
    */
  var render: js.UndefOr[StringDictionary[RenderingConfiguration | Boolean]] = js.undefined
  /**
    * SVG sprite path and file name, relative to the mode.<mode>.dest directory.
    * You may omit the file extension, in which case it will be set to ".svg" automatically.
    * @default "svg/sprite.<mode>.svg"
    */
  var sprite: js.UndefOr[String] = js.undefined
}

object ModeConfig {
  @scala.inline
  def apply(
    bust: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    dimensions: String | Boolean = null,
    example: RenderingConfiguration | Boolean = null,
    mode: String = null,
    prefix: String = null,
    render: StringDictionary[RenderingConfiguration | Boolean] = null,
    sprite: String = null
  ): ModeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bust)) __obj.updateDynamic("bust")(bust.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeConfig]
  }
}

