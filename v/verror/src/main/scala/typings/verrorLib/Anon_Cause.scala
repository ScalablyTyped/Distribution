package typings
package verrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Cause
  extends org.scalablytyped.runtime.Instantiable3[
      (/* options */ stdLib.Error) | (/* options */ verrorLib.verrorMod.VErrorNs.Options), 
      /* message */ java.lang.String, 
      /* params (repeated) */ js.Any, 
      verrorLib.verrorMod.VError
    ] {
  /*
    * Represents a collection of errors for the purpose of consumers that generally
    * only deal with one error.  Callers can extract the individual errors
    * contained in this object, but may also just treat it as a normal single
    * error, in which case a summary message will be printed.
    */
  var MultiError: org.scalablytyped.runtime.Instantiable1[/* errors */ js.Array[stdLib.Error], verrorLib.verrorMod.VErrorNs.MultiError] = js.native
  /*
    * SError is like VError, but stricter about types.  You cannot pass "null" or
    * "undefined" as string arguments to the formatter.  Since SError is only a
    * different function, not really a different class, we don't set
    * SError.prototype.name.
    */
  var SError: org.scalablytyped.runtime.Instantiable0[verrorLib.verrorMod.VErrorNs.SError] = js.native
  /*
    * Like JavaScript's built-in Error class, but supports a "cause" argument which
    * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
    * The cause argument can be null.
    */
  var WError: org.scalablytyped.runtime.Instantiable0[verrorLib.verrorMod.VErrorNs.WError] = js.native
  def cause(err: stdLib.Error): stdLib.Error | scala.Null = js.native
  def errorForEach(err: stdLib.Error, func: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def errorFromList[T /* <: stdLib.Error */](errors: js.Array[T]): scala.Null | T | verrorLib.verrorMod.VErrorNs.MultiError = js.native
  def findCauseByName(err: stdLib.Error, name: java.lang.String): stdLib.Error | scala.Null = js.native
  def fullStack(err: stdLib.Error): java.lang.String = js.native
  def hasCauseWithName(err: stdLib.Error, name: java.lang.String): scala.Boolean = js.native
  def info(err: stdLib.Error): verrorLib.verrorMod.VErrorNs.Info = js.native
}

