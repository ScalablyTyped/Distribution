package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.serializersMod.DecoratorWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Reflection, 'id' | 'name' | 'kind' | 'kindString' | 'comment' | 'decorates'> */
trait Reflection
  extends StObject
     with __ModelToObject[js.Any] {
  
  var children: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var comment: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment
  ] = js.undefined
  
  var decorates: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
  ] = js.undefined
  
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.undefined
  
  var flags: ReflectionFlags
  
  var getSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var id: ModelToObject[Double] | Double
  
  var indexSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var kind: ModelToObject[ReflectionKind] | ReflectionKind
  
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  
  var name: ModelToObject[String] | String
  
  var originalName: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var setSignature: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var signatures: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
  
  var typeParameter: js.UndefOr[js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]] = js.undefined
}
object Reflection {
  
  inline def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): Reflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reflection]
  }
  
  extension [Self <: Reflection](x: Self) {
    
    inline def setChildren(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setComment(
      value: ModelToObject[js.UndefOr[typings.typedoc.commentsCommentMod.Comment]] | typings.typedoc.commentsCommentMod.Comment
    ): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "comment", js.Array(value :_*))
    
    inline def setDecorates(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.modelsTypesMod.Type]]] | js.Array[typings.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "decorates", value.asInstanceOf[js.Any])
    
    inline def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    
    inline def setDecoratesVarargs(value: (typings.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "decorates", js.Array(value :_*))
    
    inline def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetSignature(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    inline def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    inline def setGetSignatureVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "getSignature", js.Array(value :_*))
    
    inline def setId(value: ModelToObject[Double] | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    inline def setIndexSignature(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    inline def setIndexSignatureUndefined: Self = StObject.set(x, "indexSignature", js.undefined)
    
    inline def setIndexSignatureVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "indexSignature", js.Array(value :_*))
    
    inline def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    inline def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kindString", js.Array(value :_*))
    
    inline def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    inline def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setParameters(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setSetSignature(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    inline def setSetSignatureUndefined: Self = StObject.set(x, "setSignature", js.undefined)
    
    inline def setSetSignatureVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "setSignature", js.Array(value :_*))
    
    inline def setSignatures(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    inline def setTypeParameter(value: js.Array[ModelToObject[typings.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterUndefined: Self = StObject.set(x, "typeParameter", js.undefined)
    
    inline def setTypeParameterVarargs(value: ModelToObject[typings.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "typeParameter", js.Array(value :_*))
  }
}
