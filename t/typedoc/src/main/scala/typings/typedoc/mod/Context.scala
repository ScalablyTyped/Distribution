package typings.typedoc.mod

import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Context")
@js.native
open class Context protected ()
  extends typings.typedoc.distLibConverterMod.Context {
  /**
    * Create a new Context instance.
    *
    * @param converter  The converter instance that has created the context.
    * @internal
    */
  def this(
    converter: typings.typedoc.distLibConverterConverterMod.Converter,
    programs: js.Array[Program],
    project: typings.typedoc.distLibModelsMod.ProjectReflection
  ) = this()
  def this(
    converter: typings.typedoc.distLibConverterConverterMod.Converter,
    programs: js.Array[Program],
    project: typings.typedoc.distLibModelsMod.ProjectReflection,
    scope: typings.typedoc.distLibModelsMod.Reflection
  ) = this()
}
