package typings
package vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertConfiguration extends js.Object {
  var caFile: js.UndefOr[java.lang.String] = js.undefined
  var certFile: js.UndefOr[java.lang.String] = js.undefined
  var keyFile: js.UndefOr[java.lang.String] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
}

object ICertConfiguration {
  @scala.inline
  def apply(
    caFile: java.lang.String = null,
    certFile: java.lang.String = null,
    keyFile: java.lang.String = null,
    passphrase: java.lang.String = null
  ): ICertConfiguration = {
    val __obj = js.Dynamic.literal()
    if (caFile != null) __obj.updateDynamic("caFile")(caFile)
    if (certFile != null) __obj.updateDynamic("certFile")(certFile)
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[ICertConfiguration]
  }
}

