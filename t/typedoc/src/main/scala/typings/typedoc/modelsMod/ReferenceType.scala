package typings.typedoc.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models", "ReferenceType")
@js.native
class ReferenceType protected ()
  extends typings.typedoc.modelsTypesMod.ReferenceType {
  def this(name: String, symbolFQN: String) = this()
  def this(name: String, symbolFQN: String, reflection: typings.typedoc.abstractMod.Reflection) = this()
}

/* static members */
@JSImport("typedoc/dist/lib/models", "ReferenceType")
@js.native
object ReferenceType extends js.Object {
  var SYMBOL_FQN_RESOLVED: String = js.native
  var SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
}

