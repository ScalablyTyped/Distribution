package typings.typedoc.distLibConverterConverterMod

import typings.typedoc.distLibApplicationMod.Application
import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibConverterContextMod.Context
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsMod.Type
import typings.typedoc.distLibUtilsComponentMod.ChildableComponent
import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/converter", "Converter")
@js.native
class Converter () extends ChildableComponent[Application, ConverterComponent] {
  var addNodeConverter: js.Any = js.native
  var addTypeConverter: js.Any = js.native
  var compile: js.Any = js.native
  var excludeExternals: Boolean = js.native
  var excludeNotExported: Boolean = js.native
  var excludePrivate: Boolean = js.native
  var excludeProtected: Boolean = js.native
  var externalPattern: js.Array[String] = js.native
  var includeDeclarations: Boolean = js.native
  var name: String = js.native
  var nodeConverters: js.Any = js.native
  var removeNodeConverter: js.Any = js.native
  var removeTypeConverter: js.Any = js.native
  var resolve: js.Any = js.native
  var typeNodeConverters: js.Any = js.native
  var typeTypeConverters: js.Any = js.native
  def convert(fileNames: js.Array[String]): ConverterResult = js.native
  def convertNode(context: Context, node: Node): js.UndefOr[Reflection] = js.native
  def convertType(context: Context): js.UndefOr[Type] = js.native
  def convertType(context: Context, node: Node): js.UndefOr[Type] = js.native
  def convertType(context: Context, node: Node, `type`: typings.typescript.typescriptMod.Type): js.UndefOr[Type] = js.native
  def convertTypes(context: Context): js.Array[Type] = js.native
  def convertTypes(context: Context, nodes: js.Array[Node]): js.Array[Type] = js.native
  def convertTypes(context: Context, nodes: js.Array[Node], types: js.Array[typings.typescript.typescriptMod.Type]): js.Array[Type] = js.native
  def getDefaultLib(): String = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/converter/converter", "Converter")
@js.native
object Converter extends js.Object {
  var EVENT_BEGIN: String = js.native
  var EVENT_CREATE_DECLARATION: String = js.native
  var EVENT_CREATE_PARAMETER: String = js.native
  var EVENT_CREATE_SIGNATURE: String = js.native
  var EVENT_CREATE_TYPE_PARAMETER: String = js.native
  var EVENT_END: String = js.native
  var EVENT_FILE_BEGIN: String = js.native
  var EVENT_FUNCTION_IMPLEMENTATION: String = js.native
  var EVENT_RESOLVE: String = js.native
  var EVENT_RESOLVE_BEGIN: String = js.native
  var EVENT_RESOLVE_END: String = js.native
}

