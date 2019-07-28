package typings.verror.verrorMod

import typings.std.Error
import typings.verror.TypeofClassVError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("verror", JSImport.Namespace)
@js.native
class ^ () extends VError {
  def this(message: String, params: js.Any*) = this()
  def this(options: Error, message: String, params: js.Any*) = this()
  def this(options: Options, message: String, params: js.Any*) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[Error] = js.native
}

@JSImport("verror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VError: TypeofClassVError = js.native
  def cause(err: Error): Error | Null = js.native
  def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  def findCauseByName(err: Error, name: String): Error | Null = js.native
  def fullStack(err: Error): String = js.native
  def hasCauseWithName(err: Error, name: String): Boolean = js.native
  def info(err: Error): Info = js.native
}

