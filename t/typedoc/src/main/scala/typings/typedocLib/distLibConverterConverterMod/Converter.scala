package typings
package typedocLib.distLibConverterConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/converter", "Converter")
@js.native
class Converter ()
  extends typedocLib.distLibUtilsComponentMod.ChildableComponent[
      typedocLib.distLibApplicationMod.Application, 
      typedocLib.distLibConverterComponentsMod.ConverterComponent
    ] {
  var addNodeConverter: js.Any = js.native
  var addTypeConverter: js.Any = js.native
  var compile: js.Any = js.native
  var compilerHost: js.Any = js.native
  var excludeExternals: scala.Boolean = js.native
  var excludeNotExported: scala.Boolean = js.native
  var excludePrivate: scala.Boolean = js.native
  var excludeProtected: scala.Boolean = js.native
  var externalPattern: java.lang.String = js.native
  var includeDeclarations: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var nodeConverters: js.Any = js.native
  var removeNodeConverter: js.Any = js.native
  var removeTypeConverter: js.Any = js.native
  var resolve: js.Any = js.native
  var typeNodeConverters: js.Any = js.native
  var typeTypeConverters: js.Any = js.native
  def convert(fileNames: js.Array[java.lang.String]): ConverterResult = js.native
  def convertNode(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.Node
  ): typedocLib.distLibModelsMod.Reflection = js.native
  def convertType(context: typedocLib.distLibConverterContextMod.Context): typedocLib.distLibModelsMod.Type = js.native
  def convertType(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.Node
  ): typedocLib.distLibModelsMod.Type = js.native
  def convertType(
    context: typedocLib.distLibConverterContextMod.Context,
    node: typescriptLib.typescriptMod.tsNs.Node,
    `type`: typescriptLib.typescriptMod.tsNs.Type
  ): typedocLib.distLibModelsMod.Type = js.native
  def getDefaultLib(): java.lang.String = js.native
}

@JSImport("typedoc/dist/lib/converter/converter", "Converter")
@js.native
object Converter extends js.Object {
  var EVENT_BEGIN: java.lang.String = js.native
  var EVENT_CREATE_DECLARATION: java.lang.String = js.native
  var EVENT_CREATE_PARAMETER: java.lang.String = js.native
  var EVENT_CREATE_SIGNATURE: java.lang.String = js.native
  var EVENT_CREATE_TYPE_PARAMETER: java.lang.String = js.native
  var EVENT_END: java.lang.String = js.native
  var EVENT_FILE_BEGIN: java.lang.String = js.native
  var EVENT_FUNCTION_IMPLEMENTATION: java.lang.String = js.native
  var EVENT_RESOLVE: java.lang.String = js.native
  var EVENT_RESOLVE_BEGIN: java.lang.String = js.native
  var EVENT_RESOLVE_END: java.lang.String = js.native
}

