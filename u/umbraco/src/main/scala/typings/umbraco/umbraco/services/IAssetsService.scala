package typings.umbraco.umbraco.services

import typings.angular.angularMod.IPromise
import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.assetsService
  *
  * @requires $q
  * @requires angularHelper
  *
  * @description
  * Promise-based utillity service to lazy-load client-side dependencies inside angular controllers.
  */
trait IAssetsService extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.assetsService#load
    * @methodOf umbraco.services.assetsService
    *
    * @description
    * Injects a collection of files, this can be ONLY js files
    *
    *
    * @param {Array} pathArray string array of paths to the files to load
    * @param {Scope} scope optional scope to pass into the loader
    * @returns {Promise} Promise object which resolves when all the files has loaded
    */
  def load(pathArray: js.Array[String], scope: IScope): IPromise[_]
  /**
    * @ngdoc method
    * @name umbraco.services.assetsService#loadCss
    * @methodOf umbraco.services.assetsService
    *
    * @description
    * Injects a file as a stylesheet into the document head
    *
    * @param {String} path path to the css file to load
    * @param {Scope} scope optional scope to pass into the loader
    * @param {Object} keyvalue collection of attributes to pass to the stylesheet element
    * @param {Number} timeout in milliseconds
    * @returns {Promise} Promise object which resolves when the file has loaded
    */
  def loadCss(path: String, scope: IScope, attributes: js.Object, timeout: Double): IPromise[_]
  /**
    * @ngdoc method
    * @name umbraco.services.assetsService#loadJs
    * @methodOf umbraco.services.assetsService
    *
    * @description
    * Injects a file as a javascript into the document
    *
    * @param {String} path path to the js file to load
    * @param {Scope} scope optional scope to pass into the loader
    * @param {Object} keyvalue collection of attributes to pass to the script element
    * @param {Number} timeout in milliseconds
    * @returns {Promise} Promise object which resolves when the file has loaded
    */
  def loadJs(path: String, scope: IScope, attributes: js.Object, timeout: Double): IPromise[_]
}

object IAssetsService {
  @scala.inline
  def apply(
    load: (js.Array[String], IScope) => IPromise[_],
    loadCss: (String, IScope, js.Object, Double) => IPromise[_],
    loadJs: (String, IScope, js.Object, Double) => IPromise[_]
  ): IAssetsService = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load), loadCss = js.Any.fromFunction4(loadCss), loadJs = js.Any.fromFunction4(loadJs))
  
    __obj.asInstanceOf[IAssetsService]
  }
}

