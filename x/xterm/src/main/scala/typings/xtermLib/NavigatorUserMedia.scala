package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorUserMedia extends js.Object {
  val mediaDevices: MediaDevices
  def getDisplayMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream]
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): scala.Unit
}

object NavigatorUserMedia {
  @scala.inline
  def apply(
    getDisplayMedia: js.Function1[MediaStreamConstraints, js.Promise[MediaStream]],
    getUserMedia: js.Function3[
      MediaStreamConstraints, 
      NavigatorUserMediaSuccessCallback, 
      NavigatorUserMediaErrorCallback, 
      scala.Unit
    ],
    mediaDevices: MediaDevices
  ): NavigatorUserMedia = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisplayMedia")(getDisplayMedia)
    __obj.updateDynamic("getUserMedia")(getUserMedia)
    __obj.updateDynamic("mediaDevices")(mediaDevices)
    __obj.asInstanceOf[NavigatorUserMedia]
  }
}

