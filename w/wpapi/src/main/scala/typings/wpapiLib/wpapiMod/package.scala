package typings
package wpapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wpapiMod {
  type HTTPHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Routes = org.scalablytyped.runtime.StringDictionary[Route]
  type TransportFunction = js.Function2[/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback], js.Promise[js.Any]]
  type WPRequestCallback = js.Function2[/* error */ stdLib.Error, /* data */ js.Any, scala.Unit]
  type WPRequestFactory = js.Function0[WPRequest]
}
