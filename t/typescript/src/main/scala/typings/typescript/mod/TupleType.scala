package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescript.mod.FlowType because Already inherited
- typings.typescript.mod.Type because Already inherited
- typings.typescript.mod.ObjectType because Already inherited
- typings.typescript.mod.TypeReference because var conflicts: aliasSymbol, aliasTypeArguments, flags, objectFlags, pattern, symbol. Inlined target, node, typeArguments */ @js.native
trait TupleType extends InterfaceType {
  
  var combinedFlags: ElementFlags = js.native
  
  var elementFlags: js.Array[ElementFlags] = js.native
  
  var fixedLength: Double = js.native
  
  var hasRestElement: Boolean = js.native
  
  var labeledElementDeclarations: js.UndefOr[js.Array[NamedTupleMember | ParameterDeclaration]] = js.native
  
  var minLength: Double = js.native
  
  var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.native
  
  var readonly: Boolean = js.native
  
  var target: GenericType = js.native
  
  var typeArguments: js.UndefOr[js.Array[Type]] = js.native
}
object TupleType {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(combinedFlags = combinedFlags.asInstanceOf[js.Any], elementFlags = elementFlags.asInstanceOf[js.Any], fixedLength = fixedLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), hasRestElement = hasRestElement.asInstanceOf[js.Any], isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), minLength = minLength.asInstanceOf[js.Any], objectFlags = objectFlags.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
  
  @scala.inline
  implicit class TupleTypeOps[Self <: TupleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCombinedFlags(value: ElementFlags): Self = this.set("combinedFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementFlagsVarargs(value: ElementFlags*): Self = this.set("elementFlags", js.Array(value :_*))
    
    @scala.inline
    def setElementFlags(value: js.Array[ElementFlags]): Self = this.set("elementFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedLength(value: Double): Self = this.set("fixedLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRestElement(value: Boolean): Self = this.set("hasRestElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: GenericType): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabeledElementDeclarationsVarargs(value: (NamedTupleMember | ParameterDeclaration)*): Self = this.set("labeledElementDeclarations", js.Array(value :_*))
    
    @scala.inline
    def setLabeledElementDeclarations(value: js.Array[NamedTupleMember | ParameterDeclaration]): Self = this.set("labeledElementDeclarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabeledElementDeclarations: Self = this.set("labeledElementDeclarations", js.undefined)
    
    @scala.inline
    def setNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setTypeArgumentsVarargs(value: Type*): Self = this.set("typeArguments", js.Array(value :_*))
    
    @scala.inline
    def setTypeArguments(value: js.Array[Type]): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeArguments: Self = this.set("typeArguments", js.undefined)
  }
}
