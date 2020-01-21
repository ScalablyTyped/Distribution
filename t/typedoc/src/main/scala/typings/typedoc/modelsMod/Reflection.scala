package typings.typedoc.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models", "Reflection")
@js.native
abstract class Reflection protected ()
  extends typings.typedoc.reflectionsMod.Reflection {
  def this(name: String, kind: typings.typedoc.abstractMod.ReflectionKind) = this()
  def this(
    name: String,
    kind: typings.typedoc.abstractMod.ReflectionKind,
    parent: typings.typedoc.abstractMod.Reflection
  ) = this()
}

