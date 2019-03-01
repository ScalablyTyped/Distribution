package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionStatistic extends js.Object {
  var statisticName: java.lang.String
  var value: scala.Double
}

object ExtensionStatistic {
  @scala.inline
  def apply(statisticName: java.lang.String, value: scala.Double): ExtensionStatistic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statisticName")(statisticName)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExtensionStatistic]
  }
}

