package typings.umbraco

import typings.angular.mod.IHttpHeadersGetter
import typings.angular.mod.IHttpPromiseCallback
import typings.angular.mod.IRequestConfig
import typings.umbraco.mod.resources.IResourcePromise
import typings.umbraco.umbraco.resources.Direction
import typings.umbraco.umbraco.resources.OrderItemsBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error[T] extends StObject {
    
    def error(data: IResourcePromise, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
    @JSName("error")
    var error_Original: IHttpPromiseCallback[IResourcePromise] = js.native
    
    def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
    @JSName("success")
    var success_Original: IHttpPromiseCallback[T] = js.native
  }
  
  @js.native
  trait ErrorMsg[T] extends StObject {
    
    var errorMsg: String = js.native
    
    def success(data: T, status: Double, headers: IHttpHeadersGetter, config: IRequestConfig): Unit = js.native
    @JSName("success")
    var success_Original: IHttpPromiseCallback[T] = js.native
  }
  
  @js.native
  trait Filter extends StObject {
    
    var filter: String = js.native
    
    var orderBy: OrderItemsBy = js.native
    
    var orderDirection: Direction = js.native
    
    var pageNumber: Double = js.native
    
    var pageSize: Double = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(
      filter: String,
      orderBy: OrderItemsBy,
      orderDirection: Direction,
      pageNumber: Double,
      pageSize: Double
    ): Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderDirection = orderDirection.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderBy(value: OrderItemsBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderDirection(value: Direction): Self = StObject.set(x, "orderDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var Url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(Url: String): Url = {
      val __obj = js.Dynamic.literal(Url = Url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    }
  }
}
