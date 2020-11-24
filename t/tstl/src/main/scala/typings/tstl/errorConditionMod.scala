package typings.tstl

import typings.tstl.errorCategoryMod.ErrorCategory
import typings.tstl.errorInstanceMod.ErrorInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/ErrorCondition", JSImport.Namespace)
@js.native
object errorConditionMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition () extends ErrorInstance {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: ErrorCategory) = this()
  }
}
