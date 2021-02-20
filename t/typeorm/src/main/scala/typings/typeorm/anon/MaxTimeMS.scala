package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxTimeMS extends StObject {
  
  var maxTimeMS: js.UndefOr[Double] = js.native
  
  var projection: js.UndefOr[js.Object] = js.native
  
  var sort: js.UndefOr[js.Object] = js.native
}
object MaxTimeMS {
  
  @scala.inline
  def apply(): MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMS]
  }
  
  @scala.inline
  implicit class MaxTimeMSMutableBuilder[Self <: MaxTimeMS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setProjection(value: js.Object): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
