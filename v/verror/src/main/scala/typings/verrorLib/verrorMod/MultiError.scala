package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
    * Represents a collection of errors for the purpose of consumers that generally
    * only deal with one error.  Callers can extract the individual errors
    * contained in this object, but may also just treat it as a normal single
    * error, in which case a summary message will be printed.
    */
@JSImport("verror", "MultiError")
@js.native
class MultiError protected ()
  extends verrorLib.verrorMod.VErrorNs.MultiError {
  def this(errors: js.Array[stdLib.Error]) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[stdLib.Error] = js.native
  /* CompleteClass */
  override def errors(): js.Array[stdLib.Error] = js.native
}

