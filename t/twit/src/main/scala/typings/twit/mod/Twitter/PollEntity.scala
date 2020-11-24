package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollEntity extends js.Object {
  
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
  implicit class PollEntityOps[Self <: PollEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration_minutes(value: String): Self = this.set("duration_minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_datetime(value: String): Self = this.set("end_datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: PollOptions*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[PollOptions]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
