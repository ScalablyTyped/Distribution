package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.typedocStrings.reference
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/reference", JSImport.Namespace)
@js.native
object modelsTypesReferenceMod extends js.Object {
  @js.native
  class ReferenceType protected () extends Type {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: Reflection) = this()
    var name: String = js.native
    var reflection: js.UndefOr[Reflection] = js.native
    var symbolFullyQualifiedName: String = js.native
    var typeArguments: js.UndefOr[js.Array[Type]] = js.native
    @JSName("type")
    val type_ReferenceType: reference = js.native
    def equals(other: ReferenceType): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_FQN_RESOLVED: String = js.native
    var SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
  }
  
}

