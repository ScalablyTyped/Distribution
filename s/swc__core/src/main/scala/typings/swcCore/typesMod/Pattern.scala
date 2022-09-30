package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.importDotmeta
import typings.swcCore.swcCoreStrings.newDottarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.BindingIdentifier
  - typings.swcCore.typesMod.ArrayPattern
  - typings.swcCore.typesMod.RestElement
  - typings.swcCore.typesMod.ObjectPattern
  - typings.swcCore.typesMod.AssignmentPattern
  - typings.swcCore.typesMod.Invalid
  - typings.swcCore.typesMod.Expression
*/
trait Pattern extends StObject
object Pattern {
  
  inline def ArrayExpression(elements: js.Array[js.UndefOr[ExprOrSpread]], span: Span): typings.swcCore.typesMod.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ArrayExpression]
  }
  
  inline def ArrayPattern(elements: js.Array[js.UndefOr[Pattern]], optional: Boolean, span: Span): typings.swcCore.typesMod.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.swcCore.typesMod.ArrayPattern]
  }
  
  inline def ArrowFunctionExpression(
    async: Boolean,
    body: BlockStatement | Expression,
    generator: Boolean,
    params: js.Array[Pattern],
    span: Span
  ): typings.swcCore.typesMod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ArrowFunctionExpression]
  }
  
  inline def AssignmentExpression(left: Expression | Pattern, operator: AssignmentOperator, right: Expression, span: Span): typings.swcCore.typesMod.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.AssignmentExpression]
  }
  
  inline def AssignmentPattern(left: Pattern, right: Expression, span: Span): typings.swcCore.typesMod.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.swcCore.typesMod.AssignmentPattern]
  }
  
  inline def AwaitExpression(argument: Expression, span: Span): typings.swcCore.typesMod.AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.AwaitExpression]
  }
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typings.swcCore.typesMod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.BigIntLiteral]
  }
  
  inline def BinaryExpression(left: Expression, operator: BinaryOperator, right: Expression, span: Span): typings.swcCore.typesMod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.BinaryExpression]
  }
  
  inline def BindingIdentifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.BindingIdentifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.BindingIdentifier]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typings.swcCore.typesMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[Argument], callee: Super | Import | Expression, span: Span): typings.swcCore.typesMod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.CallExpression]
  }
  
  inline def ClassExpression(
    body: js.Array[ClassMember],
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): typings.swcCore.typesMod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ClassExpression]
  }
  
  inline def ConditionalExpression(alternate: Expression, consequent: Expression, span: Span, test: Expression): typings.swcCore.typesMod.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ConditionalExpression]
  }
  
  inline def FunctionExpression(async: Boolean, generator: Boolean, params: js.Array[Param], span: Span): typings.swcCore.typesMod.FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.FunctionExpression]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.Identifier]
  }
  
  inline def Invalid(span: Span): typings.swcCore.typesMod.Invalid = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Invalid")
    __obj.asInstanceOf[typings.swcCore.typesMod.Invalid]
  }
  
  inline def JSXElement(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): typings.swcCore.typesMod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXElement]
  }
  
  inline def JSXEmptyExpression(span: Span): typings.swcCore.typesMod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXEmptyExpression]
  }
  
  inline def JSXFragment(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): typings.swcCore.typesMod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXFragment]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typings.swcCore.typesMod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typings.swcCore.typesMod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXNamespacedName]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typings.swcCore.typesMod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXText]
  }
  
  inline def MemberExpression(`object`: Expression, property: Identifier | PrivateName | ComputedPropName, span: Span): typings.swcCore.typesMod.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.MemberExpression]
  }
  
  inline def MetaProperty(kind: newDottarget | importDotmeta, span: Span): typings.swcCore.typesMod.MetaProperty = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.swcCore.typesMod.MetaProperty]
  }
  
  inline def NewExpression(callee: Expression, span: Span): typings.swcCore.typesMod.NewExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.NewExpression]
  }
  
  inline def NullLiteral(span: Span): typings.swcCore.typesMod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typings.swcCore.typesMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.NumericLiteral]
  }
  
  inline def ObjectExpression(properties: js.Array[SpreadElement | Property], span: Span): typings.swcCore.typesMod.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ObjectExpression]
  }
  
  inline def ObjectPattern(optional: Boolean, properties: js.Array[ObjectPatternProperty], span: Span): typings.swcCore.typesMod.ObjectPattern = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.swcCore.typesMod.ObjectPattern]
  }
  
  inline def OptionalChainingExpression(base: MemberExpression | OptionalChainingCall, questionDotToken: Span, span: Span): typings.swcCore.typesMod.OptionalChainingExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], questionDotToken = questionDotToken.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalChainingExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.OptionalChainingExpression]
  }
  
  inline def ParenthesisExpression(expression: Expression, span: Span): typings.swcCore.typesMod.ParenthesisExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesisExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ParenthesisExpression]
  }
  
  inline def PrivateName(id: Identifier, span: Span): typings.swcCore.typesMod.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typings.swcCore.typesMod.PrivateName]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typings.swcCore.typesMod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.RegExpLiteral]
  }
  
  inline def RestElement(argument: Pattern, rest: Span, span: Span): typings.swcCore.typesMod.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.swcCore.typesMod.RestElement]
  }
  
  inline def SequenceExpression(expressions: js.Array[Expression], span: Span): typings.swcCore.typesMod.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.SequenceExpression]
  }
  
  inline def StringLiteral(span: Span, value: String): typings.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.StringLiteral]
  }
  
  inline def SuperPropExpression(obj: Super, property: Identifier | ComputedPropName, span: Span): typings.swcCore.typesMod.SuperPropExpression = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SuperPropExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.SuperPropExpression]
  }
  
  inline def TaggedTemplateExpression(span: Span, tag: Expression, template: TemplateLiteral): typings.swcCore.typesMod.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.TaggedTemplateExpression]
  }
  
  inline def TemplateLiteral(expressions: js.Array[Expression], quasis: js.Array[TemplateElement], span: Span): typings.swcCore.typesMod.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.TemplateLiteral]
  }
  
  inline def ThisExpression(span: Span): typings.swcCore.typesMod.ThisExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.ThisExpression]
  }
  
  inline def TsAsExpression(expression: Expression, span: Span, typeAnnotation: TsType): typings.swcCore.typesMod.TsAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsAsExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsAsExpression]
  }
  
  inline def TsConstAssertion(expression: Expression, span: Span): typings.swcCore.typesMod.TsConstAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstAssertion")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsConstAssertion]
  }
  
  inline def TsInstantiation(expression: Expression, span: Span, typeArguments: TsTypeParameterInstantiation): typings.swcCore.typesMod.TsInstantiation = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInstantiation")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsInstantiation]
  }
  
  inline def TsNonNullExpression(expression: Expression, span: Span): typings.swcCore.typesMod.TsNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsNonNullExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsNonNullExpression]
  }
  
  inline def TsTypeAssertion(expression: Expression, span: Span, typeAnnotation: TsType): typings.swcCore.typesMod.TsTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAssertion")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTypeAssertion]
  }
  
  inline def UnaryExpression(argument: Expression, operator: UnaryOperator, span: Span): typings.swcCore.typesMod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.UnaryExpression]
  }
  
  inline def UpdateExpression(argument: Expression, operator: UpdateOperator, prefix: Boolean, span: Span): typings.swcCore.typesMod.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.UpdateExpression]
  }
  
  inline def YieldExpression(delegate: Boolean, span: Span): typings.swcCore.typesMod.YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.swcCore.typesMod.YieldExpression]
  }
}
