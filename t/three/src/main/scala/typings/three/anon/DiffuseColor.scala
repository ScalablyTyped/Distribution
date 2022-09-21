package typings.three.anon

import typings.three.nodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffuseColor extends StObject {
  
  var diffuseColor: default
}
object DiffuseColor {
  
  inline def apply(diffuseColor: default): DiffuseColor = {
    val __obj = js.Dynamic.literal(diffuseColor = diffuseColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffuseColor]
  }
  
  extension [Self <: DiffuseColor](x: Self) {
    
    inline def setDiffuseColor(value: default): Self = StObject.set(x, "diffuseColor", value.asInstanceOf[js.Any])
  }
}
