package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.macroResource
  * @description Deals with data for macros
  *
  **/
@js.native
trait IMacroResource extends StObject {
  
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroParameters
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the editable macro parameters for the specified macro alias
    *
    * @param {int} macroId The macro id to get parameters for
    *
    */
  def getMacroParameters(macroId: Double): js.Any = js.native
  
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroResult
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the result of a macro as html to display in the rich text editor
    *
    * @param {int} macroId The macro id to get parameters for
    * @param {int} pageId The current page id
    * @param {Array} macroParamDictionary A dictionary of macro parameters
    *
    */
  def getMacroResultAsHtmlForEditor(macroId: Double, pageId: Double, macroParamDictionary: js.Array[_]): js.Any = js.native
}
object IMacroResource {
  
  @scala.inline
  def apply(
    getMacroParameters: Double => js.Any,
    getMacroResultAsHtmlForEditor: (Double, Double, js.Array[_]) => js.Any
  ): IMacroResource = {
    val __obj = js.Dynamic.literal(getMacroParameters = js.Any.fromFunction1(getMacroParameters), getMacroResultAsHtmlForEditor = js.Any.fromFunction3(getMacroResultAsHtmlForEditor))
    __obj.asInstanceOf[IMacroResource]
  }
  
  @scala.inline
  implicit class IMacroResourceMutableBuilder[Self <: IMacroResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMacroParameters(value: Double => js.Any): Self = StObject.set(x, "getMacroParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMacroResultAsHtmlForEditor(value: (Double, Double, js.Array[_]) => js.Any): Self = StObject.set(x, "getMacroResultAsHtmlForEditor", js.Any.fromFunction3(value))
  }
}
