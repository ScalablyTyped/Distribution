package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.serializersMod.DecoratorWrapper
import typings.typedoc.serializersMod.SourceReferenceWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.ContainerReflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.DeclarationReflection, 'type' | 'defaultValue' | 'overwrites' | 'inheritedFrom' | 'extendedTypes' | 'extendedBy' | 'implementedTypes' | 'implementedBy' | 'implementationOf'> */
trait DeclarationReflection
  extends StObject
     with __ModelToObject[js.Any] {
  
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]
  ] = js.undefined
  
  var children: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var comment: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment
  ] = js.undefined
  
  var decorates: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.undefined
  
  var defaultValue: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  
  var extendedBy: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  
  var extendedTypes: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  
  var flags: ReflectionFlags
  
  var getSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var groups: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionGroupMod.ReflectionGroup]]] | js.Array[typings.typedoc.reflectionGroupMod.ReflectionGroup]
  ] = js.undefined
  
  var id: ModelToObject[Double] | Double
  
  var implementationOf: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  
  var implementedBy: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  
  var implementedTypes: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  
  var indexSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var inheritedFrom: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  
  var kind: ModelToObject[ReflectionKind] | ReflectionKind
  
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  
  var name: ModelToObject[String] | String
  
  var originalName: js.UndefOr[String] = js.undefined
  
  var overwrites: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  
  var parameters: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var setSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var signatures: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var sources: js.UndefOr[ModelToObject[js.Array[SourceReferenceWrapper]]] = js.undefined
  
  var `type`: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
  
  var typeParameter: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
}
object DeclarationReflection {
  
  @scala.inline
  def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): DeclarationReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationReflection]
  }
  
  @scala.inline
  implicit class DeclarationReflectionMutableBuilder[Self <: DeclarationReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]
    ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (typings.typedoc.reflectionCategoryMod.ReflectionCategory | _ModelToObject[js.Any])*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setComment(
      value: ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment
    ): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "comment", js.Array(value :_*))
    
    @scala.inline
    def setDecorates(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "decorates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    
    @scala.inline
    def setDecoratesVarargs(value: (typings.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "decorates", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setExtendedBy(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "extendedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedByUndefined: Self = StObject.set(x, "extendedBy", js.undefined)
    
    @scala.inline
    def setExtendedByVarargs(value: (typings.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "extendedBy", js.Array(value :_*))
    
    @scala.inline
    def setExtendedTypes(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "extendedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedTypesUndefined: Self = StObject.set(x, "extendedTypes", js.undefined)
    
    @scala.inline
    def setExtendedTypesVarargs(value: (typings.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "extendedTypes", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSignature(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    @scala.inline
    def setGetSignatureVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "getSignature", js.Array(value :_*))
    
    @scala.inline
    def setGroups(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionGroupMod.ReflectionGroup]]] | js.Array[typings.typedoc.reflectionGroupMod.ReflectionGroup]
    ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: (typings.typedoc.reflectionGroupMod.ReflectionGroup | _ModelToObject[js.Any])*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setImplementationOf(
      value: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
    ): Self = StObject.set(x, "implementationOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementationOfUndefined: Self = StObject.set(x, "implementationOf", js.undefined)
    
    @scala.inline
    def setImplementationOfVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "implementationOf", js.Array(value :_*))
    
    @scala.inline
    def setImplementedBy(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "implementedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementedByUndefined: Self = StObject.set(x, "implementedBy", js.undefined)
    
    @scala.inline
    def setImplementedByVarargs(value: (typings.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "implementedBy", js.Array(value :_*))
    
    @scala.inline
    def setImplementedTypes(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "implementedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementedTypesUndefined: Self = StObject.set(x, "implementedTypes", js.undefined)
    
    @scala.inline
    def setImplementedTypesVarargs(value: (typings.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "implementedTypes", js.Array(value :_*))
    
    @scala.inline
    def setIndexSignature(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexSignatureUndefined: Self = StObject.set(x, "indexSignature", js.undefined)
    
    @scala.inline
    def setIndexSignatureVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "indexSignature", js.Array(value :_*))
    
    @scala.inline
    def setInheritedFrom(
      value: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
    ): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    @scala.inline
    def setInheritedFromVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "inheritedFrom", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    @scala.inline
    def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kindString", js.Array(value :_*))
    
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setOverwrites(
      value: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
    ): Self = StObject.set(x, "overwrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwritesUndefined: Self = StObject.set(x, "overwrites", js.undefined)
    
    @scala.inline
    def setOverwritesVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "overwrites", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSetSignature(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSignatureUndefined: Self = StObject.set(x, "setSignature", js.undefined)
    
    @scala.inline
    def setSetSignatureVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "setSignature", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: ModelToObject[js.Array[SourceReferenceWrapper]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterUndefined: Self = StObject.set(x, "typeParameter", js.undefined)
    
    @scala.inline
    def setTypeParameterVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "typeParameter", js.Array(value :_*))
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
