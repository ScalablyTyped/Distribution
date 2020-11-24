package typings.umbraco.umbraco.resources

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.mediaTypeResource
  * @description Loads in data for media types
  **/
@js.native
trait IMediaTypeResource extends js.Object {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.mediaTypeResource#getAllowedTypes
    * @methodOf umbraco.resources.mediaTypeResource
    *
    * @description
    * Returns a list of allowed media types underneath a media item with a given ID
    *
    * ##usage
    * <pre>
    * mediaTypeResource.getAllowedTypes(1234)
    *    .then(function(array) {
    *        $scope.type = type;
    *    });
    * </pre>
    * @param {Int} mediaId id of the media item to retrive allowed child types for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllowedTypes(mediaId: Double): IPromise[IResourcePromise] = js.native
}
object IMediaTypeResource {
  
  @scala.inline
  def apply(getAllowedTypes: Double => IPromise[IResourcePromise]): IMediaTypeResource = {
    val __obj = js.Dynamic.literal(getAllowedTypes = js.Any.fromFunction1(getAllowedTypes))
    __obj.asInstanceOf[IMediaTypeResource]
  }
  
  @scala.inline
  implicit class IMediaTypeResourceOps[Self <: IMediaTypeResource] (val x: Self) extends AnyVal {
    
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
    def setGetAllowedTypes(value: Double => IPromise[IResourcePromise]): Self = this.set("getAllowedTypes", js.Any.fromFunction1(value))
  }
}
