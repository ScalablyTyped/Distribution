package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.EditorOptions")
@js.native
class EditorOptions ()
  extends typings.typescriptServices.TypeScript.Services.EditorOptions {
  /* CompleteClass */
  override var ConvertTabsToSpaces: Boolean = js.native
  /* CompleteClass */
  override var IndentSize: Double = js.native
  /* CompleteClass */
  override var NewLineCharacter: String = js.native
  /* CompleteClass */
  override var TabSize: Double = js.native
}

/* static members */
@JSImport("typescript-services", "Services.EditorOptions")
@js.native
object EditorOptions extends js.Object {
  def clone(objectToClone: typings.typescriptServices.TypeScript.Services.EditorOptions): typings.typescriptServices.TypeScript.Services.EditorOptions = js.native
}

