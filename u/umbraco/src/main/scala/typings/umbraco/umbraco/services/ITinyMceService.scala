package typings.umbraco.umbraco.services

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.tinyMceService
  *
  *
  * @description
  * A service containing all logic for all of the Umbraco TinyMCE plugins
  */
@js.native
trait ITinyMceService extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#configuration
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Returns a collection of plugins available to the tinyMCE editor
    *
    */
  def configuration(): js.Array[ITinyMcePlugin] = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createInsertEmbeddedMedia
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the umbrco insert embedded media tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createInsertEmbeddedMedia(editor: js.Object, $scope: IScope): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createUmbracoMacro
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the insert umbrco macro tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createInsertMacro(editor: js.Object, $scope: IScope): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#createMediaPicker
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Creates the umbrco insert media tinymce plugin
    *
    * @param {Object} editor the TinyMCE editor instance
    * @param {Object} $scope the current controller scope
    */
  def createMediaPicker(editor: js.Object): Unit = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.services.tinyMceService#defaultPrevalues
    * @methodOf umbraco.services.tinyMceService
    *
    * @description
    * Returns a default configration to fallback on in case none is provided
    *
    */
  def defaultPrevalues(): IConfiguration = js.native
}
object ITinyMceService {
  
  @scala.inline
  def apply(
    configuration: () => js.Array[ITinyMcePlugin],
    createInsertEmbeddedMedia: (js.Object, IScope) => Unit,
    createInsertMacro: (js.Object, IScope) => Unit,
    createMediaPicker: js.Object => Unit,
    defaultPrevalues: () => IConfiguration
  ): ITinyMceService = {
    val __obj = js.Dynamic.literal(configuration = js.Any.fromFunction0(configuration), createInsertEmbeddedMedia = js.Any.fromFunction2(createInsertEmbeddedMedia), createInsertMacro = js.Any.fromFunction2(createInsertMacro), createMediaPicker = js.Any.fromFunction1(createMediaPicker), defaultPrevalues = js.Any.fromFunction0(defaultPrevalues))
    __obj.asInstanceOf[ITinyMceService]
  }
  
  @scala.inline
  implicit class ITinyMceServiceOps[Self <: ITinyMceService] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: () => js.Array[ITinyMcePlugin]): Self = this.set("configuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateInsertEmbeddedMedia(value: (js.Object, IScope) => Unit): Self = this.set("createInsertEmbeddedMedia", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateInsertMacro(value: (js.Object, IScope) => Unit): Self = this.set("createInsertMacro", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateMediaPicker(value: js.Object => Unit): Self = this.set("createMediaPicker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultPrevalues(value: () => IConfiguration): Self = this.set("defaultPrevalues", js.Any.fromFunction0(value))
  }
}
