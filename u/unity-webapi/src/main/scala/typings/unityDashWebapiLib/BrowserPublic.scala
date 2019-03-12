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
  def apply(getUnityObject: scala.Double => Unity): BrowserPublic = {
    val __obj = js.Dynamic.literal(getUnityObject = js.Any.fromFunction1(getUnityObject))
  
    __obj.asInstanceOf[BrowserPublic]
  }
}

