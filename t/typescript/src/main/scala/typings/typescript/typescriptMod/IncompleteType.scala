package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompleteType extends FlowType {
  var flags: TypeFlags
  var `type`: Type
}

object IncompleteType {
  @scala.inline
  def apply(flags: TypeFlags, `type`: Type): IncompleteType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteType]
  }
}

