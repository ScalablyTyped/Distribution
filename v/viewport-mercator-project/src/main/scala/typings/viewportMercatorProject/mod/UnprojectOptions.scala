package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprojectOptions
  extends StObject
     with ProjectOptions {
  
  var targetZ: js.UndefOr[Double] = js.undefined
}
object UnprojectOptions {
  
  inline def apply(): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprojectOptions]
  }
  
  extension [Self <: UnprojectOptions](x: Self) {
    
    inline def setTargetZ(value: Double): Self = StObject.set(x, "targetZ", value.asInstanceOf[js.Any])
    
    inline def setTargetZUndefined: Self = StObject.set(x, "targetZ", js.undefined)
  }
}
