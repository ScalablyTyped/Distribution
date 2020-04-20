package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferContentPartFactory extends js.Object {
  def createWithName(name: String): BackgroundTransferContentPart
  def createWithNameAndFileName(name: String, fileName: String): BackgroundTransferContentPart
}

object IBackgroundTransferContentPartFactory {
  @scala.inline
  def apply(
    createWithName: String => BackgroundTransferContentPart,
    createWithNameAndFileName: (String, String) => BackgroundTransferContentPart
  ): IBackgroundTransferContentPartFactory = {
    val __obj = js.Dynamic.literal(createWithName = js.Any.fromFunction1(createWithName), createWithNameAndFileName = js.Any.fromFunction2(createWithNameAndFileName))
    __obj.asInstanceOf[IBackgroundTransferContentPartFactory]
  }
}

