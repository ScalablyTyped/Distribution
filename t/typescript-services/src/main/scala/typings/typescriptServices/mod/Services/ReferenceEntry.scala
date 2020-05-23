package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.ReferenceEntry")
@js.native
class ReferenceEntry protected ()
  extends typings.typescriptServices.TypeScript.Services.ReferenceEntry {
  def this(fileName: String, minChar: Double, limChar: Double, isWriteAccess: Boolean) = this()
  /* CompleteClass */
  override var fileName: String = js.native
  /* CompleteClass */
  override var isWriteAccess: Boolean = js.native
  /* CompleteClass */
  override var limChar: Double = js.native
  /* CompleteClass */
  override var minChar: Double = js.native
}

