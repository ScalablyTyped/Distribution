package typings.victory.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryThemeInterface extends js.Object {
  /**
    * Default theme
    */
  var grayscale: VictoryThemeDefinition
  var material: VictoryThemeDefinition
}

object VictoryThemeInterface {
  @scala.inline
  def apply(grayscale: VictoryThemeDefinition, material: VictoryThemeDefinition): VictoryThemeInterface = {
    val __obj = js.Dynamic.literal(grayscale = grayscale.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VictoryThemeInterface]
  }
}

