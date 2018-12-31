package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.umbRequestHelper
  * @description A helper object used for sending requests to the server
  */
@js.native
trait IUmbracoRequestHelper extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.umbRequestHelper#convertVirtualToAbsolutePath
    * @methodOf umbraco.services.umbRequestHelper
    * @function
    *
    * @description
    * This will convert a virtual path (i.e. ~/App_Plugins/Blah/Test.html ) to an absolute path
    *
    * @param {string} a virtual path, if this is already an absolute path it will just be returned, if this is a relative path an exception will be thrown
    */
  def convertVirtualToAbsolutePath(virtualPath: java.lang.String): java.lang.String = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.umbRequestHelper#dictionaryToQueryString
    * @methodOf umbraco.services.umbRequestHelper
    * @function
    *
    * @description
    * This will turn an array of key/value pairs into a query string
    *
    * @param {Array} queryStrings An array of key/value pairs
    */
  def dictionaryToQueryString(queryStrings: js.Array[KeyValuePair[java.lang.String]]): java.lang.String = js.native
  /**
    * @ngdoc method
    * @name umbraco.services.umbRequestHelper#getApiUrl
    * @methodOf umbraco.services.umbRequestHelper
    * @function
    *
    * @description
    * This will return the webapi Url for the requested key based on the servervariables collection
    *
    * @param {string} apiName The webapi name that is found in the servervariables["umbracoUrls"] dictionary
    * @param {string} actionName The webapi action name
    * @param {object} queryStrings Can be either a string or an array containing key/value pairs
    */
  def getApiUrl(apiName: java.lang.String, actionName: java.lang.String, queryStrings: java.lang.String): java.lang.String = js.native
  def getApiUrl(
    apiName: java.lang.String,
    actionName: java.lang.String,
    queryStrings: js.Array[KeyValuePair[java.lang.String]]
  ): java.lang.String = js.native
  /**
    * @ngdoc function
    * @name umbraco.services.umbRequestHelper#resourcePromise
    * @methodOf umbraco.services.umbRequestHelper
    * @function
    *
    * @description
    * This returns a promise with an underlying http call, it is a helper method to reduce
    *  the amount of duplicate code needed to query http resources and automatically handle any
    *  Http errors. See /docs/source/using-promises-resources.md
    *
    * @param {object} opts A mixed object which can either be a string representing the error message to be
    *   returned OR an object containing either:
    *     { success: successCallback, errorMsg: errorMessage }
    *          OR
    *     { success: successCallback, error: errorCallback }
    *   In both of the above, the successCallback must accept these parameters: data, status, headers, config
    *   If using the errorCallback it must accept these parameters: data, status, headers, config
    *   The success callback must return the data which will be resolved by the deferred object.
    *   The error callback must return an object containing: {errorMsg: errorMessage, data: originalData, status: status }
    */
  def resourcePromise[T](httpPromise: angularLib.angularMod.angularNs.IPromise[T], opts: java.lang.String): umbracoLib.umbracoMod.resourcesNs.IResourcePromise | js.Object = js.native
  def resourcePromise[T](httpPromise: angularLib.angularMod.angularNs.IPromise[T], opts: umbracoLib.Anon_Success[T]): umbracoLib.umbracoMod.resourcesNs.IResourcePromise | js.Object = js.native
  def resourcePromise[T](httpPromise: angularLib.angularMod.angularNs.IPromise[T], opts: umbracoLib.Anon_SuccessError[T]): umbracoLib.umbracoMod.resourcesNs.IResourcePromise | js.Object = js.native
}

