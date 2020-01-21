package typings.typedRestClient.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertConfiguration extends js.Object {
  var caFile: js.UndefOr[String] = js.undefined
  var certFile: js.UndefOr[String] = js.undefined
  var keyFile: js.UndefOr[String] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
}

object ICertConfiguration {
  @scala.inline
  def apply(caFile: String = null, certFile: String = null, keyFile: String = null, passphrase: String = null): ICertConfiguration = {
    val __obj = js.Dynamic.literal()
    if (caFile != null) __obj.updateDynamic("caFile")(caFile.asInstanceOf[js.Any])
    if (certFile != null) __obj.updateDynamic("certFile")(certFile.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertConfiguration]
  }
}

