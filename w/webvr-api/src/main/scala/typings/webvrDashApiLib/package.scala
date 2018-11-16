package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webvrDashApiLib {
  type VRDisplayEventReason_dt_alias = webvrDashApiLib.webvrDashApiLibStrings.mounted | webvrDashApiLib.webvrDashApiLibStrings.navigation | webvrDashApiLib.webvrDashApiLibStrings.requested | webvrDashApiLib.webvrDashApiLibStrings.unmounted
  // Typescript doesn't allow redefinition of type aliases even if they match,
  // thus the _dt_alias to signal this being an alias for the use of DefinitelyTyped
  type VREye_dt_alias = webvrDashApiLib.webvrDashApiLibStrings.left | webvrDashApiLib.webvrDashApiLibStrings.right
}
