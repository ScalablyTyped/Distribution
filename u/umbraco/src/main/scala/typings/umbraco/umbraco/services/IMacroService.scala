package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.macroService
  *
  *
  * @description
  * A service to return macro information such as generating syntax to insert a macro into an editor
  */
trait IMacroService extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateWebFormsSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into a rich text editor - this is the very old umbraco style syntax
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateMacroSyntax(args: Any*): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateMvcSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into an mvc template
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateMvcSyntax(args: Any*): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateWebFormsSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into a webforms templates
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateWebFormsSyntax(args: Any*): Unit
}
object IMacroService {
  
  inline def apply(
    generateMacroSyntax: /* repeated */ Any => Unit,
    generateMvcSyntax: /* repeated */ Any => Unit,
    generateWebFormsSyntax: /* repeated */ Any => Unit
  ): IMacroService = {
    val __obj = js.Dynamic.literal(generateMacroSyntax = js.Any.fromFunction1(generateMacroSyntax), generateMvcSyntax = js.Any.fromFunction1(generateMvcSyntax), generateWebFormsSyntax = js.Any.fromFunction1(generateWebFormsSyntax))
    __obj.asInstanceOf[IMacroService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMacroService] (val x: Self) extends AnyVal {
    
    inline def setGenerateMacroSyntax(value: /* repeated */ Any => Unit): Self = StObject.set(x, "generateMacroSyntax", js.Any.fromFunction1(value))
    
    inline def setGenerateMvcSyntax(value: /* repeated */ Any => Unit): Self = StObject.set(x, "generateMvcSyntax", js.Any.fromFunction1(value))
    
    inline def setGenerateWebFormsSyntax(value: /* repeated */ Any => Unit): Self = StObject.set(x, "generateWebFormsSyntax", js.Any.fromFunction1(value))
  }
}
