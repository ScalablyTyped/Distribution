package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
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
object Options {
  
  @scala.inline
  def apply(options: js.Any, path: String): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
