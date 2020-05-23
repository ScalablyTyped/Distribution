package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTimeChangeRequestedEventArgs extends ICurrentTimeChangeRequestedEventArgs

object CurrentTimeChangeRequestedEventArgs {
  @scala.inline
  def apply(time: Double): CurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTimeChangeRequestedEventArgs]
  }
}

