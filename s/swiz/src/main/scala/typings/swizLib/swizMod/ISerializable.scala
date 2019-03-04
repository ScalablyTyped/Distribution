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
  def apply(getSerializerType: js.Function0[java.lang.String]): ISerializable = {
    val __obj = js.Dynamic.literal(getSerializerType = getSerializerType)
  
    __obj.asInstanceOf[ISerializable]
  }
}

