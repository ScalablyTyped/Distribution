package typings.superDashError.superDashErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("super-error", JSImport.Namespace)
@js.native
class ^ protected () extends SuperError {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def causedBy(err: Error): this.type = js.native
}

@JSImport("super-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def subclass(exports: js.Any, name: String): SuperErrorI = js.native
  def subclass(
    exports: js.Any,
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ js.Any, Unit]
  ): SuperErrorI = js.native
  def subclass(name: String): SuperErrorI = js.native
  def subclass(
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ js.Any, Unit]
  ): SuperErrorI = js.native
}

