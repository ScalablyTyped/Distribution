package typings.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Reflection")
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
