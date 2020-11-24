package typings.swaggerSailsHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("swagger-sails-hook", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Create a new `swagger-sails-hook` sails hook and register it with `sails`
    * @param sails - reference to the running sails instance
    * @returns SailsHook - `swagger-sails-hook` object implementing the Sails' hook specification.
    */
  def apply(sails: js.Any): SailsHook = js.native
}
