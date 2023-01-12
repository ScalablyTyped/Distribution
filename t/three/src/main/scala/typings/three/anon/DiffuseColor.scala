package typings.three.anon

import typings.three.examplesJsmNodesCoreNodeMod.default
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffuseColor] (val x: Self) extends AnyVal {
    
    inline def setDiffuseColor(value: default): Self = StObject.set(x, "diffuseColor", value.asInstanceOf[js.Any])
  }
}
