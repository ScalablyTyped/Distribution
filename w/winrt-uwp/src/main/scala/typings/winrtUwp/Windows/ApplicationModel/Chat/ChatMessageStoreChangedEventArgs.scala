package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for the ChatMessageStoreChanged event. */
@js.native
trait ChatMessageStoreChangedEventArgs extends js.Object {
  
  /** Gets the ID of the object that changed. */
  var id: String = js.native
  
  /** Gets the type of change that happened. */
  var kind: ChatStoreChangedEventKind = js.native
}
object ChatMessageStoreChangedEventArgs {
  
  @scala.inline
  def apply(id: String, kind: ChatStoreChangedEventKind): ChatMessageStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageStoreChangedEventArgs]
  }
  
  @scala.inline
  implicit class ChatMessageStoreChangedEventArgsOps[Self <: ChatMessageStoreChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ChatStoreChangedEventKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
