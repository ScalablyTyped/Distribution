package typings.svgSprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingConfiguration extends js.Object {
  /**
    * HTML document destination
    * @default "sprite.<mode>.html"
    */
  var dest: js.UndefOr[String] = js.native
  /**
    * HTML document Mustache template
    * @default "tmpl/<mode>/sprite.html"
    */
  var template: js.UndefOr[String] = js.native
}

object RenderingConfiguration {
  @scala.inline
  def apply(): RenderingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingConfiguration]
  }
  @scala.inline
  implicit class RenderingConfigurationOps[Self <: RenderingConfiguration] (val x: Self) extends AnyVal {
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
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

