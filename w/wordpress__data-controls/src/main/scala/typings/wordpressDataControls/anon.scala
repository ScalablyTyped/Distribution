package typings.wordpressDataControls

import typings.wordpressApiFetch.buildTypesTypesMod.APIFetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Promise[T] extends StObject {
    
    var promise: js.Promise[T]
    
    var `type`: String
  }
  object Promise {
    
    inline def apply[T](promise: js.Promise[T], `type`: String): Promise[T] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Promise[?], T] (val x: Self & Promise[T]) extends AnyVal {
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromisePromise[T] extends StObject {
    
    var promise: js.Promise[T]
  }
  object PromisePromise {
    
    inline def apply[T](promise: js.Promise[T]): PromisePromise[T] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromisePromise[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisePromise[?], T] (val x: Self & PromisePromise[T]) extends AnyVal {
      
      inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var request: APIFetchOptions
    
    var `type`: String
  }
  object Request {
    
    inline def apply(request: APIFetchOptions, `type`: String): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: APIFetchOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestAPIFetchOptions extends StObject {
    
    var request: typings.wordpressApiFetch.mod.APIFetchOptions
  }
  object RequestAPIFetchOptions {
    
    inline def apply(request: typings.wordpressApiFetch.mod.APIFetchOptions): RequestAPIFetchOptions = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestAPIFetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestAPIFetchOptions] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: typings.wordpressApiFetch.mod.APIFetchOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
