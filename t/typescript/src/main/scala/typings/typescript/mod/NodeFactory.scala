package typings.typescript.mod

import typings.typescript.anon.ExpressionWithTypeArgumen
import typings.typescript.mod.SyntaxKind.ExtendsKeyword
import typings.typescript.mod.SyntaxKind.FalseKeyword
import typings.typescript.mod.SyntaxKind.ImplementsKeyword
import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.SyntaxKind.KeyOfKeyword
import typings.typescript.mod.SyntaxKind.NewKeyword
import typings.typescript.mod.SyntaxKind.NullKeyword
import typings.typescript.mod.SyntaxKind.SuperKeyword
import typings.typescript.mod.SyntaxKind.ThisKeyword
import typings.typescript.mod.SyntaxKind.TrueKeyword
import typings.typescript.mod.SyntaxKind.UniqueKeyword
import typings.typescript.mod.SyntaxKind.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeFactory extends StObject {
  
  def createAdd(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createArrayBindingPattern(elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
  
  def createArrayLiteralExpression(): ArrayLiteralExpression = js.native
  def createArrayLiteralExpression(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def createArrayLiteralExpression(elements: js.Array[Expression], multiLine: Boolean): ArrayLiteralExpression = js.native
  def createArrayLiteralExpression(elements: Unit, multiLine: Boolean): ArrayLiteralExpression = js.native
  
  def createArrayTypeNode(elementType: TypeNode): ArrayTypeNode = js.native
  
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Unit,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  
  def createAsExpression(expression: Expression, `type`: TypeNode): AsExpression = js.native
  
  def createAssertClause(elements: NodeArray[AssertEntry]): AssertClause = js.native
  def createAssertClause(elements: NodeArray[AssertEntry], multiLine: Boolean): AssertClause = js.native
  
  def createAssertEntry(name: AssertionKey, value: Expression): AssertEntry = js.native
  
  def createAssignment(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def createAssignment(left: Expression, right: Expression): AssignmentExpression[EqualsToken] = js.native
  def createAssignment(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment = js.native
  
  def createAwaitExpression(expression: Expression): AwaitExpression = js.native
  
  def createBigIntLiteral(value: java.lang.String): BigIntLiteral = js.native
  def createBigIntLiteral(value: PseudoBigInt): BigIntLiteral = js.native
  
  def createBinaryExpression(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def createBinaryExpression(left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
  
  def createBindingElement(dotDotDotToken: Unit, propertyName: java.lang.String, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: Unit,
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: java.lang.String, name: BindingName): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: java.lang.String, name: BindingName, initializer: Expression): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: Unit, name: java.lang.String): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: Unit, name: java.lang.String, initializer: Expression): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: Unit, name: BindingName): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: Unit, name: BindingName, initializer: Expression): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: PropertyName, name: java.lang.String): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: PropertyName, name: java.lang.String, initializer: Expression): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def createBindingElement(dotDotDotToken: Unit, propertyName: PropertyName, name: BindingName, initializer: Expression): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: java.lang.String, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: java.lang.String, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: java.lang.String,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: Unit, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: Unit,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: Unit, name: BindingName): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: Unit, name: BindingName, initializer: Expression): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: PropertyName, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  
  def createBitwiseAnd(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createBitwiseNot(operand: Expression): PrefixUnaryExpression = js.native
  
  def createBitwiseOr(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createBitwiseXor(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createBlock(statements: js.Array[Statement]): Block = js.native
  def createBlock(statements: js.Array[Statement], multiLine: Boolean): Block = js.native
  
  def createBreakStatement(): BreakStatement = js.native
  def createBreakStatement(label: java.lang.String): BreakStatement = js.native
  def createBreakStatement(label: Identifier): BreakStatement = js.native
  
  def createBundle(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def createBundle(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
  
  def createCallChain(expression: Expression): CallChain = js.native
  def createCallChain(expression: Expression, questionDotToken: Unit, typeArguments: js.Array[TypeNode]): CallChain = js.native
  def createCallChain(
    expression: Expression,
    questionDotToken: Unit,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def createCallChain(
    expression: Expression,
    questionDotToken: Unit,
    typeArguments: Unit,
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def createCallChain(expression: Expression, questionDotToken: QuestionDotToken): CallChain = js.native
  def createCallChain(expression: Expression, questionDotToken: QuestionDotToken, typeArguments: js.Array[TypeNode]): CallChain = js.native
  def createCallChain(
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def createCallChain(
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: Unit,
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  
  def createCallExpression(expression: Expression): CallExpression = js.native
  def createCallExpression(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
  def createCallExpression(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
  def createCallExpression(expression: Expression, typeArguments: Unit, argumentsArray: js.Array[Expression]): CallExpression = js.native
  
  def createCallSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def createCallSignature(typeParameters: Unit, parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def createCallSignature(typeParameters: Unit, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): CallSignatureDeclaration = js.native
  
  def createCaseBlock(clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
  
  def createCaseClause(expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
  
  def createCatchClause(variableDeclaration: java.lang.String, block: Block): CatchClause = js.native
  def createCatchClause(variableDeclaration: Unit, block: Block): CatchClause = js.native
  def createCatchClause(variableDeclaration: BindingName, block: Block): CatchClause = js.native
  def createCatchClause(variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassExpression(
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  
  def createClassStaticBlockDeclaration(body: Block): ClassStaticBlockDeclaration = js.native
  /**
    * @deprecated Decorators and modifiers are no longer supported for this function. Callers should use an overload that does not accept the `decorators` and `modifiers` parameters.
    */
  def createClassStaticBlockDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], body: Block): ClassStaticBlockDeclaration = js.native
  def createClassStaticBlockDeclaration(decorators: js.Array[Decorator], modifiers: Unit, body: Block): ClassStaticBlockDeclaration = js.native
  def createClassStaticBlockDeclaration(decorators: Unit, modifiers: js.Array[Modifier], body: Block): ClassStaticBlockDeclaration = js.native
  def createClassStaticBlockDeclaration(decorators: Unit, modifiers: Unit, body: Block): ClassStaticBlockDeclaration = js.native
  
  def createComma(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createCommaListExpression(elements: js.Array[Expression]): CommaListExpression = js.native
  
  def createComputedPropertyName(expression: Expression): ComputedPropertyName = js.native
  
  def createConditionalExpression(
    condition: Expression,
    questionToken: Unit,
    whenTrue: Expression,
    colonToken: Unit,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def createConditionalExpression(
    condition: Expression,
    questionToken: Unit,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def createConditionalExpression(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: Unit,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def createConditionalExpression(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  
  def createConditionalTypeNode(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
  
  def createConstructSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def createConstructSignature(typeParameters: Unit, parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def createConstructSignature(typeParameters: Unit, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): ConstructSignatureDeclaration = js.native
  
  /**
    * @deprecated This node does not support Decorators. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createConstructorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(decorators: js.Array[Decorator], modifiers: Unit, parameters: js.Array[ParameterDeclaration]): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(decorators: Unit, modifiers: js.Array[Modifier], parameters: js.Array[ParameterDeclaration]): ConstructorDeclaration = js.native
  def createConstructorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorDeclaration(decorators: Unit, modifiers: Unit, parameters: js.Array[ParameterDeclaration]): ConstructorDeclaration = js.native
  def createConstructorDeclaration(decorators: Unit, modifiers: Unit, parameters: js.Array[ParameterDeclaration], body: Block): ConstructorDeclaration = js.native
  def createConstructorDeclaration(modifiers: js.Array[Modifier], parameters: js.Array[ParameterDeclaration]): ConstructorDeclaration = js.native
  def createConstructorDeclaration(modifiers: js.Array[Modifier], parameters: js.Array[ParameterDeclaration], body: Block): ConstructorDeclaration = js.native
  def createConstructorDeclaration(modifiers: Unit, parameters: js.Array[ParameterDeclaration]): ConstructorDeclaration = js.native
  def createConstructorDeclaration(modifiers: Unit, parameters: js.Array[ParameterDeclaration], body: Block): ConstructorDeclaration = js.native
  
  def createConstructorTypeNode(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  /** @deprecated Use the overload that accepts 'modifiers' */
  def createConstructorTypeNode(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def createConstructorTypeNode(typeParameters: Unit, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): ConstructorTypeNode = js.native
  
  def createContinueStatement(): ContinueStatement = js.native
  def createContinueStatement(label: java.lang.String): ContinueStatement = js.native
  def createContinueStatement(label: Identifier): ContinueStatement = js.native
  
  def createDebuggerStatement(): DebuggerStatement = js.native
  
  def createDecorator(expression: Expression): Decorator = js.native
  
  def createDefaultClause(statements: js.Array[Statement]): DefaultClause = js.native
  
  def createDeleteExpression(expression: Expression): DeleteExpression = js.native
  
  def createDivide(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createDoStatement(statement: Statement, expression: Expression): DoStatement = js.native
  
  def createElementAccessChain(expression: Expression, questionDotToken: Unit, index: Double): ElementAccessChain = js.native
  def createElementAccessChain(expression: Expression, questionDotToken: Unit, index: Expression): ElementAccessChain = js.native
  def createElementAccessChain(expression: Expression, questionDotToken: QuestionDotToken, index: Double): ElementAccessChain = js.native
  def createElementAccessChain(expression: Expression, questionDotToken: QuestionDotToken, index: Expression): ElementAccessChain = js.native
  
  def createElementAccessExpression(expression: Expression, index: Double): ElementAccessExpression = js.native
  def createElementAccessExpression(expression: Expression, index: Expression): ElementAccessExpression = js.native
  
  def createEmptyStatement(): EmptyStatement = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(decorators: js.Array[Decorator], modifiers: Unit, name: Identifier, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(decorators: Unit, modifiers: js.Array[Modifier], name: Identifier, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(decorators: Unit, modifiers: Unit, name: java.lang.String, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(decorators: Unit, modifiers: Unit, name: Identifier, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(modifiers: js.Array[Modifier], name: java.lang.String, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(modifiers: js.Array[Modifier], name: Identifier, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(modifiers: Unit, name: java.lang.String, members: js.Array[EnumMember]): EnumDeclaration = js.native
  def createEnumDeclaration(modifiers: Unit, name: Identifier, members: js.Array[EnumMember]): EnumDeclaration = js.native
  
  def createEnumMember(name: java.lang.String): EnumMember = js.native
  def createEnumMember(name: java.lang.String, initializer: Expression): EnumMember = js.native
  def createEnumMember(name: PropertyName): EnumMember = js.native
  def createEnumMember(name: PropertyName, initializer: Expression): EnumMember = js.native
  
  def createEquality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createExponent(left: Expression, right: Expression): BinaryExpression = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: Unit,
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(decorators: js.Array[Decorator], modifiers: Unit, isExportEquals: Boolean, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(decorators: js.Array[Decorator], modifiers: Unit, isExportEquals: Unit, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(decorators: Unit, modifiers: js.Array[Modifier], isExportEquals: Boolean, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(decorators: Unit, modifiers: js.Array[Modifier], isExportEquals: Unit, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(decorators: Unit, modifiers: Unit, isExportEquals: Boolean, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(decorators: Unit, modifiers: Unit, isExportEquals: Unit, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(modifiers: js.Array[Modifier], isExportEquals: Boolean, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(modifiers: js.Array[Modifier], isExportEquals: Unit, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(modifiers: Unit, isExportEquals: Boolean, expression: Expression): ExportAssignment = js.native
  def createExportAssignment(modifiers: Unit, isExportEquals: Unit, expression: Expression): ExportAssignment = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: Unit, isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: Unit, modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: Unit, modifiers: Unit, isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: Unit, modifiers: Unit, isTypeOnly: Boolean, exportClause: NamedExportBindings): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(modifiers: js.Array[Modifier], isTypeOnly: Boolean, exportClause: NamedExportBindings): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(modifiers: Unit, isTypeOnly: Boolean): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(modifiers: Unit, isTypeOnly: Boolean, exportClause: Unit, moduleSpecifier: Expression): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(modifiers: Unit, isTypeOnly: Boolean, exportClause: NamedExportBindings): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  
  def createExportDefault(expression: Expression): ExportAssignment = js.native
  
  def createExportSpecifier(isTypeOnly: Boolean, propertyName: java.lang.String, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(isTypeOnly: Boolean, propertyName: java.lang.String, name: Identifier): ExportSpecifier = js.native
  def createExportSpecifier(isTypeOnly: Boolean, propertyName: Unit, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(isTypeOnly: Boolean, propertyName: Unit, name: Identifier): ExportSpecifier = js.native
  def createExportSpecifier(isTypeOnly: Boolean, propertyName: Identifier, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(isTypeOnly: Boolean, propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
  
  def createExpressionStatement(expression: Expression): ExpressionStatement = js.native
  
  def createExpressionWithTypeArguments(expression: Expression): ExpressionWithTypeArguments = js.native
  def createExpressionWithTypeArguments(expression: Expression, typeArguments: js.Array[TypeNode]): ExpressionWithTypeArguments = js.native
  
  def createExternalModuleExport(exportName: Identifier): ExportDeclaration = js.native
  
  def createExternalModuleReference(expression: Expression): ExternalModuleReference = js.native
  
  def createFalse(): FalseLiteral = js.native
  
  def createForInStatement(initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
  
  def createForOfStatement(awaitModifier: Unit, initializer: ForInitializer, expression: Expression, statement: Statement): ForOfStatement = js.native
  def createForOfStatement(
    awaitModifier: AwaitKeyword,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  
  def createForStatement(initializer: Unit, condition: Unit, incrementor: Unit, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: Unit, condition: Unit, incrementor: Expression, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: Unit, condition: Expression, incrementor: Unit, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: Unit, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: ForInitializer, condition: Unit, incrementor: Unit, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: ForInitializer, condition: Unit, incrementor: Expression, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: ForInitializer, condition: Expression, incrementor: Unit, statement: Statement): ForStatement = js.native
  def createForStatement(initializer: ForInitializer, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
  def createFunctionDeclaration(
    modifiers: js.UndefOr[js.Array[ModifierLike]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
  
  def createFunctionExpression(
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.UndefOr[js.Array[ParameterDeclaration]],
    `type`: js.UndefOr[TypeNode],
    body: Block
  ): FunctionExpression = js.native
  
  def createFunctionTypeNode(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def createFunctionTypeNode(typeParameters: Unit, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): FunctionTypeNode = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(decorators: Unit, modifiers: Unit, name: PropertyName, parameters: js.Array[ParameterDeclaration]): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(modifiers: js.Array[ModifierLike], name: PropertyName, parameters: js.Array[ParameterDeclaration]): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(modifiers: Unit, name: java.lang.String, parameters: js.Array[ParameterDeclaration]): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(modifiers: Unit, name: PropertyName, parameters: js.Array[ParameterDeclaration]): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(modifiers: Unit, name: PropertyName, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): GetAccessorDeclaration = js.native
  def createGetAccessorDeclaration(
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  
  def createGreaterThan(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createGreaterThanEquals(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createHeritageClause(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def createHeritageClause(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  
  def createIdentifier(text: java.lang.String): Identifier = js.native
  
  def createIfStatement(expression: Expression, thenStatement: Statement): IfStatement = js.native
  def createIfStatement(expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
  
  def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement]): CallExpression = js.native
  def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
  
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement]): CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
  
  def createImportClause(isTypeOnly: Boolean): ImportClause = js.native
  def createImportClause(isTypeOnly: Boolean, name: Unit, namedBindings: NamedImportBindings): ImportClause = js.native
  def createImportClause(isTypeOnly: Boolean, name: Identifier): ImportClause = js.native
  def createImportClause(isTypeOnly: Boolean, name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(decorators: js.Array[Decorator], modifiers: Unit, importClause: Unit, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(decorators: Unit, modifiers: js.Array[Modifier], importClause: Unit, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(decorators: Unit, modifiers: Unit, importClause: Unit, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(decorators: Unit, modifiers: Unit, importClause: ImportClause, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: Unit,
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(modifiers: js.Array[Modifier], importClause: Unit, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(modifiers: js.Array[Modifier], importClause: ImportClause, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def createImportDeclaration(modifiers: Unit, importClause: Unit, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(modifiers: Unit, importClause: Unit, moduleSpecifier: Expression, assertClause: AssertClause): ImportDeclaration = js.native
  def createImportDeclaration(modifiers: Unit, importClause: ImportClause, moduleSpecifier: Expression): ImportDeclaration = js.native
  def createImportDeclaration(
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(modifiers: Unit, isTypeOnly: Boolean, name: java.lang.String, moduleReference: ModuleReference): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(modifiers: Unit, isTypeOnly: Boolean, name: Identifier, moduleReference: ModuleReference): ImportEqualsDeclaration = js.native
  
  def createImportSpecifier(isTypeOnly: Boolean, propertyName: Unit, name: Identifier): ImportSpecifier = js.native
  def createImportSpecifier(isTypeOnly: Boolean, propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
  
  def createImportTypeAssertionContainer(clause: AssertClause): ImportTypeAssertionContainer = js.native
  def createImportTypeAssertionContainer(clause: AssertClause, multiLine: Boolean): ImportTypeAssertionContainer = js.native
  
  def createImportTypeNode(argument: TypeNode): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, assertions: Unit, qualifier: Unit, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: Unit,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, assertions: Unit, qualifier: Unit, typeArguments: Unit, isTypeOf: Boolean): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, assertions: Unit, qualifier: EntityName): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, assertions: Unit, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: Unit,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: Unit,
    qualifier: EntityName,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, assertions: ImportTypeAssertionContainer): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: Unit,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, assertions: ImportTypeAssertionContainer, qualifier: EntityName): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: Unit, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: Unit, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: Unit, typeArguments: Unit, isTypeOf: Boolean): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode], isTypeOf: Boolean): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName, typeArguments: Unit, isTypeOf: Boolean): ImportTypeNode = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createIndexSignature(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexSignature(decorators: Unit, modifiers: Unit, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): IndexSignatureDeclaration = js.native
  def createIndexSignature(modifiers: js.Array[Modifier], parameters: js.Array[ParameterDeclaration], `type`: TypeNode): IndexSignatureDeclaration = js.native
  def createIndexSignature(modifiers: Unit, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): IndexSignatureDeclaration = js.native
  
  def createIndexedAccessTypeNode(objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
  
  def createInequality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createInferTypeNode(typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createInterfaceDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  
  def createIntersectionTypeNode(types: js.Array[TypeNode]): IntersectionTypeNode = js.native
  
  def createJSDocAllType(): JSDocAllType = js.native
  
  def createJSDocAugmentsTag(tagName: Unit, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Unit, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Unit, className: ExpressionWithTypeArgumen, comment: NodeArray[JSDocComment]): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocAugmentsTag = js.native
  def createJSDocAugmentsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: NodeArray[JSDocComment]): JSDocAugmentsTag = js.native
  
  def createJSDocAuthorTag(): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Unit, comment: java.lang.String): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Unit, comment: NodeArray[JSDocComment]): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Identifier): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Identifier, comment: java.lang.String): JSDocAuthorTag = js.native
  def createJSDocAuthorTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocAuthorTag = js.native
  
  def createJSDocCallbackTag(tagName: Unit, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Unit, typeExpression: JSDocSignature, fullName: Unit, comment: java.lang.String): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Unit, typeExpression: JSDocSignature, fullName: Unit, comment: NodeArray[JSDocComment]): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Unit, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Unit, typeExpression: JSDocSignature, fullName: Identifier, comment: java.lang.String): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Unit, typeExpression: JSDocSignature, fullName: JSDocNamespaceDeclaration): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: Unit, comment: java.lang.String): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(tagName: Identifier, typeExpression: JSDocSignature, fullName: JSDocNamespaceDeclaration): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def createJSDocCallbackTag(
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  
  def createJSDocClassTag(): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Unit, comment: java.lang.String): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Unit, comment: NodeArray[JSDocComment]): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Identifier): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Identifier, comment: java.lang.String): JSDocClassTag = js.native
  def createJSDocClassTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocClassTag = js.native
  
  def createJSDocComment(): JSDoc = js.native
  def createJSDocComment(comment: java.lang.String): JSDoc = js.native
  def createJSDocComment(comment: java.lang.String, tags: js.Array[JSDocTag]): JSDoc = js.native
  def createJSDocComment(comment: Unit, tags: js.Array[JSDocTag]): JSDoc = js.native
  def createJSDocComment(comment: NodeArray[JSDocComment]): JSDoc = js.native
  def createJSDocComment(comment: NodeArray[JSDocComment], tags: js.Array[JSDocTag]): JSDoc = js.native
  
  def createJSDocDeprecatedTag(tagName: Identifier): JSDocDeprecatedTag = js.native
  def createJSDocDeprecatedTag(tagName: Identifier, comment: java.lang.String): JSDocDeprecatedTag = js.native
  def createJSDocDeprecatedTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocDeprecatedTag = js.native
  
  def createJSDocEnumTag(tagName: Unit, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
  def createJSDocEnumTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocEnumTag = js.native
  
  def createJSDocFunctionType(parameters: js.Array[ParameterDeclaration]): JSDocFunctionType = js.native
  def createJSDocFunctionType(parameters: js.Array[ParameterDeclaration], `type`: TypeNode): JSDocFunctionType = js.native
  
  def createJSDocImplementsTag(tagName: Unit, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Unit, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Unit, className: ExpressionWithTypeArgumen, comment: NodeArray[JSDocComment]): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: java.lang.String): JSDocImplementsTag = js.native
  def createJSDocImplementsTag(tagName: Identifier, className: ExpressionWithTypeArgumen, comment: NodeArray[JSDocComment]): JSDocImplementsTag = js.native
  
  def createJSDocLink(name: Unit, text: java.lang.String): JSDocLink = js.native
  def createJSDocLink(name: EntityName, text: java.lang.String): JSDocLink = js.native
  def createJSDocLink(name: JSDocMemberName, text: java.lang.String): JSDocLink = js.native
  
  def createJSDocLinkCode(name: Unit, text: java.lang.String): JSDocLinkCode = js.native
  def createJSDocLinkCode(name: EntityName, text: java.lang.String): JSDocLinkCode = js.native
  def createJSDocLinkCode(name: JSDocMemberName, text: java.lang.String): JSDocLinkCode = js.native
  
  def createJSDocLinkPlain(name: Unit, text: java.lang.String): JSDocLinkPlain = js.native
  def createJSDocLinkPlain(name: EntityName, text: java.lang.String): JSDocLinkPlain = js.native
  def createJSDocLinkPlain(name: JSDocMemberName, text: java.lang.String): JSDocLinkPlain = js.native
  
  def createJSDocMemberName(left: EntityName, right: Identifier): JSDocMemberName = js.native
  def createJSDocMemberName(left: JSDocMemberName, right: Identifier): JSDocMemberName = js.native
  
  def createJSDocNameReference(name: EntityName): JSDocNameReference = js.native
  def createJSDocNameReference(name: JSDocMemberName): JSDocNameReference = js.native
  
  def createJSDocNamepathType(`type`: TypeNode): JSDocNamepathType = js.native
  
  def createJSDocNonNullableType(`type`: TypeNode): JSDocNonNullableType = js.native
  def createJSDocNonNullableType(`type`: TypeNode, postfix: Boolean): JSDocNonNullableType = js.native
  
  def createJSDocNullableType(`type`: TypeNode): JSDocNullableType = js.native
  def createJSDocNullableType(`type`: TypeNode, postfix: Boolean): JSDocNullableType = js.native
  
  def createJSDocOptionalType(`type`: TypeNode): JSDocOptionalType = js.native
  
  def createJSDocOverrideTag(tagName: Identifier): JSDocOverrideTag = js.native
  def createJSDocOverrideTag(tagName: Identifier, comment: java.lang.String): JSDocOverrideTag = js.native
  def createJSDocOverrideTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocOverrideTag = js.native
  
  def createJSDocParameterTag(tagName: Unit, name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
  def createJSDocParameterTag(tagName: Unit, name: EntityName, isBracketed: Boolean, typeExpression: Unit, isNameFirst: Boolean): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(tagName: Unit, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(tagName: Identifier, name: EntityName, isBracketed: Boolean): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(tagName: Identifier, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def createJSDocParameterTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  
  def createJSDocPrivateTag(): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Unit, comment: java.lang.String): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Unit, comment: NodeArray[JSDocComment]): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Identifier): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Identifier, comment: java.lang.String): JSDocPrivateTag = js.native
  def createJSDocPrivateTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocPrivateTag = js.native
  
  def createJSDocPropertyTag(tagName: Unit, name: EntityName, isBracketed: Boolean): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(tagName: Unit, name: EntityName, isBracketed: Boolean, typeExpression: Unit, isNameFirst: Boolean): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(tagName: Unit, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(tagName: Identifier, name: EntityName, isBracketed: Boolean): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(tagName: Identifier, name: EntityName, isBracketed: Boolean, typeExpression: JSDocTypeExpression): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def createJSDocPropertyTag(
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  
  def createJSDocProtectedTag(): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Unit, comment: java.lang.String): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Unit, comment: NodeArray[JSDocComment]): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Identifier): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Identifier, comment: java.lang.String): JSDocProtectedTag = js.native
  def createJSDocProtectedTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocProtectedTag = js.native
  
  def createJSDocPublicTag(): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Unit, comment: java.lang.String): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Unit, comment: NodeArray[JSDocComment]): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Identifier): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Identifier, comment: java.lang.String): JSDocPublicTag = js.native
  def createJSDocPublicTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocPublicTag = js.native
  
  def createJSDocReadonlyTag(): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Unit, comment: java.lang.String): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Unit, comment: NodeArray[JSDocComment]): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Identifier): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Identifier, comment: java.lang.String): JSDocReadonlyTag = js.native
  def createJSDocReadonlyTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocReadonlyTag = js.native
  
  def createJSDocReturnTag(): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Unit, typeExpression: Unit, comment: java.lang.String): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Unit, typeExpression: Unit, comment: NodeArray[JSDocComment]): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Unit, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: Unit, comment: java.lang.String): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: Unit, comment: NodeArray[JSDocComment]): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocReturnTag = js.native
  def createJSDocReturnTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocReturnTag = js.native
  
  def createJSDocSeeTag(): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Unit, nameExpression: Unit, comment: java.lang.String): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Unit, nameExpression: Unit, comment: NodeArray[JSDocComment]): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Unit, nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Unit, nameExpression: JSDocNameReference, comment: java.lang.String): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Unit, nameExpression: JSDocNameReference, comment: NodeArray[JSDocComment]): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: Unit, comment: java.lang.String): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: Unit, comment: NodeArray[JSDocComment]): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: JSDocNameReference, comment: java.lang.String): JSDocSeeTag = js.native
  def createJSDocSeeTag(tagName: Identifier, nameExpression: JSDocNameReference, comment: NodeArray[JSDocComment]): JSDocSeeTag = js.native
  
  def createJSDocSignature(typeParameters: js.Array[JSDocTemplateTag], parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def createJSDocSignature(
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  def createJSDocSignature(typeParameters: Unit, parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def createJSDocSignature(typeParameters: Unit, parameters: js.Array[JSDocParameterTag], `type`: JSDocReturnTag): JSDocSignature = js.native
  
  def createJSDocTemplateTag(tagName: Unit, constraint: Unit, typeParameters: js.Array[TypeParameterDeclaration]): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Unit,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Unit,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(tagName: Unit, constraint: JSDocTypeExpression, typeParameters: js.Array[TypeParameterDeclaration]): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Unit,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Unit,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(tagName: Identifier, constraint: Unit, typeParameters: js.Array[TypeParameterDeclaration]): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def createJSDocTemplateTag(
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  
  def createJSDocText(text: java.lang.String): JSDocText = js.native
  
  def createJSDocThisTag(tagName: Unit, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocThisTag = js.native
  def createJSDocThisTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocThisTag = js.native
  
  def createJSDocTypeExpression(`type`: TypeNode): JSDocTypeExpression = js.native
  
  def createJSDocTypeLiteral(): JSDocTypeLiteral = js.native
  def createJSDocTypeLiteral(jsDocPropertyTags: js.Array[JSDocPropertyLikeTag]): JSDocTypeLiteral = js.native
  def createJSDocTypeLiteral(jsDocPropertyTags: js.Array[JSDocPropertyLikeTag], isArrayType: Boolean): JSDocTypeLiteral = js.native
  def createJSDocTypeLiteral(jsDocPropertyTags: Unit, isArrayType: Boolean): JSDocTypeLiteral = js.native
  
  def createJSDocTypeTag(tagName: Unit, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Unit, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
  def createJSDocTypeTag(tagName: Identifier, typeExpression: JSDocTypeExpression, comment: NodeArray[JSDocComment]): JSDocTypeTag = js.native
  
  def createJSDocTypedefTag(
    tagName: js.UndefOr[Identifier],
    typeExpression: js.UndefOr[JSDocTypeExpression | JSDocTypeLiteral],
    fullName: js.UndefOr[Identifier | JSDocNamespaceDeclaration],
    comment: js.UndefOr[java.lang.String | NodeArray[JSDocComment]]
  ): JSDocTypedefTag = js.native
  
  def createJSDocUnknownTag(tagName: Identifier): JSDocUnknownTag = js.native
  def createJSDocUnknownTag(tagName: Identifier, comment: java.lang.String): JSDocUnknownTag = js.native
  def createJSDocUnknownTag(tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocUnknownTag = js.native
  
  def createJSDocUnknownType(): JSDocUnknownType = js.native
  
  def createJSDocVariadicType(`type`: TypeNode): JSDocVariadicType = js.native
  
  def createJsxAttribute(name: Identifier): JsxAttribute = js.native
  def createJsxAttribute(name: Identifier, initializer: JsxAttributeValue): JsxAttribute = js.native
  
  def createJsxAttributes(properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
  
  def createJsxClosingElement(tagName: JsxTagNameExpression): JsxClosingElement = js.native
  
  def createJsxElement(openingElement: JsxOpeningElement, children: js.Array[JsxChild], closingElement: JsxClosingElement): JsxElement = js.native
  
  def createJsxExpression(): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: Unit, expression: Expression): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: DotDotDotToken): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: DotDotDotToken, expression: Expression): JsxExpression = js.native
  
  def createJsxFragment(
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
  
  def createJsxJsxClosingFragment(): JsxClosingFragment = js.native
  
  def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxOpeningElement = js.native
  def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: Unit, attributes: JsxAttributes): JsxOpeningElement = js.native
  
  def createJsxOpeningFragment(): JsxOpeningFragment = js.native
  
  def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxSelfClosingElement = js.native
  def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: Unit, attributes: JsxAttributes): JsxSelfClosingElement = js.native
  
  def createJsxSpreadAttribute(expression: Expression): JsxSpreadAttribute = js.native
  
  def createJsxText(text: java.lang.String): JsxText = js.native
  def createJsxText(text: java.lang.String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
  
  def createKeywordTypeNode[TKind /* <: KeywordTypeSyntaxKind */](kind: TKind): KeywordTypeNode[TKind] = js.native
  
  def createLabeledStatement(label: java.lang.String, statement: Statement): LabeledStatement = js.native
  def createLabeledStatement(label: Identifier, statement: Statement): LabeledStatement = js.native
  
  def createLeftShift(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLessThan(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLessThanEquals(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLiteralTypeNode(literal: BooleanLiteral): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: LiteralExpression): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: NullLiteral): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  
  def createLogicalAnd(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createLogicalNot(operand: Expression): PrefixUnaryExpression = js.native
  
  def createLogicalOr(left: Expression, right: Expression): BinaryExpression = js.native
  
  /**
    * Create a unique temporary variable for use in a loop.
    * @param reservedInNestedScopes When `true`, reserves the temporary variable name in all nested scopes
    * during emit so that the variable can be referenced in a nested function body. This is an alternative to
    * setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
    */
  def createLoopVariable(): Identifier = js.native
  def createLoopVariable(reservedInNestedScopes: Boolean): Identifier = js.native
  
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode],
    members: js.UndefOr[NodeArray[TypeElement]]
  ): MappedTypeNode = js.native
  
  def createMetaProperty(keywordToken: ImportKeyword, name: Identifier): MetaProperty = js.native
  def createMetaProperty(keywordToken: NewKeyword, name: Identifier): MetaProperty = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createMethodDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: java.lang.String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
  def createMethodDeclaration(
    modifiers: js.UndefOr[js.Array[ModifierLike]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: java.lang.String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
  
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: java.lang.String,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): MethodSignature = js.native
  def createMethodSignature(
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  
  def createModifier[T /* <: ModifierSyntaxKind */](kind: T): ModifierToken[T] = js.native
  
  def createModifiersFromModifierFlags(flags: ModifierFlags): js.UndefOr[js.Array[Modifier]] = js.native
  
  def createModuleBlock(statements: js.Array[Statement]): ModuleBlock = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: Unit,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: Unit, name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: Unit, name: ModuleName, body: Unit, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: Unit, name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: js.Array[Modifier], name: ModuleName, body: Unit, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: Unit, name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: Unit, name: ModuleName, body: Unit, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: Unit, name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: Unit, modifiers: Unit, name: ModuleName, body: ModuleBody, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: js.Array[Modifier], name: ModuleName, body: Unit, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: Unit, name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: Unit, name: ModuleName, body: Unit, flags: NodeFlags): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: Unit, name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(modifiers: Unit, name: ModuleName, body: ModuleBody, flags: NodeFlags): ModuleDeclaration = js.native
  
  def createModulo(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createMultiply(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createNamedExports(elements: js.Array[ExportSpecifier]): NamedExports = js.native
  
  def createNamedImports(elements: js.Array[ImportSpecifier]): NamedImports = js.native
  
  def createNamedTupleMember(dotDotDotToken: Unit, name: Identifier, questionToken: Unit, `type`: TypeNode): NamedTupleMember = js.native
  def createNamedTupleMember(dotDotDotToken: Unit, name: Identifier, questionToken: QuestionToken, `type`: TypeNode): NamedTupleMember = js.native
  def createNamedTupleMember(dotDotDotToken: DotDotDotToken, name: Identifier, questionToken: Unit, `type`: TypeNode): NamedTupleMember = js.native
  def createNamedTupleMember(dotDotDotToken: DotDotDotToken, name: Identifier, questionToken: QuestionToken, `type`: TypeNode): NamedTupleMember = js.native
  
  def createNamespaceExport(name: Identifier): NamespaceExport = js.native
  
  def createNamespaceExportDeclaration(name: java.lang.String): NamespaceExportDeclaration = js.native
  def createNamespaceExportDeclaration(name: Identifier): NamespaceExportDeclaration = js.native
  
  def createNamespaceImport(name: Identifier): NamespaceImport = js.native
  
  def createNewExpression(expression: Expression): NewExpression = js.native
  def createNewExpression(expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def createNewExpression(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): NewExpression = js.native
  def createNewExpression(expression: Expression, typeArguments: Unit, argumentsArray: js.Array[Expression]): NewExpression = js.native
  
  def createNoSubstitutionTemplateLiteral(text: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  def createNoSubstitutionTemplateLiteral(text: java.lang.String, rawText: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  def createNoSubstitutionTemplateLiteral(text: Unit, rawText: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  
  def createNodeArray[T /* <: Node */](): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.Array[T]): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.Array[T], hasTrailingComma: Boolean): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: Unit, hasTrailingComma: Boolean): NodeArray[T] = js.native
  
  def createNonNullChain(expression: Expression): NonNullChain = js.native
  
  def createNonNullExpression(expression: Expression): NonNullExpression = js.native
  
  def createNotEmittedStatement(original: Node): NotEmittedStatement = js.native
  
  def createNull(): NullLiteral = js.native
  
  def createNumericLiteral(value: java.lang.String): NumericLiteral = js.native
  def createNumericLiteral(value: java.lang.String, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
  def createNumericLiteral(value: Double): NumericLiteral = js.native
  def createNumericLiteral(value: Double, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
  
  def createObjectBindingPattern(elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
  
  def createObjectLiteralExpression(): ObjectLiteralExpression = js.native
  def createObjectLiteralExpression(properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  def createObjectLiteralExpression(properties: js.Array[ObjectLiteralElementLike], multiLine: Boolean): ObjectLiteralExpression = js.native
  def createObjectLiteralExpression(properties: Unit, multiLine: Boolean): ObjectLiteralExpression = js.native
  
  def createOmittedExpression(): OmittedExpression = js.native
  
  def createOptionalTypeNode(`type`: TypeNode): OptionalTypeNode = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createParameterDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
  def createParameterDeclaration(
    modifiers: js.UndefOr[js.Array[ModifierLike]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
  
  def createParenthesizedExpression(expression: Expression): ParenthesizedExpression = js.native
  
  def createParenthesizedType(`type`: TypeNode): ParenthesizedTypeNode = js.native
  
  def createPartiallyEmittedExpression(expression: Expression): PartiallyEmittedExpression = js.native
  def createPartiallyEmittedExpression(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
  
  def createPostfixDecrement(operand: Expression): PostfixUnaryExpression = js.native
  
  def createPostfixIncrement(operand: Expression): PostfixUnaryExpression = js.native
  
  def createPostfixUnaryExpression(operand: Expression, operator: PostfixUnaryOperator): PostfixUnaryExpression = js.native
  
  def createPrefixDecrement(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixIncrement(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixMinus(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixPlus(operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrefixUnaryExpression(operator: PrefixUnaryOperator, operand: Expression): PrefixUnaryExpression = js.native
  
  def createPrivateIdentifier(text: java.lang.String): PrivateIdentifier = js.native
  
  def createPropertyAccessChain(expression: Expression, questionDotToken: Unit, name: java.lang.String): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: Unit, name: MemberName): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: java.lang.String): PropertyAccessChain = js.native
  def createPropertyAccessChain(expression: Expression, questionDotToken: QuestionDotToken, name: MemberName): PropertyAccessChain = js.native
  
  def createPropertyAccessExpression(expression: Expression, name: java.lang.String): PropertyAccessExpression = js.native
  def createPropertyAccessExpression(expression: Expression, name: MemberName): PropertyAccessExpression = js.native
  
  def createPropertyAssignment(name: java.lang.String, initializer: Expression): PropertyAssignment = js.native
  def createPropertyAssignment(name: PropertyName, initializer: Expression): PropertyAssignment = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createPropertyDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: js.Array[ModifierLike], name: java.lang.String): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: js.Array[ModifierLike], name: PropertyName): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: Unit, name: java.lang.String): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: Unit, name: java.lang.String, questionOrExclamationToken: Unit, `type`: TypeNode): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: Unit, name: PropertyName): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: Unit, name: PropertyName, questionOrExclamationToken: ExclamationToken | QuestionToken): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyDeclaration(modifiers: Unit, name: PropertyName, questionOrExclamationToken: Unit, `type`: TypeNode): PropertyDeclaration = js.native
  def createPropertyDeclaration(
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  
  def createPropertySignature(modifiers: js.Array[Modifier], name: java.lang.String): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: java.lang.String, questionToken: Unit, `type`: TypeNode): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: java.lang.String, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: Unit, `type`: TypeNode): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(modifiers: js.Array[Modifier], name: PropertyName, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: java.lang.String): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: java.lang.String, questionToken: Unit, `type`: TypeNode): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: java.lang.String, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: java.lang.String, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: PropertyName): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: PropertyName, questionToken: Unit, `type`: TypeNode): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
  def createPropertySignature(modifiers: Unit, name: PropertyName, questionToken: QuestionToken, `type`: TypeNode): PropertySignature = js.native
  
  def createQualifiedName(left: EntityName, right: java.lang.String): QualifiedName = js.native
  def createQualifiedName(left: EntityName, right: Identifier): QualifiedName = js.native
  
  def createRegularExpressionLiteral(text: java.lang.String): RegularExpressionLiteral = js.native
  
  def createRestTypeNode(`type`: TypeNode): RestTypeNode = js.native
  
  def createReturnStatement(): ReturnStatement = js.native
  def createReturnStatement(expression: Expression): ReturnStatement = js.native
  
  def createRightShift(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createSemicolonClassElement(): SemicolonClassElement = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(decorators: Unit, modifiers: Unit, name: PropertyName, parameters: js.Array[ParameterDeclaration]): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(modifiers: js.Array[ModifierLike], name: PropertyName, parameters: js.Array[ParameterDeclaration]): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(modifiers: Unit, name: java.lang.String, parameters: js.Array[ParameterDeclaration]): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(modifiers: Unit, name: java.lang.String, parameters: js.Array[ParameterDeclaration], body: Block): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(modifiers: Unit, name: PropertyName, parameters: js.Array[ParameterDeclaration]): SetAccessorDeclaration = js.native
  def createSetAccessorDeclaration(modifiers: Unit, name: PropertyName, parameters: js.Array[ParameterDeclaration], body: Block): SetAccessorDeclaration = js.native
  
  def createShorthandPropertyAssignment(name: java.lang.String): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: java.lang.String, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: Identifier): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  
  def createSourceFile(statements: js.Array[Statement], endOfFileToken: EndOfFileToken, flags: NodeFlags): SourceFile = js.native
  
  def createSpreadAssignment(expression: Expression): SpreadAssignment = js.native
  
  def createSpreadElement(expression: Expression): SpreadElement = js.native
  
  def createStrictEquality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createStrictInequality(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createStringLiteral(text: java.lang.String): StringLiteral = js.native
  def createStringLiteral(text: java.lang.String, isSingleQuote: Boolean): StringLiteral = js.native
  
  def createStringLiteralFromNode(sourceNode: PropertyNameLiteral): StringLiteral = js.native
  def createStringLiteralFromNode(sourceNode: PropertyNameLiteral, isSingleQuote: Boolean): StringLiteral = js.native
  
  def createSubtract(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createSuper(): SuperExpression = js.native
  
  def createSwitchStatement(expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
  
  def createTaggedTemplateExpression(tag: Expression, typeArguments: js.Array[TypeNode], template: TemplateLiteral): TaggedTemplateExpression = js.native
  def createTaggedTemplateExpression(tag: Expression, typeArguments: Unit, template: TemplateLiteral): TaggedTemplateExpression = js.native
  
  /**
    * Create a unique temporary variable.
    * @param recordTempVariable An optional callback used to record the temporary variable name. This
    * should usually be a reference to `hoistVariableDeclaration` from a `TransformationContext`, but
    * can be `undefined` if you plan to record the temporary variable manually.
    * @param reservedInNestedScopes When `true`, reserves the temporary variable name in all nested scopes
    * during emit so that the variable can be referenced in a nested function body. This is an alternative to
    * setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
    */
  def createTempVariable(): Identifier = js.native
  def createTempVariable(recordTempVariable: js.Function1[/* node */ Identifier, Unit]): Identifier = js.native
  def createTempVariable(recordTempVariable: js.Function1[/* node */ Identifier, Unit], reservedInNestedScopes: Boolean): Identifier = js.native
  def createTempVariable(recordTempVariable: Unit, reservedInNestedScopes: Boolean): Identifier = js.native
  
  def createTemplateExpression(head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
  
  def createTemplateHead(text: java.lang.String): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String, rawText: java.lang.String): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateHead = js.native
  def createTemplateHead(text: java.lang.String, rawText: Unit, templateFlags: TokenFlags): TemplateHead = js.native
  def createTemplateHead(text: Unit, rawText: java.lang.String): TemplateHead = js.native
  def createTemplateHead(text: Unit, rawText: java.lang.String, templateFlags: TokenFlags): TemplateHead = js.native
  
  def createTemplateLiteralType(head: TemplateHead, templateSpans: js.Array[TemplateLiteralTypeSpan]): TemplateLiteralTypeNode = js.native
  
  def createTemplateLiteralTypeSpan(`type`: TypeNode, literal: TemplateMiddle): TemplateLiteralTypeSpan = js.native
  def createTemplateLiteralTypeSpan(`type`: TypeNode, literal: TemplateTail): TemplateLiteralTypeSpan = js.native
  
  def createTemplateMiddle(text: java.lang.String): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String, rawText: java.lang.String): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateMiddle = js.native
  def createTemplateMiddle(text: java.lang.String, rawText: Unit, templateFlags: TokenFlags): TemplateMiddle = js.native
  def createTemplateMiddle(text: Unit, rawText: java.lang.String): TemplateMiddle = js.native
  def createTemplateMiddle(text: Unit, rawText: java.lang.String, templateFlags: TokenFlags): TemplateMiddle = js.native
  
  def createTemplateSpan(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def createTemplateSpan(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
  
  def createTemplateTail(text: java.lang.String): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String, rawText: java.lang.String): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String, rawText: java.lang.String, templateFlags: TokenFlags): TemplateTail = js.native
  def createTemplateTail(text: java.lang.String, rawText: Unit, templateFlags: TokenFlags): TemplateTail = js.native
  def createTemplateTail(text: Unit, rawText: java.lang.String): TemplateTail = js.native
  def createTemplateTail(text: Unit, rawText: java.lang.String, templateFlags: TokenFlags): TemplateTail = js.native
  
  def createThis(): ThisExpression = js.native
  
  def createThisTypeNode(): ThisTypeNode = js.native
  
  def createThrowStatement(expression: Expression): ThrowStatement = js.native
  
  def createToken(token: FalseKeyword): FalseLiteral = js.native
  def createToken(token: NullKeyword): NullLiteral = js.native
  def createToken(token: SuperKeyword): SuperExpression = js.native
  def createToken(token: ThisKeyword): ThisExpression = js.native
  def createToken(token: TrueKeyword): TrueLiteral = js.native
  def createToken[TKind /* <: PunctuationSyntaxKind */](token: TKind): PunctuationToken[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_KeywordToken[TKind /* <: KeywordSyntaxKind */](token: TKind): KeywordToken[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_KeywordTypeNode[TKind /* <: KeywordTypeSyntaxKind */](token: TKind): KeywordTypeNode[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_ModifierToken[TKind /* <: ModifierSyntaxKind */](token: TKind): ModifierToken[TKind] = js.native
  @JSName("createToken")
  def createToken_TKind_Token[TKind /* <: Unknown | typings.typescript.mod.SyntaxKind.EndOfFileToken */](token: TKind): Token[TKind] = js.native
  
  def createTrue(): TrueLiteral = js.native
  
  def createTryStatement(tryBlock: Block): TryStatement = js.native
  def createTryStatement(tryBlock: Block, catchClause: Unit, finallyBlock: Block): TryStatement = js.native
  def createTryStatement(tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def createTryStatement(tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
  
  def createTupleTypeNode(elements: js.Array[TypeNode | NamedTupleMember]): TupleTypeNode = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(decorators: Unit, modifiers: Unit, name: java.lang.String, typeParameters: Unit, `type`: TypeNode): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(decorators: Unit, modifiers: Unit, name: Identifier, typeParameters: Unit, `type`: TypeNode): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(modifiers: js.Array[Modifier], name: java.lang.String, typeParameters: Unit, `type`: TypeNode): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(modifiers: js.Array[Modifier], name: Identifier, typeParameters: Unit, `type`: TypeNode): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    modifiers: Unit,
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(modifiers: Unit, name: java.lang.String, typeParameters: Unit, `type`: TypeNode): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(modifiers: Unit, name: Identifier, typeParameters: Unit, `type`: TypeNode): TypeAliasDeclaration = js.native
  
  def createTypeAssertion(`type`: TypeNode, expression: Expression): TypeAssertion = js.native
  
  def createTypeLiteralNode(): TypeLiteralNode = js.native
  def createTypeLiteralNode(members: js.Array[TypeElement]): TypeLiteralNode = js.native
  
  def createTypeOfExpression(expression: Expression): TypeOfExpression = js.native
  
  def createTypeOperatorNode(operator: KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(operator: typings.typescript.mod.SyntaxKind.ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(operator: UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: java.lang.String): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: java.lang.String, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: java.lang.String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: java.lang.String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: Identifier): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: Identifier, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: js.Array[Modifier], name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: java.lang.String): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: java.lang.String, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: java.lang.String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: java.lang.String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: Identifier): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: Identifier, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(modifiers: Unit, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  /** @deprecated Use the overload that accepts 'modifiers' */
  def createTypeParameterDeclaration(name: java.lang.String): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  
  def createTypePredicateNode(assertsModifier: Unit, parameterName: java.lang.String): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: Unit, parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: Unit, parameterName: Identifier): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: Unit, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: Unit, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: Unit, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: java.lang.String): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  
  def createTypeQueryNode(exprName: EntityName): TypeQueryNode = js.native
  def createTypeQueryNode(exprName: EntityName, typeArguments: js.Array[TypeNode]): TypeQueryNode = js.native
  
  def createTypeReferenceNode(typeName: java.lang.String): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: EntityName): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: EntityName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  
  def createUnionTypeNode(types: js.Array[TypeNode]): UnionTypeNode = js.native
  
  /** Create a unique name based on the supplied text. */
  def createUniqueName(text: java.lang.String): Identifier = js.native
  def createUniqueName(text: java.lang.String, flags: GeneratedIdentifierFlags): Identifier = js.native
  
  def createUnsignedRightShift(left: Expression, right: Expression): BinaryExpression = js.native
  
  def createVariableDeclaration(name: java.lang.String): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: Unit, `type`: Unit, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: Unit, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: Unit, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: ExclamationToken): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: ExclamationToken, `type`: Unit, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    exclamationToken: ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: Unit, `type`: Unit, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: Unit, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: Unit, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken, `type`: Unit, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  
  def createVariableDeclarationList(declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  def createVariableDeclarationList(declarations: js.Array[VariableDeclaration], flags: NodeFlags): VariableDeclarationList = js.native
  
  def createVariableStatement(modifiers: js.Array[Modifier], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def createVariableStatement(modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
  def createVariableStatement(modifiers: Unit, declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def createVariableStatement(modifiers: Unit, declarationList: VariableDeclarationList): VariableStatement = js.native
  
  def createVoidExpression(expression: Expression): VoidExpression = js.native
  
  def createVoidZero(): VoidExpression = js.native
  
  def createWhileStatement(expression: Expression, statement: Statement): WhileStatement = js.native
  
  def createWithStatement(expression: Expression, statement: Statement): WithStatement = js.native
  
  def createYieldExpression(): YieldExpression = js.native
  def createYieldExpression(asteriskToken: Unit, expression: Expression): YieldExpression = js.native
  def createYieldExpression(asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
  
  /** Create a unique name generated for a node. */
  def getGeneratedNameForNode(): Identifier = js.native
  def getGeneratedNameForNode(node: Unit, flags: GeneratedIdentifierFlags): Identifier = js.native
  def getGeneratedNameForNode(node: Node): Identifier = js.native
  def getGeneratedNameForNode(node: Node, flags: GeneratedIdentifierFlags): Identifier = js.native
  
  def restoreOuterExpressions(outerExpression: Unit, innerExpression: Expression): Expression = js.native
  def restoreOuterExpressions(outerExpression: Unit, innerExpression: Expression, kinds: OuterExpressionKinds): Expression = js.native
  def restoreOuterExpressions(outerExpression: Expression, innerExpression: Expression): Expression = js.native
  def restoreOuterExpressions(outerExpression: Expression, innerExpression: Expression, kinds: OuterExpressionKinds): Expression = js.native
  
  def updateArrayBindingPattern(node: ArrayBindingPattern, elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
  
  def updateArrayLiteralExpression(node: ArrayLiteralExpression, elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  
  def updateArrayTypeNode(node: ArrayTypeNode, elementType: TypeNode): ArrayTypeNode = js.native
  
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  
  def updateAsExpression(node: AsExpression, expression: Expression, `type`: TypeNode): AsExpression = js.native
  
  def updateAssertClause(node: AssertClause, elements: NodeArray[AssertEntry]): AssertClause = js.native
  def updateAssertClause(node: AssertClause, elements: NodeArray[AssertEntry], multiLine: Boolean): AssertClause = js.native
  
  def updateAssertEntry(node: AssertEntry, name: AssertionKey, value: Expression): AssertEntry = js.native
  
  def updateAwaitExpression(node: AwaitExpression, expression: Expression): AwaitExpression = js.native
  
  def updateBinaryExpression(node: BinaryExpression, left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def updateBinaryExpression(node: BinaryExpression, left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
  
  def updateBindingElement(node: BindingElement, dotDotDotToken: Unit, propertyName: Unit, name: BindingName): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: Unit,
    propertyName: Unit,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBindingElement(node: BindingElement, dotDotDotToken: Unit, propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: Unit,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBindingElement(node: BindingElement, dotDotDotToken: DotDotDotToken, propertyName: Unit, name: BindingName): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: Unit,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  
  def updateBlock(node: Block, statements: js.Array[Statement]): Block = js.native
  
  def updateBreakStatement(node: BreakStatement): BreakStatement = js.native
  def updateBreakStatement(node: BreakStatement, label: Identifier): BreakStatement = js.native
  
  def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
  
  def updateCallChain(
    node: CallChain,
    expression: Expression,
    questionDotToken: Unit,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def updateCallChain(
    node: CallChain,
    expression: Expression,
    questionDotToken: Unit,
    typeArguments: Unit,
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def updateCallChain(
    node: CallChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  def updateCallChain(
    node: CallChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    typeArguments: Unit,
    argumentsArray: js.Array[Expression]
  ): CallChain = js.native
  
  def updateCallExpression(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def updateCallExpression(
    node: CallExpression,
    expression: Expression,
    typeArguments: Unit,
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  
  def updateCallSignature(node: CallSignatureDeclaration, typeParameters: Unit, parameters: NodeArray[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  
  def updateCaseBlock(node: CaseBlock, clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
  
  def updateCaseClause(node: CaseClause, expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
  
  def updateCatchClause(node: CatchClause, variableDeclaration: Unit, block: Block): CatchClause = js.native
  def updateCatchClause(node: CatchClause, variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
  
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[ModifierLike],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Unit,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  
  def updateClassStaticBlockDeclaration(node: ClassStaticBlockDeclaration, body: Block): ClassStaticBlockDeclaration = js.native
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateClassStaticBlockDeclaration(
    node: ClassStaticBlockDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    body: Block
  ): ClassStaticBlockDeclaration = js.native
  def updateClassStaticBlockDeclaration(node: ClassStaticBlockDeclaration, decorators: js.Array[Decorator], modifiers: Unit, body: Block): ClassStaticBlockDeclaration = js.native
  def updateClassStaticBlockDeclaration(node: ClassStaticBlockDeclaration, decorators: Unit, modifiers: js.Array[Modifier], body: Block): ClassStaticBlockDeclaration = js.native
  def updateClassStaticBlockDeclaration(node: ClassStaticBlockDeclaration, decorators: Unit, modifiers: Unit, body: Block): ClassStaticBlockDeclaration = js.native
  
  def updateCommaListExpression(node: CommaListExpression, elements: js.Array[Expression]): CommaListExpression = js.native
  
  def updateComputedPropertyName(node: ComputedPropertyName, expression: Expression): ComputedPropertyName = js.native
  
  def updateConditionalExpression(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  
  def updateConditionalTypeNode(
    node: ConditionalTypeNode,
    checkType: TypeNode,
    extendsType: TypeNode,
    trueType: TypeNode,
    falseType: TypeNode
  ): ConditionalTypeNode = js.native
  
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  
  /**
    * @deprecated This node does not support Decorators. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(node: ConstructorDeclaration, modifiers: Unit, parameters: js.Array[ParameterDeclaration]): ConstructorDeclaration = js.native
  def updateConstructorDeclaration(
    node: ConstructorDeclaration,
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    modifiers: js.Array[Modifier],
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    modifiers: js.Array[Modifier],
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    modifiers: Unit,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    modifiers: Unit,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  /** @deprecated Use the overload that accepts 'modifiers' */
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  
  def updateContinueStatement(node: ContinueStatement): ContinueStatement = js.native
  def updateContinueStatement(node: ContinueStatement, label: Identifier): ContinueStatement = js.native
  
  def updateDecorator(node: Decorator, expression: Expression): Decorator = js.native
  
  def updateDefaultClause(node: DefaultClause, statements: js.Array[Statement]): DefaultClause = js.native
  
  def updateDeleteExpression(node: DeleteExpression, expression: Expression): DeleteExpression = js.native
  
  def updateDoStatement(node: DoStatement, statement: Statement, expression: Expression): DoStatement = js.native
  
  def updateElementAccessChain(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: Unit,
    argumentExpression: Expression
  ): ElementAccessChain = js.native
  def updateElementAccessChain(
    node: ElementAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    argumentExpression: Expression
  ): ElementAccessChain = js.native
  
  def updateElementAccessExpression(node: ElementAccessExpression, expression: Expression, argumentExpression: Expression): ElementAccessExpression = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(node: EnumDeclaration, modifiers: Unit, name: Identifier, members: js.Array[EnumMember]): EnumDeclaration = js.native
  
  def updateEnumMember(node: EnumMember, name: PropertyName): EnumMember = js.native
  def updateEnumMember(node: EnumMember, name: PropertyName, initializer: Expression): EnumMember = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateExportAssignment(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
  def updateExportAssignment(node: ExportAssignment, decorators: js.Array[Decorator], modifiers: Unit, expression: Expression): ExportAssignment = js.native
  def updateExportAssignment(node: ExportAssignment, decorators: Unit, modifiers: js.Array[Modifier], expression: Expression): ExportAssignment = js.native
  def updateExportAssignment(node: ExportAssignment, decorators: Unit, modifiers: Unit, expression: Expression): ExportAssignment = js.native
  def updateExportAssignment(node: ExportAssignment, modifiers: js.Array[Modifier], expression: Expression): ExportAssignment = js.native
  def updateExportAssignment(node: ExportAssignment, modifiers: Unit, expression: Expression): ExportAssignment = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, decorators: js.Array[Decorator], modifiers: Unit, isTypeOnly: Boolean): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, decorators: Unit, modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, decorators: Unit, modifiers: Unit, isTypeOnly: Boolean): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, modifiers: js.Array[Modifier], isTypeOnly: Boolean): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, modifiers: Unit, isTypeOnly: Boolean): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, modifiers: Unit, isTypeOnly: Boolean, exportClause: NamedExportBindings): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Unit,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    exportClause: NamedExportBindings,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ExportDeclaration = js.native
  
  def updateExportSpecifier(node: ExportSpecifier, isTypeOnly: Boolean, propertyName: Unit, name: Identifier): ExportSpecifier = js.native
  def updateExportSpecifier(node: ExportSpecifier, isTypeOnly: Boolean, propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
  
  def updateExpressionStatement(node: ExpressionStatement, expression: Expression): ExpressionStatement = js.native
  
  def updateExpressionWithTypeArguments(node: ExpressionWithTypeArguments, expression: Expression): ExpressionWithTypeArguments = js.native
  def updateExpressionWithTypeArguments(node: ExpressionWithTypeArguments, expression: Expression, typeArguments: js.Array[TypeNode]): ExpressionWithTypeArguments = js.native
  
  def updateExternalModuleReference(node: ExternalModuleReference, expression: Expression): ExternalModuleReference = js.native
  
  def updateForInStatement(node: ForInStatement, initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
  
  def updateForOfStatement(
    node: ForOfStatement,
    awaitModifier: Unit,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def updateForOfStatement(
    node: ForOfStatement,
    awaitModifier: AwaitKeyword,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  
  def updateForStatement(node: ForStatement, initializer: Unit, condition: Unit, incrementor: Unit, statement: Statement): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: Unit,
    condition: Unit,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: Unit,
    condition: Expression,
    incrementor: Unit,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: Unit,
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Unit,
    incrementor: Unit,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Unit,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: Unit,
    statement: Statement
  ): ForStatement = js.native
  def updateForStatement(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateFunctionDeclaration(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: FunctionDeclaration,
    modifiers: js.UndefOr[js.Array[ModifierLike]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): FunctionDeclaration = js.native
  
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.Array[Modifier],
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: Unit,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Unit,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: Unit,
    asteriskToken: AsteriskToken,
    name: Identifier,
    typeParameters: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionExpression = js.native
  
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: Unit,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessorDeclaration(
    node: GetAccessorDeclaration,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  
  def updateHeritageClause(node: HeritageClause, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  
  def updateIfStatement(node: IfStatement, expression: Expression, thenStatement: Statement): IfStatement = js.native
  def updateIfStatement(node: IfStatement, expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
  
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean): ImportClause = js.native
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean, name: Unit, namedBindings: NamedImportBindings): ImportClause = js.native
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean, name: Identifier): ImportClause = js.native
  def updateImportClause(node: ImportClause, isTypeOnly: Boolean, name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: Unit,
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    modifiers: js.Array[Modifier],
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(node: ImportDeclaration, modifiers: Unit, importClause: Unit, moduleSpecifier: Expression): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    modifiers: Unit,
    importClause: Unit,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  def updateImportDeclaration(node: ImportDeclaration, modifiers: Unit, importClause: ImportClause, moduleSpecifier: Expression): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    modifiers: Unit,
    importClause: ImportClause,
    moduleSpecifier: Expression,
    assertClause: AssertClause
  ): ImportDeclaration = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: Unit,
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    modifiers: js.Array[Modifier],
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    modifiers: Unit,
    isTypeOnly: Boolean,
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  
  def updateImportSpecifier(node: ImportSpecifier, isTypeOnly: Boolean, propertyName: Unit, name: Identifier): ImportSpecifier = js.native
  def updateImportSpecifier(node: ImportSpecifier, isTypeOnly: Boolean, propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
  
  def updateImportTypeAssertionContainer(node: ImportTypeAssertionContainer, clause: AssertClause): ImportTypeAssertionContainer = js.native
  def updateImportTypeAssertionContainer(node: ImportTypeAssertionContainer, clause: AssertClause, multiLine: Boolean): ImportTypeAssertionContainer = js.native
  
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: Unit,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: Unit,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: Unit,
    qualifier: Unit,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, assertions: Unit, qualifier: EntityName): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: Unit,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: Unit,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: Unit,
    qualifier: EntityName,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, assertions: ImportTypeAssertionContainer): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: Unit,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode]
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    assertions: ImportTypeAssertionContainer,
    qualifier: EntityName,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: Unit, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: Unit,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: Unit, typeArguments: Unit, isTypeOf: Boolean): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: Unit,
    isTypeOf: Boolean
  ): ImportTypeNode = js.native
  
  /**
    * @deprecated Decorators and modifiers are no longer supported for this function. Callers should use an overload that does not accept the `decorators` and `modifiers` parameters.
    */
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: Unit,
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    modifiers: Unit,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  
  def updateIndexedAccessTypeNode(node: IndexedAccessTypeNode, objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
  
  def updateInferTypeNode(node: InferTypeNode, typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    heritageClauses: Unit,
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  
  def updateIntersectionTypeNode(node: IntersectionTypeNode, types: NodeArray[TypeNode]): IntersectionTypeNode = js.native
  
  def updateJSDocAugmentsTag(node: JSDocAugmentsTag, tagName: Unit, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(
    node: JSDocAugmentsTag,
    tagName: Unit,
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(
    node: JSDocAugmentsTag,
    tagName: Unit,
    className: ExpressionWithTypeArgumen,
    comment: NodeArray[JSDocComment]
  ): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(node: JSDocAugmentsTag, tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(
    node: JSDocAugmentsTag,
    tagName: Identifier,
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocAugmentsTag = js.native
  def updateJSDocAugmentsTag(
    node: JSDocAugmentsTag,
    tagName: Identifier,
    className: ExpressionWithTypeArgumen,
    comment: NodeArray[JSDocComment]
  ): JSDocAugmentsTag = js.native
  
  def updateJSDocAuthorTag(node: JSDocAuthorTag): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Unit, comment: java.lang.String): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Unit, comment: NodeArray[JSDocComment]): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Identifier): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Identifier, comment: java.lang.String): JSDocAuthorTag = js.native
  def updateJSDocAuthorTag(node: JSDocAuthorTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocAuthorTag = js.native
  
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: Unit, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: Unit,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: Unit, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Unit,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: Identifier, typeExpression: JSDocSignature): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Unit,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Unit,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(node: JSDocCallbackTag, tagName: Identifier, typeExpression: JSDocSignature, fullName: Identifier): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: Identifier,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: java.lang.String
  ): JSDocCallbackTag = js.native
  def updateJSDocCallbackTag(
    node: JSDocCallbackTag,
    tagName: Identifier,
    typeExpression: JSDocSignature,
    fullName: JSDocNamespaceDeclaration,
    comment: NodeArray[JSDocComment]
  ): JSDocCallbackTag = js.native
  
  def updateJSDocClassTag(node: JSDocClassTag): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Unit, comment: java.lang.String): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Unit, comment: NodeArray[JSDocComment]): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier, comment: java.lang.String): JSDocClassTag = js.native
  def updateJSDocClassTag(node: JSDocClassTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocClassTag = js.native
  
  def updateJSDocComment(node: JSDoc): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: java.lang.String): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: java.lang.String, tags: js.Array[JSDocTag]): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: Unit, tags: js.Array[JSDocTag]): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: NodeArray[JSDocComment]): JSDoc = js.native
  def updateJSDocComment(node: JSDoc, comment: NodeArray[JSDocComment], tags: js.Array[JSDocTag]): JSDoc = js.native
  
  def updateJSDocDeprecatedTag(node: JSDocDeprecatedTag, tagName: Identifier): JSDocDeprecatedTag = js.native
  def updateJSDocDeprecatedTag(node: JSDocDeprecatedTag, tagName: Identifier, comment: java.lang.String): JSDocDeprecatedTag = js.native
  def updateJSDocDeprecatedTag(node: JSDocDeprecatedTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocDeprecatedTag = js.native
  
  def updateJSDocEnumTag(node: JSDocEnumTag, tagName: Unit, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def updateJSDocEnumTag(node: JSDocEnumTag, tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocEnumTag = js.native
  def updateJSDocEnumTag(
    node: JSDocEnumTag,
    tagName: Unit,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocEnumTag = js.native
  def updateJSDocEnumTag(node: JSDocEnumTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocEnumTag = js.native
  def updateJSDocEnumTag(
    node: JSDocEnumTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocEnumTag = js.native
  def updateJSDocEnumTag(
    node: JSDocEnumTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocEnumTag = js.native
  
  def updateJSDocFunctionType(node: JSDocFunctionType, parameters: js.Array[ParameterDeclaration]): JSDocFunctionType = js.native
  def updateJSDocFunctionType(node: JSDocFunctionType, parameters: js.Array[ParameterDeclaration], `type`: TypeNode): JSDocFunctionType = js.native
  
  def updateJSDocImplementsTag(node: JSDocImplementsTag, tagName: Unit, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(
    node: JSDocImplementsTag,
    tagName: Unit,
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(
    node: JSDocImplementsTag,
    tagName: Unit,
    className: ExpressionWithTypeArgumen,
    comment: NodeArray[JSDocComment]
  ): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(node: JSDocImplementsTag, tagName: Identifier, className: ExpressionWithTypeArgumen): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(
    node: JSDocImplementsTag,
    tagName: Identifier,
    className: ExpressionWithTypeArgumen,
    comment: java.lang.String
  ): JSDocImplementsTag = js.native
  def updateJSDocImplementsTag(
    node: JSDocImplementsTag,
    tagName: Identifier,
    className: ExpressionWithTypeArgumen,
    comment: NodeArray[JSDocComment]
  ): JSDocImplementsTag = js.native
  
  def updateJSDocLink(node: JSDocLink, name: Unit, text: java.lang.String): JSDocLink = js.native
  def updateJSDocLink(node: JSDocLink, name: EntityName, text: java.lang.String): JSDocLink = js.native
  def updateJSDocLink(node: JSDocLink, name: JSDocMemberName, text: java.lang.String): JSDocLink = js.native
  
  def updateJSDocLinkCode(node: JSDocLinkCode, name: Unit, text: java.lang.String): JSDocLinkCode = js.native
  def updateJSDocLinkCode(node: JSDocLinkCode, name: EntityName, text: java.lang.String): JSDocLinkCode = js.native
  def updateJSDocLinkCode(node: JSDocLinkCode, name: JSDocMemberName, text: java.lang.String): JSDocLinkCode = js.native
  
  def updateJSDocLinkPlain(node: JSDocLinkPlain, name: Unit, text: java.lang.String): JSDocLinkPlain = js.native
  def updateJSDocLinkPlain(node: JSDocLinkPlain, name: EntityName, text: java.lang.String): JSDocLinkPlain = js.native
  def updateJSDocLinkPlain(node: JSDocLinkPlain, name: JSDocMemberName, text: java.lang.String): JSDocLinkPlain = js.native
  
  def updateJSDocMemberName(node: JSDocMemberName, left: EntityName, right: Identifier): JSDocMemberName = js.native
  def updateJSDocMemberName(node: JSDocMemberName, left: JSDocMemberName, right: Identifier): JSDocMemberName = js.native
  
  def updateJSDocNameReference(node: JSDocNameReference, name: EntityName): JSDocNameReference = js.native
  def updateJSDocNameReference(node: JSDocNameReference, name: JSDocMemberName): JSDocNameReference = js.native
  
  def updateJSDocNamepathType(node: JSDocNamepathType, `type`: TypeNode): JSDocNamepathType = js.native
  
  def updateJSDocNonNullableType(node: JSDocNonNullableType, `type`: TypeNode): JSDocNonNullableType = js.native
  
  def updateJSDocNullableType(node: JSDocNullableType, `type`: TypeNode): JSDocNullableType = js.native
  
  def updateJSDocOptionalType(node: JSDocOptionalType, `type`: TypeNode): JSDocOptionalType = js.native
  
  def updateJSDocOverrideTag(node: JSDocOverrideTag, tagName: Identifier): JSDocOverrideTag = js.native
  def updateJSDocOverrideTag(node: JSDocOverrideTag, tagName: Identifier, comment: java.lang.String): JSDocOverrideTag = js.native
  def updateJSDocOverrideTag(node: JSDocOverrideTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocOverrideTag = js.native
  
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocParameterTag = js.native
  def updateJSDocParameterTag(
    node: JSDocParameterTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocParameterTag = js.native
  
  def updateJSDocPrivateTag(node: JSDocPrivateTag): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Unit, comment: java.lang.String): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Unit, comment: NodeArray[JSDocComment]): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Identifier): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Identifier, comment: java.lang.String): JSDocPrivateTag = js.native
  def updateJSDocPrivateTag(node: JSDocPrivateTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocPrivateTag = js.native
  
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Unit,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: Unit,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: java.lang.String
  ): JSDocPropertyTag = js.native
  def updateJSDocPropertyTag(
    node: JSDocPropertyTag,
    tagName: Identifier,
    name: EntityName,
    isBracketed: Boolean,
    typeExpression: JSDocTypeExpression,
    isNameFirst: Boolean,
    comment: NodeArray[JSDocComment]
  ): JSDocPropertyTag = js.native
  
  def updateJSDocProtectedTag(node: JSDocProtectedTag): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Unit, comment: java.lang.String): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Unit, comment: NodeArray[JSDocComment]): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Identifier): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Identifier, comment: java.lang.String): JSDocProtectedTag = js.native
  def updateJSDocProtectedTag(node: JSDocProtectedTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocProtectedTag = js.native
  
  def updateJSDocPublicTag(node: JSDocPublicTag): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Unit, comment: java.lang.String): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Unit, comment: NodeArray[JSDocComment]): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Identifier): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Identifier, comment: java.lang.String): JSDocPublicTag = js.native
  def updateJSDocPublicTag(node: JSDocPublicTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocPublicTag = js.native
  
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Unit, comment: java.lang.String): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Unit, comment: NodeArray[JSDocComment]): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Identifier): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Identifier, comment: java.lang.String): JSDocReadonlyTag = js.native
  def updateJSDocReadonlyTag(node: JSDocReadonlyTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocReadonlyTag = js.native
  
  def updateJSDocReturnTag(node: JSDocReturnTag): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Unit, typeExpression: Unit, comment: java.lang.String): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Unit, typeExpression: Unit, comment: NodeArray[JSDocComment]): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Unit, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: Unit,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: Unit,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Identifier): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Identifier, typeExpression: Unit, comment: java.lang.String): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Identifier, typeExpression: Unit, comment: NodeArray[JSDocComment]): JSDocReturnTag = js.native
  def updateJSDocReturnTag(node: JSDocReturnTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocReturnTag = js.native
  def updateJSDocReturnTag(
    node: JSDocReturnTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocReturnTag = js.native
  
  def updateJSDocSeeTag(node: JSDocSeeTag): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Unit, nameExpression: Unit, comment: java.lang.String): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Unit, nameExpression: Unit, comment: NodeArray[JSDocComment]): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Unit, nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Unit, nameExpression: JSDocNameReference, comment: java.lang.String): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: Unit,
    nameExpression: JSDocNameReference,
    comment: NodeArray[JSDocComment]
  ): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier, nameExpression: Unit, comment: java.lang.String): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier, nameExpression: Unit, comment: NodeArray[JSDocComment]): JSDocSeeTag = js.native
  def updateJSDocSeeTag(node: JSDocSeeTag, tagName: Identifier, nameExpression: JSDocNameReference): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: Identifier,
    nameExpression: JSDocNameReference,
    comment: java.lang.String
  ): JSDocSeeTag = js.native
  def updateJSDocSeeTag(
    node: JSDocSeeTag,
    tagName: Identifier,
    nameExpression: JSDocNameReference,
    comment: NodeArray[JSDocComment]
  ): JSDocSeeTag = js.native
  
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag]
  ): JSDocSignature = js.native
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: js.Array[JSDocTemplateTag],
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  def updateJSDocSignature(node: JSDocSignature, typeParameters: Unit, parameters: js.Array[JSDocParameterTag]): JSDocSignature = js.native
  def updateJSDocSignature(
    node: JSDocSignature,
    typeParameters: Unit,
    parameters: js.Array[JSDocParameterTag],
    `type`: JSDocReturnTag
  ): JSDocSignature = js.native
  
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Unit,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Unit,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Unit,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Unit,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Unit,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Unit,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: Unit,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration]
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: java.lang.String
  ): JSDocTemplateTag = js.native
  def updateJSDocTemplateTag(
    node: JSDocTemplateTag,
    tagName: Identifier,
    constraint: JSDocTypeExpression,
    typeParameters: js.Array[TypeParameterDeclaration],
    comment: NodeArray[JSDocComment]
  ): JSDocTemplateTag = js.native
  
  def updateJSDocText(node: JSDocText, text: java.lang.String): JSDocText = js.native
  
  def updateJSDocThisTag(node: JSDocThisTag): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Unit, typeExpression: Unit, comment: java.lang.String): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Unit, typeExpression: Unit, comment: NodeArray[JSDocComment]): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Unit, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: Unit,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Identifier): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Identifier, typeExpression: Unit, comment: java.lang.String): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Identifier, typeExpression: Unit, comment: NodeArray[JSDocComment]): JSDocThisTag = js.native
  def updateJSDocThisTag(node: JSDocThisTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocThisTag = js.native
  def updateJSDocThisTag(
    node: JSDocThisTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocThisTag = js.native
  
  def updateJSDocTypeExpression(node: JSDocTypeExpression, `type`: TypeNode): JSDocTypeExpression = js.native
  
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral): JSDocTypeLiteral = js.native
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral, jsDocPropertyTags: js.Array[JSDocPropertyLikeTag]): JSDocTypeLiteral = js.native
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral, jsDocPropertyTags: js.Array[JSDocPropertyLikeTag], isArrayType: Boolean): JSDocTypeLiteral = js.native
  def updateJSDocTypeLiteral(node: JSDocTypeLiteral, jsDocPropertyTags: Unit, isArrayType: Boolean): JSDocTypeLiteral = js.native
  
  def updateJSDocTypeTag(node: JSDocTypeTag, tagName: Unit, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def updateJSDocTypeTag(node: JSDocTypeTag, tagName: Unit, typeExpression: JSDocTypeExpression, comment: java.lang.String): JSDocTypeTag = js.native
  def updateJSDocTypeTag(
    node: JSDocTypeTag,
    tagName: Unit,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocTypeTag = js.native
  def updateJSDocTypeTag(node: JSDocTypeTag, tagName: Identifier, typeExpression: JSDocTypeExpression): JSDocTypeTag = js.native
  def updateJSDocTypeTag(
    node: JSDocTypeTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: java.lang.String
  ): JSDocTypeTag = js.native
  def updateJSDocTypeTag(
    node: JSDocTypeTag,
    tagName: Identifier,
    typeExpression: JSDocTypeExpression,
    comment: NodeArray[JSDocComment]
  ): JSDocTypeTag = js.native
  
  def updateJSDocTypedefTag(
    node: JSDocTypedefTag,
    tagName: js.UndefOr[Identifier],
    typeExpression: js.UndefOr[JSDocTypeExpression | JSDocTypeLiteral],
    fullName: js.UndefOr[Identifier | JSDocNamespaceDeclaration],
    comment: js.UndefOr[java.lang.String | NodeArray[JSDocComment]]
  ): JSDocTypedefTag = js.native
  
  def updateJSDocUnknownTag(node: JSDocUnknownTag, tagName: Identifier): JSDocUnknownTag = js.native
  def updateJSDocUnknownTag(node: JSDocUnknownTag, tagName: Identifier, comment: java.lang.String): JSDocUnknownTag = js.native
  def updateJSDocUnknownTag(node: JSDocUnknownTag, tagName: Identifier, comment: NodeArray[JSDocComment]): JSDocUnknownTag = js.native
  
  def updateJSDocVariadicType(node: JSDocVariadicType, `type`: TypeNode): JSDocVariadicType = js.native
  
  def updateJsxAttribute(node: JsxAttribute, name: Identifier): JsxAttribute = js.native
  def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: JsxAttributeValue): JsxAttribute = js.native
  
  def updateJsxAttributes(node: JsxAttributes, properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
  
  def updateJsxClosingElement(node: JsxClosingElement, tagName: JsxTagNameExpression): JsxClosingElement = js.native
  
  def updateJsxElement(
    node: JsxElement,
    openingElement: JsxOpeningElement,
    children: js.Array[JsxChild],
    closingElement: JsxClosingElement
  ): JsxElement = js.native
  
  def updateJsxExpression(node: JsxExpression): JsxExpression = js.native
  def updateJsxExpression(node: JsxExpression, expression: Expression): JsxExpression = js.native
  
  def updateJsxFragment(
    node: JsxFragment,
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
  
  def updateJsxOpeningElement(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
  def updateJsxOpeningElement(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: Unit,
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
  
  def updateJsxSelfClosingElement(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  def updateJsxSelfClosingElement(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: Unit,
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  
  def updateJsxSpreadAttribute(node: JsxSpreadAttribute, expression: Expression): JsxSpreadAttribute = js.native
  
  def updateJsxText(node: JsxText, text: java.lang.String): JsxText = js.native
  def updateJsxText(node: JsxText, text: java.lang.String, containsOnlyTriviaWhiteSpaces: Boolean): JsxText = js.native
  
  def updateLabeledStatement(node: LabeledStatement, label: Identifier, statement: Statement): LabeledStatement = js.native
  
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: BooleanLiteral): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: LiteralExpression): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: NullLiteral): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  
  def updateMappedTypeNode(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyKeyword | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    nameType: js.UndefOr[TypeNode],
    questionToken: js.UndefOr[QuestionToken | PlusToken | MinusToken],
    `type`: js.UndefOr[TypeNode],
    members: js.UndefOr[NodeArray[TypeElement]]
  ): MappedTypeNode = js.native
  
  def updateMetaProperty(node: MetaProperty, name: Identifier): MetaProperty = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateMethodDeclaration(
    node: MethodDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
  def updateMethodDeclaration(
    node: MethodDeclaration,
    modifiers: js.UndefOr[js.Array[ModifierLike]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: js.UndefOr[Block]
  ): MethodDeclaration = js.native
  
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: Unit,
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): MethodSignature = js.native
  
  def updateModuleBlock(node: ModuleBlock, statements: js.Array[Statement]): ModuleBlock = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, decorators: js.Array[Decorator], modifiers: Unit, name: ModuleName): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, decorators: Unit, modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, decorators: Unit, modifiers: Unit, name: ModuleName): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, decorators: Unit, modifiers: Unit, name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, modifiers: Unit, name: ModuleName): ModuleDeclaration = js.native
  def updateModuleDeclaration(node: ModuleDeclaration, modifiers: Unit, name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  
  def updateNamedExports(node: NamedExports, elements: js.Array[ExportSpecifier]): NamedExports = js.native
  
  def updateNamedImports(node: NamedImports, elements: js.Array[ImportSpecifier]): NamedImports = js.native
  
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: Unit,
    name: Identifier,
    questionToken: Unit,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: Unit,
    name: Identifier,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: DotDotDotToken,
    name: Identifier,
    questionToken: Unit,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  def updateNamedTupleMember(
    node: NamedTupleMember,
    dotDotDotToken: DotDotDotToken,
    name: Identifier,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): NamedTupleMember = js.native
  
  def updateNamespaceExport(node: NamespaceExport, name: Identifier): NamespaceExport = js.native
  
  def updateNamespaceExportDeclaration(node: NamespaceExportDeclaration, name: Identifier): NamespaceExportDeclaration = js.native
  
  def updateNamespaceImport(node: NamespaceImport, name: Identifier): NamespaceImport = js.native
  
  def updateNewExpression(node: NewExpression, expression: Expression): NewExpression = js.native
  def updateNewExpression(node: NewExpression, expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def updateNewExpression(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def updateNewExpression(
    node: NewExpression,
    expression: Expression,
    typeArguments: Unit,
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  
  def updateNonNullChain(node: NonNullChain, expression: Expression): NonNullChain = js.native
  
  def updateNonNullExpression(node: NonNullExpression, expression: Expression): NonNullExpression = js.native
  
  def updateObjectBindingPattern(node: ObjectBindingPattern, elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
  
  def updateObjectLiteralExpression(node: ObjectLiteralExpression, properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  
  def updateOptionalTypeNode(node: OptionalTypeNode, `type`: TypeNode): OptionalTypeNode = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateParameterDeclaration(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
  def updateParameterDeclaration(
    node: ParameterDeclaration,
    modifiers: js.UndefOr[js.Array[ModifierLike]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: js.UndefOr[QuestionToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): ParameterDeclaration = js.native
  
  def updateParenthesizedExpression(node: ParenthesizedExpression, expression: Expression): ParenthesizedExpression = js.native
  
  def updateParenthesizedType(node: ParenthesizedTypeNode, `type`: TypeNode): ParenthesizedTypeNode = js.native
  
  def updatePartiallyEmittedExpression(node: PartiallyEmittedExpression, expression: Expression): PartiallyEmittedExpression = js.native
  
  def updatePostfixUnaryExpression(node: PostfixUnaryExpression, operand: Expression): PostfixUnaryExpression = js.native
  
  def updatePrefixUnaryExpression(node: PrefixUnaryExpression, operand: Expression): PrefixUnaryExpression = js.native
  
  def updatePropertyAccessChain(node: PropertyAccessChain, expression: Expression, questionDotToken: Unit, name: MemberName): PropertyAccessChain = js.native
  def updatePropertyAccessChain(
    node: PropertyAccessChain,
    expression: Expression,
    questionDotToken: QuestionDotToken,
    name: MemberName
  ): PropertyAccessChain = js.native
  
  def updatePropertyAccessExpression(node: PropertyAccessExpression, expression: Expression, name: MemberName): PropertyAccessExpression = js.native
  
  def updatePropertyAssignment(node: PropertyAssignment, name: PropertyName, initializer: Expression): PropertyAssignment = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: js.UndefOr[QuestionToken | ExclamationToken],
    `type`: js.UndefOr[TypeNode],
    initializer: js.UndefOr[Expression]
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(node: PropertyDeclaration, modifiers: js.Array[ModifierLike], name: java.lang.String): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(node: PropertyDeclaration, modifiers: js.Array[ModifierLike], name: PropertyName): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(node: PropertyDeclaration, modifiers: Unit, name: java.lang.String): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: java.lang.String,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(node: PropertyDeclaration, modifiers: Unit, name: PropertyName): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: ExclamationToken | QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updatePropertyDeclaration(
    node: PropertyDeclaration,
    modifiers: Unit,
    name: PropertyName,
    questionOrExclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  
  def updatePropertySignature(node: PropertySignature, modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: Unit,
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(node: PropertySignature, modifiers: Unit, name: PropertyName): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: Unit,
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(node: PropertySignature, modifiers: Unit, name: PropertyName, questionToken: QuestionToken): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: Unit,
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  
  def updateQualifiedName(node: QualifiedName, left: EntityName, right: Identifier): QualifiedName = js.native
  
  def updateRestTypeNode(node: RestTypeNode, `type`: TypeNode): RestTypeNode = js.native
  
  def updateReturnStatement(node: ReturnStatement): ReturnStatement = js.native
  def updateReturnStatement(node: ReturnStatement, expression: Expression): ReturnStatement = js.native
  
  /**
    * @deprecated Decorators have been combined with modifiers. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    modifiers: js.Array[ModifierLike],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessorDeclaration(
    node: SetAccessorDeclaration,
    modifiers: Unit,
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  
  def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier): ShorthandPropertyAssignment = js.native
  def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  
  def updateSourceFile(node: SourceFile, statements: js.Array[Statement]): SourceFile = js.native
  def updateSourceFile(node: SourceFile, statements: js.Array[Statement], isDeclarationFile: Boolean): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: Unit,
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: Unit,
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: Unit,
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: Unit,
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: Unit,
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Boolean,
    referencedFiles: Unit,
    typeReferences: Unit,
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: Unit,
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: Unit,
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: js.Array[FileReference],
    typeReferences: Unit,
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: Unit,
    hasNoDefaultLib: Boolean
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: Unit,
    hasNoDefaultLib: Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFile(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: Unit,
    referencedFiles: Unit,
    typeReferences: Unit,
    hasNoDefaultLib: Unit,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  
  def updateSpreadAssignment(node: SpreadAssignment, expression: Expression): SpreadAssignment = js.native
  
  def updateSpreadElement(node: SpreadElement, expression: Expression): SpreadElement = js.native
  
  def updateSwitchStatement(node: SwitchStatement, expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
  
  def updateTaggedTemplateExpression(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.Array[TypeNode],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  def updateTaggedTemplateExpression(node: TaggedTemplateExpression, tag: Expression, typeArguments: Unit, template: TemplateLiteral): TaggedTemplateExpression = js.native
  
  def updateTemplateExpression(node: TemplateExpression, head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
  
  def updateTemplateLiteralType(
    node: TemplateLiteralTypeNode,
    head: TemplateHead,
    templateSpans: js.Array[TemplateLiteralTypeSpan]
  ): TemplateLiteralTypeNode = js.native
  
  def updateTemplateLiteralTypeSpan(node: TemplateLiteralTypeSpan, `type`: TypeNode, literal: TemplateMiddle): TemplateLiteralTypeSpan = js.native
  def updateTemplateLiteralTypeSpan(node: TemplateLiteralTypeSpan, `type`: TypeNode, literal: TemplateTail): TemplateLiteralTypeSpan = js.native
  
  def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateTail): TemplateSpan = js.native
  
  def updateThrowStatement(node: ThrowStatement, expression: Expression): ThrowStatement = js.native
  
  def updateTryStatement(node: TryStatement, tryBlock: Block): TryStatement = js.native
  def updateTryStatement(node: TryStatement, tryBlock: Block, catchClause: Unit, finallyBlock: Block): TryStatement = js.native
  def updateTryStatement(node: TryStatement, tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def updateTryStatement(node: TryStatement, tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
  
  def updateTupleTypeNode(node: TupleTypeNode, elements: js.Array[TypeNode | NamedTupleMember]): TupleTypeNode = js.native
  
  /**
    * @deprecated Decorators are no longer supported for this function. Callers should use an overload that does not accept a `decorators` parameter.
    */
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: Unit,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: Unit,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    modifiers: Unit,
    name: Identifier,
    typeParameters: Unit,
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  
  def updateTypeAssertion(node: TypeAssertion, `type`: TypeNode, expression: Expression): TypeAssertion = js.native
  
  def updateTypeLiteralNode(node: TypeLiteralNode, members: NodeArray[TypeElement]): TypeLiteralNode = js.native
  
  def updateTypeOfExpression(node: TypeOfExpression, expression: Expression): TypeOfExpression = js.native
  
  def updateTypeOperatorNode(node: TypeOperatorNode, `type`: TypeNode): TypeOperatorNode = js.native
  
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, modifiers: js.Array[Modifier], name: Identifier): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    constraint: Unit,
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    constraint: TypeNode
  ): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    modifiers: js.Array[Modifier],
    name: Identifier,
    constraint: TypeNode,
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, modifiers: Unit, name: Identifier): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    modifiers: Unit,
    name: Identifier,
    constraint: Unit,
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, modifiers: Unit, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    modifiers: Unit,
    name: Identifier,
    constraint: TypeNode,
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  /** @deprecated Use the overload that accepts 'modifiers' */
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: Unit, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: Unit, parameterName: Identifier): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: Unit, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: Unit, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: Unit, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: TypePredicateNode,
    assertsModifier: AssertsKeyword,
    parameterName: Identifier,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: TypePredicateNode,
    assertsModifier: AssertsKeyword,
    parameterName: ThisTypeNode,
    `type`: TypeNode
  ): TypePredicateNode = js.native
  
  def updateTypeQueryNode(node: TypeQueryNode, exprName: EntityName): TypeQueryNode = js.native
  def updateTypeQueryNode(node: TypeQueryNode, exprName: EntityName, typeArguments: js.Array[TypeNode]): TypeQueryNode = js.native
  
  def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName): TypeReferenceNode = js.native
  def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName, typeArguments: NodeArray[TypeNode]): TypeReferenceNode = js.native
  
  def updateUnionTypeNode(node: UnionTypeNode, types: NodeArray[TypeNode]): UnionTypeNode = js.native
  
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName): VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: Unit,
    `type`: Unit,
    initializer: Expression
  ): VariableDeclaration = js.native
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, exclamationToken: Unit, `type`: TypeNode): VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: Unit,
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, exclamationToken: ExclamationToken): VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: ExclamationToken,
    `type`: Unit,
    initializer: Expression
  ): VariableDeclaration = js.native
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, exclamationToken: ExclamationToken, `type`: TypeNode): VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: VariableDeclaration,
    name: BindingName,
    exclamationToken: ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): VariableDeclaration = js.native
  
  def updateVariableDeclarationList(node: VariableDeclarationList, declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  
  def updateVariableStatement(node: VariableStatement, modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
  def updateVariableStatement(node: VariableStatement, modifiers: Unit, declarationList: VariableDeclarationList): VariableStatement = js.native
  
  def updateVoidExpression(node: VoidExpression, expression: Expression): VoidExpression = js.native
  
  def updateWhileStatement(node: WhileStatement, expression: Expression, statement: Statement): WhileStatement = js.native
  
  def updateWithStatement(node: WithStatement, expression: Expression, statement: Statement): WithStatement = js.native
  
  def updateYieldExpression(node: YieldExpression): YieldExpression = js.native
  def updateYieldExpression(node: YieldExpression, asteriskToken: Unit, expression: Expression): YieldExpression = js.native
  def updateYieldExpression(node: YieldExpression, asteriskToken: AsteriskToken): YieldExpression = js.native
  def updateYieldExpression(node: YieldExpression, asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
}
