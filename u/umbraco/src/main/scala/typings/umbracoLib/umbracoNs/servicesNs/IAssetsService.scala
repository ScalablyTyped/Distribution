package typings
package umbracoLib.umbracoNs.servicesNs

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
  def load(pathArray: js.Array[java.lang.String], scope: angularLib.angularMod.angularNs.IScope): angularLib.angularMod.angularNs.IPromise[_]
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
  def loadCss(
    path: java.lang.String,
    scope: angularLib.angularMod.angularNs.IScope,
    attributes: js.Object,
    timeout: scala.Double
  ): angularLib.angularMod.angularNs.IPromise[_]
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
  def loadJs(
    path: java.lang.String,
    scope: angularLib.angularMod.angularNs.IScope,
    attributes: js.Object,
    timeout: scala.Double
  ): angularLib.angularMod.angularNs.IPromise[_]
}

object IAssetsService {
  @scala.inline
  def apply(
    load: js.Function2[
      js.Array[java.lang.String], 
      angularLib.angularMod.angularNs.IScope, 
      angularLib.angularMod.angularNs.IPromise[_]
    ],
    loadCss: js.Function4[
      java.lang.String, 
      angularLib.angularMod.angularNs.IScope, 
      js.Object, 
      scala.Double, 
      angularLib.angularMod.angularNs.IPromise[_]
    ],
    loadJs: js.Function4[
      java.lang.String, 
      angularLib.angularMod.angularNs.IScope, 
      js.Object, 
      scala.Double, 
      angularLib.angularMod.angularNs.IPromise[_]
    ]
  ): IAssetsService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("loadCss")(loadCss)
    __obj.updateDynamic("loadJs")(loadJs)
    __obj.asInstanceOf[IAssetsService]
  }
}

