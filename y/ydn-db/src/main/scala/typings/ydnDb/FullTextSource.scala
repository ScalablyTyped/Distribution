package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullTextSource extends StObject {
  
  var keyPath: String = js.native
  
  var storeName: String = js.native
  
  var weight: js.UndefOr[Double] = js.native
}
object FullTextSource {
  
  @scala.inline
  def apply(keyPath: String, storeName: String): FullTextSource = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTextSource]
  }
  
  @scala.inline
  implicit class FullTextSourceMutableBuilder[Self <: FullTextSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
