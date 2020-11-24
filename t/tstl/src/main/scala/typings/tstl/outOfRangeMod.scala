package typings.tstl

import typings.tstl.logicErrorMod.LogicError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/OutOfRange", JSImport.Namespace)
@js.native
object outOfRangeMod extends js.Object {
  
  @js.native
  class OutOfRange protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
}
