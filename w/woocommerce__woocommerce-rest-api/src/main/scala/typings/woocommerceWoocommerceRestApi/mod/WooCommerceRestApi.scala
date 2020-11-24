package typings.woocommerceWoocommerceRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WooCommerceRestApi extends js.Object {
  
  /**
    * Get OAuth
    */
  def _getOAuth(): js.Any = js.native
  
  /**
    * Get URL
    */
  def _getUrl(endpoint: String, params: js.Any): String = js.native
  
  /**
    * Normalize query string for oAuth
    */
  def _normalizeQueryString(url: String, params: js.Any): String = js.native
  
  /**
    * Parse params object.
    */
  def _parseParamsObject(params: js.Any, query: js.Any): WooCommerceRestApiQuery = js.native
  
  /**
    * Do requests
    */
  def _request(method: WooCommerceRestApiMethod, endpoint: String, data: js.Any, params: js.Any): js.Promise[_] = js.native
  
  /**
    * Set default options
    */
  def _setDefaultsOptions(opt: WooCommerceRestApiOptions): Unit = js.native
  
  var axiosConfig: js.Any = js.native
  
  var classVersion: String = js.native
  
  var consumerKey: String = js.native
  
  var consumerSecret: String = js.native
  
  /**
    * DELETE requests
    */
  def delete(endpoint: String): js.Promise[_] = js.native
  def delete(endpoint: String, params: js.Any): js.Promise[_] = js.native
  
  var encoding: WooCommerceRestApiEncoding = js.native
  
  /**
    * GET requests
    */
  def get(endpoint: String): js.Promise[_] = js.native
  def get(endpoint: String, params: js.Any): js.Promise[_] = js.native
  
  /**
    * OPTIONS requests
    */
  def options(endpoint: String): js.Promise[_] = js.native
  def options(endpoint: String, params: js.Any): js.Promise[_] = js.native
  
  var port: Double = js.native
  
  /**
    * POST requests
    */
  def post(endpoint: String, data: js.Any): js.Promise[_] = js.native
  def post(endpoint: String, data: js.Any, params: js.Any): js.Promise[_] = js.native
  
  /**
    * PUT requests
    */
  def put(endpoint: String, data: js.Any): js.Promise[_] = js.native
  def put(endpoint: String, data: js.Any, params: js.Any): js.Promise[_] = js.native
  
  var queryStringAuth: Boolean = js.native
  
  var timeout: Double = js.native
  
  var url: String = js.native
  
  var version: WooCommerceRestApiVersion = js.native
  
  var wpAPIPrefix: String = js.native
}
