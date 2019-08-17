package typings.wpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wpapiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type HTTPHeaders = StringDictionary[String]
  type Routes = StringDictionary[Route]
  type TransportFunction = js.Function2[/* wpreq */ WPRequest, /* cb */ js.UndefOr[WPRequestCallback], js.Promise[js.Any]]
  type WPRequestCallback = js.Function2[/* error */ Error, /* data */ js.Any, Unit]
  type WPRequestFactory = js.Function0[WPRequest]
}
