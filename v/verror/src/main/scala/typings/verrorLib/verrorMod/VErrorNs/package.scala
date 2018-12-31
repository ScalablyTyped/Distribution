package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VErrorNs {
  /*
    * SError is like VError, but stricter about types.  You cannot pass "null" or
    * "undefined" as string arguments to the formatter.  Since SError is only a
    * different function, not really a different class, we don't set
    * SError.prototype.name.
    */
  type SError = verrorLib.verrorMod.VError
  /*
    * Like JavaScript's built-in Error class, but supports a "cause" argument which
    * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
    * The cause argument can be null.
    */
  type WError = verrorLib.verrorMod.VError
}
