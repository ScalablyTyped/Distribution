package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionStatistic extends js.Object {
  var statisticName: String
  var value: Double
}

object ExtensionStatistic {
  @scala.inline
  def apply(statisticName: String, value: Double): ExtensionStatistic = {
    val __obj = js.Dynamic.literal(statisticName = statisticName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionStatistic]
  }
}

