package typings.tslint.tslintMod

import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isTypeFlagSet")
@js.native
object isTypeFlagSet extends js.Object {
  def apply(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
}

