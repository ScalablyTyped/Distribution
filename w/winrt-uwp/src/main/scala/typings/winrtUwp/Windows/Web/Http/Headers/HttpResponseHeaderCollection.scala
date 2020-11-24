package typings.winrtUwp.Windows.Web.Http.Headers

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a collection of the HTTP headers associated with an HTTP response. */
@js.native
trait HttpResponseHeaderCollection extends js.Object {
  
  /** Gets or sets the TimeSpan object that represents the value of an Age HTTP header on an HTTP response. */
  var age: Double = js.native
  
  /** Gets the HttpMethodHeaderValueCollection of HttpMethod objects that represent the value of an Allow HTTP header on an HTTP response. */
  var allow: HttpMethodHeaderValueCollection = js.native
  
  /**
    * Adds a new item to the end of the HttpResponseHeaderCollection .
    * @param name The name of the value to add.
    * @param value The item value to add.
    */
  def append(name: String, value: String): Unit = js.native
  
  /** Gets the HttpCacheDirectiveHeaderValueCollection of objects that represent the value of a Cache-Control HTTP header on an HTTP response. */
  var cacheControl: HttpCacheDirectiveHeaderValueCollection = js.native
  
  /** Removes all objects from the collection. */
  def clear(): Unit = js.native
  
  /** Gets the HttpConnectionOptionHeaderValueCollection of HttpConnectionOptionHeaderValue objects that represent the value of a Connection HTTP header on an HTTP response. */
  var connection: HttpConnectionOptionHeaderValueCollection = js.native
  
  /** Gets or sets the DateTime object that represents the value of a Date HTTP header on an HTTP response. */
  var date: Date = js.native
  
  /**
    * Retrieves an iterator to the first item in the HttpResponseHeaderCollection .
    * @return An object that can be used to enumerate the items in the collection. The iterator points to the first item in the HttpResponseHeaderCollection .
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Returns an immutable view of the HttpResponseHeaderCollection .
    * @return The view of the HttpResponseHeaderCollection .
    */
  def getView(): IMapView[String, String] = js.native
  
  /**
    * Determines whether the HttpResponseHeaderCollection contains the specified key.
    * @param key The key associated with the item to locate.
    * @return true if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Inserts or replaces an item in the HttpResponseHeaderCollection with the specified key and value.
    * @param key The key of the item to be inserted.
    * @param value The value of the item to insert.
    * @return true if an item with the specified key is an existing item that was replaced; otherwise false.
    */
  def insert(key: String, value: String): Boolean = js.native
  
  /** Gets or sets the Uri that represents the value or a Location HTTP header on an HTTP response. */
  var location: Uri = js.native
  
  /**
    * Lookup an item in the HttpResponseHeaderCollection .
    * @param key The key of the item to lookup.
    * @return The value of the item if found.
    */
  def lookup(key: String): String = js.native
  
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a Proxy-Authenticate HTTP header on an HTTP response. */
  var proxyAuthenticate: HttpChallengeHeaderValueCollection = js.native
  
  /**
    * Removes an item with a given key from the HttpResponseHeaderCollection .
    * @param key Key of the item to be removed.
    */
  def remove(key: String): Unit = js.native
  
  /** Gets or sets the HttpDateOrDeltaHeaderValue object that represent the value of a Retry-After HTTP header on an HTTP response. */
  var retryAfter: HttpDateOrDeltaHeaderValue = js.native
  
  /** Gets the number of objects in the HttpResponseHeaderCollection . */
  var size: Double = js.native
  
  /** Gets the HttpTransferCodingHeaderValueCollection of HttpTransferCodingHeaderValue objects that represent the value of a Transfer-Encoding HTTP header on an HTTP response. */
  var transferEncoding: HttpTransferCodingHeaderValueCollection = js.native
  
  /**
    * Try to append the specified item to the HttpResponseHeaderCollection without validation.
    * @param name The name of the item to append.
    * @param value The value of the item to append.
    * @return true if the item was appended; otherwise false.
    */
  def tryAppendWithoutValidation(name: String, value: String): Boolean = js.native
  
  /** Gets the HttpChallengeHeaderValueCollection of HttpChallengeHeaderValue objects that represent the value of a WWW-Authenticate HTTP header on an HTTP response. */
  var wwwAuthenticate: HttpChallengeHeaderValueCollection = js.native
}
object HttpResponseHeaderCollection {
  
  @scala.inline
  def apply(
    age: Double,
    allow: HttpMethodHeaderValueCollection,
    append: (String, String) => Unit,
    cacheControl: HttpCacheDirectiveHeaderValueCollection,
    clear: () => Unit,
    connection: HttpConnectionOptionHeaderValueCollection,
    date: Date,
    first: () => IIterator[IKeyValuePair[_, _]],
    getView: () => IMapView[String, String],
    hasKey: String => Boolean,
    insert: (String, String) => Boolean,
    location: Uri,
    lookup: String => String,
    proxyAuthenticate: HttpChallengeHeaderValueCollection,
    remove: String => Unit,
    retryAfter: HttpDateOrDeltaHeaderValue,
    size: Double,
    transferEncoding: HttpTransferCodingHeaderValueCollection,
    tryAppendWithoutValidation: (String, String) => Boolean,
    wwwAuthenticate: HttpChallengeHeaderValueCollection
  ): HttpResponseHeaderCollection = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], allow = allow.asInstanceOf[js.Any], append = js.Any.fromFunction2(append), cacheControl = cacheControl.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), connection = connection.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), location = location.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), proxyAuthenticate = proxyAuthenticate.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), retryAfter = retryAfter.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], transferEncoding = transferEncoding.asInstanceOf[js.Any], tryAppendWithoutValidation = js.Any.fromFunction2(tryAppendWithoutValidation), wwwAuthenticate = wwwAuthenticate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseHeaderCollection]
  }
  
  @scala.inline
  implicit class HttpResponseHeaderCollectionOps[Self <: HttpResponseHeaderCollection] (val x: Self) extends AnyVal {
    
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
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow(value: HttpMethodHeaderValueCollection): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppend(value: (String, String) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCacheControl(value: HttpCacheDirectiveHeaderValueCollection): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnection(value: HttpConnectionOptionHeaderValueCollection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: () => IIterator[IKeyValuePair[_, _]]): Self = this.set("first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetView(value: () => IMapView[String, String]): Self = this.set("getView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKey(value: String => Boolean): Self = this.set("hasKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: (String, String) => Boolean): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLocation(value: Uri): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookup(value: String => String): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProxyAuthenticate(value: HttpChallengeHeaderValueCollection): Self = this.set("proxyAuthenticate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRetryAfter(value: HttpDateOrDeltaHeaderValue): Self = this.set("retryAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferEncoding(value: HttpTransferCodingHeaderValueCollection): Self = this.set("transferEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryAppendWithoutValidation(value: (String, String) => Boolean): Self = this.set("tryAppendWithoutValidation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWwwAuthenticate(value: HttpChallengeHeaderValueCollection): Self = this.set("wwwAuthenticate", value.asInstanceOf[js.Any])
  }
}
