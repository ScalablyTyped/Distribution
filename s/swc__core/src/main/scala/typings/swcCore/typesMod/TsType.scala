package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.TsKeywordType
  - typings.swcCore.typesMod.TsThisType
  - typings.swcCore.typesMod.TsFnOrConstructorType
  - typings.swcCore.typesMod.TsTypeReference
  - typings.swcCore.typesMod.TsTypeQuery
  - typings.swcCore.typesMod.TsTypeLiteral
  - typings.swcCore.typesMod.TsArrayType
  - typings.swcCore.typesMod.TsTupleType
  - typings.swcCore.typesMod.TsOptionalType
  - typings.swcCore.typesMod.TsRestType
  - typings.swcCore.typesMod.TsUnionOrIntersectionType
  - typings.swcCore.typesMod.TsConditionalType
  - typings.swcCore.typesMod.TsInferType
  - typings.swcCore.typesMod.TsParenthesizedType
  - typings.swcCore.typesMod.TsTypeOperator
  - typings.swcCore.typesMod.TsIndexedAccessType
  - typings.swcCore.typesMod.TsMappedType
  - typings.swcCore.typesMod.TsLiteralType
  - typings.swcCore.typesMod.TsTypePredicate
  - typings.swcCore.typesMod.TsImportType
*/
trait TsType extends StObject
object TsType {
  
  inline def TsArrayType(elemType: TsType, span: Span): typings.swcCore.typesMod.TsArrayType = {
    val __obj = js.Dynamic.literal(elemType = elemType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsArrayType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsArrayType]
  }
  
  inline def TsConditionalType(checkType: TsType, extendsType: TsType, falseType: TsType, span: Span, trueType: TsType): typings.swcCore.typesMod.TsConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConditionalType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsConditionalType]
  }
  
  inline def TsConstructorType(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typings.swcCore.typesMod.TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsConstructorType]
  }
  
  inline def TsFunctionType(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typings.swcCore.typesMod.TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsFunctionType]
  }
  
  inline def TsImportType(argument: StringLiteral, span: Span): typings.swcCore.typesMod.TsImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsImportType]
  }
  
  inline def TsIndexedAccessType(indexType: TsType, objectType: TsType, readonly: Boolean, span: Span): typings.swcCore.typesMod.TsIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexedAccessType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsIndexedAccessType]
  }
  
  inline def TsInferType(span: Span, typeParam: TsTypeParameter): typings.swcCore.typesMod.TsInferType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInferType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsInferType]
  }
  
  inline def TsIntersectionType(span: Span, types: js.Array[TsType]): typings.swcCore.typesMod.TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsIntersectionType]
  }
  
  inline def TsKeywordType(kind: TsKeywordTypeKind, span: Span): typings.swcCore.typesMod.TsKeywordType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsKeywordType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsKeywordType]
  }
  
  inline def TsLiteralType(literal: TsLiteral, span: Span): typings.swcCore.typesMod.TsLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsLiteralType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsLiteralType]
  }
  
  inline def TsMappedType(span: Span, typeParam: TsTypeParameter): typings.swcCore.typesMod.TsMappedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMappedType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsMappedType]
  }
  
  inline def TsOptionalType(span: Span, typeAnnotation: TsType): typings.swcCore.typesMod.TsOptionalType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsOptionalType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsOptionalType]
  }
  
  inline def TsParenthesizedType(span: Span, typeAnnotation: TsType): typings.swcCore.typesMod.TsParenthesizedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParenthesizedType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsParenthesizedType]
  }
  
  inline def TsRestType(span: Span, typeAnnotation: TsType): typings.swcCore.typesMod.TsRestType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsRestType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsRestType]
  }
  
  inline def TsThisType(span: Span): typings.swcCore.typesMod.TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsThisType]
  }
  
  inline def TsTupleType(elemTypes: js.Array[TsTupleElement], span: Span): typings.swcCore.typesMod.TsTupleType = {
    val __obj = js.Dynamic.literal(elemTypes = elemTypes.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTupleType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTupleType]
  }
  
  inline def TsTypeLiteral(members: js.Array[TsTypeElement], span: Span): typings.swcCore.typesMod.TsTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTypeLiteral]
  }
  
  inline def TsTypeOperator(op: TsTypeOperatorOp, span: Span, typeAnnotation: TsType): typings.swcCore.typesMod.TsTypeOperator = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeOperator")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTypeOperator]
  }
  
  inline def TsTypePredicate(asserts: Boolean, paramName: TsThisTypeOrIdent, span: Span): typings.swcCore.typesMod.TsTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], paramName = paramName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypePredicate")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTypePredicate]
  }
  
  inline def TsTypeQuery(exprName: TsTypeQueryExpr, span: Span): typings.swcCore.typesMod.TsTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeQuery")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTypeQuery]
  }
  
  inline def TsTypeReference(span: Span, typeName: TsEntityName): typings.swcCore.typesMod.TsTypeReference = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeReference")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTypeReference]
  }
  
  inline def TsUnionType(span: Span, types: js.Array[TsType]): typings.swcCore.typesMod.TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsUnionType]
  }
}
