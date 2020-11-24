package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.macroService
  *
  *
  * @description
  * A service to return macro information such as generating syntax to insert a macro into an editor
  */
@js.native
trait IMacroService extends js.Object {
  
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
  def generateMacroSyntax(args: js.Any*): Unit = js.native
  
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
  def generateMvcSyntax(args: js.Any*): Unit = js.native
  
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
  def generateWebFormsSyntax(args: js.Any*): Unit = js.native
}
object IMacroService {
  
  @scala.inline
  def apply(
    generateMacroSyntax: /* repeated */ js.Any => Unit,
    generateMvcSyntax: /* repeated */ js.Any => Unit,
    generateWebFormsSyntax: /* repeated */ js.Any => Unit
  ): IMacroService = {
    val __obj = js.Dynamic.literal(generateMacroSyntax = js.Any.fromFunction1(generateMacroSyntax), generateMvcSyntax = js.Any.fromFunction1(generateMvcSyntax), generateWebFormsSyntax = js.Any.fromFunction1(generateWebFormsSyntax))
    __obj.asInstanceOf[IMacroService]
  }
  
  @scala.inline
  implicit class IMacroServiceOps[Self <: IMacroService] (val x: Self) extends AnyVal {
    
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
    def setGenerateMacroSyntax(value: /* repeated */ js.Any => Unit): Self = this.set("generateMacroSyntax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateMvcSyntax(value: /* repeated */ js.Any => Unit): Self = this.set("generateMvcSyntax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateWebFormsSyntax(value: /* repeated */ js.Any => Unit): Self = this.set("generateWebFormsSyntax", js.Any.fromFunction1(value))
  }
}
