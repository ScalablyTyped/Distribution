package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
    * Like JavaScript's built-in Error class, but supports a "cause" argument which
    * is wrapped, not "folded in" as with VError.	Accepts a printf-style message.
    * The cause argument can be null.
    */
@JSImport("verror", "WError")
@js.native
class WError ()
  extends verrorLib.verrorMod.VErrorNs.WError {
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[stdLib.Error] = js.native
}

