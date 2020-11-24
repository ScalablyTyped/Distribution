package typings.tstl

import typings.tstl.errorCategoryMod.ErrorCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/exception/ErrorInstance", JSImport.Namespace)
@js.native
object errorInstanceMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ErrorInstance () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: ErrorCategory) = this()
    
    /**
      * Assign content.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def assign(`val`: Double, category: ErrorCategory): Unit = js.native
    
    /**
      * Get category.
      *
      * @return The category object.
      */
    def category(): ErrorCategory = js.native
    
    var category_ : ErrorCategory = js.native
    
    /**
      * Clear content.
      */
    def clear(): Unit = js.native
    
    /**
      * Get message.
      *
      * @return The message.
      */
    def message(): String = js.native
    
    def toJSON(): js.Object = js.native
    
    /**
      * Covert bo bool.
      *
      * @return Whether the {@link value} is not zero.
      */
    def to_bool(): Boolean = js.native
    
    /**
      * Get value, the identifier.
      *
      * @return The value, identifier of this object.
      */
    def value(): Double = js.native
    
    var value_ : Double = js.native
  }
}
