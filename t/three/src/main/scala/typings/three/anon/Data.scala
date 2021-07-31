package typings.three.anon

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: String
  
  var isInterleavedBufferAttribute: `true`
  
  var itemSize: Double
  
  var normalized: Boolean
  
  var offset: Double
}
object Data {
  
  @scala.inline
  def apply(data: String, itemSize: Double, normalized: Boolean, offset: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isInterleavedBufferAttribute = true, itemSize = itemSize.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInterleavedBufferAttribute(value: `true`): Self = StObject.set(x, "isInterleavedBufferAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
