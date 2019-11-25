package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionStatisticUpdate extends js.Object {
  var extensionName: String
  var operation: ExtensionStatisticOperation
  var publisherName: String
  var statistic: ExtensionStatistic
}

object ExtensionStatisticUpdate {
  @scala.inline
  def apply(
    extensionName: String,
    operation: ExtensionStatisticOperation,
    publisherName: String,
    statistic: ExtensionStatistic
  ): ExtensionStatisticUpdate = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionStatisticUpdate]
  }
}

