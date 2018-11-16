package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactLocationFieldFactory extends js.Object {
  def createLocation(unstructuredAddress: java.lang.String): ContactLocationField = js.native
  def createLocation(unstructuredAddress: java.lang.String, category: ContactFieldCategory): ContactLocationField = js.native
  def createLocation(
    unstructuredAddress: java.lang.String,
    category: ContactFieldCategory,
    street: java.lang.String,
    city: java.lang.String,
    region: java.lang.String,
    country: java.lang.String,
    postalCode: java.lang.String
  ): ContactLocationField = js.native
}

