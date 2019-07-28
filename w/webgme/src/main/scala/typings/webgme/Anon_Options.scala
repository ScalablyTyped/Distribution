package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  /**
    * Optional options passed to authorizer module at initialization (via gmeConfig).
    *    config.authentication.authorizer.options = {};
    */
  var options: js.Any
  /**
    * Path (absolute) to module implementing AuthorizerBase 
    * (located next to deafultauthorizer) for getting and 
    * setting authorization regarding projects and project creation.
    *   config.authentication.authorizer.path = './src/server/middleware/auth/defaultauthorizer';
    */
  var path: String
}

object Anon_Options {
  @scala.inline
  def apply(options: js.Any, path: String): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options, path = path)
  
    __obj.asInstanceOf[Anon_Options]
  }
}

