package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentAddress extends js.Object {
  val addressLine: js.Array[java.lang.String]
  val city: java.lang.String
  val country: java.lang.String
  val dependentLocality: java.lang.String
  val languageCode: java.lang.String
  val organization: java.lang.String
  val phone: java.lang.String
  val postalCode: java.lang.String
  val recipient: java.lang.String
  val region: java.lang.String
  val sortingCode: java.lang.String
  def toJSON(): js.Any
}

@JSGlobal("PaymentAddress")
@js.native
object PaymentAddress
  extends org.scalablytyped.runtime.Instantiable0[PaymentAddress]

