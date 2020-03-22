package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createFileLevelUniqueName")
@js.native
object createFileLevelUniqueName extends js.Object {
  /** Create a unique name based on the supplied text. This does not consider names injected by the transformer. */
  def apply(text: String): Identifier = js.native
}

