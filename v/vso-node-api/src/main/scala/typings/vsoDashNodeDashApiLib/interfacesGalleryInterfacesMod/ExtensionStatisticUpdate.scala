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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extensionName")(extensionName)
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.updateDynamic("statistic")(statistic)
    __obj.asInstanceOf[ExtensionStatisticUpdate]
  }
}

