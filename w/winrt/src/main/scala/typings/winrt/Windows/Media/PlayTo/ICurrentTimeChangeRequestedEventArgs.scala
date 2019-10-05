package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentTimeChangeRequestedEventArgs extends js.Object {
  var time: Double
}

object ICurrentTimeChangeRequestedEventArgs {
  @scala.inline
  def apply(time: Double): ICurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time)
  
    __obj.asInstanceOf[ICurrentTimeChangeRequestedEventArgs]
  }
}

