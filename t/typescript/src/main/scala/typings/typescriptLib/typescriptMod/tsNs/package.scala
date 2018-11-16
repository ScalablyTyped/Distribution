package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tsNs {
  type AccessorDeclaration = GetAccessorDeclaration | SetAccessorDeclaration
  type AdditiveOperator = SyntaxKind
  type AdditiveOperatorOrHigher = MultiplicativeOperatorOrHigher | AdditiveOperator
  type AffectedFileResult[T] = js.UndefOr[typescriptLib.Anon_Result[T]]
  type ArrayBindingElement = BindingElement | OmittedExpression
  type ArrayBindingOrAssignmentPattern = ArrayBindingPattern | ArrayLiteralExpression
  type AssertionExpression = TypeAssertion | AsExpression
  type AssignmentOperator = SyntaxKind | CompoundAssignmentOperator
  type AssignmentOperatorOrHigher = LogicalOperatorOrHigher | AssignmentOperator
  type AssignmentOperatorToken = Token[AssignmentOperator]
  type AssignmentPattern = ObjectLiteralExpression | ArrayLiteralExpression
  type AsteriskToken = Token[SyntaxKind]
  type AtToken = Token[SyntaxKind]
  type AwaitKeywordToken = Token[SyntaxKind]
  type BaseType = ObjectType | IntersectionType
  type BinaryOperator = AssignmentOperatorOrHigher | SyntaxKind
  type BinaryOperatorToken = Token[BinaryOperator]
  type BindingName = Identifier | BindingPattern
  type BindingOrAssignmentElement = VariableDeclaration | ParameterDeclaration | BindingElement | PropertyAssignment | ShorthandPropertyAssignment | SpreadAssignment | OmittedExpression | SpreadElement | ArrayLiteralExpression | ObjectLiteralExpression | AssignmentExpression[EqualsToken] | Identifier | PropertyAccessExpression | ElementAccessExpression
  type BindingOrAssignmentElementRestIndicator = DotDotDotToken | SpreadElement | SpreadAssignment
  type BindingOrAssignmentElementTarget = BindingOrAssignmentPattern | Identifier | PropertyAccessExpression | ElementAccessExpression | OmittedExpression
  type BindingOrAssignmentPattern = ObjectBindingOrAssignmentPattern | ArrayBindingOrAssignmentPattern
  type BindingPattern = ObjectBindingPattern | ArrayBindingPattern
  type BitwiseOperator = SyntaxKind
  type BitwiseOperatorOrHigher = EqualityOperatorOrHigher | BitwiseOperator
  type BlockLike = SourceFile | Block | ModuleBlock | CaseOrDefaultClause
  type BreakOrContinueStatement = BreakStatement | ContinueStatement
  type CallLikeExpression = CallExpression | NewExpression | TaggedTemplateExpression | Decorator | JsxOpeningLikeElement
  type CaseOrDefaultClause = CaseClause | DefaultClause
  type ClassLikeDeclaration = ClassDeclaration | ClassExpression
  type CodeActionCommand = InstallPackageAction | GenerateTypesAction
  type ColonToken = Token[SyntaxKind]
  type CommentKind = SyntaxKind
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double]) | js.Array[java.lang.String] | MapLike[js.Array[java.lang.String]] | js.Array[PluginImport] | js.Array[ProjectReference] | scala.Null
  ]
  type CompletionsTriggerCharacter = typescriptLib.typescriptLibStrings.DOT | typescriptLib.typescriptLibStrings.BACKSLASH | typescriptLib.typescriptLibStrings.`'` | typescriptLib.typescriptLibStrings.BACKTICK | typescriptLib.typescriptLibStrings.`/` | typescriptLib.typescriptLibStrings.`@` | typescriptLib.typescriptLibStrings.`<`
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
  type DeclarationName = Identifier | StringLiteral | NumericLiteral | ComputedPropertyName | BindingPattern
  type DeclarationWithTypeParameterChildren = SignatureDeclaration | ClassLikeDeclaration | InterfaceDeclaration | TypeAliasDeclaration | JSDocTemplateTag
  type DeclarationWithTypeParameters = DeclarationWithTypeParameterChildren | JSDocTypedefTag | JSDocCallbackTag | JSDocSignature
  type DestructuringAssignment = ObjectDestructuringAssignment | ArrayDestructuringAssignment
  type DestructuringPattern = BindingPattern | ObjectLiteralExpression | ArrayLiteralExpression
  type DiagnosticReporter = js.Function1[/* diagnostic */ Diagnostic, scala.Unit]
  type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, scala.Unit]
  type DocumentRegistryBucketKey = java.lang.String with typescriptLib.Anon_BucketKey
  type DotDotDotToken = Token[SyntaxKind]
  type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]
  type EndOfFileToken = Token[SyntaxKind] with JSDocContainer
  type EntityName = Identifier | QualifiedName
  type EntityNameExpression = Identifier | PropertyAccessEntityNameExpression
  type EntityNameOrEntityNameExpression = EntityName | EntityNameExpression
  type EnumType = Type
  type EqualityOperator = SyntaxKind
  type EqualityOperatorOrHigher = RelationalOperatorOrHigher | EqualityOperator
  type EqualsGreaterThanToken = Token[SyntaxKind]
  type EqualsToken = Token[SyntaxKind]
  type ErrorCallback = js.Function2[/* message */ DiagnosticMessage, /* length */ scala.Double, scala.Unit]
  type ExclamationToken = Token[SyntaxKind]
  type ExponentiationOperator = SyntaxKind
  type FileWatcherCallback = js.Function2[/* fileName */ java.lang.String, /* eventKind */ FileWatcherEventKind, scala.Unit]
  type FlowNode = AfterFinallyFlow | PreFinallyFlow | FlowStart | FlowLabel | FlowAssignment | FlowCondition | FlowSwitchClause | FlowArrayMutation
  type FlowType = Type | IncompleteType
  type ForInOrOfStatement = ForInStatement | ForOfStatement
  type ForInitializer = VariableDeclarationList | Expression
  type FunctionBody = Block
  /** @deprecated Use SignatureDeclaration */
  type FunctionLike = SignatureDeclaration
  type FunctionLikeDeclaration = FunctionDeclaration | MethodDeclaration | GetAccessorDeclaration | SetAccessorDeclaration | ConstructorDeclaration | FunctionExpression | ArrowFunction
  type FunctionOrConstructorTypeNode = FunctionTypeNode | ConstructorTypeNode
  type GenerateTypesAction = GenerateTypesOptions
  type HasExpressionInitializer = VariableDeclaration | ParameterDeclaration | BindingElement | PropertySignature | PropertyDeclaration | PropertyAssignment | EnumMember
  type HasInitializer = HasExpressionInitializer | ForStatement | ForInStatement | ForOfStatement | JsxAttribute
  type HasJSDoc = ParameterDeclaration | CallSignatureDeclaration | ConstructSignatureDeclaration | MethodSignature | PropertySignature | ArrowFunction | ParenthesizedExpression | SpreadAssignment | ShorthandPropertyAssignment | PropertyAssignment | FunctionExpression | LabeledStatement | ExpressionStatement | VariableStatement | FunctionDeclaration | ConstructorDeclaration | MethodDeclaration | PropertyDeclaration | AccessorDeclaration | ClassLikeDeclaration | InterfaceDeclaration | TypeAliasDeclaration | EnumMember | EnumDeclaration | ModuleDeclaration | ImportEqualsDeclaration | IndexSignatureDeclaration | FunctionTypeNode | ConstructorTypeNode | JSDocFunctionType | ExportDeclaration | EndOfFileToken
  type HasType = SignatureDeclaration | VariableDeclaration | ParameterDeclaration | PropertySignature | PropertyDeclaration | TypePredicateNode | ParenthesizedTypeNode | TypeOperatorNode | MappedTypeNode | AssertionExpression | TypeAliasDeclaration | JSDocTypeExpression | JSDocNonNullableType | JSDocNullableType | JSDocOptionalType | JSDocVariadicType
  type ImportOrExportSpecifier = ImportSpecifier | ExportSpecifier
  /** Deprecated, please use UpdateExpression */
  type IncrementExpression = UpdateExpression
  type InstantiableType = Type
  type IntersectionType = UnionOrIntersectionType
  type JSDocNamespaceBody = Identifier | JSDocNamespaceDeclaration
  type JSDocTypeReferencingNode = JSDocVariadicType | JSDocOptionalType | JSDocNullableType | JSDocNonNullableType
  type JsDocSyntaxKind = SyntaxKind | KeywordSyntaxKind
  /** @deprecated Use FileExtensionInfo instead. */
  type JsFileExtensionInfo = FileExtensionInfo
  type JsxAttributeLike = JsxAttribute | JsxSpreadAttribute
  type JsxChild = JsxText | JsxExpression | JsxElement | JsxSelfClosingElement | JsxFragment
  type JsxOpeningLikeElement = JsxSelfClosingElement | JsxOpeningElement
  type JsxTagNameExpression = Identifier | ThisExpression | JsxTagNamePropertyAccess
  type JsxTokenSyntaxKind = SyntaxKind
  type KeywordSyntaxKind = SyntaxKind
  type LogicalOperator = SyntaxKind
  type LogicalOperatorOrHigher = BitwiseOperatorOrHigher | LogicalOperator
  type MinusToken = Token[SyntaxKind]
  type Modifier = Token[SyntaxKind]
  type ModifiersArray = NodeArray[Modifier]
  type ModuleBody = NamespaceBody | JSDocNamespaceBody
  type ModuleName = Identifier | StringLiteral
  type ModuleReference = EntityName | ExternalModuleReference
  type MultiplicativeOperator = SyntaxKind
  type MultiplicativeOperatorOrHigher = ExponentiationOperator | MultiplicativeOperator
  type NamedImportBindings = NamespaceImport | NamedImports
  type NamedImportsOrExports = NamedImports | NamedExports
  type NamespaceBody = ModuleBlock | NamespaceDeclaration
  type ObjectBindingOrAssignmentPattern = ObjectBindingPattern | ObjectLiteralExpression
  /** Unlike ObjectLiteralElement, excludes JSXAttribute and JSXSpreadAttribute. */
  type ObjectLiteralElementLike = PropertyAssignment | ShorthandPropertyAssignment | SpreadAssignment | MethodDeclaration | AccessorDeclaration
  type ObjectTypeDeclaration = ClassLikeDeclaration | InterfaceDeclaration | TypeLiteralNode
  type OrganizeImportsScope = CombinedCodeFixScope
  type ParameterPropertyDeclaration = ParameterDeclaration with typescriptLib.Anon_Name
  type Path = java.lang.String with typescriptLib.Anon_PathBrand
  type PlusToken = Token[SyntaxKind]
  type PostfixUnaryOperator = SyntaxKind
  type PrefixUnaryOperator = SyntaxKind
  type PropertyName = Identifier | StringLiteral | NumericLiteral | ComputedPropertyName
  type QuestionToken = Token[SyntaxKind]
  type ReadonlyToken = Token[SyntaxKind]
  type RelationalOperator = SyntaxKind
  type RelationalOperatorOrHigher = ShiftOperatorOrHigher | RelationalOperator
  type RenameInfo = RenameInfoSuccess | RenameInfoFailure
  type RenameLocation = DocumentSpan
  /**
       * Branded string for keeping track of when we've turned an ambiguous path
       * specified like "./blah" to an absolute path to an actual
       * tsconfig file, e.g. "/root/blah/tsconfig.json"
       */
  type ResolvedConfigFileName = java.lang.String with typescriptLib.Anon_IsResolvedConfigFileName
  type ShiftOperator = SyntaxKind
  type ShiftOperatorOrHigher = AdditiveOperatorOrHigher | ShiftOperator
  type SignatureDeclaration = CallSignatureDeclaration | ConstructSignatureDeclaration | MethodSignature | IndexSignatureDeclaration | FunctionTypeNode | ConstructorTypeNode | JSDocFunctionType | FunctionDeclaration | MethodDeclaration | ConstructorDeclaration | AccessorDeclaration | FunctionExpression | ArrowFunction
  type SignatureHelpRetriggerCharacter = SignatureHelpTriggerCharacter | typescriptLib.typescriptLibStrings.`)`
  type SignatureHelpTriggerCharacter = typescriptLib.typescriptLibStrings.`,` | typescriptLib.typescriptLibStrings.`(` | typescriptLib.typescriptLibStrings.`<`
  type SignatureHelpTriggerReason = SignatureHelpInvokedReason | SignatureHelpCharacterTypedReason | SignatureHelpRetriggeredReason
  type StringLiteralLike = StringLiteral | NoSubstitutionTemplateLiteral
  type StructuredType = ObjectType | UnionType | IntersectionType
  type SuperProperty = SuperPropertyAccessExpression | SuperElementAccessExpression
  /** SymbolTable based on ES6 Map interface. */
  type SymbolTable = UnderscoreEscapedMap[Symbol]
  type TemplateLiteral = TemplateExpression | NoSubstitutionTemplateLiteral
  type TemplateLiteralToken = NoSubstitutionTemplateLiteral | TemplateHead | TemplateMiddle | TemplateTail
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
  type TypePredicate = IdentifierTypePredicate | ThisTypePredicate
  type TypeReferenceType = TypeReferenceNode | ExpressionWithTypeArguments
  type TypeVariable = TypeParameter | IndexedAccessType
  type UnionOrIntersectionTypeNode = UnionTypeNode | IntersectionTypeNode
  type UnionType = UnionOrIntersectionType
  type VariableLikeDeclaration = VariableDeclaration | ParameterDeclaration | BindingElement | PropertyDeclaration | PropertyAssignment | PropertySignature | JsxAttribute | ShorthandPropertyAssignment | EnumMember | JSDocPropertyTag | JSDocParameterTag
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
