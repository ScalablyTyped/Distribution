package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.EventTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after SDK was successfully initialized after init function call
		*/
trait SDKReady
  extends voximplantDashWebsdkLib.voximplantDashWebsdkMod.VoxImplantNs.VoxImplantEvent {
  /**
  			*	SDK version
  			*/
  var version: java.lang.String
}

object SDKReady {
  @scala.inline
  def apply(version: java.lang.String): SDKReady = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SDKReady]
  }
}

