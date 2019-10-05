package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationErrorStatics extends js.Object {
  def getStatus(hresult: Double): SyndicationErrorStatus
}

object ISyndicationErrorStatics {
  @scala.inline
  def apply(getStatus: Double => SyndicationErrorStatus): ISyndicationErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[ISyndicationErrorStatics]
  }
}

