package typings
package unityDashWebapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserPublic extends js.Object {
  def getUnityObject(version: scala.Double): Unity
}

object BrowserPublic {
  @scala.inline
  def apply(getUnityObject: js.Function1[scala.Double, Unity]): BrowserPublic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUnityObject")(getUnityObject)
    __obj.asInstanceOf[BrowserPublic]
  }
}

