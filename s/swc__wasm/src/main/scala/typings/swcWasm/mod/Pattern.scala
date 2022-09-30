package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.importDotmeta
import typings.swcWasm.swcWasmStrings.newDottarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.BindingIdentifier
  - typings.swcWasm.mod.ArrayPattern
  - typings.swcWasm.mod.RestElement
  - typings.swcWasm.mod.ObjectPattern
  - typings.swcWasm.mod.AssignmentPattern
  - typings.swcWasm.mod.Invalid
  - typings.swcWasm.mod.Expression
*/
trait Pattern extends StObject
object Pattern {
  
  inline def ArrayExpression(elements: js.Array[js.UndefOr[ExprOrSpread]], span: Span): typings.swcWasm.mod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ArrayExpression]
  }
  
  inline def ArrayPattern(elements: js.Array[js.UndefOr[Pattern]], optional: Boolean, span: Span): typings.swcWasm.mod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.swcWasm.mod.ArrayPattern]
  }
  
  inline def ArrowFunctionExpression(
    async: Boolean,
    body: BlockStatement | Expression,
    generator: Boolean,
    params: js.Array[Pattern],
    span: Span
  ): typings.swcWasm.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ArrowFunctionExpression]
  }
  
  inline def AssignmentExpression(left: Expression | Pattern, operator: AssignmentOperator, right: Expression, span: Span): typings.swcWasm.mod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.AssignmentExpression]
  }
  
  inline def AssignmentPattern(left: Pattern, right: Expression, span: Span): typings.swcWasm.mod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.swcWasm.mod.AssignmentPattern]
  }
  
  inline def AwaitExpression(argument: Expression, span: Span): typings.swcWasm.mod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.AwaitExpression]
  }
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typings.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.BigIntLiteral]
  }
  
  inline def BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression, span: Span): typings.swcWasm.mod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.BinaryExpression]
  }
  
  inline def BindingIdentifier(optional: Boolean, span: Span, value: String): typings.swcWasm.mod.BindingIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcWasm.mod.BindingIdentifier]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typings.swcWasm.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[Argument], callee: Super | Import | Expression, span: Span): typings.swcWasm.mod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.CallExpression]
  }
  
  inline def ClassExpression(
    body: js.Array[ClassMember],
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typings.swcWasm.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ClassExpression]
  }
  
  inline def ConditionalExpression(alternate: Expression, consequent: Expression, span: Span, test: Expression): typings.swcWasm.mod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ConditionalExpression]
  }
  
  inline def FunctionExpression(async: Boolean, generator: Boolean, params: js.Array[Param], span: Span): typings.swcWasm.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.FunctionExpression]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcWasm.mod.Identifier]
  }
  
  inline def Invalid(span: Span): typings.swcWasm.mod.Invalid = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Invalid")
    __obj.asInstanceOf[typings.swcWasm.mod.Invalid]
  }
  
  inline def JSXElement(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): typings.swcWasm.mod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXElement]
  }
  
  inline def JSXEmptyExpression(span: Span): typings.swcWasm.mod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXEmptyExpression]
  }
  
  inline def JSXFragment(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): typings.swcWasm.mod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXFragment]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typings.swcWasm.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typings.swcWasm.mod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXNamespacedName]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typings.swcWasm.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXText]
  }
  
  inline def MemberExpression(`object`: Expression, property: Identifier | PrivateName | ComputedPropName, span: Span): typings.swcWasm.mod.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.MemberExpression]
  }
  
  inline def MetaProperty(kind: newDottarget | importDotmeta, span: Span): typings.swcWasm.mod.MetaProperty = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.swcWasm.mod.MetaProperty]
  }
  
  inline def NewExpression(callee: Expression, span: Span): typings.swcWasm.mod.NewExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.NewExpression]
  }
  
  inline def NullLiteral(span: Span): typings.swcWasm.mod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typings.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.NumericLiteral]
  }
  
  inline def ObjectExpression(properties: js.Array[SpreadElement | Property], span: Span): typings.swcWasm.mod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ObjectExpression]
  }
  
  inline def ObjectPattern(optional: Boolean, properties: js.Array[ObjectPatternProperty], span: Span): typings.swcWasm.mod.ObjectPattern = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.swcWasm.mod.ObjectPattern]
  }
  
  inline def OptionalChainingExpression(base: MemberExpression | OptionalChainingCall, questionDotToken: Span, span: Span): typings.swcWasm.mod.OptionalChainingExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], questionDotToken = questionDotToken.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalChainingExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.OptionalChainingExpression]
  }
  
  inline def ParenthesisExpression(expression: Expression, span: Span): typings.swcWasm.mod.ParenthesisExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesisExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ParenthesisExpression]
  }
  
  inline def PrivateName(id: Identifier, span: Span): typings.swcWasm.mod.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typings.swcWasm.mod.PrivateName]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typings.swcWasm.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.RegExpLiteral]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typings.swcWasm.mod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.swcWasm.mod.RestElement]
  }
  
  inline def SequenceExpression(expressions: js.Array[Expression], span: Span): typings.swcWasm.mod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.SequenceExpression]
  }
  
  inline def StringLiteral(span: Span, value: String): typings.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.StringLiteral]
  }
  
  inline def SuperPropExpression(obj: Super, property: Identifier | ComputedPropName, span: Span): typings.swcWasm.mod.SuperPropExpression = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SuperPropExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.SuperPropExpression]
  }
  
  inline def TaggedTemplateExpression(span: Span, tag: Expression, template: TemplateLiteral): typings.swcWasm.mod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.TaggedTemplateExpression]
  }
  
  inline def TemplateLiteral(expressions: js.Array[Expression], quasis: js.Array[TemplateElement], span: Span): typings.swcWasm.mod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.TemplateLiteral]
  }
  
  inline def ThisExpression(span: Span): typings.swcWasm.mod.ThisExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.ThisExpression]
  }
  
  inline def TsAsExpression(expression: Expression, span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsAsExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.TsAsExpression]
  }
  
  inline def TsConstAssertion(expression: Expression, span: Span): typings.swcWasm.mod.TsConstAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstAssertion")
    __obj.asInstanceOf[typings.swcWasm.mod.TsConstAssertion]
  }
  
  inline def TsInstantiation(expression: Expression, span: Span, typeArguments: TsTypeParameterInstantiation): typings.swcWasm.mod.TsInstantiation = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInstantiation")
    __obj.asInstanceOf[typings.swcWasm.mod.TsInstantiation]
  }
  
  inline def TsNonNullExpression(expression: Expression, span: Span): typings.swcWasm.mod.TsNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNonNullExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.TsNonNullExpression]
  }
  
  inline def TsTypeAssertion(expression: Expression, span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAssertion")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypeAssertion]
  }
  
  inline def UnaryExpression(argument: Expression, operator: UnaryOperator, span: Span): typings.swcWasm.mod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.UnaryExpression]
  }
  
  inline def UpdateExpression(argument: Expression, operator: UpdateOperator, prefix: Boolean, span: Span): typings.swcWasm.mod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.UpdateExpression]
  }
  
  inline def YieldExpression(delegate: Boolean, span: Span): typings.swcWasm.mod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.YieldExpression]
  }
}
