package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RawResult[T] extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var hCode: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
  var sessionId: java.lang.String
  var state: webdriverioLib.webdriverioLibStrings.failure | webdriverioLib.webdriverioLibStrings.success
  var value: T
}

