package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a collection of the HTTP headers associated with an HTTP response. */
@JSGlobal("Windows.Web.Http.Headers.HttpResponseHeaderCollection")
@js.native
abstract class HttpResponseHeaderCollection ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.Headers.HttpResponseHeaderCollection {
  
  /** Gets or sets the TimeSpan object that represents the value of an Age HTTP header on an HTTP response. */
  /* CompleteClass */
  var age: Double = js.native
  
  /** Gets the HttpMethodHeaderValueCollection of HttpMethod objects that represent the value of an Allow HTTP header on an HTTP response. */
  /* CompleteClass */
  var allow: typings.winrtUwp.Windows.Web.Http.Headers.HttpMethodHeaderValueCollection = js.native
  
  /**
    * Adds a new item to the end of the HttpResponseHeaderCollection .
    * @param name The name of the value to add.
    * @param value The item value to add.
    */
  /* CompleteClass */
  override def append(name: String, value: String): Unit = js.native
  
  /** Gets the HttpCacheDirectiveHeaderValueCollection of objects that represent the value of a Cache-Control HTTP header on an HTTP response. */
  /* CompleteClass */
  var cacheControl: typings.winrtUwp.Windows.Web.Http.Headers.HttpCacheDirectiveHeaderValueCollection = js.native
  
  /** Removes all objects from the collection. */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /** Gets the HttpConnectionOptionHeaderValueCollection of HttpConnectionOptionHeaderValue objects that represent the value of a Connection HTTP header on an HTTP response. */
  /* CompleteClass */
  var connection: typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValueCollection = js.native
  
  /** Gets or sets the DateTime object that represents the value of a Date HTTP header on an HTTP response. */
  /* CompleteClass */
  var date: js.Date = js.native
  
  /**
    * Retrieves an iterator to the first item in the HttpResponseHeaderCollection .
    * @return An object that can be used to enumerate the items in the collection. The iterator points to the first item in the HttpResponseHeaderCollection .
    */
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[Any, Any]] = js.native
  
  /**
    * Returns an immutable view of the HttpResponseHeaderCollection .
    * @return The view of the HttpResponseHeaderCollection .
    */
  /* CompleteClass */
  override def getView(): IMapView[String, String] = js.native
  
  /**
    * Determines whether the HttpResponseHeaderCollection contains the specified key.
    * @param key The key associated with the item to locate.
    * @return true if the key is found; otherwise, false.
    */
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  
  /**
    * Inserts or replaces an item in the HttpResponseHeaderCollection with the specified key and value.
    * @param key The key of the item to be inserted.
    * @param value The value of the item to insert.
    * @return true if an item with the specified key is an existing item that was replaced; otherwise false.
    */
  /* CompleteClass */
  override def insert(key: String, value: String): Boolean = js.native
  
  /** Gets or sets the Uri that represents the value or a Location HTTP header on an HTTP response. */
  /* CompleteClass */
  var location: Uri = js.native
  
  /**
    * Lookup an item in the HttpResponseHeaderCollection .
    * @param key The key of the item to lookup.
    * @return The value of the item if found.
    */
  /* CompleteClass */
  override def lookup(key: String): String = js.native
  
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a Proxy-Authenticate HTTP header on an HTTP response. */
  /* CompleteClass */
  var proxyAuthenticate: typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValueCollection = js.native
  
  /**
    * Removes an item with a given key from the HttpResponseHeaderCollection .
    * @param key Key of the item to be removed.
    */
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  
  /** Gets or sets the HttpDateOrDeltaHeaderValue object that represent the value of a Retry-After HTTP header on an HTTP response. */
  /* CompleteClass */
  var retryAfter: typings.winrtUwp.Windows.Web.Http.Headers.HttpDateOrDeltaHeaderValue = js.native
  
  /** Gets the number of objects in the HttpResponseHeaderCollection . */
  /* CompleteClass */
  var size: Double = js.native
  
  /** Gets the HttpTransferCodingHeaderValueCollection of HttpTransferCodingHeaderValue objects that represent the value of a Transfer-Encoding HTTP header on an HTTP response. */
  /* CompleteClass */
  var transferEncoding: typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValueCollection = js.native
  
  /**
    * Try to append the specified item to the HttpResponseHeaderCollection without validation.
    * @param name The name of the item to append.
    * @param value The value of the item to append.
    * @return true if the item was appended; otherwise false.
    */
  /* CompleteClass */
  override def tryAppendWithoutValidation(name: String, value: String): Boolean = js.native
  
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a WWW-Authenticate HTTP header on an HTTP response. */
  /* CompleteClass */
  var wwwAuthenticate: typings.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValueCollection = js.native
}
