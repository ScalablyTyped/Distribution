package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Admin extends js.Object {
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

object Admin {
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
  ): Admin = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], createPublisher = createPublisher.asInstanceOf[js.Any], deleteExtension = deleteExtension.asInstanceOf[js.Any], deletePublisher = deletePublisher.asInstanceOf[js.Any], editSettings = editSettings.asInstanceOf[js.Any], managePermissions = managePermissions.asInstanceOf[js.Any], privateRead = privateRead.asInstanceOf[js.Any], publishExtension = publishExtension.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], trustedPartner = trustedPartner.asInstanceOf[js.Any], updateExtension = updateExtension.asInstanceOf[js.Any], viewPermissions = viewPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Admin]
  }
}

