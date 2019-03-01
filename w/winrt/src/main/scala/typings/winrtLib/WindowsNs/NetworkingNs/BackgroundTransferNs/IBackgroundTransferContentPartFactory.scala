package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferContentPartFactory extends js.Object {
  def createWithName(name: java.lang.String): BackgroundTransferContentPart
  def createWithNameAndFileName(name: java.lang.String, fileName: java.lang.String): BackgroundTransferContentPart
}

object IBackgroundTransferContentPartFactory {
  @scala.inline
  def apply(
    createWithName: js.Function1[java.lang.String, BackgroundTransferContentPart],
    createWithNameAndFileName: js.Function2[java.lang.String, java.lang.String, BackgroundTransferContentPart]
  ): IBackgroundTransferContentPartFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWithName")(createWithName)
    __obj.updateDynamic("createWithNameAndFileName")(createWithNameAndFileName)
    __obj.asInstanceOf[IBackgroundTransferContentPartFactory]
  }
}

