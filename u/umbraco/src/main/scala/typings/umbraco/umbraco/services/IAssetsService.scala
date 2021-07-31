package typings.umbraco.umbraco.services

import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait IAssetsService extends StObject {
  
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
  def load(pathArray: js.Array[String], scope: IScope): IPromise[js.Any]
  
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
  def loadCss(path: String, scope: IScope, attributes: js.Object, timeout: Double): IPromise[js.Any]
  
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
  def loadJs(path: String, scope: IScope, attributes: js.Object, timeout: Double): IPromise[js.Any]
}
object IAssetsService {
  
  @scala.inline
  def apply(
    load: (js.Array[String], IScope) => IPromise[js.Any],
    loadCss: (String, IScope, js.Object, Double) => IPromise[js.Any],
    loadJs: (String, IScope, js.Object, Double) => IPromise[js.Any]
  ): IAssetsService = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load), loadCss = js.Any.fromFunction4(loadCss), loadJs = js.Any.fromFunction4(loadJs))
    __obj.asInstanceOf[IAssetsService]
  }
  
  @scala.inline
  implicit class IAssetsServiceMutableBuilder[Self <: IAssetsService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoad(value: (js.Array[String], IScope) => IPromise[js.Any]): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadCss(value: (String, IScope, js.Object, Double) => IPromise[js.Any]): Self = StObject.set(x, "loadCss", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLoadJs(value: (String, IScope, js.Object, Double) => IPromise[js.Any]): Self = StObject.set(x, "loadJs", js.Any.fromFunction4(value))
  }
}
