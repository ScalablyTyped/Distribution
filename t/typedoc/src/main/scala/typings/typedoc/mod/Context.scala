package typings.typedoc.mod

import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Context")
@js.native
open class Context protected ()
  extends typings.typedoc.converterMod.Context {
  /**
    * Create a new Context instance.
    *
    * @param converter  The converter instance that has created the context.
    * @internal
    */
  def this(
    converter: typings.typedoc.converterConverterMod.Converter,
    programs: js.Array[Program],
    project: typings.typedoc.modelsMod.ProjectReflection
  ) = this()
  def this(
    converter: typings.typedoc.converterConverterMod.Converter,
    programs: js.Array[Program],
    project: typings.typedoc.modelsMod.ProjectReflection,
    scope: typings.typedoc.modelsMod.Reflection
  ) = this()
}
