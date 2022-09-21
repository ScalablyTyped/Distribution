package typings.typedoc

import typings.std.Partial
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.anon.PartialTypeVisitorvoid
import typings.typedoc.converterMod.Context
import typings.typedoc.declarationMod.DeclarationReflection
import typings.typedoc.declarationReferenceMod.DeclarationReference
import typings.typedoc.projectMod.ProjectReflection
import typings.typedoc.serializationMod.Serializer
import typings.typedoc.typedocStrings.Plussign
import typings.typedoc.typedocStrings.`-_`
import typings.typedoc.typedocStrings.`named-tuple-member`
import typings.typedoc.typedocStrings.`template-literal`
import typings.typedoc.typedocStrings.array
import typings.typedoc.typedocStrings.conditional
import typings.typedoc.typedocStrings.indexedAccess
import typings.typedoc.typedocStrings.inferred
import typings.typedoc.typedocStrings.intersection
import typings.typedoc.typedocStrings.intrinsic
import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.literal
import typings.typedoc.typedocStrings.mapped
import typings.typedoc.typedocStrings.optional
import typings.typedoc.typedocStrings.predicate
import typings.typedoc.typedocStrings.query
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.reference
import typings.typedoc.typedocStrings.reflection
import typings.typedoc.typedocStrings.rest
import typings.typedoc.typedocStrings.tuple
import typings.typedoc.typedocStrings.typeOperator
import typings.typedoc.typedocStrings.union
import typings.typedoc.typedocStrings.unique
import typings.typedoc.typedocStrings.unknown
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsTypesMod {
  
  @JSImport("typedoc/dist/lib/models/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/models/types", "ArrayType")
  @js.native
  open class ArrayType protected ()
    extends Type
       with SomeType {
    /**
      * @param elementType The type of the elements in the array.
      */
    def this(elementType: SomeType) = this()
    
    var elementType: SomeType = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    @JSName("type")
    val type_ArrayType: /* "array" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ConditionalType")
  @js.native
  open class ConditionalType protected ()
    extends Type
       with SomeType {
    def this(checkType: SomeType, extendsType: SomeType, trueType: SomeType, falseType: SomeType) = this()
    
    var checkType: SomeType = js.native
    
    var extendsType: SomeType = js.native
    
    var falseType: SomeType = js.native
    
    var trueType: SomeType = js.native
    
    @JSName("type")
    val type_ConditionalType: /* "conditional" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IndexedAccessType")
  @js.native
  open class IndexedAccessType protected ()
    extends Type
       with SomeType {
    def this(objectType: SomeType, indexType: SomeType) = this()
    
    var indexType: SomeType = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    var objectType: SomeType = js.native
    
    @JSName("type")
    val type_IndexedAccessType: /* "indexedAccess" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "InferredType")
  @js.native
  open class InferredType protected ()
    extends Type
       with SomeType {
    def this(name: String) = this()
    def this(name: String, constraint: SomeType) = this()
    
    var constraint: js.UndefOr[SomeType] = js.native
    
    var name: String = js.native
    
    @JSName("type")
    val type_InferredType: /* "inferred" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IntersectionType")
  @js.native
  open class IntersectionType protected ()
    extends Type
       with SomeType {
    def this(types: js.Array[SomeType]) = this()
    
    @JSName("type")
    val type_IntersectionType: /* "intersection" */ String = js.native
    
    var types: js.Array[SomeType] = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IntrinsicType")
  @js.native
  open class IntrinsicType protected ()
    extends Type
       with SomeType {
    def this(name: String) = this()
    
    var name: String = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    def toObject(): typings.typedoc.schemaMod.IntrinsicType = js.native
    
    @JSName("type")
    val type_IntrinsicType: /* "intrinsic" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "LiteralType")
  @js.native
  open class LiteralType ()
    extends Type
       with SomeType {
    def this(value: String) = this()
    def this(value: js.BigInt) = this()
    def this(value: Boolean) = this()
    def this(value: Double) = this()
    
    def needsParenthesis(): Boolean = js.native
    
    def toObject(): typings.typedoc.schemaMod.LiteralType = js.native
    
    @JSName("type")
    val type_LiteralType: /* "literal" */ String = js.native
    
    var value: String | Double | Boolean | Null | js.BigInt = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "MappedType")
  @js.native
  open class MappedType protected ()
    extends Type
       with SomeType {
    def this(parameter: String, parameterType: SomeType, templateType: SomeType) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: `-_` | Plussign
    ) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: `-_` | Plussign,
      optionalModifier: `-_` | Plussign
    ) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: Unit,
      optionalModifier: `-_` | Plussign
    ) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: `-_` | Plussign,
      optionalModifier: `-_` | Plussign,
      nameType: SomeType
    ) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: `-_` | Plussign,
      optionalModifier: Unit,
      nameType: SomeType
    ) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: Unit,
      optionalModifier: `-_` | Plussign,
      nameType: SomeType
    ) = this()
    def this(
      parameter: String,
      parameterType: SomeType,
      templateType: SomeType,
      readonlyModifier: Unit,
      optionalModifier: Unit,
      nameType: SomeType
    ) = this()
    
    var nameType: js.UndefOr[SomeType] = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    var optionalModifier: js.UndefOr[`-_` | Plussign] = js.native
    
    var parameter: String = js.native
    
    var parameterType: SomeType = js.native
    
    var readonlyModifier: js.UndefOr[`-_` | Plussign] = js.native
    
    var templateType: SomeType = js.native
    
    @JSName("type")
    val type_MappedType: /* "mapped" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "NamedTupleMember")
  @js.native
  open class NamedTupleMember protected ()
    extends Type
       with SomeType {
    def this(name: String, isOptional: Boolean, element: SomeType) = this()
    
    var element: SomeType = js.native
    
    var isOptional: Boolean = js.native
    
    var name: String = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    @JSName("type")
    val type_NamedTupleMember: /* "named-tuple-member" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "OptionalType")
  @js.native
  open class OptionalType protected ()
    extends Type
       with SomeType {
    def this(elementType: SomeType) = this()
    
    var elementType: SomeType = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    @JSName("type")
    val type_OptionalType: /* "optional" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "PredicateType")
  @js.native
  open class PredicateType protected ()
    extends Type
       with SomeType {
    /**
      * Create a new PredicateType instance.
      *
      * @param name The identifier name which is tested by the predicate.
      * @param asserts True if the type is of the form `asserts val is string`,
      *                false if the type is of the form `val is string`
      * @param targetType The type that the identifier is tested to be.
      *                   May be undefined if the type is of the form `asserts val`.
      *                   Will be defined if the type is of the form `asserts val is string` or `val is string`.
      */
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: SomeType) = this()
    
    var asserts: Boolean = js.native
    
    var name: String = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    var targetType: js.UndefOr[SomeType] = js.native
    
    @JSName("type")
    val type_PredicateType: /* "predicate" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "QueryType")
  @js.native
  open class QueryType protected ()
    extends Type
       with SomeType {
    def this(reference: ReferenceType) = this()
    
    /**
      * @privateRemarks
      * An argument could be made that this ought to return true for indexedObject
      * since precedence is different than on the value side... if someone really cares
      * they can easily use a custom theme to change this.
      */
    def needsParenthesis(): Boolean = js.native
    
    val queryType: ReferenceType = js.native
    
    @JSName("type")
    val type_QueryType: /* "query" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ReferenceType")
  @js.native
  /* private */ open class ReferenceType ()
    extends Type
       with SomeType {
    
    /**
      * The package that this type is referencing.
      * Will only be set for `ReferenceType`s pointing to a symbol within `node_modules`.
      */
    @JSName("package")
    var _package: js.UndefOr[String] = js.native
    
    /* private */ var _project: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * If this reference type refers to a reflection defined by a project not being rendered,
      * points to the url that this type should be linked to.
      */
    var externalUrl: js.UndefOr[String] = js.native
    
    /**
      * Don't use this if at all possible. It will eventually go away since models may not
      * retain information from the original TS objects to enable documentation generation from
      * previously generated JSON.
      * @internal
      */
    def getSymbol(): js.UndefOr[Symbol] = js.native
    
    /**
      * The name of the referenced type.
      *
      * If the symbol cannot be found cause it's not part of the documentation this
      * can be used to represent the type.
      */
    var name: String = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    /**
      * The fully qualified name of the referenced type, relative to the file it is defined in.
      * This will usually be the same as `name`, unless namespaces are used.
      */
    var qualifiedName: String = js.native
    
    /**
      * The resolved reflection.
      */
    def reflection: js.UndefOr[Reflection] = js.native
    
    /**
      * Convert this reference type to a declaration reference used for resolution of external types.
      */
    def toDeclarationReference(): DeclarationReference = js.native
    
    /**
      * The type arguments of this reference.
      */
    var typeArguments: js.UndefOr[js.Array[SomeType]] = js.native
    
    @JSName("type")
    val type_ReferenceType: /* "reference" */ String = js.native
  }
  /* static members */
  object ReferenceType {
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal this is used for type parameters, which don't actually point to something */
    inline def createBrokenReference(name: String, project: ProjectReflection): ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createBrokenReference")(name.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[ReferenceType]
    
    inline def createResolvedReference(name: String, target: Double, project: ProjectReflection): ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedReference")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[ReferenceType]
    inline def createResolvedReference(name: String, target: Reflection, project: ProjectReflection): ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedReference")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[ReferenceType]
    
    inline def createSymbolReference(symbol: Symbol, context: Context): ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolReference")(symbol.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReferenceType]
    inline def createSymbolReference(symbol: Symbol, context: Context, name: String): ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolReference")(symbol.asInstanceOf[js.Any], context.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReferenceType]
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ReflectionType")
  @js.native
  open class ReflectionType protected ()
    extends Type
       with SomeType {
    def this(declaration: DeclarationReflection) = this()
    
    var declaration: DeclarationReflection = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    @JSName("type")
    val type_ReflectionType: /* "reflection" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "RestType")
  @js.native
  open class RestType protected ()
    extends Type
       with SomeType {
    def this(elementType: SomeType) = this()
    
    var elementType: SomeType = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    @JSName("type")
    val type_RestType: /* "rest" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TemplateLiteralType")
  @js.native
  open class TemplateLiteralType protected ()
    extends Type
       with SomeType {
    def this(head: String, tail: js.Array[js.Tuple2[SomeType, String]]) = this()
    
    var head: String = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    var tail: js.Array[js.Tuple2[SomeType, String]] = js.native
    
    @JSName("type")
    val type_TemplateLiteralType: /* "template-literal" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TupleType")
  @js.native
  open class TupleType protected ()
    extends Type
       with SomeType {
    /**
      * @param elements The ordered type elements of the tuple type.
      */
    def this(elements: js.Array[SomeType]) = this()
    
    var elements: js.Array[SomeType] = js.native
    
    def needsParenthesis(): Boolean = js.native
    
    @JSName("type")
    val type_TupleType: /* "tuple" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "Type")
  @js.native
  abstract class Type () extends StObject {
    
    /**
      * Implementation method for `toString`. `needsParenthesis` will be used to determine if
      * the returned string should be wrapped in parenthesis.
      */
    /* protected */ def getTypeString(): String = js.native
    
    def needsParenthesis(context: TypeContext): Boolean = js.native
    
    def stringify(context: TypeContext): String = js.native
    
    def toObject(serializer: Serializer): typings.typedoc.schemaMod.SomeType = js.native
    
    /**
      * The type name identifier.
      */
    val `type`: array | conditional | indexedAccess | inferred | intersection | intrinsic | literal | mapped | optional | predicate | query | reference | reflection | rest | `template-literal` | tuple | `named-tuple-member` | typeOperator | union | unknown = js.native
    
    def visit[T](visitor: Partial[TypeVisitor[T]]): js.UndefOr[T] = js.native
    /**
      * Visit this type, returning the value returned by the visitor.
      */
    def visit[T](visitor: TypeVisitor[T]): T = js.native
  }
  
  /* Inlined { readonly none :'none',  readonly templateLiteralElement :'templateLiteralElement',  readonly arrayElement :'arrayElement',  readonly indexedAccessElement :'indexedAccessElement',  readonly conditionalCheck :'conditionalCheck',  readonly conditionalExtends :'conditionalExtends',  readonly conditionalTrue :'conditionalTrue',  readonly conditionalFalse :'conditionalFalse',  readonly indexedIndex :'indexedIndex',  readonly indexedObject :'indexedObject',  readonly inferredConstraint :'inferredConstraint',  readonly intersectionElement :'intersectionElement',  readonly mappedName :'mappedName',  readonly mappedParameter :'mappedParameter',  readonly mappedTemplate :'mappedTemplate',  readonly optionalElement :'optionalElement',  readonly predicateTarget :'predicateTarget',  readonly queryTypeTarget :'queryTypeTarget',  readonly typeOperatorTarget :'typeOperatorTarget',  readonly referenceTypeArgument :'referenceTypeArgument',  readonly restElement :'restElement',  readonly tupleElement :'tupleElement',  readonly unionElement :'unionElement'}[keyof { readonly none :'none',  readonly templateLiteralElement :'templateLiteralElement',  readonly arrayElement :'arrayElement',  readonly indexedAccessElement :'indexedAccessElement',  readonly conditionalCheck :'conditionalCheck',  readonly conditionalExtends :'conditionalExtends',  readonly conditionalTrue :'conditionalTrue',  readonly conditionalFalse :'conditionalFalse',  readonly indexedIndex :'indexedIndex',  readonly indexedObject :'indexedObject',  readonly inferredConstraint :'inferredConstraint',  readonly intersectionElement :'intersectionElement',  readonly mappedName :'mappedName',  readonly mappedParameter :'mappedParameter',  readonly mappedTemplate :'mappedTemplate',  readonly optionalElement :'optionalElement',  readonly predicateTarget :'predicateTarget',  readonly queryTypeTarget :'queryTypeTarget',  readonly typeOperatorTarget :'typeOperatorTarget',  readonly referenceTypeArgument :'referenceTypeArgument',  readonly restElement :'restElement',  readonly tupleElement :'tupleElement',  readonly unionElement :'unionElement'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.conditionalExtends
    - typings.typedoc.typedocStrings.conditionalFalse
    - typings.typedoc.typedocStrings.templateLiteralElement
    - typings.typedoc.typedocStrings.inferredConstraint
    - typings.typedoc.typedocStrings.conditionalCheck
    - typings.typedoc.typedocStrings.none
    - typings.typedoc.typedocStrings.referenceTypeArgument
    - typings.typedoc.typedocStrings.optionalElement
    - typings.typedoc.typedocStrings.unionElement
    - typings.typedoc.typedocStrings.tupleElement
    - typings.typedoc.typedocStrings.conditionalTrue
    - typings.typedoc.typedocStrings.mappedName
    - typings.typedoc.typedocStrings.indexedIndex
    - typings.typedoc.typedocStrings.intersectionElement
    - typings.typedoc.typedocStrings.mappedTemplate
    - typings.typedoc.typedocStrings.restElement
    - typings.typedoc.typedocStrings.mappedParameter
    - typings.typedoc.typedocStrings.typeOperatorTarget
    - typings.typedoc.typedocStrings.indexedObject
    - typings.typedoc.typedocStrings.queryTypeTarget
    - typings.typedoc.typedocStrings.arrayElement
    - typings.typedoc.typedocStrings.predicateTarget
    - typings.typedoc.typedocStrings.indexedAccessElement
  */
  trait TypeContext extends StObject
  object TypeContext {
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.arrayElement")
    @js.native
    val arrayElement: typings.typedoc.typedocStrings.arrayElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.conditionalCheck")
    @js.native
    val conditionalCheck: typings.typedoc.typedocStrings.conditionalCheck = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.conditionalExtends")
    @js.native
    val conditionalExtends: typings.typedoc.typedocStrings.conditionalExtends = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.conditionalFalse")
    @js.native
    val conditionalFalse: typings.typedoc.typedocStrings.conditionalFalse = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.conditionalTrue")
    @js.native
    val conditionalTrue: typings.typedoc.typedocStrings.conditionalTrue = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.indexedAccessElement")
    @js.native
    val indexedAccessElement: typings.typedoc.typedocStrings.indexedAccessElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.indexedIndex")
    @js.native
    val indexedIndex: typings.typedoc.typedocStrings.indexedIndex = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.indexedObject")
    @js.native
    val indexedObject: typings.typedoc.typedocStrings.indexedObject = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.inferredConstraint")
    @js.native
    val inferredConstraint: typings.typedoc.typedocStrings.inferredConstraint = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.intersectionElement")
    @js.native
    val intersectionElement: typings.typedoc.typedocStrings.intersectionElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.mappedName")
    @js.native
    val mappedName: typings.typedoc.typedocStrings.mappedName = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.mappedParameter")
    @js.native
    val mappedParameter: typings.typedoc.typedocStrings.mappedParameter = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.mappedTemplate")
    @js.native
    val mappedTemplate: typings.typedoc.typedocStrings.mappedTemplate = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.none")
    @js.native
    val none: typings.typedoc.typedocStrings.none = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.optionalElement")
    @js.native
    val optionalElement: typings.typedoc.typedocStrings.optionalElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.predicateTarget")
    @js.native
    val predicateTarget: typings.typedoc.typedocStrings.predicateTarget = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.queryTypeTarget")
    @js.native
    val queryTypeTarget: typings.typedoc.typedocStrings.queryTypeTarget = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.referenceTypeArgument")
    @js.native
    val referenceTypeArgument: typings.typedoc.typedocStrings.referenceTypeArgument = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.restElement")
    @js.native
    val restElement: typings.typedoc.typedocStrings.restElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.templateLiteralElement")
    @js.native
    val templateLiteralElement: typings.typedoc.typedocStrings.templateLiteralElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.tupleElement")
    @js.native
    val tupleElement: typings.typedoc.typedocStrings.tupleElement = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.typeOperatorTarget")
    @js.native
    val typeOperatorTarget: typings.typedoc.typedocStrings.typeOperatorTarget = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "TypeContext.unionElement")
    @js.native
    val unionElement: typings.typedoc.typedocStrings.unionElement = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TypeOperatorType")
  @js.native
  open class TypeOperatorType protected ()
    extends Type
       with SomeType {
    def this(target: SomeType, operator: keyof | unique | readonly) = this()
    
    var operator: keyof | unique | readonly = js.native
    
    var target: SomeType = js.native
    
    @JSName("type")
    val type_TypeOperatorType: /* "typeOperator" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "UnionType")
  @js.native
  open class UnionType protected ()
    extends Type
       with SomeType {
    def this(types: js.Array[SomeType]) = this()
    
    /* private */ var normalize: Any = js.native
    
    @JSName("type")
    val type_UnionType: /* "union" */ String = js.native
    
    var types: js.Array[SomeType] = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/types", "UnknownType")
  @js.native
  open class UnknownType protected ()
    extends Type
       with SomeType {
    def this(name: String) = this()
    
    /**
      * A string representation of the type as returned from TypeScript compiler.
      */
    var name: String = js.native
    
    def toObject(): typings.typedoc.schemaMod.UnknownType = js.native
    
    @JSName("type")
    val type_UnknownType: /* "unknown" */ String = js.native
  }
  
  inline def makeRecursiveVisitor(visitor: PartialTypeVisitorvoid): TypeVisitor[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRecursiveVisitor")(visitor.asInstanceOf[js.Any]).asInstanceOf[TypeVisitor[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.modelsTypesMod.LiteralType
    - typings.typedoc.modelsTypesMod.NamedTupleMember
    - typings.typedoc.modelsTypesMod.UnionType
    - typings.typedoc.modelsTypesMod.ReferenceType
    - typings.typedoc.modelsTypesMod.IndexedAccessType
    - typings.typedoc.modelsTypesMod.IntersectionType
    - typings.typedoc.modelsTypesMod.ArrayType
    - typings.typedoc.modelsTypesMod.TemplateLiteralType
    - typings.typedoc.modelsTypesMod.PredicateType
    - typings.typedoc.modelsTypesMod.TypeOperatorType
    - typings.typedoc.modelsTypesMod.InferredType
    - typings.typedoc.modelsTypesMod.TupleType
    - typings.typedoc.modelsTypesMod.RestType
    - typings.typedoc.modelsTypesMod.QueryType
    - typings.typedoc.modelsTypesMod.IntrinsicType
    - typings.typedoc.modelsTypesMod.ReflectionType
    - typings.typedoc.modelsTypesMod.UnknownType
    - typings.typedoc.modelsTypesMod.MappedType
    - typings.typedoc.modelsTypesMod.OptionalType
    - typings.typedoc.modelsTypesMod.ConditionalType
  */
  trait SomeType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.array
    - typings.typedoc.typedocStrings.conditional
    - typings.typedoc.typedocStrings.indexedAccess
    - typings.typedoc.typedocStrings.inferred
    - typings.typedoc.typedocStrings.intersection
    - typings.typedoc.typedocStrings.intrinsic
    - typings.typedoc.typedocStrings.literal
    - typings.typedoc.typedocStrings.mapped
    - typings.typedoc.typedocStrings.optional
    - typings.typedoc.typedocStrings.predicate
    - typings.typedoc.typedocStrings.query
    - typings.typedoc.typedocStrings.reference
    - typings.typedoc.typedocStrings.reflection
    - typings.typedoc.typedocStrings.rest
    - typings.typedoc.typedocStrings.`template-literal`
    - typings.typedoc.typedocStrings.tuple
    - typings.typedoc.typedocStrings.`named-tuple-member`
    - typings.typedoc.typedocStrings.typeOperator
    - typings.typedoc.typedocStrings.union
    - typings.typedoc.typedocStrings.unknown
  */
  trait TypeKind extends StObject
  
  trait TypeKindMap extends StObject {
    
    var array: ArrayType
    
    var conditional: ConditionalType
    
    var indexedAccess: IndexedAccessType
    
    var inferred: InferredType
    
    var intersection: IntersectionType
    
    var intrinsic: IntrinsicType
    
    var literal: LiteralType
    
    var mapped: MappedType
    
    var `named-tuple-member`: NamedTupleMember
    
    var optional: OptionalType
    
    var predicate: PredicateType
    
    var query: QueryType
    
    var reference: ReferenceType
    
    var reflection: ReflectionType
    
    var rest: RestType
    
    var `template-literal`: TemplateLiteralType
    
    var tuple: TupleType
    
    var typeOperator: TypeOperatorType
    
    var union: UnionType
    
    var unknown: UnknownType
  }
  object TypeKindMap {
    
    inline def apply(
      array: ArrayType,
      conditional: ConditionalType,
      indexedAccess: IndexedAccessType,
      inferred: InferredType,
      intersection: IntersectionType,
      intrinsic: IntrinsicType,
      literal: LiteralType,
      mapped: MappedType,
      `named-tuple-member`: NamedTupleMember,
      optional: OptionalType,
      predicate: PredicateType,
      query: QueryType,
      reference: ReferenceType,
      reflection: ReflectionType,
      rest: RestType,
      `template-literal`: TemplateLiteralType,
      tuple: TupleType,
      typeOperator: TypeOperatorType,
      union: UnionType,
      unknown: UnknownType
    ): TypeKindMap = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], indexedAccess = indexedAccess.asInstanceOf[js.Any], inferred = inferred.asInstanceOf[js.Any], intersection = intersection.asInstanceOf[js.Any], intrinsic = intrinsic.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], mapped = mapped.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], reflection = reflection.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], tuple = tuple.asInstanceOf[js.Any], typeOperator = typeOperator.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
      __obj.updateDynamic("named-tuple-member")(`named-tuple-member`.asInstanceOf[js.Any])
      __obj.updateDynamic("template-literal")(`template-literal`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeKindMap]
    }
    
    extension [Self <: TypeKindMap](x: Self) {
      
      inline def setArray(value: ArrayType): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setConditional(value: ConditionalType): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
      
      inline def setIndexedAccess(value: IndexedAccessType): Self = StObject.set(x, "indexedAccess", value.asInstanceOf[js.Any])
      
      inline def setInferred(value: InferredType): Self = StObject.set(x, "inferred", value.asInstanceOf[js.Any])
      
      inline def setIntersection(value: IntersectionType): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
      
      inline def setIntrinsic(value: IntrinsicType): Self = StObject.set(x, "intrinsic", value.asInstanceOf[js.Any])
      
      inline def setLiteral(value: LiteralType): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setMapped(value: MappedType): Self = StObject.set(x, "mapped", value.asInstanceOf[js.Any])
      
      inline def `setNamed-tuple-member`(value: NamedTupleMember): Self = StObject.set(x, "named-tuple-member", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: OptionalType): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: PredicateType): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: QueryType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReference(value: ReferenceType): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReflection(value: ReflectionType): Self = StObject.set(x, "reflection", value.asInstanceOf[js.Any])
      
      inline def setRest(value: RestType): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def `setTemplate-literal`(value: TemplateLiteralType): Self = StObject.set(x, "template-literal", value.asInstanceOf[js.Any])
      
      inline def setTuple(value: TupleType): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
      
      inline def setTypeOperator(value: TypeOperatorType): Self = StObject.set(x, "typeOperator", value.asInstanceOf[js.Any])
      
      inline def setUnion(value: UnionType): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: UnknownType): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in typedoc.typedoc/dist/lib/models/types.TypeKind ]: (type : typedoc.typedoc/dist/lib/models/types.TypeKindMap[K]): T} */
  trait TypeVisitor[T] extends StObject {
    
    def array(`type`: ArrayType): T
    @JSName("array")
    var array_Original: js.Function1[/* type */ ArrayType, T]
    
    def conditional(`type`: ConditionalType): T
    @JSName("conditional")
    var conditional_Original: js.Function1[/* type */ ConditionalType, T]
    
    def indexedAccess(`type`: IndexedAccessType): T
    @JSName("indexedAccess")
    var indexedAccess_Original: js.Function1[/* type */ IndexedAccessType, T]
    
    def inferred(`type`: InferredType): T
    @JSName("inferred")
    var inferred_Original: js.Function1[/* type */ InferredType, T]
    
    def intersection(`type`: IntersectionType): T
    @JSName("intersection")
    var intersection_Original: js.Function1[/* type */ IntersectionType, T]
    
    def intrinsic(`type`: IntrinsicType): T
    @JSName("intrinsic")
    var intrinsic_Original: js.Function1[/* type */ IntrinsicType, T]
    
    def literal(`type`: LiteralType): T
    @JSName("literal")
    var literal_Original: js.Function1[/* type */ LiteralType, T]
    
    def mapped(`type`: MappedType): T
    @JSName("mapped")
    var mapped_Original: js.Function1[/* type */ MappedType, T]
    
    def `named-tuple-member`(`type`: NamedTupleMember): T
    @JSName("named-tuple-member")
    var `named-tuple-member_Original`: js.Function1[/* type */ NamedTupleMember, T]
    
    def optional(`type`: OptionalType): T
    @JSName("optional")
    var optional_Original: js.Function1[/* type */ OptionalType, T]
    
    def predicate(`type`: PredicateType): T
    @JSName("predicate")
    var predicate_Original: js.Function1[/* type */ PredicateType, T]
    
    def query(`type`: QueryType): T
    @JSName("query")
    var query_Original: js.Function1[/* type */ QueryType, T]
    
    def reference(`type`: ReferenceType): T
    @JSName("reference")
    var reference_Original: js.Function1[/* type */ ReferenceType, T]
    
    def reflection(`type`: ReflectionType): T
    @JSName("reflection")
    var reflection_Original: js.Function1[/* type */ ReflectionType, T]
    
    def rest(`type`: RestType): T
    @JSName("rest")
    var rest_Original: js.Function1[/* type */ RestType, T]
    
    def `template-literal`(`type`: TemplateLiteralType): T
    @JSName("template-literal")
    var `template-literal_Original`: js.Function1[/* type */ TemplateLiteralType, T]
    
    def tuple(`type`: TupleType): T
    @JSName("tuple")
    var tuple_Original: js.Function1[/* type */ TupleType, T]
    
    def typeOperator(`type`: TypeOperatorType): T
    @JSName("typeOperator")
    var typeOperator_Original: js.Function1[/* type */ TypeOperatorType, T]
    
    def union(`type`: UnionType): T
    @JSName("union")
    var union_Original: js.Function1[/* type */ UnionType, T]
    
    def unknown(`type`: UnknownType): T
    @JSName("unknown")
    var unknown_Original: js.Function1[/* type */ UnknownType, T]
  }
  object TypeVisitor {
    
    inline def apply[T](
      array: /* type */ ArrayType => T,
      conditional: /* type */ ConditionalType => T,
      indexedAccess: /* type */ IndexedAccessType => T,
      inferred: /* type */ InferredType => T,
      intersection: /* type */ IntersectionType => T,
      intrinsic: /* type */ IntrinsicType => T,
      literal: /* type */ LiteralType => T,
      mapped: /* type */ MappedType => T,
      `named-tuple-member`: /* type */ NamedTupleMember => T,
      optional: /* type */ OptionalType => T,
      predicate: /* type */ PredicateType => T,
      query: /* type */ QueryType => T,
      reference: /* type */ ReferenceType => T,
      reflection: /* type */ ReflectionType => T,
      rest: /* type */ RestType => T,
      `template-literal`: /* type */ TemplateLiteralType => T,
      tuple: /* type */ TupleType => T,
      typeOperator: /* type */ TypeOperatorType => T,
      union: /* type */ UnionType => T,
      unknown: /* type */ UnknownType => T
    ): TypeVisitor[T] = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), conditional = js.Any.fromFunction1(conditional), indexedAccess = js.Any.fromFunction1(indexedAccess), inferred = js.Any.fromFunction1(inferred), intersection = js.Any.fromFunction1(intersection), intrinsic = js.Any.fromFunction1(intrinsic), literal = js.Any.fromFunction1(literal), mapped = js.Any.fromFunction1(mapped), optional = js.Any.fromFunction1(optional), predicate = js.Any.fromFunction1(predicate), query = js.Any.fromFunction1(query), reference = js.Any.fromFunction1(reference), reflection = js.Any.fromFunction1(reflection), rest = js.Any.fromFunction1(rest), tuple = js.Any.fromFunction1(tuple), typeOperator = js.Any.fromFunction1(typeOperator), union = js.Any.fromFunction1(union), unknown = js.Any.fromFunction1(unknown))
      __obj.updateDynamic("named-tuple-member")(js.Any.fromFunction1(`named-tuple-member`))
      __obj.updateDynamic("template-literal")(js.Any.fromFunction1(`template-literal`))
      __obj.asInstanceOf[TypeVisitor[T]]
    }
    
    extension [Self <: TypeVisitor[?], T](x: Self & TypeVisitor[T]) {
      
      inline def setArray(value: /* type */ ArrayType => T): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setConditional(value: /* type */ ConditionalType => T): Self = StObject.set(x, "conditional", js.Any.fromFunction1(value))
      
      inline def setIndexedAccess(value: /* type */ IndexedAccessType => T): Self = StObject.set(x, "indexedAccess", js.Any.fromFunction1(value))
      
      inline def setInferred(value: /* type */ InferredType => T): Self = StObject.set(x, "inferred", js.Any.fromFunction1(value))
      
      inline def setIntersection(value: /* type */ IntersectionType => T): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
      
      inline def setIntrinsic(value: /* type */ IntrinsicType => T): Self = StObject.set(x, "intrinsic", js.Any.fromFunction1(value))
      
      inline def setLiteral(value: /* type */ LiteralType => T): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
      
      inline def setMapped(value: /* type */ MappedType => T): Self = StObject.set(x, "mapped", js.Any.fromFunction1(value))
      
      inline def `setNamed-tuple-member`(value: /* type */ NamedTupleMember => T): Self = StObject.set(x, "named-tuple-member", js.Any.fromFunction1(value))
      
      inline def setOptional(value: /* type */ OptionalType => T): Self = StObject.set(x, "optional", js.Any.fromFunction1(value))
      
      inline def setPredicate(value: /* type */ PredicateType => T): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setQuery(value: /* type */ QueryType => T): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setReference(value: /* type */ ReferenceType => T): Self = StObject.set(x, "reference", js.Any.fromFunction1(value))
      
      inline def setReflection(value: /* type */ ReflectionType => T): Self = StObject.set(x, "reflection", js.Any.fromFunction1(value))
      
      inline def setRest(value: /* type */ RestType => T): Self = StObject.set(x, "rest", js.Any.fromFunction1(value))
      
      inline def `setTemplate-literal`(value: /* type */ TemplateLiteralType => T): Self = StObject.set(x, "template-literal", js.Any.fromFunction1(value))
      
      inline def setTuple(value: /* type */ TupleType => T): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
      
      inline def setTypeOperator(value: /* type */ TypeOperatorType => T): Self = StObject.set(x, "typeOperator", js.Any.fromFunction1(value))
      
      inline def setUnion(value: /* type */ UnionType => T): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
      
      inline def setUnknown(value: /* type */ UnknownType => T): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
    }
  }
}
