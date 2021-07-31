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
  
  @scala.inline
  def apply(): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprojectOptions]
  }
  
  @scala.inline
  implicit class UnprojectOptionsMutableBuilder[Self <: UnprojectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetZ(value: Double): Self = StObject.set(x, "targetZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetZUndefined: Self = StObject.set(x, "targetZ", js.undefined)
  }
}
