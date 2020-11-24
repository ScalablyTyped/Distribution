package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTransferContentPartFactory extends js.Object {
  
  def createWithName(name: String): BackgroundTransferContentPart = js.native
  
  def createWithNameAndFileName(name: String, fileName: String): BackgroundTransferContentPart = js.native
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
  
  @scala.inline
  implicit class IBackgroundTransferContentPartFactoryOps[Self <: IBackgroundTransferContentPartFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateWithName(value: String => BackgroundTransferContentPart): Self = this.set("createWithName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithNameAndFileName(value: (String, String) => BackgroundTransferContentPart): Self = this.set("createWithNameAndFileName", js.Any.fromFunction2(value))
  }
}
