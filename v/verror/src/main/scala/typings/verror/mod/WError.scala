package typings.verror.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Like JavaScript's built-in Error class, but supports a "cause" argument which
  * is wrapped, not "folded in" as with VError.    Accepts a printf-style message.
  * The cause argument can be null.
  */
@JSImport("verror", "WError")
@js.native
class WError () extends VError {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[Error] = js.native
}

