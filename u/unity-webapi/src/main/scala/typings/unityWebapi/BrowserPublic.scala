package typings.unityWebapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserPublic extends js.Object {
  def getUnityObject(version: Double): Unity = js.native
}

object BrowserPublic {
  @scala.inline
  def apply(getUnityObject: Double => Unity): BrowserPublic = {
    val __obj = js.Dynamic.literal(getUnityObject = js.Any.fromFunction1(getUnityObject))
    __obj.asInstanceOf[BrowserPublic]
  }
  @scala.inline
  implicit class BrowserPublicOps[Self <: BrowserPublic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetUnityObject(value: Double => Unity): Self = this.set("getUnityObject", js.Any.fromFunction1(value))
  }
  
}

