package typings
package xDashRayDashCrawlerLib.xDashRayDashCrawlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object XRayCrawlerNs {
  type Callback[T] = js.Function2[/* err */ stdLib.Error, /* obj */ T, scala.Unit]
  type Driver = js.Function2[
    /* context */ httpDashContextLib.httpDashContextMod.HttpContextNs.Context, 
    /* callback */ Callback[httpDashContextLib.httpDashContextMod.HttpContextNs.Context], 
    scala.Unit
  ]
  type RandomDelay = js.Function0[scala.Double]
  type RequestHook = js.Function1[
    /* request */ httpDashContextLib.httpDashContextMod.HttpContextNs.Request, 
    scala.Unit
  ]
  type ResponseHook = js.Function1[
    /* response */ httpDashContextLib.httpDashContextMod.HttpContextNs.Response, 
    scala.Unit
  ]
}
