package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Admin extends js.Object {
  var admin: scala.Double
  var createPublisher: scala.Double
  var deleteExtension: scala.Double
  var deletePublisher: scala.Double
  var editSettings: scala.Double
  var managePermissions: scala.Double
  var privateRead: scala.Double
  var publishExtension: scala.Double
  var read: scala.Double
  var trustedPartner: scala.Double
  var updateExtension: scala.Double
  var viewPermissions: scala.Double
}

object Anon_Admin {
  @scala.inline
  def apply(
    admin: scala.Double,
    createPublisher: scala.Double,
    deleteExtension: scala.Double,
    deletePublisher: scala.Double,
    editSettings: scala.Double,
    managePermissions: scala.Double,
    privateRead: scala.Double,
    publishExtension: scala.Double,
    read: scala.Double,
    trustedPartner: scala.Double,
    updateExtension: scala.Double,
    viewPermissions: scala.Double
  ): Anon_Admin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("admin")(admin)
    __obj.updateDynamic("createPublisher")(createPublisher)
    __obj.updateDynamic("deleteExtension")(deleteExtension)
    __obj.updateDynamic("deletePublisher")(deletePublisher)
    __obj.updateDynamic("editSettings")(editSettings)
    __obj.updateDynamic("managePermissions")(managePermissions)
    __obj.updateDynamic("privateRead")(privateRead)
    __obj.updateDynamic("publishExtension")(publishExtension)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("trustedPartner")(trustedPartner)
    __obj.updateDynamic("updateExtension")(updateExtension)
    __obj.updateDynamic("viewPermissions")(viewPermissions)
    __obj.asInstanceOf[Anon_Admin]
  }
}

