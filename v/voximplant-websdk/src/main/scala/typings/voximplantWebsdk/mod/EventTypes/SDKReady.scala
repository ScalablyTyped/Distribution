package typings.voximplantWebsdk.mod.EventTypes

import typings.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched after SDK was successfully initialized after init function call
  */
trait SDKReady extends VoxImplantEvent {
  /**
    *    SDK version
    */
  var version: String
}

object SDKReady {
  @scala.inline
  def apply(version: String): SDKReady = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKReady]
  }
}

