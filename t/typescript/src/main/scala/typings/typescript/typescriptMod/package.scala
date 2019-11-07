package typings.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.typescript.Anon_Affected
  import typings.typescript.Anon_BucketKey
  import typings.typescript.Anon_EscapedIdentifier
  import typings.typescript.Anon_Metadata
  import typings.typescript.Anon_Name
  import typings.typescript.Anon_PathBrand
  import typings.typescript.typescriptMod.SyntaxKind.AbstractKeyword
  import typings.typescript.typescriptMod.SyntaxKind.AssertsKeyword
  import typings.typescript.typescriptMod.SyntaxKind.AsteriskAsteriskToken
  import typings.typescript.typescriptMod.SyntaxKind.AsyncKeyword
  import typings.typescript.typescriptMod.SyntaxKind.AwaitKeyword
  import typings.typescript.typescriptMod.SyntaxKind.ConstKeyword
  import typings.typescript.typescriptMod.SyntaxKind.DeclareKeyword
  import typings.typescript.typescriptMod.SyntaxKind.DefaultKeyword
  import typings.typescript.typescriptMod.SyntaxKind.ExportKeyword
  import typings.typescript.typescriptMod.SyntaxKind.PrivateKeyword
  import typings.typescript.typescriptMod.SyntaxKind.ProtectedKeyword
  import typings.typescript.typescriptMod.SyntaxKind.PublicKeyword
  import typings.typescript.typescriptMod.SyntaxKind.ReadonlyKeyword
  import typings.typescript.typescriptMod.SyntaxKind.StaticKeyword

  type AdditiveOperatorOrHigher = MultiplicativeOperatorOrHigher | AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[Anon_Affected[T]]
  type AssertsToken = Token[AssertsKeyword]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.typescriptMod.SyntaxKind.QuestionQuestionToken
    - typings.typescript.typescriptMod.LogicalOperatorOrHigher
    - typings.typescript.typescriptMod.AssignmentOperator
  */
  type AssignmentOperatorOrHigher = _AssignmentOperatorOrHigher | LogicalOperatorOrHigher
  type AssignmentOperatorToken = Token[AssignmentOperator]
  type AsteriskToken = Token[typings.typescript.typescriptMod.SyntaxKind.AsteriskToken]
  type AwaitKeywordToken = Token[AwaitKeyword]
  type BaseType = ObjectType | IntersectionType | TypeVariable
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.typescriptMod.AssignmentOperatorOrHigher
    - typings.typescript.typescriptMod.SyntaxKind.CommaToken
  */
  type BinaryOperator = _BinaryOperator | LogicalOperatorOrHigher
  type BinaryOperatorToken = Token[BinaryOperator]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.typescriptMod.VariableDeclaration
    - typings.typescript.typescriptMod.ParameterDeclaration
    - typings.typescript.typescriptMod.BindingElement
    - typings.typescript.typescriptMod.PropertyAssignment
    - typings.typescript.typescriptMod.ShorthandPropertyAssignment
    - typings.typescript.typescriptMod.SpreadAssignment
    - typings.typescript.typescriptMod.OmittedExpression
    - typings.typescript.typescriptMod.SpreadElement
    - typings.typescript.typescriptMod.ArrayLiteralExpression
    - typings.typescript.typescriptMod.ObjectLiteralExpression
    - typings.typescript.typescriptMod.AssignmentExpression[typings.typescript.typescriptMod.EqualsToken]
    - typings.typescript.typescriptMod.Identifier
    - typings.typescript.typescriptMod.PropertyAccessExpression
    - typings.typescript.typescriptMod.ElementAccessExpression
  */
  type BindingOrAssignmentElement = _BindingOrAssignmentElement | AssignmentExpression[EqualsToken]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.typescriptMod.DotDotDotToken
    - typings.typescript.typescriptMod.SpreadElement
    - typings.typescript.typescriptMod.SpreadAssignment
  */
  type BindingOrAssignmentElementRestIndicator = _BindingOrAssignmentElementRestIndicator | DotDotDotToken
  type BitwiseOperatorOrHigher = EqualityOperatorOrHigher | BitwiseOperator
  type CodeActionCommand = InstallPackageAction
  type ColonToken = Token[typings.typescript.typescriptMod.SyntaxKind.ColonToken]
  type CompilerOptionsValue = js.UndefOr[
    String | Double | Boolean | (js.Array[Double | PluginImport | ProjectReference | String]) | MapLike[js.Array[String]] | Null
  ]
  type ConciseBody = FunctionBody | Expression
  /** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
  type CreateProgram[T /* <: BuilderProgram */] = js.Function6[
    /* rootNames */ js.UndefOr[js.Array[String]], 
    /* options */ js.UndefOr[CompilerOptions], 
    /* host */ js.UndefOr[CompilerHost], 
    /* oldProgram */ js.UndefOr[T], 
    /* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], 
    /* projectReferences */ js.UndefOr[js.Array[ProjectReference]], 
    T
  ]
  type CustomTransformerFactory = js.Function1[/* context */ TransformationContext, CustomTransformer]
  type DeferredTypeReference = TypeReference
  type DiagnosticReporter = js.Function1[/* diagnostic */ Diagnostic, Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ String, Unit]
  type DocumentRegistryBucketKey = String with Anon_BucketKey
  type DotDotDotToken = Token[typings.typescript.typescriptMod.SyntaxKind.DotDotDotToken]
  type DotToken = Token[typings.typescript.typescriptMod.SyntaxKind.DotToken]
  type EmitHelperUniqueNameCallback = js.Function1[/* name */ String, String]
  type EndOfFileToken = Token[typings.typescript.typescriptMod.SyntaxKind.EndOfFileToken] with JSDocContainer
  type EnumType = Type
  type EqualityOperatorOrHigher = RelationalOperatorOrHigher | EqualityOperator
  type EqualsGreaterThanToken = Token[typings.typescript.typescriptMod.SyntaxKind.EqualsGreaterThanToken]
  type EqualsToken = Token[typings.typescript.typescriptMod.SyntaxKind.EqualsToken]
  type ErrorCallback = js.Function2[/* message */ DiagnosticMessage, /* length */ Double, Unit]
  type ExclamationToken = Token[typings.typescript.typescriptMod.SyntaxKind.ExclamationToken]
  type ExponentiationOperator = AsteriskAsteriskToken
  type FileWatcherCallback = js.Function2[/* fileName */ String, /* eventKind */ FileWatcherEventKind, Unit]
  type FunctionBody = Block
  type FunctionLike = SignatureDeclaration
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.typescriptMod.ParameterDeclaration
    - typings.typescript.typescriptMod.CallSignatureDeclaration
    - typings.typescript.typescriptMod.ConstructSignatureDeclaration
    - typings.typescript.typescriptMod.MethodSignature
    - typings.typescript.typescriptMod.PropertySignature
    - typings.typescript.typescriptMod.ArrowFunction
    - typings.typescript.typescriptMod.ParenthesizedExpression
    - typings.typescript.typescriptMod.SpreadAssignment
    - typings.typescript.typescriptMod.ShorthandPropertyAssignment
    - typings.typescript.typescriptMod.PropertyAssignment
    - typings.typescript.typescriptMod.FunctionExpression
    - typings.typescript.typescriptMod.LabeledStatement
    - typings.typescript.typescriptMod.ExpressionStatement
    - typings.typescript.typescriptMod.VariableStatement
    - typings.typescript.typescriptMod.FunctionDeclaration
    - typings.typescript.typescriptMod.ConstructorDeclaration
    - typings.typescript.typescriptMod.MethodDeclaration
    - typings.typescript.typescriptMod.PropertyDeclaration
    - typings.typescript.typescriptMod.AccessorDeclaration
    - typings.typescript.typescriptMod.ClassLikeDeclaration
    - typings.typescript.typescriptMod.InterfaceDeclaration
    - typings.typescript.typescriptMod.TypeAliasDeclaration
    - typings.typescript.typescriptMod.EnumMember
    - typings.typescript.typescriptMod.EnumDeclaration
    - typings.typescript.typescriptMod.ModuleDeclaration
    - typings.typescript.typescriptMod.ImportEqualsDeclaration
    - typings.typescript.typescriptMod.IndexSignatureDeclaration
    - typings.typescript.typescriptMod.FunctionTypeNode
    - typings.typescript.typescriptMod.ConstructorTypeNode
    - typings.typescript.typescriptMod.JSDocFunctionType
    - typings.typescript.typescriptMod.ExportDeclaration
    - typings.typescript.typescriptMod.EndOfFileToken
  */
  type HasJSDoc = _HasJSDoc | EndOfFileToken
  type IncrementExpression = UpdateExpression
  type InstantiableType = Type
  type IntersectionType = UnionOrIntersectionType
  type JsFileExtensionInfo = FileExtensionInfo
  type LogicalOperatorOrHigher = BitwiseOperatorOrHigher | LogicalOperator
  /**
    * Type of objects whose values are all of the same type.
    * The `in` and `for-in` operators can *not* be safely used,
    * since `Object.prototype` may be modified by outside code.
    */
  type MapLike[T] = StringDictionary[T]
  type MinusToken = Token[typings.typescript.typescriptMod.SyntaxKind.MinusToken]
  type Modifier = Token[
    AbstractKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | ReadonlyKeyword | StaticKeyword
  ]
  type ModifiersArray = NodeArray[Modifier]
  type MultiplicativeOperatorOrHigher = ExponentiationOperator | MultiplicativeOperator
  type OrganizeImportsScope = CombinedCodeFixScope
  type ParameterPropertyDeclaration = ParameterDeclaration with Anon_Name
  type Path = String with Anon_PathBrand
  type PlusToken = Token[typings.typescript.typescriptMod.SyntaxKind.PlusToken]
  type QuestionDotToken = Token[typings.typescript.typescriptMod.SyntaxKind.QuestionDotToken]
  type QuestionToken = Token[typings.typescript.typescriptMod.SyntaxKind.QuestionToken]
  type ReadonlyToken = Token[ReadonlyKeyword]
  type RelationalOperatorOrHigher = ShiftOperatorOrHigher | RelationalOperator
  type ReportEmitErrorSummary = js.Function1[/* errorCount */ Double, Unit]
  type ResolvedConfigFileName = String with js.Object
  type ShiftOperatorOrHigher = AdditiveOperatorOrHigher | ShiftOperator
  type StructuredType = ObjectType | UnionType | IntersectionType
  type SymbolTable = UnderscoreEscapedMap[Symbol]
  type Transformer[T /* <: Node */] = js.Function1[/* node */ T, T]
  type TransformerFactory[T /* <: Node */] = js.Function1[/* context */ TransformationContext, Transformer[T]]
  type TypeParameter = Type
  type TypeVariable = TypeParameter | IndexedAccessType
  type UnionType = UnionOrIntersectionType
  type VisitResult[T /* <: Node */] = js.UndefOr[T | js.Array[T]]
  type Visitor = js.Function1[/* node */ Node, VisitResult[Node]]
  /**
    * Creates the watch what generates program using the config file
    */
  type WatchOfConfigFile[T] = Watch[T]
  type WatchStatusReporter = js.Function4[
    /* diagnostic */ Diagnostic, 
    /* newLine */ String, 
    /* options */ CompilerOptions, 
    /* errorCount */ js.UndefOr[Double], 
    Unit
  ]
  type WithMetadata[T] = T with Anon_Metadata
  type WriteFileCallback = js.Function5[
    /* fileName */ String, 
    /* data */ String, 
    /* writeByteOrderMark */ Boolean, 
    /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
    /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], 
    Unit
  ]
  type __String = (String with Anon_EscapedIdentifier) | (Unit with Anon_EscapedIdentifier) | InternalSymbolName
}
