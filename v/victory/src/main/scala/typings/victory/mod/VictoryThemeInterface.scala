package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryThemeInterface extends StObject {
  
  /**
    * Default theme
    */
  var grayscale: VictoryThemeDefinition
  
  var material: VictoryThemeDefinition
}
object VictoryThemeInterface {
  
  inline def apply(grayscale: VictoryThemeDefinition, material: VictoryThemeDefinition): VictoryThemeInterface = {
    val __obj = js.Dynamic.literal(grayscale = grayscale.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryThemeInterface]
  }
  
  extension [Self <: VictoryThemeInterface](x: Self) {
    
    inline def setGrayscale(value: VictoryThemeDefinition): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
    
    inline def setMaterial(value: VictoryThemeDefinition): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
  }
}
