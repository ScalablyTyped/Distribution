package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.schemaMod.ArrayType
  - typings.typedoc.schemaMod.ConditionalType
  - typings.typedoc.schemaMod.IndexedAccessType
  - typings.typedoc.schemaMod.InferredType
  - typings.typedoc.schemaMod.IntersectionType
  - typings.typedoc.schemaMod.IntrinsicType
  - typings.typedoc.schemaMod.PredicateType
  - typings.typedoc.schemaMod.ReferenceType
  - typings.typedoc.schemaMod.ReflectionType
  - typings.typedoc.schemaMod.StringLiteralType
  - typings.typedoc.schemaMod.TupleType
  - typings.typedoc.schemaMod.TypeOperatorType
  - typings.typedoc.schemaMod.TypeParameterType
  - typings.typedoc.schemaMod.UnionType
  - typings.typedoc.schemaMod.UnknownType
*/
trait SomeType
  extends StObject
     with __ModelToObject[js.Any]
object SomeType {
  
  @scala.inline
  def ArrayType(
    elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
  ): typings.typedoc.schemaMod.ArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ArrayType]
  }
  
  @scala.inline
  def ConditionalType(
    checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): typings.typedoc.schemaMod.ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ConditionalType]
  }
  
  @scala.inline
  def IndexedAccessType(
    indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
  ): typings.typedoc.schemaMod.IndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.IndexedAccessType]
  }
  
  @scala.inline
  def InferredType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): typings.typedoc.schemaMod.InferredType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.InferredType]
  }
  
  @scala.inline
  def IntersectionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): typings.typedoc.schemaMod.IntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.IntersectionType]
  }
  
  @scala.inline
  def IntrinsicType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
  ): typings.typedoc.schemaMod.IntrinsicType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.IntrinsicType]
  }
  
  @scala.inline
  def PredicateType(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
  ): typings.typedoc.schemaMod.PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.PredicateType]
  }
  
  @scala.inline
  def ReferenceType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  ): typings.typedoc.schemaMod.ReferenceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ReferenceType]
  }
  
  @scala.inline
  def ReflectionType(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): typings.typedoc.schemaMod.ReflectionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.ReflectionType]
  }
  
  @scala.inline
  def StringLiteralType(
    `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String),
    value: ModelToObject[String] | String
  ): typings.typedoc.schemaMod.StringLiteralType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.StringLiteralType]
  }
  
  @scala.inline
  def TupleType(`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): typings.typedoc.schemaMod.TupleType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.TupleType]
  }
  
  @scala.inline
  def TypeOperatorType(
    operator: (ModelToObject[keyof | unique | readonly]) | keyof | unique | readonly,
    target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
  ): typings.typedoc.schemaMod.TypeOperatorType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.TypeOperatorType]
  }
  
  @scala.inline
  def TypeParameterType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): typings.typedoc.schemaMod.TypeParameterType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.TypeParameterType]
  }
  
  @scala.inline
  def UnionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): typings.typedoc.schemaMod.UnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.UnionType]
  }
  
  @scala.inline
  def UnknownType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)
  ): typings.typedoc.schemaMod.UnknownType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedoc.schemaMod.UnknownType]
  }
}
