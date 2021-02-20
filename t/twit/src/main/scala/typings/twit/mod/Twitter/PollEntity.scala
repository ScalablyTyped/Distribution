package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollEntity extends StObject {
  
  var duration_minutes: String = js.native
  
  var end_datetime: String = js.native
  
  var options: js.Array[PollOptions] = js.native
}
object PollEntity {
  
  @scala.inline
  def apply(duration_minutes: String, end_datetime: String, options: js.Array[PollOptions]): PollEntity = {
    val __obj = js.Dynamic.literal(duration_minutes = duration_minutes.asInstanceOf[js.Any], end_datetime = end_datetime.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollEntity]
  }
  
  @scala.inline
  implicit class PollEntityMutableBuilder[Self <: PollEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration_minutes(value: String): Self = StObject.set(x, "duration_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_datetime(value: String): Self = StObject.set(x, "end_datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Array[PollOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: PollOptions*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
