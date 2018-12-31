package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialOptions extends js.Object {
  var excludeList: js.UndefOr[js.Array[ScopedCredentialDescriptor]] = js.undefined
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeoutSeconds: js.UndefOr[scala.Double] = js.undefined
}

