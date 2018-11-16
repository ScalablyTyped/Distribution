package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WPAPINs {
  type HTTPArgumentType = wpapiLib.wpapiLibStrings.string | wpapiLib.wpapiLibStrings.integer | wpapiLib.wpapiLibStrings.number | wpapiLib.wpapiLibStrings.boolean | wpapiLib.wpapiLibStrings.`object` | wpapiLib.wpapiLibStrings.array
  type HTTPMethod = wpapiLib.wpapiLibStrings.GET | wpapiLib.wpapiLibStrings.POST | wpapiLib.wpapiLibStrings.PUT | wpapiLib.wpapiLibStrings.PATCH | wpapiLib.wpapiLibStrings.DELETE
  type TransportFunction = js.Function2[
    /* wpreq */ WPRequest, 
    /* cb */ js.UndefOr[WPRequestCallback], 
    stdLib.Promise[js.Any]
  ]
  type WPRequestCallback = js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  type WPRequestFactory = js.Function0[WPRequest]
}
