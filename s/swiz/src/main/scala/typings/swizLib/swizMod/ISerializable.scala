package typings
package swizLib.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializable extends js.Object {
  def getSerializerType(): java.lang.String
}

object ISerializable {
  @scala.inline
  def apply(getSerializerType: () => java.lang.String): ISerializable = {
    val __obj = js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType))
  
    __obj.asInstanceOf[ISerializable]
  }
}

