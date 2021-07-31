package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSourceRequestedEventArgs
  extends StObject
     with IPlayToSourceRequestedEventArgs
object PlayToSourceRequestedEventArgs {
  
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): PlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceRequestedEventArgs]
  }
}
