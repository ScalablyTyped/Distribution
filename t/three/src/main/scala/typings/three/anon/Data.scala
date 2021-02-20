package typings.three.anon

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: String = js.native
  
  var isInterleavedBufferAttribute: `true` = js.native
  
  var itemSize: Double = js.native
  
  var normalized: Boolean = js.native
  
  var offset: Double = js.native
}
object Data {
  
  @scala.inline
  def apply(
    data: String,
    isInterleavedBufferAttribute: `true`,
    itemSize: Double,
    normalized: Boolean,
    offset: Double
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isInterleavedBufferAttribute = isInterleavedBufferAttribute.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
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
