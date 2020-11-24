package typings.tstl

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/Exception", JSImport.Namespace)
@js.native
object exceptionExceptionMod extends js.Object {
  
  @js.native
  class Exception protected () extends Error {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
    
    /**
      * The error name.
      */
    @JSName("name")
    def name_MException: String = js.native
    
    /**
      * Native function for `JSON.stringify()`.
      *
      * The {@link Exception.toJSON} function returns only three properties; ({@link name}, {@link message} and {@link stack}). If you want to define a new sub-class extending the {@link Exception} and const the class to export additional props (or remove some props), override this {@link Exception.toJSON} method.
      *
      * @return An object for `JSON.stringify()`.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * Get error message.
      *
      * @return The error message.
      */
    def what(): String = js.native
  }
}
