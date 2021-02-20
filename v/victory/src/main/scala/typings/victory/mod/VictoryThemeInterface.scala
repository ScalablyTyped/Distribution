package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryThemeInterface extends StObject {
  
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
  implicit class VictoryThemeInterfaceMutableBuilder[Self <: VictoryThemeInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrayscale(value: VictoryThemeDefinition): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterial(value: VictoryThemeDefinition): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}
