package typings.typedoc.distLibModelsTypesTupleMod

import typings.typedoc.distLibModelsTypesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/tuple", "TupleType")
@js.native
class TupleType protected () extends Type {
  def this(elements: js.Array[Type]) = this()
  var elements: js.Array[Type] = js.native
  def equals(`type`: TupleType): Boolean = js.native
}

