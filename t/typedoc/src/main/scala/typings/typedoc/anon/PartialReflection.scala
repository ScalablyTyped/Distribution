package typings.typedoc.anon

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.commentsCommentMod.Comment
import typings.typedoc.modelsMod.Reflection
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod.ReflectionFlags
import typings.typedoc.schemaMod._ModelToObject
import typings.typedoc.serializersMod.DecoratorWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Reflection> */
trait PartialReflection extends StObject {
  
  var children: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  
  var comment: js.UndefOr[ModelToObject[js.UndefOr[Comment]] | Comment] = js.undefined
  
  var decorates: js.UndefOr[ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]] = js.undefined
  
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.undefined
  
  var flags: js.UndefOr[ReflectionFlags] = js.undefined
  
  var getSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  
  var id: js.UndefOr[ModelToObject[Double] | Double] = js.undefined
  
  var indexSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  
  var kind: js.UndefOr[ModelToObject[ReflectionKind] | ReflectionKind] = js.undefined
  
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  
  var name: js.UndefOr[ModelToObject[String] | String] = js.undefined
  
  var originalName: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  
  var setSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  
  var signatures: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
  
  var typeParameter: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.undefined
}
object PartialReflection {
  
  @scala.inline
  def apply(): PartialReflection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReflection]
  }
  
  @scala.inline
  implicit class PartialReflectionMutableBuilder[Self <: PartialReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: ModelToObject[js.UndefOr[Comment]] | Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "comment", js.Array(value :_*))
    
    @scala.inline
    def setDecorates(value: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]): Self = StObject.set(x, "decorates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    
    @scala.inline
    def setDecoratesVarargs(value: (Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "decorates", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setGetSignature(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    @scala.inline
    def setGetSignatureVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "getSignature", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setIndexSignature(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexSignatureUndefined: Self = StObject.set(x, "indexSignature", js.undefined)
    
    @scala.inline
    def setIndexSignatureVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "indexSignature", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    @scala.inline
    def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kindString", js.Array(value :_*))
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSetSignature(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSignatureUndefined: Self = StObject.set(x, "setSignature", js.undefined)
    
    @scala.inline
    def setSetSignatureVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "setSignature", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setTypeParameter(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterUndefined: Self = StObject.set(x, "typeParameter", js.undefined)
    
    @scala.inline
    def setTypeParameterVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "typeParameter", js.Array(value :_*))
  }
}
