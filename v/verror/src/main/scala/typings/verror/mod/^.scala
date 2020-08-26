package typings.verror.mod

import typings.std.Error
import typings.verror.anon.TypeofVError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("verror", JSImport.Namespace)
@js.native
class ^ protected () extends VError {
  def this(message: js.UndefOr[scala.Nothing], params: js.Any*) = this()
  def this(message: String, params: js.Any*) = this()
  def this(options: Error, message: String, params: js.Any*) = this()
  def this(options: Options, message: String, params: js.Any*) = this()
}

@JSImport("verror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VError: TypeofVError = js.native
  def cause(err: Error): Error | Null = js.native
  def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  def findCauseByName(err: Error, name: String): Error | Null = js.native
  def fullStack(err: Error): String = js.native
  def hasCauseWithName(err: Error, name: String): Boolean = js.native
  def info(err: Error): Info = js.native
}

