package typings.twilio

import typings.twilio.libRestTwilioMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBaseVersionMod {
  
  @JSImport("twilio/lib/base/Version", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Version {
    def this(solutelydomain: typings.twilio.libBaseDomainMod.^, version: String) = this()
    
    /**
      * Generate absolute url from a uri
      *
      * @param  uri uri to transform
      * @return transformed url
      */
    /* CompleteClass */
    override def absoluteUrl(uri: String): String = js.native
    
    /**
      * Create a new record
      * @throws {Error} If response returns non 2xx or 201 status code
      *
      * @param  opts request options
      * @return promise that resolves to created record
      */
    /* CompleteClass */
    override def create(opts: RequestOptions): js.Promise[Any] = js.native
    
    /**
      * Fetch a instance of a record
      * @throws {Error} If response returns non 2xx or 3xx status code
      *
      * @param  opts request options
      * @return promise that resolves to fetched result
      */
    /* CompleteClass */
    override def fetch(opts: RequestOptions): js.Promise[Any] = js.native
    
    /**
      * Fetch a page of records
      *
      * @param  opts request options
      * @return promise that resolves to page of records
      */
    /* CompleteClass */
    override def page(opts: RequestOptions): js.Promise[Any] = js.native
    
    /**
      * Process limits for list requests
      *
      * @param opts Page limit options passed to the request
      */
    /* CompleteClass */
    override def readLimits(opts: PageLimitOptions): PageLimit = js.native
    
    /**
      * Generate relative url from a uri
      *
      * @param  uri uri to transform
      * @return transformed url
      */
    /* CompleteClass */
    override def relativeUrl(uri: String): String = js.native
    
    /**
      * Delete a record
      * @throws {Error} If response returns a 5xx status
      *
      * @param  opts request options
      * @return promise that resolves to true if record was deleted
      */
    /* CompleteClass */
    override def remove(opts: RequestOptions): js.Promise[Boolean] = js.native
    
    /**
      * Make a request against the domain
      *
      * @param  opts request options
      * @return promise that resolves to request response
      */
    /* CompleteClass */
    override def request(opts: RequestOptions): js.Promise[Any] = js.native
    
    /**
      * Update a record
      * @throws {Error} If response returns non 2xx status code
      *
      * @param  opts request options
      * @return promise that resolves to updated result
      */
    /* CompleteClass */
    override def update(opts: RequestOptions): js.Promise[Any] = js.native
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
    
    extension [Self <: PageLimit](x: Self) {
      
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
    
    extension [Self <: PageLimitOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    /**
      * Generate absolute url from a uri
      *
      * @param  uri uri to transform
      * @return transformed url
      */
    def absoluteUrl(uri: String): String
    
    /**
      * Create a new record
      * @throws {Error} If response returns non 2xx or 201 status code
      *
      * @param  opts request options
      * @return promise that resolves to created record
      */
    def create(opts: RequestOptions): js.Promise[Any]
    
    /**
      * Fetch a instance of a record
      * @throws {Error} If response returns non 2xx or 3xx status code
      *
      * @param  opts request options
      * @return promise that resolves to fetched result
      */
    def fetch(opts: RequestOptions): js.Promise[Any]
    
    /**
      * Fetch a page of records
      *
      * @param  opts request options
      * @return promise that resolves to page of records
      */
    def page(opts: RequestOptions): js.Promise[Any]
    
    /**
      * Process limits for list requests
      *
      * @param opts Page limit options passed to the request
      */
    def readLimits(opts: PageLimitOptions): PageLimit
    
    /**
      * Generate relative url from a uri
      *
      * @param  uri uri to transform
      * @return transformed url
      */
    def relativeUrl(uri: String): String
    
    /**
      * Delete a record
      * @throws {Error} If response returns a 5xx status
      *
      * @param  opts request options
      * @return promise that resolves to true if record was deleted
      */
    def remove(opts: RequestOptions): js.Promise[Boolean]
    
    /**
      * Make a request against the domain
      *
      * @param  opts request options
      * @return promise that resolves to request response
      */
    def request(opts: RequestOptions): js.Promise[Any]
    
    /**
      * Update a record
      * @throws {Error} If response returns non 2xx status code
      *
      * @param  opts request options
      * @return promise that resolves to updated result
      */
    def update(opts: RequestOptions): js.Promise[Any]
  }
  object Version {
    
    inline def apply(
      absoluteUrl: String => String,
      create: RequestOptions => js.Promise[Any],
      fetch: RequestOptions => js.Promise[Any],
      page: RequestOptions => js.Promise[Any],
      readLimits: PageLimitOptions => PageLimit,
      relativeUrl: String => String,
      remove: RequestOptions => js.Promise[Boolean],
      request: RequestOptions => js.Promise[Any],
      update: RequestOptions => js.Promise[Any]
    ): Version = {
      val __obj = js.Dynamic.literal(absoluteUrl = js.Any.fromFunction1(absoluteUrl), create = js.Any.fromFunction1(create), fetch = js.Any.fromFunction1(fetch), page = js.Any.fromFunction1(page), readLimits = js.Any.fromFunction1(readLimits), relativeUrl = js.Any.fromFunction1(relativeUrl), remove = js.Any.fromFunction1(remove), request = js.Any.fromFunction1(request), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setAbsoluteUrl(value: String => String): Self = StObject.set(x, "absoluteUrl", js.Any.fromFunction1(value))
      
      inline def setCreate(value: RequestOptions => js.Promise[Any]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setFetch(value: RequestOptions => js.Promise[Any]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setPage(value: RequestOptions => js.Promise[Any]): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
      
      inline def setReadLimits(value: PageLimitOptions => PageLimit): Self = StObject.set(x, "readLimits", js.Any.fromFunction1(value))
      
      inline def setRelativeUrl(value: String => String): Self = StObject.set(x, "relativeUrl", js.Any.fromFunction1(value))
      
      inline def setRemove(value: RequestOptions => js.Promise[Boolean]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRequest(value: RequestOptions => js.Promise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: RequestOptions => js.Promise[Any]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
