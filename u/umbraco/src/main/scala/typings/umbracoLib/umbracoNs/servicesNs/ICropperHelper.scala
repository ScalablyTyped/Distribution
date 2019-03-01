package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.cropperHelper
  * @description A helper object used for dealing with image cropper data
  */
trait ICropperHelper extends js.Object {
  /**
  		* @ngdoc method
  		* @name umbraco.services.cropperHelper#configuration
  		* @methodOf umbraco.services.cropperHelper
  		*
  		* @description
  		* Returns a collection of plugins available to the tinyMCE editor
  		*
  		*/
  def configuration(mediaTypeAlias: java.lang.String): js.Any
}

object ICropperHelper {
  @scala.inline
  def apply(configuration: js.Function1[java.lang.String, js.Any]): ICropperHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configuration")(configuration)
    __obj.asInstanceOf[ICropperHelper]
  }
}

