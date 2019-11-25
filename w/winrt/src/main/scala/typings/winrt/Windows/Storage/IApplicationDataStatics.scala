package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationDataStatics extends js.Object {
  var current: ApplicationData
}

object IApplicationDataStatics {
  @scala.inline
  def apply(current: ApplicationData): IApplicationDataStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IApplicationDataStatics]
  }
}

