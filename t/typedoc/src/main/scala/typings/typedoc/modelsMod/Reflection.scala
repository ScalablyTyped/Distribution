package typings.typedoc.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models", "Reflection")
@js.native
abstract class Reflection protected ()
  extends typings.typedoc.modelsReflectionsMod.Reflection {
  def this(name: String, kind: typings.typedoc.kindMod.ReflectionKind) = this()
  def this(
    name: String,
    kind: typings.typedoc.kindMod.ReflectionKind,
    parent: typings.typedoc.abstractMod.Reflection
  ) = this()
}
