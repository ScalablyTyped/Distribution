package typings.symphonyApiClientNode.anon

import typings.symphonyApiClientNode.streamsClientMod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamTypes extends js.Object {
  
  var streamTypes: js.Array[StreamType] = js.native
}
object StreamTypes {
  
  @scala.inline
  def apply(streamTypes: js.Array[StreamType]): StreamTypes = {
    val __obj = js.Dynamic.literal(streamTypes = streamTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamTypes]
  }
  
  @scala.inline
  implicit class StreamTypesOps[Self <: StreamTypes] (val x: Self) extends AnyVal {
    
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
    def setStreamTypesVarargs(value: StreamType*): Self = this.set("streamTypes", js.Array(value :_*))
    
    @scala.inline
    def setStreamTypes(value: js.Array[StreamType]): Self = this.set("streamTypes", value.asInstanceOf[js.Any])
  }
}
