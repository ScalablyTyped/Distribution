package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSource
  extends StObject
     with IPlayToSource
object PlayToSource {
  
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit): PlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext))
    __obj.asInstanceOf[PlayToSource]
  }
}
