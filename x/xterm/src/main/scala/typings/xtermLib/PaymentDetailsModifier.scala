package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetailsModifier extends js.Object {
  var additionalDisplayItems: js.UndefOr[js.Array[PaymentItem]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var supportedMethods: java.lang.String | js.Array[java.lang.String]
  var total: js.UndefOr[PaymentItem] = js.undefined
}

