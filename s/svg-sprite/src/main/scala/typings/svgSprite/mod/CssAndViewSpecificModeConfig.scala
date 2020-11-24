package typings.svgSprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssAndViewSpecificModeConfig extends ModeConfig {
  
  /**
    * If given and not empty, this will be the selector name of a CSS rule commonly specifying the background-image
    * and background-repeat properties for all the shapes in the sprite (thus saving some bytes by not unnecessarily repeating them for each shape)
    */
  var common: js.UndefOr[String] = js.native
  
  /**
    * The arrangement of the shapes within the sprite. Might be "vertical", "horizontal", "diagonal" or "packed"
    * (with the latter being the most compact type). It depends on your project which layout is best for you.
    * @default "packed"
    */
  var layout: js.UndefOr[String] = js.native
  
  /**
    * If given and not empty, a mixin with this name will be added to supporting output formats (e.g. Sass, LESS, Stylus),
    * specifying the background-image and background-repeat properties for all the shapes in the sprite.
    * You may use it for creating custom CSS within @media rules. The mixin acts much like the common rule.
    * In fact, you can even combine the two - if both are enabled, the common rule will use the mixin internally.
    */
  var mixin: js.UndefOr[String] = js.native
}
object CssAndViewSpecificModeConfig {
  
  @scala.inline
  def apply(): CssAndViewSpecificModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssAndViewSpecificModeConfig]
  }
  
  @scala.inline
  implicit class CssAndViewSpecificModeConfigOps[Self <: CssAndViewSpecificModeConfig] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: String): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMixin(value: String): Self = this.set("mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMixin: Self = this.set("mixin", js.undefined)
  }
}
