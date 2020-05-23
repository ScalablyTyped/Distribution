package typings.typescriptServices.mod.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.TextEditInfo")
@js.native
class TextEditInfo protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo {
  def this(position: Double, length: Double, replaceWith: String) = this()
  /* CompleteClass */
  override var length: Double = js.native
  /* CompleteClass */
  override var position: Double = js.native
  /* CompleteClass */
  override var replaceWith: String = js.native
}

