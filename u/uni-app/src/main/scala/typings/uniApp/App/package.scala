package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object App {
  type AppConstructor = js.Function1[
    /* options */ (typings.uniApp.App.AppInstance[typings.uniApp.AnyObject with typings.uniApp.App.AppInstance[js.Object]]) with typings.uniApp.AnyObject with typings.uniApp.App.AppInstance[js.Object], 
    scala.Unit
  ]
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[typings.uniApp.App.GetAppOption], 
    typings.uniApp.App.AppInstance[typings.uniApp.AnyObject] with typings.uniApp.AnyObject
  ]
}
