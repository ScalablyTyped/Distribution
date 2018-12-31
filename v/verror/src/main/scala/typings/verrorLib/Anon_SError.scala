package typings
package verrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SError extends js.Object {
  /*
    * Represents a collection of errors for the purpose of consumers that generally
    * only deal with one error.  Callers can extract the individual errors
    * contained in this object, but may also just treat it as a normal single
    * error, in which case a summary message will be printed.
    */
  var MultiError: org.scalablytyped.runtime.Instantiable1[/* errors */ js.Array[stdLib.Error], verrorLib.verrorMod.VErrorNs.MultiError]
  /*
    * SError is like VError, but stricter about types.  You cannot pass "null" or
    * "undefined" as string arguments to the formatter.  Since SError is only a
    * different function, not really a different class, we don't set
    * SError.prototype.name.
    */
  var SError: org.scalablytyped.runtime.Instantiable0[verrorLib.verrorMod.VErrorNs.SError]
  /*
    * Like JavaScript's built-in Error class, but supports a "cause" argument which
    * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
    * The cause argument can be null.
    */
  var WError: org.scalablytyped.runtime.Instantiable0[verrorLib.verrorMod.VErrorNs.WError]
}

