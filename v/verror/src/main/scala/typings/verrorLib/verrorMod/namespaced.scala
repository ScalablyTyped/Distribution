package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("verror", JSImport.Namespace)
@js.native
class namespaced () extends VError {
  def this(message: java.lang.String, params: js.Any*) = this()
  def this(options: stdLib.Error, message: java.lang.String, params: js.Any*) = this()
  def this(options: verrorLib.verrorMod.VErrorNs.Options, message: java.lang.String, params: js.Any*) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[stdLib.Error] = js.native
}

@JSImport("verror", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var VError: verrorLib.Anon_SError = js.native
  def cause(err: stdLib.Error): stdLib.Error | scala.Null = js.native
  def errorForEach(err: stdLib.Error, func: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def errorFromList[T /* <: stdLib.Error */](errors: js.Array[T]): scala.Null | T | verrorLib.verrorMod.VErrorNs.MultiError = js.native
  def findCauseByName(err: stdLib.Error, name: java.lang.String): stdLib.Error | scala.Null = js.native
  def fullStack(err: stdLib.Error): java.lang.String = js.native
  def hasCauseWithName(err: stdLib.Error, name: java.lang.String): scala.Boolean = js.native
  def info(err: stdLib.Error): verrorLib.verrorMod.VErrorNs.Info = js.native
}

