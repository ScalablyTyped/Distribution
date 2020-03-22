package typings.winrt

import typings.winrt.Windows.Data.Json.IJsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var items: js.Array[IJsonValue]
  var returnValue: Double
}

object Anon1 {
  @scala.inline
  def apply(items: js.Array[IJsonValue], returnValue: Double): Anon1 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon1]
  }
}

