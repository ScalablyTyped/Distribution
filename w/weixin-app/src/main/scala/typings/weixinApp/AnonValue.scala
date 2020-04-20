package typings.weixinApp

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var value: StringDictionary[String | Boolean | Double]
}

object AnonValue {
  @scala.inline
  def apply(value: StringDictionary[String | Boolean | Double]): AnonValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

