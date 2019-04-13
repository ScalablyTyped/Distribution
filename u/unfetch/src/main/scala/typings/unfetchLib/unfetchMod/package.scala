package typings
package unfetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unfetchMod {
  type IsomorphicBody = stdLib.Body | nodeDashFetchLib.nodeDashFetchMod.Body
  type IsomorphicHeaders = stdLib.Headers | nodeDashFetchLib.nodeDashFetchMod.Headers
  type IsomorphicRequest = stdLib.Request | nodeDashFetchLib.nodeDashFetchMod.Request
  type IsomorphicResponse = stdLib.Response | nodeDashFetchLib.nodeDashFetchMod.Response
}
