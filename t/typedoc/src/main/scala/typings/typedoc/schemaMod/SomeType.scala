package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends __ModelToObject[js.Any]

object SomeType {
  @scala.inline
  def InferredType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ArrayType(
    elementType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "array" */ String]) | (/* "array" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def TupleType(`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): SomeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def IntersectionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): SomeType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ReferenceType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def UnionType(
    `type`: ModelToObject[String] | String,
    types: ModelToObject[js.Array[typings.typedoc.typesAbstractMod.Type]] | js.Array[typings.typedoc.typesAbstractMod.Type]
  ): SomeType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def TypeOperatorType(
    operator: (ModelToObject[/* "keyof" */ String]) | (/* "keyof" */ String),
    target: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def StringLiteralType(
    `type`: (ModelToObject[/* "stringLiteral" */ String]) | (/* "stringLiteral" */ String),
    value: ModelToObject[String] | String
  ): SomeType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def IntrinsicType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ConditionalType(
    checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): SomeType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def ReflectionType(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): SomeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def IndexedAccessType(
    indexType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    objectType: ModelToObject[typings.typedoc.modelsTypesMod.Type] | typings.typedoc.modelsTypesMod.Type,
    `type`: (ModelToObject[/* "indexedAccess" */ String]) | (/* "indexedAccess" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def TypeParameterType(name: ModelToObject[String] | String, `type`: ModelToObject[String] | String): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def UnknownType(
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
  @scala.inline
  def PredicateType(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
  ): SomeType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SomeType]
  }
}

