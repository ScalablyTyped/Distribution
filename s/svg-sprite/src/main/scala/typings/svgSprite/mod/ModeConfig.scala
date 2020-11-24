package typings.svgSprite.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModeConfig extends js.Object {
  
  /**
    * Add a content based hash to the name of the sprite file so that clients reliably reload the sprite
    * when it's content changes («cache busting»). Defaults to false except for «css» and «view» sprites.
    * @default true∣false
    */
  var bust: js.UndefOr[Boolean] = js.native
  
  /**
    * Base directory for sprite and CSS file output. If not absolute, the path will be resolved using the main output directory (see global dest option).
    * @default "<mode>"
    */
  var dest: js.UndefOr[String] = js.native
  
  /**
    * A non-empty string value will trigger the creation of additional CSS rules specifying the dimensions of each shape in the sprite.
    * The string will be used as suffix to mode.<mode>.prefix during CSS selector construction and may contain the placeholder "%s",
    * which will get replaced by the value of mode.<mode>.prefix.
    * A boolean TRUE will cause the dimensions to be included directly into each shape's CSS rule (only available for «css» and «view» sprites).
    * @default "-dims"
    */
  var dimensions: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Enabling this will trigger the creation of an HTML document demoing the usage of the sprite. Please see below for details on [rendering configurations](#rendering-configurations).
    * @default false
    */
  var example: js.UndefOr[RenderingConfiguration | Boolean] = js.native
  
  /**
    * Specify svg-sprite which output mode to use with this configuration
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * Used for prefixing the [shape ID](#shape-ids) during CSS selector construction. If the value is empty,
    * no prefix will be used. The prefix may contain the placeholder "%s" (e.g. ".svg %s-svg"),
    * which will then get replaced by the shape ID. Please be aware that "%" is a special character
    * in this context and that you'll have to escape it by another percent sign ("%%") in case you want
    * to output it to your stylesheets (e.g. for a [Sass placeholder selector](http://sass-lang.com/documentation/file.SASS_REFERENCE.html#placeholder_selectors_)).
    * @default ".svg-%s"
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Collection of [stylesheet rendering configurations](#rendering-configurations).
    * The keys are used as file extensions as well as file return keys. At present,
    * there are default templates for the file extensions css ([CSS](http://www.w3.org/Style/CSS/)),
    * scss ([Sass](http://sass-lang.com/)), less ([Less](http://lesscss.org/)) and styl ([Stylus](http://learnboost.github.io/stylus/)),
    * which all reside in the directory tmpl/css. Example: {css: true, scss: {dest: '_sprite.scss'}}
    * @default {}
    */
  var render: js.UndefOr[StringDictionary[RenderingConfiguration | Boolean]] = js.native
  
  /**
    * SVG sprite path and file name, relative to the mode.<mode>.dest directory.
    * You may omit the file extension, in which case it will be set to ".svg" automatically.
    * @default "svg/sprite.<mode>.svg"
    */
  var sprite: js.UndefOr[String] = js.native
}
object ModeConfig {
  
  @scala.inline
  def apply(): ModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModeConfig]
  }
  
  @scala.inline
  implicit class ModeConfigOps[Self <: ModeConfig] (val x: Self) extends AnyVal {
    
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
    def setBust(value: Boolean): Self = this.set("bust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBust: Self = this.set("bust", js.undefined)
    
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setDimensions(value: String | Boolean): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setExample(value: RenderingConfiguration | Boolean): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRender(value: StringDictionary[RenderingConfiguration | Boolean]): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSprite(value: String): Self = this.set("sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
  }
}
