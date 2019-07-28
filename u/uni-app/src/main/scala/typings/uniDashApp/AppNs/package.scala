package typings.uniDashApp

import typings.uniDashApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AppNs {
  type AppConstructor = js.Function1[
    /* options */ (AppInstance[AnyObject with AppInstance[js.Object]]) with AnyObject with AppInstance[js.Object], 
    Unit
  ]
  type GetApp = js.Function1[/* opts */ js.UndefOr[GetAppOption], AppInstance[AnyObject] with AnyObject]
}
