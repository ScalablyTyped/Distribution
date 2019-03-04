package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  def getUnityObject(version: scala.Double): Unity
}

object External {
  @scala.inline
  def apply(getUnityObject: js.Function1[scala.Double, Unity]): External = {
    val __obj = js.Dynamic.literal(getUnityObject = getUnityObject)
  
    __obj.asInstanceOf[External]
  }
}

