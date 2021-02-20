package typings.wordpressApiFetch.mod

import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIFetchOptions extends RequestInit {
  
  /**
    * Shorthand to be used in place of body, accepts an object value to be
    * stringified to JSON.
    */
  var data: js.UndefOr[js.Object] = js.native
  
  /**
    * Unlike `fetch`, the `Promise` return value of `apiFetch` will resolve to the
    * parsed JSON result. Disable this behavior by passing `parse` as `false`.
    *
    * @defaultValue true
    */
  var parse: js.UndefOr[Boolean] = js.native
  
  /**
    * Shorthand to be used in place of url, appended to the REST API root URL
    * for the current site.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Absolute URL to the endpoint from which to fetch.
    */
  var url: js.UndefOr[String] = js.native
}
object APIFetchOptions {
  
  @scala.inline
  def apply(): APIFetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIFetchOptions]
  }
  
  @scala.inline
  implicit class APIFetchOptionsMutableBuilder[Self <: APIFetchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
