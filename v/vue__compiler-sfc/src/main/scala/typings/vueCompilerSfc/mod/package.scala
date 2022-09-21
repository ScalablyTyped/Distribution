package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StringDictionary
import typings.babelParser.anon.ParseResultFile
import typings.babelParser.mod.ParserOptions
import typings.babelParser.mod.ParserPlugin
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.Program_
import typings.magicString.mod.default
import typings.std.Record
import typings.vueCompilerSfc.mod.^
import typings.vueReactivityTransform.anon.Default
import typings.vueReactivityTransform.anon.ImportedHelpers
import typings.vueReactivityTransform.mod.RefTransformOptions
import typings.vueReactivityTransform.mod.RefTransformResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def babelParse(input: String): ParseResultFile = ^.asInstanceOf[js.Dynamic].applyDynamic("babelParse")(input.asInstanceOf[js.Any]).asInstanceOf[ParseResultFile]
inline def babelParse(input: String, options: ParserOptions): ParseResultFile = (^.asInstanceOf[js.Dynamic].applyDynamic("babelParse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResultFile]

inline def compileScript(sfc: SFCDescriptor, options: SFCScriptCompileOptions): SFCScriptBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("compileScript")(sfc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SFCScriptBlock]

inline def compileStyle(options: SFCStyleCompileOptions): SFCStyleCompileResults = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[SFCStyleCompileResults]

inline def compileStyleAsync(options: SFCAsyncStyleCompileOptions): js.Promise[SFCStyleCompileResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SFCStyleCompileResults]]

inline def compileTemplate(options: SFCTemplateCompileOptions): SFCTemplateCompileResults = ^.asInstanceOf[js.Dynamic].applyDynamic("compileTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[SFCTemplateCompileResults]

inline def extractIdentifiers(param: Node): js.Array[Identifier_] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractIdentifiers")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier_]]
inline def extractIdentifiers(param: Node, nodes: js.Array[Identifier_]): js.Array[Identifier_] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractIdentifiers")(param.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Identifier_]]

inline def generateCodeFrame(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generateCodeFrame(source: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
inline def generateCodeFrame(source: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
inline def generateCodeFrame(source: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]

inline def isInDestructureAssignment(parent: Node, parentStack: js.Array[Node]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInDestructureAssignment")(parent.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isStaticProperty(node: Node): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStaticProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @babel/types.@babel/types.ObjectProperty */ Boolean]

inline def parse(source: String): SFCParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[SFCParseResult]
inline def parse(source: String, hasSourceMapFilenameSourceRootPadIgnoreEmptyCompiler: SFCParseOptions): SFCParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], hasSourceMapFilenameSourceRootPadIgnoreEmptyCompiler.asInstanceOf[js.Any])).asInstanceOf[SFCParseResult]

inline def rewriteDefault(input: String, as: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rewriteDefault")(input.asInstanceOf[js.Any], as.asInstanceOf[js.Any])).asInstanceOf[String]
inline def rewriteDefault(input: String, as: String, parserPlugins: js.Array[ParserPlugin]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rewriteDefault")(input.asInstanceOf[js.Any], as.asInstanceOf[js.Any], parserPlugins.asInstanceOf[js.Any])).asInstanceOf[String]

inline def shouldTransformRef(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldTransformRef")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def transformRef(src: String): RefTransformResults = ^.asInstanceOf[js.Dynamic].applyDynamic("transformRef")(src.asInstanceOf[js.Any]).asInstanceOf[RefTransformResults]
inline def transformRef(src: String, hasFilenameSourceMapParserPluginsImportHelpersFrom: RefTransformOptions): RefTransformResults = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRef")(src.asInstanceOf[js.Any], hasFilenameSourceMapParserPluginsImportHelpersFrom.asInstanceOf[js.Any])).asInstanceOf[RefTransformResults]

inline def transformRefAST(ast: Program_, s: default): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(ast: Program_, s: default, offset: Double): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(ast: Program_, s: default, offset: Double, knownRefs: js.Array[String]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(
  ast: Program_,
  s: default,
  offset: Double,
  knownRefs: js.Array[String],
  knownProps: Record[String, Default]
): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(ast: Program_, s: default, offset: Double, knownRefs: Unit, knownProps: Record[String, Default]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(ast: Program_, s: default, offset: Unit, knownRefs: js.Array[String]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(
  ast: Program_,
  s: default,
  offset: Unit,
  knownRefs: js.Array[String],
  knownProps: Record[String, Default]
): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]
inline def transformRefAST(ast: Program_, s: default, offset: Unit, knownRefs: Unit, knownProps: Record[String, Default]): ImportedHelpers = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRefAST")(ast.asInstanceOf[js.Any], s.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], knownRefs.asInstanceOf[js.Any], knownProps.asInstanceOf[js.Any])).asInstanceOf[ImportedHelpers]

inline def walk: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("walk").asInstanceOf[Any]

inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Boolean,
  parentStack: js.Array[Node]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Boolean,
  parentStack: js.Array[Node],
  knownIds: Record[String, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Boolean,
  parentStack: Unit,
  knownIds: Record[String, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Unit,
  parentStack: js.Array[Node]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Unit,
  parentStack: js.Array[Node],
  knownIds: Record[String, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def walkIdentifiers(
  root: Node,
  onIdentifier: js.Function5[
  /* node */ Identifier_, 
  /* parent */ Node, 
  /* parentStack */ js.Array[Node], 
  /* isReference */ Boolean, 
  /* isLocal */ Boolean, 
  Unit
],
  includeAll: Unit,
  parentStack: Unit,
  knownIds: Record[String, Double]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkIdentifiers")(root.asInstanceOf[js.Any], onIdentifier.asInstanceOf[js.Any], includeAll.asInstanceOf[js.Any], parentStack.asInstanceOf[js.Any], knownIds.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AssetURLTagConfig = StringDictionary[js.Array[String]]
