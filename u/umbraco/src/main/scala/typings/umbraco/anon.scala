package typings.umbraco

import typings.angular.mod.IHttpHeadersGetter
import typings.angular.mod.IHttpPromiseCallback
import typings.angular.mod.IRequestConfig
import typings.umbraco.mod.resources.IResourcePromise
import typings.umbraco.umbraco.resources.Direction
import typings.umbraco.umbraco.resources.OrderItemsBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error[T] extends StObject {
    
    def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit
    @JSName("error")
    var error_Original: IHttpPromiseCallback[IResourcePromise]
    
    def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit
    @JSName("success")
    var success_Original: IHttpPromiseCallback[T]
  }
  object Error {
    
    inline def apply[T](
      error: (IResourcePromise, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Unit,
      success: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Unit
    ): Error[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction4(error), success = js.Any.fromFunction4(success))
      __obj.asInstanceOf[Error[T]]
    }
    
    extension [Self <: Error[?], T](x: Self & Error[T]) {
      
      inline def setError(
        value: (IResourcePromise, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction4(value))
      
      inline def setSuccess(
        value: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction4(value))
    }
  }
  
  trait ErrorMsg[T] extends StObject {
    
    var errorMsg: String
    
    def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit
    @JSName("success")
    var success_Original: IHttpPromiseCallback[T]
  }
  object ErrorMsg {
    
    inline def apply[T](
      errorMsg: String,
      success: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Unit
    ): ErrorMsg[T] = {
      val __obj = js.Dynamic.literal(errorMsg = errorMsg.asInstanceOf[js.Any], success = js.Any.fromFunction4(success))
      __obj.asInstanceOf[ErrorMsg[T]]
    }
    
    extension [Self <: ErrorMsg[?], T](x: Self & ErrorMsg[T]) {
      
      inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
      
      inline def setSuccess(
        value: (T, /* status */ Double, /* headers */ IHttpHeadersGetter, /* config */ IRequestConfig) => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction4(value))
    }
  }
  
  trait Filter extends StObject {
    
    var filter: String
    
    var orderBy: OrderItemsBy
    
    var orderDirection: Direction
    
    var pageNumber: Double
    
    var pageSize: Double
  }
  object Filter {
    
    inline def apply(
      filter: String,
      orderBy: OrderItemsBy,
      orderDirection: Direction,
      pageNumber: Double,
      pageSize: Double
    ): Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderDirection = orderDirection.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setOrderBy(value: OrderItemsBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderDirection(value: Direction): Self = StObject.set(x, "orderDirection", value.asInstanceOf[js.Any])
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var Url: String
  }
  object Url {
    
    inline def apply(Url: String): Url = {
      val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
}
