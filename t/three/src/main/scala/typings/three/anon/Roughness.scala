package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Roughness extends StObject {
  
  var roughness: default
}
object Roughness {
  
  inline def apply(roughness: default): Roughness = {
    val __obj = js.Dynamic.literal(roughness = roughness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roughness]
  }
  
  extension [Self <: Roughness](x: Self) {
    
    inline def setRoughness(value: default): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
  }
}
