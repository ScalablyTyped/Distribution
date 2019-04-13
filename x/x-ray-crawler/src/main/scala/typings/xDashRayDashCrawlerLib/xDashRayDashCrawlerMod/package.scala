package typings
package xDashRayDashCrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xDashRayDashCrawlerMod {
  type Callback[T] = js.Function2[/* err */ stdLib.Error, /* obj */ T, scala.Unit]
  type Driver = js.Function2[
    /* context */ httpDashContextLib.httpDashContextMod.Context, 
    /* callback */ Callback[httpDashContextLib.httpDashContextMod.Context], 
    scala.Unit
  ]
  type RandomDelay = js.Function0[scala.Double]
  type RequestHook = js.Function1[/* request */ httpDashContextLib.httpDashContextMod.Request, scala.Unit]
  type ResponseHook = js.Function1[/* response */ httpDashContextLib.httpDashContextMod.Response, scala.Unit]
}
