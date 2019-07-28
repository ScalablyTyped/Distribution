package typings.typedoc.distLibConverterMod

import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter", "Context")
@js.native
class Context protected ()
  extends typings.typedoc.distLibConverterContextMod.Context {
  def this(
    converter: typings.typedoc.distLibConverterConverterMod.Converter,
    fileNames: js.Array[String],
    checker: TypeChecker,
    program: Program
  ) = this()
}

