package typings.winrt

import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Succeeded extends js.Object {
  var succeeded: Boolean
  var value: PowerlineFrequency
}

object Anon_Succeeded {
  @scala.inline
  def apply(succeeded: Boolean, value: PowerlineFrequency): Anon_Succeeded = {
    val __obj = js.Dynamic.literal(succeeded = succeeded, value = value)
  
    __obj.asInstanceOf[Anon_Succeeded]
  }
}

