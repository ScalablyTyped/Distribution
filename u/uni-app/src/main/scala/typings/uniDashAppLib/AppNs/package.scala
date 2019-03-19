package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AppNs {
  type AppConstructor = js.Function1[
    /* options */ (AppInstance[uniDashAppLib.AnyObject with AppInstance[js.Object]]) with uniDashAppLib.AnyObject with AppInstance[js.Object], 
    scala.Unit
  ]
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[GetAppOption], 
    AppInstance[uniDashAppLib.AnyObject] with uniDashAppLib.AnyObject
  ]
  type SceneValues = _SceneValues | scala.Double
}
