package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageQueryResultBase extends StObject {
  
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit
  
  def findStartIndexAsync(value: js.Any): IAsyncOperation[Double]
  
  var folder: StorageFolder
  
  def getCurrentQueryOptions(): QueryOptions
  
  def getItemCountAsync(): IAsyncOperation[Double]
  
  var oncontentschanged: js.Any
  
  var onoptionschanged: js.Any
}
object IStorageQueryResultBase {
  
  inline def apply(
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
  
  extension [Self <: IStorageQueryResultBase](x: Self) {
    
    inline def setApplyNewQueryOptions(value: QueryOptions => Unit): Self = StObject.set(x, "applyNewQueryOptions", js.Any.fromFunction1(value))
    
    inline def setFindStartIndexAsync(value: js.Any => IAsyncOperation[Double]): Self = StObject.set(x, "findStartIndexAsync", js.Any.fromFunction1(value))
    
    inline def setFolder(value: StorageFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentQueryOptions(value: () => QueryOptions): Self = StObject.set(x, "getCurrentQueryOptions", js.Any.fromFunction0(value))
    
    inline def setGetItemCountAsync(value: () => IAsyncOperation[Double]): Self = StObject.set(x, "getItemCountAsync", js.Any.fromFunction0(value))
    
    inline def setOncontentschanged(value: js.Any): Self = StObject.set(x, "oncontentschanged", value.asInstanceOf[js.Any])
    
    inline def setOnoptionschanged(value: js.Any): Self = StObject.set(x, "onoptionschanged", value.asInstanceOf[js.Any])
  }
}
