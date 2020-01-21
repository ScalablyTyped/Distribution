package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  def getUnityObject(version: Double): Unity
}

object External {
  @scala.inline
  def apply(getUnityObject: Double => Unity): External = {
    val __obj = js.Dynamic.literal(getUnityObject = js.Any.fromFunction1(getUnityObject))
  
    __obj.asInstanceOf[External]
  }
}

