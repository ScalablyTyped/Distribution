package typings
package winjsLib.WinJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces

trait IXHROptions extends js.Object {
  var customRequestInitializer: js.UndefOr[js.Function1[/* request */ stdLib.XMLHttpRequest, scala.Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var user: js.UndefOr[java.lang.String] = js.undefined
}

