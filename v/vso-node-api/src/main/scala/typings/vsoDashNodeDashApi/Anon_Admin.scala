package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Admin extends js.Object {
  var admin: Double
  var createPublisher: Double
  var deleteExtension: Double
  var deletePublisher: Double
  var editSettings: Double
  var managePermissions: Double
  var privateRead: Double
  var publishExtension: Double
  var read: Double
  var trustedPartner: Double
  var updateExtension: Double
  var viewPermissions: Double
}

object Anon_Admin {
  @scala.inline
  def apply(
    admin: Double,
    createPublisher: Double,
    deleteExtension: Double,
    deletePublisher: Double,
    editSettings: Double,
    managePermissions: Double,
    privateRead: Double,
    publishExtension: Double,
    read: Double,
    trustedPartner: Double,
    updateExtension: Double,
    viewPermissions: Double
  ): Anon_Admin = {
    val __obj = js.Dynamic.literal(admin = admin, createPublisher = createPublisher, deleteExtension = deleteExtension, deletePublisher = deletePublisher, editSettings = editSettings, managePermissions = managePermissions, privateRead = privateRead, publishExtension = publishExtension, read = read, trustedPartner = trustedPartner, updateExtension = updateExtension, viewPermissions = viewPermissions)
  
    __obj.asInstanceOf[Anon_Admin]
  }
}

