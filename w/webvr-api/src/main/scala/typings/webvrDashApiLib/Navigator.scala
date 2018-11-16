package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay]
  def getVRDisplays(): stdLib.Promise[js.Array[VRDisplay]]
}

