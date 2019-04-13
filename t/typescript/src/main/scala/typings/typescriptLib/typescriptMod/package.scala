package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptMod {
  type AdditiveOperator = SyntaxKind
  type AdditiveOperatorOrHigher = MultiplicativeOperatorOrHigher | AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[typescriptLib.Anon_Affected[T]]
  type AssignmentOperator = SyntaxKind | CompoundAssignmentOperator
  type AssignmentOperatorOrHigher = LogicalOperatorOrHigher | AssignmentOperator
  type AssignmentOperatorToken = Token[AssignmentOperator]
  type AsteriskToken = Token[SyntaxKind]
  type AwaitKeywordToken = Token[SyntaxKind]
  type BaseType = ObjectType | IntersectionType
  type BinaryOperator = AssignmentOperatorOrHigher | SyntaxKind
  type BinaryOperatorToken = Token[BinaryOperator]
  /* Rewritten from type alias, can be one of: 
    - VariableDeclaration
    - ParameterDeclaration
    - BindingElement
    - PropertyAssignment
    - ShorthandPropertyAssignment
    - SpreadAssignment
    - OmittedExpression
    - SpreadElement
    - ArrayLiteralExpression
    - ObjectLiteralExpression
    - AssignmentExpression[EqualsToken]
    - Identifier
    - PropertyAccessExpression
    - ElementAccessExpression
  */
  type BindingOrAssignmentElement = _BindingOrAssignmentElement | AssignmentExpression[EqualsToken]
  /* Rewritten from type alias, can be one of: 
    - DotDotDotToken
    - SpreadElement
    - SpreadAssignment
  */
  type BindingOrAssignmentElementRestIndicator = _BindingOrAssignmentElementRestIndicator | DotDotDotToken
  type BitwiseOperator = SyntaxKind
  type BitwiseOperatorOrHigher = EqualityOperatorOrHigher | BitwiseOperator
  type CodeActionCommand = InstallPackageAction | GenerateTypesAction
  type ColonToken = Token[SyntaxKind]
  type CommentKind = SyntaxKind
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double]) | js.Array[java.lang.String] | MapLike[js.Array[java.lang.String]] | js.Array[PluginImport] | js.Array[ProjectReference] | scala.Null
  ]
  type CompoundAssignmentOperator = SyntaxKind
  type ConciseBody = FunctionBody | Expression
  /** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
  type CreateProgram[T /* <: BuilderProgram */] = js.Function6[
    /* rootNames */ js.UndefOr[js.Array[java.lang.String]], 
    /* options */ js.UndefOr[CompilerOptions], 
    /* host */ js.UndefOr[CompilerHost], 
    /* oldProgram */ js.UndefOr[T], 
    /* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], 
    /* projectReferences */ js.UndefOr[js.Array[ProjectReference]], 
    T
  ]
  type DiagnosticReporter = js.Function1[/* diagnostic */ Diagnostic, scala.Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, scala.Unit]
  type DocumentRegistryBucketKey = java.lang.String with typescriptLib.Anon_BucketKey
  type DotDotDotToken = Token[SyntaxKind]
  type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]
  type EndOfFileToken = Token[SyntaxKind] with JSDocContainer
  type EnumType = Type
  type EqualityOperator = SyntaxKind
  type EqualityOperatorOrHigher = RelationalOperatorOrHigher | EqualityOperator
  type EqualsGreaterThanToken = Token[SyntaxKind]
  type EqualsToken = Token[SyntaxKind]
  type ErrorCallback = js.Function2[/* message */ DiagnosticMessage, /* length */ scala.Double, scala.Unit]
  type ExclamationToken = Token[SyntaxKind]
  type ExponentiationOperator = SyntaxKind
  type FileWatcherCallback = js.Function2[/* fileName */ java.lang.String, /* eventKind */ FileWatcherEventKind, scala.Unit]
  type FunctionBody = Block
  /** @deprecated Use SignatureDeclaration */
  type FunctionLike = SignatureDeclaration
  type GenerateTypesAction = GenerateTypesOptions
  /* Rewritten from type alias, can be one of: 
    - ParameterDeclaration
    - CallSignatureDeclaration
    - ConstructSignatureDeclaration
    - MethodSignature
    - PropertySignature
    - ArrowFunction
    - ParenthesizedExpression
    - SpreadAssignment
    - ShorthandPropertyAssignment
    - PropertyAssignment
    - FunctionExpression
    - LabeledStatement
    - ExpressionStatement
    - VariableStatement
    - FunctionDeclaration
    - ConstructorDeclaration
    - MethodDeclaration
    - PropertyDeclaration
    - AccessorDeclaration
    - ClassLikeDeclaration
    - InterfaceDeclaration
    - TypeAliasDeclaration
    - EnumMember
    - EnumDeclaration
    - ModuleDeclaration
    - ImportEqualsDeclaration
    - IndexSignatureDeclaration
    - FunctionTypeNode
    - ConstructorTypeNode
    - JSDocFunctionType
    - ExportDeclaration
    - EndOfFileToken
  */
  type HasJSDoc = _HasJSDoc | EndOfFileToken
  /** Deprecated, please use UpdateExpression */
  type IncrementExpression = UpdateExpression
  type InstantiableType = Type
  type IntersectionType = UnionOrIntersectionType
  type JsDocSyntaxKind = SyntaxKind | KeywordSyntaxKind
  /** @deprecated Use FileExtensionInfo instead. */
  type JsFileExtensionInfo = FileExtensionInfo
  type JsxTokenSyntaxKind = SyntaxKind
  type KeywordSyntaxKind = SyntaxKind
  type LogicalOperator = SyntaxKind
  type LogicalOperatorOrHigher = BitwiseOperatorOrHigher | LogicalOperator
  /**
    * Type of objects whose values are all of the same type.
    * The `in` and `for-in` operators can *not* be safely used,
    * since `Object.prototype` may be modified by outside code.
    */
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
  type MinusToken = Token[SyntaxKind]
  type Modifier = Token[SyntaxKind]
  type ModifiersArray = NodeArray[Modifier]
  type MultiplicativeOperator = SyntaxKind
  type MultiplicativeOperatorOrHigher = ExponentiationOperator | MultiplicativeOperator
  type OrganizeImportsScope = CombinedCodeFixScope
  type ParameterPropertyDeclaration = ParameterDeclaration with typescriptLib.Anon_Name
  type Path = java.lang.String with typescriptLib.Anon_PathBrand
  type PlusToken = Token[SyntaxKind]
  type PostfixUnaryOperator = SyntaxKind
  type PrefixUnaryOperator = SyntaxKind
  type QuestionToken = Token[SyntaxKind]
  type ReadonlyToken = Token[SyntaxKind]
  type RelationalOperator = SyntaxKind
  type RelationalOperatorOrHigher = ShiftOperatorOrHigher | RelationalOperator
  /**
    * Branded string for keeping track of when we've turned an ambiguous path
    * specified like "./blah" to an absolute path to an actual
    * tsconfig file, e.g. "/root/blah/tsconfig.json"
    */
  type ResolvedConfigFileName = java.lang.String with typescriptLib.Anon_IsResolvedConfigFileName
  type ShiftOperator = SyntaxKind
  type ShiftOperatorOrHigher = AdditiveOperatorOrHigher | ShiftOperator
  type StructuredType = ObjectType | UnionType | IntersectionType
  /** SymbolTable based on ES6 Map interface. */
  type SymbolTable = UnderscoreEscapedMap[Symbol]
  /**
    * A function that transforms a node.
    */
  type Transformer[T /* <: Node */] = js.Function1[/* node */ T, T]
  /**
    * A function that is used to initialize and return a `Transformer` callback, which in turn
    * will be used to transform one or more nodes.
    */
  type TransformerFactory[T /* <: Node */] = js.Function1[/* context */ TransformationContext, Transformer[T]]
  type TypeParameter = InstantiableType
  type TypeVariable = TypeParameter | IndexedAccessType
  type UnionType = UnionOrIntersectionType
  type VisitResult[T /* <: Node */] = js.UndefOr[T | js.Array[T]]
  /**
    * A function that accepts and possibly transforms a node.
    */
  type Visitor = js.Function1[/* node */ Node, VisitResult[Node]]
  /**
    * Creates the watch what generates program using the config file
    */
  type WatchOfConfigFile[T] = Watch[T]
  type WatchStatusReporter = js.Function3[
    /* diagnostic */ Diagnostic, 
    /* newLine */ java.lang.String, 
    /* options */ CompilerOptions, 
    scala.Unit
  ]
  type WithMetadata[T] = T with typescriptLib.Anon_Metadata
  type WriteFileCallback = js.Function5[
    /* fileName */ java.lang.String, 
    /* data */ java.lang.String, 
    /* writeByteOrderMark */ scala.Boolean, 
    /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
    /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], 
    scala.Unit
  ]
  /**
    * This represents a string whose leading underscore have been escaped by adding extra leading underscores.
    * The shape of this brand is rather unique compared to others we've used.
    * Instead of just an intersection of a string and an object, it is that union-ed
    * with an intersection of void and an object. This makes it wholly incompatible
    * with a normal string (which is good, it cannot be misused on assignment or on usage),
    * while still being comparable with a normal string via === (also good) and castable from a string.
    */
  type __String = (java.lang.String with typescriptLib.Anon_EscapedIdentifier) | (scala.Unit with typescriptLib.Anon_EscapedIdentifier) | InternalSymbolName
}
