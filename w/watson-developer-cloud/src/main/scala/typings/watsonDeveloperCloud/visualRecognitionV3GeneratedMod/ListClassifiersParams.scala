package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listClassifiers` operation. */
trait ListClassifiersParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Specify `true` to return details about the classifiers. Omit this parameter to return a brief list of classifiers. */
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object ListClassifiersParams {
  
  @scala.inline
  def apply(): ListClassifiersParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassifiersParams]
  }
  
  @scala.inline
  implicit class ListClassifiersParamsMutableBuilder[Self <: ListClassifiersParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
