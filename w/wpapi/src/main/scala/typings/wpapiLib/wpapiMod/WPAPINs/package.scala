package typings
package wpapiLib.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WPAPINs {
  type TransportFunction = js.Function2[/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback], js.Promise[js.Any]]
  type WPRequestCallback = js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  type WPRequestFactory = js.Function0[WPRequest]
}
