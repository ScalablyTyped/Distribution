package typings
package verrorLib.verrorMod.VErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
    * Represents a collection of errors for the purpose of consumers that generally
    * only deal with one error.  Callers can extract the individual errors
    * contained in this object, but may also just treat it as a normal single
    * error, in which case a summary message will be printed.
    */

trait MultiError
  extends verrorLib.verrorMod.VError {
  def errors(): js.Array[stdLib.Error]
}

