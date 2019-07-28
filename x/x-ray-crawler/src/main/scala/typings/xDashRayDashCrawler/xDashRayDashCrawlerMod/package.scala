package typings.xDashRayDashCrawler

import typings.httpDashContext.httpDashContextMod.Context
import typings.httpDashContext.httpDashContextMod.Request
import typings.httpDashContext.httpDashContextMod.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xDashRayDashCrawlerMod {
  type Callback[T] = js.Function2[/* err */ Error, /* obj */ T, Unit]
  type Driver = js.Function2[/* context */ Context, /* callback */ Callback[Context], Unit]
  type RandomDelay = js.Function0[Double]
  type RequestHook = js.Function1[/* request */ Request, Unit]
  type ResponseHook = js.Function1[/* response */ Response, Unit]
}
