package typings.typedoc.typedocMod

import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "Reflection")
@js.native
abstract class Reflection protected ()
  extends typings.typedoc.distLibModelsReflectionsMod.Reflection {
  def this(name: String, kind: ReflectionKind) = this()
  def this(
    name: String,
    kind: ReflectionKind,
    parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
  ) = this()
}

