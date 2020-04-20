package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceRequestedEventArgs extends js.Object {
  var sourceRequest: PlayToSourceRequest
}

object IPlayToSourceRequestedEventArgs {
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): IPlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(sourceRequest = sourceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToSourceRequestedEventArgs]
  }
}

