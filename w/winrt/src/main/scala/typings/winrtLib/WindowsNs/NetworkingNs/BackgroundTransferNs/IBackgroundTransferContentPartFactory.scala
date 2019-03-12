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
    createWithName: java.lang.String => BackgroundTransferContentPart,
    createWithNameAndFileName: (java.lang.String, java.lang.String) => BackgroundTransferContentPart
  ): IBackgroundTransferContentPartFactory = {
    val __obj = js.Dynamic.literal(createWithName = js.Any.fromFunction1(createWithName), createWithNameAndFileName = js.Any.fromFunction2(createWithNameAndFileName))
  
    __obj.asInstanceOf[IBackgroundTransferContentPartFactory]
  }
}

