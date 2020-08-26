package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryThemeInterface extends js.Object {
  /**
    * Default theme
    */
  var grayscale: VictoryThemeDefinition = js.native
  var material: VictoryThemeDefinition = js.native
}

object VictoryThemeInterface {
  @scala.inline
  def apply(grayscale: VictoryThemeDefinition, material: VictoryThemeDefinition): VictoryThemeInterface = {
    val __obj = js.Dynamic.literal(grayscale = grayscale.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryThemeInterface]
  }
  @scala.inline
  implicit class VictoryThemeInterfaceOps[Self <: VictoryThemeInterface] (val x: Self) extends AnyVal {
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
    def setGrayscale(value: VictoryThemeDefinition): Self = this.set("grayscale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterial(value: VictoryThemeDefinition): Self = this.set("material", value.asInstanceOf[js.Any])
  }
  
}

