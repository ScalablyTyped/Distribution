package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.DefinitionInfo")
@js.native
class DefinitionInfo protected ()
  extends typings.typescriptServices.TypeScript.Services.DefinitionInfo {
  def this(
    fileName: String,
    minChar: Double,
    limChar: Double,
    kind: String,
    name: String,
    containerKind: String,
    containerName: String
  ) = this()
  /* CompleteClass */
  override var containerKind: String = js.native
  /* CompleteClass */
  override var containerName: String = js.native
  /* CompleteClass */
  override var fileName: String = js.native
  /* CompleteClass */
  override var kind: String = js.native
  /* CompleteClass */
  override var limChar: Double = js.native
  /* CompleteClass */
  override var minChar: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
}

