package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleType
  extends StObject
     with GenericType {
  
  var combinedFlags: ElementFlags
  
  var elementFlags: js.Array[ElementFlags]
  
  /** Number of initial required or optional elements */
  var fixedLength: Double
  
  /** True if tuple has any rest or variadic elements */
  var hasRestElement: Boolean
  
  var labeledElementDeclarations: js.UndefOr[js.Array[NamedTupleMember | ParameterDeclaration]] = js.undefined
  
  /** Number of required or variadic elements */
  var minLength: Double
  
  var readonly: Boolean
}
object TupleType {
  
  inline def apply(
    combinedFlags: ElementFlags,
    elementFlags: js.Array[ElementFlags],
    fixedLength: Double,
    flags: TypeFlags,
    getApparentProperties: () => js.Array[Symbol],
    getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
    getCallSignatures: () => js.Array[Signature],
    getConstraint: () => js.UndefOr[Type],
    getConstructSignatures: () => js.Array[Signature],
    getDefault: () => js.UndefOr[Type],
    getFlags: () => TypeFlags,
    getNonNullableType: () => Type,
    getNumberIndexType: () => js.UndefOr[Type],
    getProperties: () => js.Array[Symbol],
    getProperty: java.lang.String => js.UndefOr[Symbol],
    getStringIndexType: () => js.UndefOr[Type],
    getSymbol: () => js.UndefOr[Symbol],
    hasRestElement: Boolean,
    isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
    isIndexType: () => /* is typescript.typescript.IndexType */ Boolean,
    isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
    isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
    isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
    isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
    minLength: Double,
    objectFlags: ObjectFlags,
    readonly: Boolean,
    symbol: Symbol,
    target: GenericType
  ): TupleType = {
    val __obj = js.Dynamic.literal(combinedFlags = combinedFlags.asInstanceOf[js.Any], elementFlags = elementFlags.asInstanceOf[js.Any], fixedLength = fixedLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), hasRestElement = hasRestElement.asInstanceOf[js.Any], isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), minLength = minLength.asInstanceOf[js.Any], objectFlags = objectFlags.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TupleType] (val x: Self) extends AnyVal {
    
    inline def setCombinedFlags(value: ElementFlags): Self = StObject.set(x, "combinedFlags", value.asInstanceOf[js.Any])
    
    inline def setElementFlags(value: js.Array[ElementFlags]): Self = StObject.set(x, "elementFlags", value.asInstanceOf[js.Any])
    
    inline def setElementFlagsVarargs(value: ElementFlags*): Self = StObject.set(x, "elementFlags", js.Array(value*))
    
    inline def setFixedLength(value: Double): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setHasRestElement(value: Boolean): Self = StObject.set(x, "hasRestElement", value.asInstanceOf[js.Any])
    
    inline def setLabeledElementDeclarations(value: js.Array[NamedTupleMember | ParameterDeclaration]): Self = StObject.set(x, "labeledElementDeclarations", value.asInstanceOf[js.Any])
    
    inline def setLabeledElementDeclarationsUndefined: Self = StObject.set(x, "labeledElementDeclarations", js.undefined)
    
    inline def setLabeledElementDeclarationsVarargs(value: (NamedTupleMember | ParameterDeclaration)*): Self = StObject.set(x, "labeledElementDeclarations", js.Array(value*))
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
  }
}
