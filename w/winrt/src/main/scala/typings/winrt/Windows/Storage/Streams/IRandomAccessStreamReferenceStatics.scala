package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRandomAccessStreamReferenceStatics extends js.Object {
  
  def createFromFile(file: IStorageFile): RandomAccessStreamReference = js.native
  
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference = js.native
  
  def createFromUri(uri: Uri): RandomAccessStreamReference = js.native
}
object IRandomAccessStreamReferenceStatics {
  
  @scala.inline
  def apply(
    createFromFile: IStorageFile => RandomAccessStreamReference,
    createFromStream: IRandomAccessStream => RandomAccessStreamReference,
    createFromUri: Uri => RandomAccessStreamReference
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal(createFromFile = js.Any.fromFunction1(createFromFile), createFromStream = js.Any.fromFunction1(createFromStream), createFromUri = js.Any.fromFunction1(createFromUri))
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
  
  @scala.inline
  implicit class IRandomAccessStreamReferenceStaticsOps[Self <: IRandomAccessStreamReferenceStatics] (val x: Self) extends AnyVal {
    
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
    def setCreateFromFile(value: IStorageFile => RandomAccessStreamReference): Self = this.set("createFromFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromStream(value: IRandomAccessStream => RandomAccessStreamReference): Self = this.set("createFromStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromUri(value: Uri => RandomAccessStreamReference): Self = this.set("createFromUri", js.Any.fromFunction1(value))
  }
}
