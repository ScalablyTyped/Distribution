package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Variant of TS 2.2 {@link RequestInit} that permits a
  * {@link PasswordCredential} to be used in the {@code credentials} property.
  * All other properties are identical to {@link RequestInit}.
  */
trait CMRequestInit extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var cache: js.UndefOr[java.lang.String] = js.undefined
  var credentials: js.UndefOr[PasswordCredential | java.lang.String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var integrity: js.UndefOr[java.lang.String] = js.undefined
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[java.lang.String] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var referrerPolicy: js.UndefOr[java.lang.String] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
}

