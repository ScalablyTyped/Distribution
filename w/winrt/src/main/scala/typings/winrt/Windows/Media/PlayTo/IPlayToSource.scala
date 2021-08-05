package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSource extends StObject {
  
  var connection: PlayToConnection
  
  var next: PlayToSource
  
  def playNext(): Unit
}
object IPlayToSource {
  
  inline def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit): IPlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext))
    __obj.asInstanceOf[IPlayToSource]
  }
  
  extension [Self <: IPlayToSource](x: Self) {
    
    inline def setConnection(value: PlayToConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setNext(value: PlayToSource): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPlayNext(value: () => Unit): Self = StObject.set(x, "playNext", js.Any.fromFunction0(value))
  }
}
