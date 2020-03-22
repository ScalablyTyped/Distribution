package typings.winrt

import typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4 extends js.Object {
  var items: js.Array[PnpObject]
  var returnValue: Double
}

object Anon4 {
  @scala.inline
  def apply(items: js.Array[PnpObject], returnValue: Double): Anon4 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon4]
  }
}

