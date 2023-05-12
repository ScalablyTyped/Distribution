package typings.twilio

import typings.twilio.libBaseBaseTwilioMod.RequestOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseVersionMod {
  
  @JSImport("twilio/lib/base/Version", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Version {
    /**
      *
      * Base version object
      *
      * @param domain - twilio domain
      * @param version - api version
      */
    def this(domain: typings.twilio.libBaseDomainMod.default, version: String) = this()
    def this(domain: typings.twilio.libBaseDomainMod.default, version: Version) = this()
  }
  
  trait PageLimit extends StObject {
    
    var limit: Double
    
    var pageSize: Double
  }
  object PageLimit {
    
    inline def apply(limit: Double, pageSize: Double): PageLimit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageLimit] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait PageLimitOptions extends StObject {
    
    /**
      * The maximum number of items to fetch
      */
    var limit: Double
    
    /**
      * The maximum number of items to return with every request
      */
    var pageSize: Double
  }
  object PageLimitOptions {
    
    inline def apply(limit: Double, pageSize: Double): PageLimitOptions = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageLimitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageLimitOptions] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Version extends StObject {
    
    var _domain: typings.twilio.libBaseDomainMod.default = js.native
    
    var _version: Version | String = js.native
    
    /**
      * Generate absolute url from a uri
      *
      * @param uri - uri to transform
      * @returns transformed url
      */
    def absoluteUrl(uri: String): String = js.native
    
    /**
      * Create a new record
      *
      * @param opts - request options
      *
      * @throws Error If response returns non 2xx or 201 status code
      *
      * @returns promise that resolves to created record
      */
    def create(opts: RequestOpts): js.Promise[Any] = js.native
    
    def domain: typings.twilio.libBaseDomainMod.default = js.native
    
    /**
      * For each record instance, executes a provided callback function with that
      * instance
      *
      * @param params - Parameters (Optional)
      * @param params.limit - Optional maximum number of record instances to
      *  fetch
      * @param params.pageSize - Optional maximum number of records to return
      *  with every request
      * @param params.callback - Callback function to call with each
      *  record instance
      * @param params.done - Optional done function to call when all
      *  records are processed, the limit is reached, or an error occurs.
      *  Receives an error argument if an error occurs.
      * @param callback - Callback function to call with each record.
      *  Receives a done function argument that will short-circuit the for-each
      *  loop that may accept an error argument.
      * @returns Returns a promise that resolves when all records
      *  processed or if the limit is reached, and rejects with an error if an
      *  error occurs and is not handled in the user provided done function.
      */
    def each[T](): js.Promise[Unit] = js.native
    def each[T](params: Any): js.Promise[Unit] = js.native
    def each[T](
      params: Any,
      callback: js.Function2[/* item */ T, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
    ): js.Promise[Unit] = js.native
    def each[T](
      params: Unit,
      callback: js.Function2[/* item */ T, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Fetch an instance of a record
      *
      * @param opts - request options
      *
      * @throws Error If response returns non 2xx or 3xx status code
      *
      * @returns promise that resolves to fetched result
      */
    def fetch(opts: RequestOpts): js.Promise[Any] = js.native
    
    def list[T](): js.Promise[Any] = js.native
    def list[T](params: Any): js.Promise[Any] = js.native
    def list[T](params: Any, callback: js.Function2[/* error */ js.Error | Null, /* items */ T, Any]): js.Promise[Any] = js.native
    def list[T](params: Unit, callback: js.Function2[/* error */ js.Error | Null, /* items */ T, Any]): js.Promise[Any] = js.native
    
    /**
      * Fetch a page of records
      *
      * @param opts - request options
      * @returns promise that resolves to page of records
      */
    def page(opts: RequestOpts): js.Promise[Any] = js.native
    
    /**
      * Process limits for list requests
      *
      * @param opts.limit - The maximum number of items to fetch
      * @param opts.pageSize - The maximum number of items to return with every request
      *
      */
    def readLimits(opts: PageLimitOptions): PageLimit = js.native
    
    /**
      * Generate relative url from a uri
      *
      * @param uri - uri to transform
      * @returns transformed url
      */
    def relativeUrl(uri: String): String = js.native
    
    /**
      * Delete a record
      *
      * @param opts - request options
      *
      * @throws Error If response returns a 5xx status
      *
      * @returns promise that resolves to true if record was deleted
      */
    def remove(opts: RequestOpts): js.Promise[Boolean] = js.native
    
    /**
      * Make a request against the domain
      *
      * @param opts - request options
      * @returns promise that resolves to request response
      */
    def request(opts: RequestOpts): js.Promise[Any] = js.native
    
    def setPromiseCallback(operationPromise: Any, callback: Any): js.Promise[Any] = js.native
    
    /**
      * Update a record
      *
      * @param opts - request options
      *
      * @throws Error If response returns non 2xx status code
      *
      * @returns promise that resolves to updated result
      */
    def update(opts: RequestOpts): js.Promise[Any] = js.native
  }
}
