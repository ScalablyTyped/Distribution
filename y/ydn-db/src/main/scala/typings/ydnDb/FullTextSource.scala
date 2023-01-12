package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullTextSource extends StObject {
  
  var keyPath: String
  
  var storeName: String
  
  var weight: js.UndefOr[Double] = js.undefined
}
object FullTextSource {
  
  inline def apply(keyPath: String, storeName: String): FullTextSource = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullTextSource] (val x: Self) extends AnyVal {
    
    inline def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
