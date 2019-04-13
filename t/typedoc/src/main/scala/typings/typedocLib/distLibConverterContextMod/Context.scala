package typings
package typedocLib.distLibConverterContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/context", "Context")
@js.native
class Context protected () extends js.Object {
  def this(converter: typedocLib.distLibConverterConverterMod.Converter, fileNames: js.Array[java.lang.String], checker: typescriptLib.typescriptMod.TypeChecker, program: typescriptLib.typescriptMod.Program) = this()
  var checker: typescriptLib.typescriptMod.TypeChecker = js.native
  var converter: typedocLib.distLibConverterConverterMod.Converter = js.native
  var externalPattern: js.UndefOr[js.Any] = js.native
  var extractTypeParameters: js.Any = js.native
  var fileNames: js.Array[java.lang.String] = js.native
  var inheritParent: js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
  var inherited: js.UndefOr[js.Array[java.lang.String]] = js.native
  var inheritedChildren: js.UndefOr[js.Array[scala.Double]] = js.native
  var isDeclaration: js.UndefOr[scala.Boolean] = js.native
  var isExternal: js.UndefOr[scala.Boolean] = js.native
  var isInherit: js.UndefOr[scala.Boolean] = js.native
  var program: typescriptLib.typescriptMod.Program = js.native
  var project: typedocLib.distLibModelsMod.ProjectReflection = js.native
  var scope: typedocLib.distLibModelsMod.Reflection = js.native
  var symbolID: js.Any = js.native
  var typeArguments: js.UndefOr[js.Array[typedocLib.distLibModelsMod.Type]] = js.native
  var typeParameters: js.UndefOr[typescriptLib.typescriptMod.MapLike[typedocLib.distLibModelsMod.Type]] = js.native
  var visitStack: js.Array[typescriptLib.typescriptMod.Node] = js.native
  def getCompilerOptions(): typescriptLib.typescriptMod.CompilerOptions = js.native
  def getLogger(): typedocLib.distLibUtilsLoggersMod.Logger = js.native
  def getSymbolID(): js.UndefOr[scala.Double] = js.native
  def getSymbolID(symbol: typescriptLib.typescriptMod.Symbol): js.UndefOr[scala.Double] = js.native
  def getTypeAtLocation(node: typescriptLib.typescriptMod.Node): js.UndefOr[typescriptLib.typescriptMod.Type] = js.native
  def inherit(baseNode: typescriptLib.typescriptMod.Node): typedocLib.distLibModelsMod.Reflection = js.native
  def inherit(
    baseNode: typescriptLib.typescriptMod.Node,
    typeArguments: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeNode]
  ): typedocLib.distLibModelsMod.Reflection = js.native
  def registerReflection(reflection: typedocLib.distLibModelsMod.Reflection): scala.Unit = js.native
  def registerReflection(reflection: typedocLib.distLibModelsMod.Reflection, node: typescriptLib.typescriptMod.Node): scala.Unit = js.native
  def registerReflection(
    reflection: typedocLib.distLibModelsMod.Reflection,
    node: typescriptLib.typescriptMod.Node,
    symbol: typescriptLib.typescriptMod.Symbol
  ): scala.Unit = js.native
  def trigger(name: java.lang.String, reflection: typedocLib.distLibModelsMod.Reflection): scala.Unit = js.native
  def trigger(
    name: java.lang.String,
    reflection: typedocLib.distLibModelsMod.Reflection,
    node: typescriptLib.typescriptMod.Node
  ): scala.Unit = js.native
  def withScope(scope: js.UndefOr[scala.Nothing], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def withScope(
    scope: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(
    scope: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    preserve: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(
    scope: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(
    scope: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    preserve: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(scope: typedocLib.distLibModelsMod.Reflection, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def withScope(
    scope: typedocLib.distLibModelsMod.Reflection,
    parameters: js.UndefOr[scala.Nothing],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(
    scope: typedocLib.distLibModelsMod.Reflection,
    parameters: js.UndefOr[scala.Nothing],
    preserve: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(
    scope: typedocLib.distLibModelsMod.Reflection,
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withScope(
    scope: typedocLib.distLibModelsMod.Reflection,
    parameters: typescriptLib.typescriptMod.NodeArray[typescriptLib.typescriptMod.TypeParameterDeclaration],
    preserve: scala.Boolean,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def withSourceFile(node: typescriptLib.typescriptMod.SourceFile, callback: js.Function): scala.Unit = js.native
}

