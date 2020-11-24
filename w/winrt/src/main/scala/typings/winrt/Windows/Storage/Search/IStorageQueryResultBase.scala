package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageQueryResultBase extends js.Object {
  
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  
  def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
  
  var folder: StorageFolder = js.native
  
  def getCurrentQueryOptions(): QueryOptions = js.native
  
  def getItemCountAsync(): IAsyncOperation[Double] = js.native
  
  var oncontentschanged: js.Any = js.native
  
  var onoptionschanged: js.Any = js.native
}
object IStorageQueryResultBase {
  
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Unit,
    findStartIndexAsync: js.Any => IAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => IAsyncOperation[Double],
    oncontentschanged: js.Any,
    onoptionschanged: js.Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync), oncontentschanged = oncontentschanged.asInstanceOf[js.Any], onoptionschanged = onoptionschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  
  @scala.inline
  implicit class IStorageQueryResultBaseOps[Self <: IStorageQueryResultBase] (val x: Self) extends AnyVal {
    
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
    def setApplyNewQueryOptions(value: QueryOptions => Unit): Self = this.set("applyNewQueryOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindStartIndexAsync(value: js.Any => IAsyncOperation[Double]): Self = this.set("findStartIndexAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFolder(value: StorageFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentQueryOptions(value: () => QueryOptions): Self = this.set("getCurrentQueryOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemCountAsync(value: () => IAsyncOperation[Double]): Self = this.set("getItemCountAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOncontentschanged(value: js.Any): Self = this.set("oncontentschanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnoptionschanged(value: js.Any): Self = this.set("onoptionschanged", value.asInstanceOf[js.Any])
  }
}
