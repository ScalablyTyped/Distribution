package typings.typedoc

import typings.typedoc.converterConverterMod.Converter
import typings.typedoc.loggersMod.Logger
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsMod.Type
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.MapLike
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  @js.native
  class Context protected () extends js.Object {
    def this(converter: Converter, fileNames: js.Array[String], checker: TypeChecker, program: Program) = this()
    var checker: TypeChecker = js.native
    var converter: Converter = js.native
    var externalPattern: js.UndefOr[js.Any] = js.native
    var extractTypeParameters: js.Any = js.native
    var fileNames: js.Array[String] = js.native
    var inheritParent: js.UndefOr[Node] = js.native
    var inherited: js.UndefOr[js.Array[String]] = js.native
    var inheritedChildren: js.UndefOr[js.Array[String]] = js.native
    var isDeclaration: js.UndefOr[Boolean] = js.native
    var isExternal: js.UndefOr[Boolean] = js.native
    var isInherit: js.UndefOr[Boolean] = js.native
    var program: Program = js.native
    var project: ProjectReflection = js.native
    var scope: Reflection = js.native
    var typeArguments: js.UndefOr[js.Array[Type]] = js.native
    var typeParameters: js.UndefOr[MapLike[Type]] = js.native
    var visitStack: js.Array[Node] = js.native
    def getCompilerOptions(): CompilerOptions = js.native
    def getLogger(): Logger = js.native
    def getSymbolAtLocation(node: Node): js.UndefOr[Symbol] = js.native
    def getTypeAtLocation(node: Node): js.UndefOr[typings.typescript.mod.Type] = js.native
    def inherit(baseNode: Node): Reflection = js.native
    def inherit(baseNode: Node, typeArguments: NodeArray[TypeNode]): Reflection = js.native
    def isExternalFile(fileName: String): Boolean = js.native
    def isOutsideDocumentation(fileName: String): Boolean = js.native
    def isOutsideDocumentation(fileName: String, isExternal: Boolean): Boolean = js.native
    def registerReflection(reflection: Reflection): Unit = js.native
    def registerReflection(reflection: Reflection, symbol: Symbol): Unit = js.native
    def resolveAliasedSymbol(): js.UndefOr[Symbol] = js.native
    def resolveAliasedSymbol(symbol: Symbol): js.UndefOr[Symbol] = js.native
    @JSName("resolveAliasedSymbol")
    def resolveAliasedSymbol_Symbol(symbol: Symbol): Symbol = js.native
    def trigger(name: String, reflection: Reflection): Unit = js.native
    def trigger(name: String, reflection: Reflection, node: Node): Unit = js.native
    def withScope(scope: js.UndefOr[Reflection], callback: js.Function0[Unit]): Unit = js.native
    def withScope(
      scope: js.UndefOr[Reflection],
      parameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withScope(
      scope: js.UndefOr[Reflection],
      parameters: js.UndefOr[NodeArray[TypeParameterDeclaration]],
      preserve: Boolean,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def withSourceFile(node: SourceFile, callback: js.Function): Unit = js.native
  }
  
}

