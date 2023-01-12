package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashtagEntity extends StObject {
  
  var indices: js.Tuple2[Double, Double]
  
  var text: String
}
object HashtagEntity {
  
  inline def apply(indices: js.Tuple2[Double, Double], text: String): HashtagEntity = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashtagEntity] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
