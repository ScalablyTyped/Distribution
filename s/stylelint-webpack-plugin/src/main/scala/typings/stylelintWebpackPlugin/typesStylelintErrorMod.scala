package typings.stylelintWebpackPlugin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStylelintErrorMod {
  
  @JSImport("stylelint-webpack-plugin/types/StylelintError", JSImport.Namespace)
  @js.native
  /**
    * @param {string=} messages
    */
  open class ^ ()
    extends StObject
       with StylelintError {
    def this(messages: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_StylelintError: String = js.native
  }
  
  trait StylelintError
    extends StObject
       with Error {
    
    @JSName("stack")
    var stack_StylelintError: String
  }
  object StylelintError {
    
    inline def apply(message: String, name: String, stack: String): StylelintError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylelintError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylelintError] (val x: Self) extends AnyVal {
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
