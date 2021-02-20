package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToSource extends StObject {
  
  var connection: PlayToConnection = js.native
  
  var next: PlayToSource = js.native
  
  def playNext(): Unit = js.native
}
object IPlayToSource {
  
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit): IPlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext))
    __obj.asInstanceOf[IPlayToSource]
  }
  
  @scala.inline
  implicit class IPlayToSourceMutableBuilder[Self <: IPlayToSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: PlayToConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: PlayToSource): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayNext(value: () => Unit): Self = StObject.set(x, "playNext", js.Any.fromFunction0(value))
  }
}
