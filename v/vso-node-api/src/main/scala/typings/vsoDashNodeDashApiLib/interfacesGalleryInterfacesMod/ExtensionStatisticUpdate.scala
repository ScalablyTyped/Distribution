package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionStatisticUpdate extends js.Object {
  var extensionName: java.lang.String
  var operation: ExtensionStatisticOperation
  var publisherName: java.lang.String
  var statistic: ExtensionStatistic
}

object ExtensionStatisticUpdate {
  @scala.inline
  def apply(
    extensionName: java.lang.String,
    operation: ExtensionStatisticOperation,
    publisherName: java.lang.String,
    statistic: ExtensionStatistic
  ): ExtensionStatisticUpdate = {
    val __obj = js.Dynamic.literal(extensionName = extensionName, operation = operation, publisherName = publisherName, statistic = statistic)
  
    __obj.asInstanceOf[ExtensionStatisticUpdate]
  }
}

