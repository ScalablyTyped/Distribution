package typings
package vsoDashNodeDashApiLib.serializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebApiArrayResult extends js.Object {
  var count: scala.Double
  var value: js.Array[_]
}

object IWebApiArrayResult {
  @scala.inline
  def apply(count: scala.Double, value: js.Array[_]): IWebApiArrayResult = {
    val __obj = js.Dynamic.literal(count = count, value = value)
  
    __obj.asInstanceOf[IWebApiArrayResult]
  }
}

