package typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuickLink extends js.Object {
  
  var id: String = js.native
  
  var supportedDataFormats: IVector[String] = js.native
  
  var supportedFileTypes: IVector[String] = js.native
  
  var thumbnail: RandomAccessStreamReference = js.native
  
  var title: String = js.native
}
object IQuickLink {
  
  @scala.inline
  def apply(
    id: String,
    supportedDataFormats: IVector[String],
    supportedFileTypes: IVector[String],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IQuickLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], supportedDataFormats = supportedDataFormats.asInstanceOf[js.Any], supportedFileTypes = supportedFileTypes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuickLink]
  }
  
  @scala.inline
  implicit class IQuickLinkOps[Self <: IQuickLink] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedDataFormats(value: IVector[String]): Self = this.set("supportedDataFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedFileTypes(value: IVector[String]): Self = this.set("supportedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: RandomAccessStreamReference): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
