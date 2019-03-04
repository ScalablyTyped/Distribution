package typings
package victoryLib.victoryMod

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
    val __obj = js.Dynamic.literal(grayscale = grayscale, material = material)
  
    __obj.asInstanceOf[VictoryThemeInterface]
  }
}

