package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.NullLogger")
@js.native
class NullLogger ()
  extends typings.typescriptServices.TypeScript.NullLogger {
  /* CompleteClass */
  override def debug(): Boolean = js.native
  /* CompleteClass */
  override def error(): Boolean = js.native
  /* CompleteClass */
  override def fatal(): Boolean = js.native
  /* CompleteClass */
  override def information(): Boolean = js.native
  /* CompleteClass */
  override def log(s: String): Unit = js.native
  /* CompleteClass */
  override def warning(): Boolean = js.native
}

