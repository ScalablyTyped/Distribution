package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpHeaderExtensionParameters extends js.Object {
  var encrypted: js.UndefOr[scala.Boolean] = js.undefined
  var id: scala.Double
  var uri: java.lang.String
}

object RTCRtpHeaderExtensionParameters {
  @scala.inline
  def apply(id: scala.Double, uri: java.lang.String, encrypted: js.UndefOr[scala.Boolean] = js.undefined): RTCRtpHeaderExtensionParameters = {
    val __obj = js.Dynamic.literal(id = id, uri = uri)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    __obj.asInstanceOf[RTCRtpHeaderExtensionParameters]
  }
}

