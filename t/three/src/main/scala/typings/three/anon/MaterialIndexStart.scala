package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialIndexStart extends StObject {
  
  var materialIndex: Double
  
  var start: Double
}
object MaterialIndexStart {
  
  @scala.inline
  def apply(materialIndex: Double, start: Double): MaterialIndexStart = {
    val __obj = js.Dynamic.literal(materialIndex = materialIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndexStart]
  }
  
  @scala.inline
  implicit class MaterialIndexStartMutableBuilder[Self <: MaterialIndexStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
