package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.mediaHelper
  * @description A helper object used for dealing with media items
  */
trait IMediaHelper extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#detectIfImageByExtension
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns true/false, indicating if the given path has an allowed image extension
    *
    * @param {string} imagePath Image path, ex: /media/1234/my-image.jpg
    */
  def detectIfImageByExtension(imagePath: java.lang.String): scala.Boolean
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#formatFileTypes
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns a string with correctly formated file types for ng-file-upload
    *
    * @param {string} file types, ex: jpg,png,tiff
    */
  def formatFileTypes(file: java.lang.String): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getImagePropertyValue
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the actual image path associated with the image property if there is one
    *
    * @param {object} options Options object
    * @param {object} options.imageModel The media object to retrieve the image path from
    */
  def getImagePropertyValue(options: IMediaOptions): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getMediaPropertyValue
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the file path associated with the media property if there is one
    *
    * @param {object} options Options object
    * @param {object} options.mediaModel The media object to retrieve the image path from
    * @param {object} options.imageOnly Optional, if true then will only return a path if the media item is an image
    */
  def getMediaPropertyValue(options: IMediaOptions): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getThumbnail
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * formats the display model used to display the content to the model used to save the content
    *
    * @param {object} options Options object
    * @param {object} options.imageModel The media object to retrieve the image path from
    */
  def getThumbnail(options: IMediaOptions): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#getThumbnailFromPath
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Returns the path to the thumbnail version of a given media library image path
    *
    * @param {string} imagePath Image path, ex: /media/1234/my-image.jpg
    */
  def getThumbnailFromPath(imagePath: java.lang.String): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#resolveFile
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Gets the media file url for a media object returned with the mediaResource
    *
    * @param {object} mediaEntity A media Entity returned from the entityResource
    * @param {boolean} thumbnail Whether to return the thumbnail url or normal url
    */
  def resolveFile(mediaItem: IMediaEntity, thumbnail: scala.Boolean): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#resolveFileFromEntity
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Gets the media file url for a media entity returned with the entityResource
    *
    * @param {object} mediaEntity A media Entity returned from the entityResource
    * @param {boolean} thumbnail Whether to return the thumbnail url or normal url
    */
  def resolveFileFromEntity(mediaEntity: IMediaEntity, thumbnail: scala.Boolean): java.lang.String
  /**
    * @ngdoc function
    * @name umbraco.services.mediaHelper#scaleToMaxSize
    * @methodOf umbraco.services.mediaHelper
    * @function
    *
    * @description
    * Finds the corrct max width and max height, given maximum dimensions and keeping aspect ratios
    *
    * @param {number} maxSize Maximum width & height
    * @param {number} width Current width
    * @param {number} height Current height
    */
  def scaleToMaxSize(maxSize: scala.Double, width: scala.Double, height: scala.Double): js.Any
}

object IMediaHelper {
  @scala.inline
  def apply(
    detectIfImageByExtension: java.lang.String => scala.Boolean,
    formatFileTypes: java.lang.String => java.lang.String,
    getImagePropertyValue: IMediaOptions => java.lang.String,
    getMediaPropertyValue: IMediaOptions => java.lang.String,
    getThumbnail: IMediaOptions => java.lang.String,
    getThumbnailFromPath: java.lang.String => java.lang.String,
    resolveFile: (IMediaEntity, scala.Boolean) => java.lang.String,
    resolveFileFromEntity: (IMediaEntity, scala.Boolean) => java.lang.String,
    scaleToMaxSize: (scala.Double, scala.Double, scala.Double) => js.Any
  ): IMediaHelper = {
    val __obj = js.Dynamic.literal(detectIfImageByExtension = js.Any.fromFunction1(detectIfImageByExtension), formatFileTypes = js.Any.fromFunction1(formatFileTypes), getImagePropertyValue = js.Any.fromFunction1(getImagePropertyValue), getMediaPropertyValue = js.Any.fromFunction1(getMediaPropertyValue), getThumbnail = js.Any.fromFunction1(getThumbnail), getThumbnailFromPath = js.Any.fromFunction1(getThumbnailFromPath), resolveFile = js.Any.fromFunction2(resolveFile), resolveFileFromEntity = js.Any.fromFunction2(resolveFileFromEntity), scaleToMaxSize = js.Any.fromFunction3(scaleToMaxSize))
  
    __obj.asInstanceOf[IMediaHelper]
  }
}

