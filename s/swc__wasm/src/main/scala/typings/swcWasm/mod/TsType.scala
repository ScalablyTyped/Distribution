package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.TsKeywordType
  - typings.swcWasm.mod.TsThisType
  - typings.swcWasm.mod.TsFnOrConstructorType
  - typings.swcWasm.mod.TsTypeReference
  - typings.swcWasm.mod.TsTypeQuery
  - typings.swcWasm.mod.TsTypeLiteral
  - typings.swcWasm.mod.TsArrayType
  - typings.swcWasm.mod.TsTupleType
  - typings.swcWasm.mod.TsOptionalType
  - typings.swcWasm.mod.TsRestType
  - typings.swcWasm.mod.TsUnionOrIntersectionType
  - typings.swcWasm.mod.TsConditionalType
  - typings.swcWasm.mod.TsInferType
  - typings.swcWasm.mod.TsParenthesizedType
  - typings.swcWasm.mod.TsTypeOperator
  - typings.swcWasm.mod.TsIndexedAccessType
  - typings.swcWasm.mod.TsMappedType
  - typings.swcWasm.mod.TsLiteralType
  - typings.swcWasm.mod.TsTypePredicate
  - typings.swcWasm.mod.TsImportType
*/
trait TsType extends StObject
object TsType {
  
  inline def TsArrayType(elemType: TsType, span: Span): typings.swcWasm.mod.TsArrayType = {
    val __obj = js.Dynamic.literal(elemType = elemType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsArrayType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsArrayType]
  }
  
  inline def TsConditionalType(checkType: TsType, extendsType: TsType, falseType: TsType, span: Span, trueType: TsType): typings.swcWasm.mod.TsConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConditionalType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsConditionalType]
  }
  
  inline def TsConstructorType(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typings.swcWasm.mod.TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsConstructorType]
  }
  
  inline def TsFunctionType(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typings.swcWasm.mod.TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsFunctionType]
  }
  
  inline def TsImportType(argument: StringLiteral, span: Span): typings.swcWasm.mod.TsImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsImportType]
  }
  
  inline def TsIndexedAccessType(indexType: TsType, objectType: TsType, readonly: Boolean, span: Span): typings.swcWasm.mod.TsIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexedAccessType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsIndexedAccessType]
  }
  
  inline def TsInferType(span: Span, typeParam: TsTypeParameter): typings.swcWasm.mod.TsInferType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInferType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsInferType]
  }
  
  inline def TsIntersectionType(span: Span, types: js.Array[TsType]): typings.swcWasm.mod.TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsIntersectionType]
  }
  
  inline def TsKeywordType(kind: TsKeywordTypeKind, span: Span): typings.swcWasm.mod.TsKeywordType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsKeywordType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsKeywordType]
  }
  
  inline def TsLiteralType(literal: TsLiteral, span: Span): typings.swcWasm.mod.TsLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsLiteralType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsLiteralType]
  }
  
  inline def TsMappedType(span: Span, typeParam: TsTypeParameter): typings.swcWasm.mod.TsMappedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMappedType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsMappedType]
  }
  
  inline def TsOptionalType(span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsOptionalType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsOptionalType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsOptionalType]
  }
  
  inline def TsParenthesizedType(span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsParenthesizedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParenthesizedType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsParenthesizedType]
  }
  
  inline def TsRestType(span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsRestType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsRestType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsRestType]
  }
  
  inline def TsThisType(span: Span): typings.swcWasm.mod.TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsThisType]
  }
  
  inline def TsTupleType(elemTypes: js.Array[TsTupleElement], span: Span): typings.swcWasm.mod.TsTupleType = {
    val __obj = js.Dynamic.literal(elemTypes = elemTypes.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTupleType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTupleType]
  }
  
  inline def TsTypeLiteral(members: js.Array[TsTypeElement], span: Span): typings.swcWasm.mod.TsTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypeLiteral]
  }
  
  inline def TsTypeOperator(op: TsTypeOperatorOp, span: Span, typeAnnotation: TsType): typings.swcWasm.mod.TsTypeOperator = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeOperator")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypeOperator]
  }
  
  inline def TsTypePredicate(asserts: Boolean, paramName: TsThisTypeOrIdent, span: Span): typings.swcWasm.mod.TsTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], paramName = paramName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypePredicate")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypePredicate]
  }
  
  inline def TsTypeQuery(exprName: TsTypeQueryExpr, span: Span): typings.swcWasm.mod.TsTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeQuery")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypeQuery]
  }
  
  inline def TsTypeReference(span: Span, typeName: TsEntityName): typings.swcWasm.mod.TsTypeReference = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeReference")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTypeReference]
  }
  
  inline def TsUnionType(span: Span, types: js.Array[TsType]): typings.swcWasm.mod.TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsUnionType]
  }
}
