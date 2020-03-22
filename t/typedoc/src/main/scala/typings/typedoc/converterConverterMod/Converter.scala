package typings.typedoc.converterConverterMod

import typings.typedoc.applicationMod.Application
import typings.typedoc.componentMod.ChildableComponent
import typings.typedoc.componentsMod.ConverterComponent
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsMod.Type
import typings.typescript.mod.Node
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
  var excludeNotDocumented: Boolean = js.native
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
  def convertType(context: Context, node: Node, `type`: typings.typescript.mod.Type): js.UndefOr[Type] = js.native
  def convertTypes(context: Context): js.Array[Type] = js.native
  def convertTypes(context: Context, nodes: js.Array[Node]): js.Array[Type] = js.native
  def convertTypes(context: Context, nodes: js.Array[Node], types: js.Array[typings.typescript.mod.Type]): js.Array[Type] = js.native
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

