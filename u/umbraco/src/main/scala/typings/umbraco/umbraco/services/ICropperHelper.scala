package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.cropperHelper
  * @description A helper object used for dealing with image cropper data
  */
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
  def configuration(mediaTypeAlias: String): Any
}
object ICropperHelper {
  
  inline def apply(configuration: String => Any): ICropperHelper = {
    val __obj = js.Dynamic.literal(configuration = js.Any.fromFunction1(configuration))
    __obj.asInstanceOf[ICropperHelper]
  }
  
  extension [Self <: ICropperHelper](x: Self) {
    
    inline def setConfiguration(value: String => Any): Self = StObject.set(x, "configuration", js.Any.fromFunction1(value))
  }
}
