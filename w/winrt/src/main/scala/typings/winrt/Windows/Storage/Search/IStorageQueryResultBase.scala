package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageQueryResultBase extends StObject {
  
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit
  
  def findStartIndexAsync(value: Any): IAsyncOperation[Double]
  
  var folder: StorageFolder
  
  def getCurrentQueryOptions(): QueryOptions
  
  def getItemCountAsync(): IAsyncOperation[Double]
  
  var oncontentschanged: Any
  
  var onoptionschanged: Any
}
object IStorageQueryResultBase {
  
  inline def apply(
    applyNewQueryOptions: QueryOptions => Unit,
    findStartIndexAsync: Any => IAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => IAsyncOperation[Double],
    oncontentschanged: Any,
    onoptionschanged: Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync), oncontentschanged = oncontentschanged.asInstanceOf[js.Any], onoptionschanged = onoptionschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStorageQueryResultBase] (val x: Self) extends AnyVal {
    
    inline def setApplyNewQueryOptions(value: QueryOptions => Unit): Self = StObject.set(x, "applyNewQueryOptions", js.Any.fromFunction1(value))
    
    inline def setFindStartIndexAsync(value: Any => IAsyncOperation[Double]): Self = StObject.set(x, "findStartIndexAsync", js.Any.fromFunction1(value))
    
    inline def setFolder(value: StorageFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentQueryOptions(value: () => QueryOptions): Self = StObject.set(x, "getCurrentQueryOptions", js.Any.fromFunction0(value))
    
    inline def setGetItemCountAsync(value: () => IAsyncOperation[Double]): Self = StObject.set(x, "getItemCountAsync", js.Any.fromFunction0(value))
    
    inline def setOncontentschanged(value: Any): Self = StObject.set(x, "oncontentschanged", value.asInstanceOf[js.Any])
    
    inline def setOnoptionschanged(value: Any): Self = StObject.set(x, "onoptionschanged", value.asInstanceOf[js.Any])
  }
}
