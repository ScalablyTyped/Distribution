package typings.typescript

import org.scalablytyped.runtime.StringDictionary
import typings.typescript.Anon_Affected
import typings.typescript.Anon_BucketKey
import typings.typescript.Anon_EscapedIdentifier
import typings.typescript.Anon_Metadata
import typings.typescript.Anon_Name
import typings.typescript.Anon_PathBrand
import typings.typescript.typescriptMod.SyntaxKind.AbstractKeyword
import typings.typescript.typescriptMod.SyntaxKind.AsteriskAsteriskToken
import typings.typescript.typescriptMod.SyntaxKind.AsyncKeyword
import typings.typescript.typescriptMod.SyntaxKind.AwaitKeyword
import typings.typescript.typescriptMod.SyntaxKind.CommaToken
import typings.typescript.typescriptMod.SyntaxKind.ConstKeyword
import typings.typescript.typescriptMod.SyntaxKind.DeclareKeyword
import typings.typescript.typescriptMod.SyntaxKind.DefaultKeyword
import typings.typescript.typescriptMod.SyntaxKind.ExportKeyword
import typings.typescript.typescriptMod.SyntaxKind.PrivateKeyword
import typings.typescript.typescriptMod.SyntaxKind.ProtectedKeyword
import typings.typescript.typescriptMod.SyntaxKind.PublicKeyword
import typings.typescript.typescriptMod.SyntaxKind.ReadonlyKeyword
import typings.typescript.typescriptMod.SyntaxKind.StaticKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptMod {
  type AdditiveOperatorOrHigher = MultiplicativeOperatorOrHigher | AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[Anon_Affected[T]]
  type AssignmentOperatorOrHigher = LogicalOperatorOrHigher | AssignmentOperator
  type AssignmentOperatorToken = Token[AssignmentOperator]
  type AsteriskToken = Token[typings.typescript.typescriptMod.SyntaxKind.AsteriskToken]
  type AwaitKeywordToken = Token[AwaitKeyword]
  type BaseType = ObjectType | IntersectionType
  type BinaryOperator = AssignmentOperatorOrHigher | CommaToken
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
  type DiagnosticReporter = js.Function1[/* diagnostic */ Diagnostic, Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ String, Unit]
  type DocumentRegistryBucketKey = String with Anon_BucketKey
  type DotDotDotToken = Token[typings.typescript.typescriptMod.SyntaxKind.DotDotDotToken]
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
  /** @deprecated Use SignatureDeclaration */
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
  /** Deprecated, please use UpdateExpression */
  type IncrementExpression = UpdateExpression
  type InstantiableType = Type
  type IntersectionType = UnionOrIntersectionType
  /** @deprecated Use FileExtensionInfo instead. */
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
  type QuestionToken = Token[typings.typescript.typescriptMod.SyntaxKind.QuestionToken]
  type ReadonlyToken = Token[ReadonlyKeyword]
  type RelationalOperatorOrHigher = ShiftOperatorOrHigher | RelationalOperator
  /**
    * Branded string for keeping track of when we've turned an ambiguous path
    * specified like "./blah" to an absolute path to an actual
    * tsconfig file, e.g. "/root/blah/tsconfig.json"
    */
  type ResolvedConfigFileName = String with js.Object
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
  type WatchStatusReporter = js.Function3[/* diagnostic */ Diagnostic, /* newLine */ String, /* options */ CompilerOptions, Unit]
  type WithMetadata[T] = T with Anon_Metadata
  type WriteFileCallback = js.Function5[
    /* fileName */ String, 
    /* data */ String, 
    /* writeByteOrderMark */ Boolean, 
    /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
    /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], 
    Unit
  ]
  /**
    * This represents a string whose leading underscore have been escaped by adding extra leading underscores.
    * The shape of this brand is rather unique compared to others we've used.
    * Instead of just an intersection of a string and an object, it is that union-ed
    * with an intersection of void and an object. This makes it wholly incompatible
    * with a normal string (which is good, it cannot be misused on assignment or on usage),
    * while still being comparable with a normal string via === (also good) and castable from a string.
    */
  type __String = (String with Anon_EscapedIdentifier) | (Unit with Anon_EscapedIdentifier) | InternalSymbolName
}
