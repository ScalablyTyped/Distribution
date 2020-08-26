package typings.svgSprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefsAndSymbolSpecificModeConfig extends ModeConfig {
  /**
    * If you want to embed the sprite into your HTML source, you will want to set this to true
    * in order to prevent the creation of SVG namespace declarations and to set some other attributes for effectively hiding the library sprite.
    * @default false
    */
  var `inline`: js.UndefOr[Boolean] = js.native
}

object DefsAndSymbolSpecificModeConfig {
  @scala.inline
  def apply(): DefsAndSymbolSpecificModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsAndSymbolSpecificModeConfig]
  }
  @scala.inline
  implicit class DefsAndSymbolSpecificModeConfigOps[Self <: DefsAndSymbolSpecificModeConfig] (val x: Self) extends AnyVal {
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
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
  }
  
}

