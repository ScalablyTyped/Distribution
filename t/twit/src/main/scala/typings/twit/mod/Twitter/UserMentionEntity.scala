package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMentionEntity extends StObject {
  
  var id: Double
  
  var id_str: String
  
  var indices: js.Tuple2[Double, Double]
  
  var name: String
  
  var screen_name: String
}
object UserMentionEntity {
  
  @scala.inline
  def apply(id: Double, id_str: String, indices: js.Tuple2[Double, Double], name: String, screen_name: String): UserMentionEntity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMentionEntity]
  }
  
  @scala.inline
  implicit class UserMentionEntityMutableBuilder[Self <: UserMentionEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
  }
}
