package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashtagEntity extends StObject {
  
  var indices: js.Tuple2[Double, Double] = js.native
  
  var text: String = js.native
}
object HashtagEntity {
  
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], text: String): HashtagEntity = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashtagEntity]
  }
  
  @scala.inline
  implicit class HashtagEntityMutableBuilder[Self <: HashtagEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
