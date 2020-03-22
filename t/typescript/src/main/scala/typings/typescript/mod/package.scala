package typings.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdditiveOperatorOrHigher = typings.typescript.mod.MultiplicativeOperatorOrHigher | typings.typescript.mod.AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[typings.typescript.AnonAffected[T]]
  type AssertsToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.AssertsKeyword]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.mod.SyntaxKind.QuestionQuestionToken
    - typings.typescript.mod.LogicalOperatorOrHigher
    - typings.typescript.mod.AssignmentOperator
  */
  type AssignmentOperatorOrHigher = typings.typescript.mod._AssignmentOperatorOrHigher | typings.typescript.mod.LogicalOperatorOrHigher
  type AssignmentOperatorToken = typings.typescript.mod.Token[typings.typescript.mod.AssignmentOperator]
  type AsteriskToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.AsteriskToken]
  type AwaitKeywordToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.AwaitKeyword]
  type BaseType = typings.typescript.mod.ObjectType | typings.typescript.mod.IntersectionType | typings.typescript.mod.TypeVariable
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.mod.AssignmentOperatorOrHigher
    - typings.typescript.mod.SyntaxKind.CommaToken
  */
  type BinaryOperator = typings.typescript.mod._BinaryOperator | typings.typescript.mod.LogicalOperatorOrHigher
  type BinaryOperatorToken = typings.typescript.mod.Token[typings.typescript.mod.BinaryOperator]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.mod.VariableDeclaration
    - typings.typescript.mod.ParameterDeclaration
    - typings.typescript.mod.BindingElement
    - typings.typescript.mod.PropertyAssignment
    - typings.typescript.mod.ShorthandPropertyAssignment
    - typings.typescript.mod.SpreadAssignment
    - typings.typescript.mod.OmittedExpression
    - typings.typescript.mod.SpreadElement
    - typings.typescript.mod.ArrayLiteralExpression
    - typings.typescript.mod.ObjectLiteralExpression
    - typings.typescript.mod.AssignmentExpression[typings.typescript.mod.EqualsToken]
    - typings.typescript.mod.Identifier
    - typings.typescript.mod.PropertyAccessExpression
    - typings.typescript.mod.ElementAccessExpression
  */
  type BindingOrAssignmentElement = typings.typescript.mod._BindingOrAssignmentElement | typings.typescript.mod.AssignmentExpression[typings.typescript.mod.EqualsToken]
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.mod.DotDotDotToken
    - typings.typescript.mod.SpreadElement
    - typings.typescript.mod.SpreadAssignment
  */
  type BindingOrAssignmentElementRestIndicator = typings.typescript.mod._BindingOrAssignmentElementRestIndicator | typings.typescript.mod.DotDotDotToken
  type BitwiseOperatorOrHigher = typings.typescript.mod.EqualityOperatorOrHigher | typings.typescript.mod.BitwiseOperator
  type CodeActionCommand = typings.typescript.mod.InstallPackageAction
  type ColonToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.ColonToken]
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[
      scala.Double | typings.typescript.mod.PluginImport | typings.typescript.mod.ProjectReference | java.lang.String
    ]) | typings.typescript.mod.MapLike[js.Array[java.lang.String]] | scala.Null
  ]
  type ConciseBody = typings.typescript.mod.FunctionBody | typings.typescript.mod.Expression
  /** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
  type CreateProgram_[T /* <: typings.typescript.mod.BuilderProgram */] = js.Function6[
    /* rootNames */ js.UndefOr[js.Array[java.lang.String]], 
    /* options */ js.UndefOr[typings.typescript.mod.CompilerOptions], 
    /* host */ js.UndefOr[typings.typescript.mod.CompilerHost], 
    /* oldProgram */ js.UndefOr[T], 
    /* configFileParsingDiagnostics */ js.UndefOr[js.Array[typings.typescript.mod.Diagnostic]], 
    /* projectReferences */ js.UndefOr[js.Array[typings.typescript.mod.ProjectReference]], 
    T
  ]
  type CustomTransformerFactory = js.Function1[
    /* context */ typings.typescript.mod.TransformationContext, 
    typings.typescript.mod.CustomTransformer
  ]
  type DeferredTypeReference = typings.typescript.mod.TypeReference
  type DiagnosticReporter = js.Function1[/* diagnostic */ typings.typescript.mod.Diagnostic, scala.Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, scala.Unit]
  type DocumentRegistryBucketKey = java.lang.String with typings.typescript.AnonBucketKey
  type DotDotDotToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.DotDotDotToken]
  type DotToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.DotToken]
  type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]
  type EndOfFileToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.EndOfFileToken] with typings.typescript.mod.JSDocContainer
  type EnumType = typings.typescript.mod.Type
  type EqualityOperatorOrHigher = typings.typescript.mod.RelationalOperatorOrHigher | typings.typescript.mod.EqualityOperator
  type EqualsGreaterThanToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken]
  type EqualsToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.EqualsToken]
  type ErrorCallback = js.Function2[
    /* message */ typings.typescript.mod.DiagnosticMessage, 
    /* length */ scala.Double, 
    scala.Unit
  ]
  type ExclamationToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.ExclamationToken]
  type ExponentiationOperator = typings.typescript.mod.SyntaxKind.AsteriskAsteriskToken
  type FileWatcherCallback = js.Function2[
    /* fileName */ java.lang.String, 
    /* eventKind */ typings.typescript.mod.FileWatcherEventKind, 
    scala.Unit
  ]
  type FunctionBody = typings.typescript.mod.Block
  type FunctionLike = typings.typescript.mod.SignatureDeclaration
  /* Rewritten from type alias, can be one of: 
    - typings.typescript.mod.ParameterDeclaration
    - typings.typescript.mod.CallSignatureDeclaration
    - typings.typescript.mod.ConstructSignatureDeclaration
    - typings.typescript.mod.MethodSignature
    - typings.typescript.mod.PropertySignature
    - typings.typescript.mod.ArrowFunction
    - typings.typescript.mod.ParenthesizedExpression
    - typings.typescript.mod.SpreadAssignment
    - typings.typescript.mod.ShorthandPropertyAssignment
    - typings.typescript.mod.PropertyAssignment
    - typings.typescript.mod.FunctionExpression
    - typings.typescript.mod.LabeledStatement
    - typings.typescript.mod.ExpressionStatement
    - typings.typescript.mod.VariableStatement
    - typings.typescript.mod.FunctionDeclaration
    - typings.typescript.mod.ConstructorDeclaration
    - typings.typescript.mod.MethodDeclaration
    - typings.typescript.mod.PropertyDeclaration
    - typings.typescript.mod.AccessorDeclaration
    - typings.typescript.mod.ClassLikeDeclaration
    - typings.typescript.mod.InterfaceDeclaration
    - typings.typescript.mod.TypeAliasDeclaration
    - typings.typescript.mod.EnumMember
    - typings.typescript.mod.EnumDeclaration
    - typings.typescript.mod.ModuleDeclaration
    - typings.typescript.mod.ImportEqualsDeclaration
    - typings.typescript.mod.IndexSignatureDeclaration
    - typings.typescript.mod.FunctionTypeNode
    - typings.typescript.mod.ConstructorTypeNode
    - typings.typescript.mod.JSDocFunctionType
    - typings.typescript.mod.ExportDeclaration
    - typings.typescript.mod.EndOfFileToken
  */
  type HasJSDoc = typings.typescript.mod._HasJSDoc | typings.typescript.mod.EndOfFileToken
  type IncrementExpression = typings.typescript.mod.UpdateExpression
  type InstantiableType = typings.typescript.mod.Type
  type IntersectionType = typings.typescript.mod.UnionOrIntersectionType
  type JsFileExtensionInfo = typings.typescript.mod.FileExtensionInfo
  type LogicalOperatorOrHigher = typings.typescript.mod.BitwiseOperatorOrHigher | typings.typescript.mod.LogicalOperator
  /**
    * Type of objects whose values are all of the same type.
    * The `in` and `for-in` operators can *not* be safely used,
    * since `Object.prototype` may be modified by outside code.
    */
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
  type MinusToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.MinusToken]
  type Modifier = typings.typescript.mod.Token[
    typings.typescript.mod.SyntaxKind.AbstractKeyword | typings.typescript.mod.SyntaxKind.AsyncKeyword | typings.typescript.mod.SyntaxKind.ConstKeyword | typings.typescript.mod.SyntaxKind.DeclareKeyword | typings.typescript.mod.SyntaxKind.DefaultKeyword | typings.typescript.mod.SyntaxKind.ExportKeyword | typings.typescript.mod.SyntaxKind.PrivateKeyword | typings.typescript.mod.SyntaxKind.ProtectedKeyword | typings.typescript.mod.SyntaxKind.PublicKeyword | typings.typescript.mod.SyntaxKind.ReadonlyKeyword | typings.typescript.mod.SyntaxKind.StaticKeyword
  ]
  type ModifiersArray = typings.typescript.mod.NodeArray[typings.typescript.mod.Modifier]
  type MultiplicativeOperatorOrHigher = typings.typescript.mod.ExponentiationOperator | typings.typescript.mod.MultiplicativeOperator
  type OrganizeImportsScope = typings.typescript.mod.CombinedCodeFixScope
  type Path = java.lang.String with typings.typescript.AnonPathBrand
  type PlusToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.PlusToken]
  type QuestionDotToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.QuestionDotToken]
  type QuestionToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.QuestionToken]
  type ReadonlyToken = typings.typescript.mod.Token[typings.typescript.mod.SyntaxKind.ReadonlyKeyword]
  type RelationalOperatorOrHigher = typings.typescript.mod.ShiftOperatorOrHigher | typings.typescript.mod.RelationalOperator
  type ReportEmitErrorSummary = js.Function1[/* errorCount */ scala.Double, scala.Unit]
  type ResolvedConfigFileName = java.lang.String with js.Object
  type ShiftOperatorOrHigher = typings.typescript.mod.AdditiveOperatorOrHigher | typings.typescript.mod.ShiftOperator
  type String = (java.lang.String with typings.typescript.AnonEscapedIdentifier) | (scala.Unit with typings.typescript.AnonEscapedIdentifier) | typings.typescript.mod.InternalSymbolName
  type StructuredType = typings.typescript.mod.ObjectType | typings.typescript.mod.UnionType | typings.typescript.mod.IntersectionType
  type SymbolTable = typings.typescript.mod.UnderscoreEscapedMap[typings.typescript.mod.Symbol]
  type Transformer[T /* <: typings.typescript.mod.Node */] = js.Function1[/* node */ T, T]
  type TransformerFactory[T /* <: typings.typescript.mod.Node */] = js.Function1[
    /* context */ typings.typescript.mod.TransformationContext, 
    typings.typescript.mod.Transformer[T]
  ]
  type TypeParameter = typings.typescript.mod.InstantiableType
  type TypeVariable = typings.typescript.mod.TypeParameter | typings.typescript.mod.IndexedAccessType
  type UnionType = typings.typescript.mod.UnionOrIntersectionType
  type VisitResult[T /* <: typings.typescript.mod.Node */] = js.UndefOr[T | js.Array[T]]
  type Visitor = js.Function1[
    /* node */ typings.typescript.mod.Node, 
    typings.typescript.mod.VisitResult[typings.typescript.mod.Node]
  ]
  /**
    * Creates the watch what generates program using the config file
    */
  type WatchOfConfigFile[T] = typings.typescript.mod.Watch[T]
  type WatchStatusReporter = js.Function4[
    /* diagnostic */ typings.typescript.mod.Diagnostic, 
    /* newLine */ java.lang.String, 
    /* options */ typings.typescript.mod.CompilerOptions, 
    /* errorCount */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type WithMetadata[T] = T with typings.typescript.AnonMetadata
  type WriteFileCallback = js.Function5[
    /* fileName */ java.lang.String, 
    /* data */ java.lang.String, 
    /* writeByteOrderMark */ scala.Boolean, 
    /* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]], 
    /* sourceFiles */ js.UndefOr[js.Array[typings.typescript.mod.SourceFile]], 
    scala.Unit
  ]
}
