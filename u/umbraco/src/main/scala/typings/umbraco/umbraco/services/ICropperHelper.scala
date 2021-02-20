package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.cropperHelper
  * @description A helper object used for dealing with image cropper data
  */
@js.native
trait ICropperHelper extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.services.cropperHelper#configuration
    * @methodOf umbraco.services.cropperHelper
    *
    * @description
    * Returns a collection of plugins available to the tinyMCE editor
    *
    */
  def configuration(mediaTypeAlias: String): js.Any = js.native
}
object ICropperHelper {
  
  @scala.inline
  def apply(configuration: String => js.Any): ICropperHelper = {
    val __obj = js.Dynamic.literal(configuration = js.Any.fromFunction1(configuration))
    __obj.asInstanceOf[ICropperHelper]
  }
  
  @scala.inline
  implicit class ICropperHelperMutableBuilder[Self <: ICropperHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String => js.Any): Self = StObject.set(x, "configuration", js.Any.fromFunction1(value))
  }
}
