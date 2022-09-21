package typings.wxServerSdk.mod

import typings.wxServerSdk.wxServerSdkStrings.asc
import typings.wxServerSdk.wxServerSdkStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  def count(): js.Promise[CountCollectionResult]
  
  def field(definition: js.Object): Collection | Query | Document
  
  def get(): js.Promise[GetCollectionResult]
  
  def limit(max: Double): Collection | Query
  
  def orderBy(fieldName: String, order: asc | desc): Collection | Query
  
  def remove(): js.Promise[RemoveCollectionResult]
  
  def skip(offset: Double): Collection | Query
  
  def update(options: CommonOption[Any]): js.Promise[UpateCollectionResult]
}
object Query {
  
  inline def apply(
    count: () => js.Promise[CountCollectionResult],
    field: js.Object => Collection | Query | Document,
    get: () => js.Promise[GetCollectionResult],
    limit: Double => Collection | Query,
    orderBy: (String, asc | desc) => Collection | Query,
    remove: () => js.Promise[RemoveCollectionResult],
    skip: Double => Collection | Query,
    update: CommonOption[Any] => js.Promise[UpateCollectionResult]
  ): Query = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), field = js.Any.fromFunction1(field), get = js.Any.fromFunction0(get), limit = js.Any.fromFunction1(limit), orderBy = js.Any.fromFunction2(orderBy), remove = js.Any.fromFunction0(remove), skip = js.Any.fromFunction1(skip), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setCount(value: () => js.Promise[CountCollectionResult]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
    
    inline def setField(value: js.Object => Collection | Query | Document): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
    
    inline def setGet(value: () => js.Promise[GetCollectionResult]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setLimit(value: Double => Collection | Query): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
    
    inline def setOrderBy(value: (String, asc | desc) => Collection | Query): Self = StObject.set(x, "orderBy", js.Any.fromFunction2(value))
    
    inline def setRemove(value: () => js.Promise[RemoveCollectionResult]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSkip(value: Double => Collection | Query): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: CommonOption[Any] => js.Promise[UpateCollectionResult]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
