package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @ngdoc service
    * @name umbraco.services.macroService
    *
    *
    * @description
    * A service to return macro information such as generating syntax to insert a macro into an editor
    */

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
  def generateMacroSyntax(args: js.Any*): scala.Unit
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
  def generateMvcSyntax(args: js.Any*): scala.Unit
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
  def generateWebFormsSyntax(args: js.Any*): scala.Unit
}

