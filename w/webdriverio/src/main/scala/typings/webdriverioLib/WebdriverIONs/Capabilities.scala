package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Capabilities extends js.Object {
  var acceptInsecureCerts: js.UndefOr[scala.Boolean] = js.undefined
  var browserName: java.lang.String
  var browserVersion: js.UndefOr[java.lang.String] = js.undefined
  // wdio-sauce-service specific
  var build: js.UndefOr[java.lang.String] = js.undefined
  var pageLoadStrategy: js.UndefOr[PageLoadingStrategy] = js.undefined
  var platformName: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[ProxyObject] = js.undefined
  var setWindowRect: js.UndefOr[scala.Boolean] = js.undefined
  var timeouts: js.UndefOr[Timeouts] = js.undefined
  var unhandledPromptBehavior: js.UndefOr[java.lang.String] = js.undefined
}

