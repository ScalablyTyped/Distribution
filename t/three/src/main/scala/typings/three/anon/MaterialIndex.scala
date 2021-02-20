package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialIndex extends StObject {
  
  var count: Double = js.native
  
  var materialIndex: js.UndefOr[Double] = js.native
  
  var start: Double = js.native
}
object MaterialIndex {
  
  @scala.inline
  def apply(count: Double, start: Double): MaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndex]
  }
  
  @scala.inline
  implicit class MaterialIndexMutableBuilder[Self <: MaterialIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialIndexUndefined: Self = StObject.set(x, "materialIndex", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
