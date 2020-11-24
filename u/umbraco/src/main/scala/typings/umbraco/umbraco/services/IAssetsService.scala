package typings.umbraco.umbraco.services

import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
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
  def load(pathArray: js.Array[String], scope: IScope): IPromise[_] = js.native
  
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
  def loadCss(path: String, scope: IScope, attributes: js.Object, timeout: Double): IPromise[_] = js.native
  
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
  def loadJs(path: String, scope: IScope, attributes: js.Object, timeout: Double): IPromise[_] = js.native
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
  
  @scala.inline
  implicit class IAssetsServiceOps[Self <: IAssetsService] (val x: Self) extends AnyVal {
    
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
    def setLoad(value: (js.Array[String], IScope) => IPromise[_]): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadCss(value: (String, IScope, js.Object, Double) => IPromise[_]): Self = this.set("loadCss", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLoadJs(value: (String, IScope, js.Object, Double) => IPromise[_]): Self = this.set("loadJs", js.Any.fromFunction4(value))
  }
}
