package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.containerMod.ContainerReflection
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.reflectionsSignatureMod.SignatureReflection
import typings.typedoc.reflectionsTypeParameterMod.TypeParameterReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsDeclarationMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedoc.abstractMod.Reflection because Already inherited
  - typings.typedoc.abstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters
  - typings.typedoc.abstractMod.TypeContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined `type`
  - typings.typedoc.abstractMod.DefaultValueContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined defaultValue */ @JSImport("typedoc/dist/lib/models/reflections/declaration", "DeclarationReflection")
  @js.native
  class DeclarationReflection protected () extends ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var extendedBy: js.UndefOr[js.Array[Type]] = js.native
    
    var extendedTypes: js.UndefOr[js.Array[Type]] = js.native
    
    def getAllSignatures(): js.Array[SignatureReflection] = js.native
    
    var getSignature: js.UndefOr[SignatureReflection] = js.native
    
    var implementationOf: js.UndefOr[Type] = js.native
    
    var implementedBy: js.UndefOr[js.Array[Type]] = js.native
    
    var implementedTypes: js.UndefOr[js.Array[Type]] = js.native
    
    var indexSignature: js.UndefOr[SignatureReflection] = js.native
    
    var inheritedFrom: js.UndefOr[Type] = js.native
    
    var overwrites: js.UndefOr[Type] = js.native
    
    var setSignature: js.UndefOr[SignatureReflection] = js.native
    
    var signatures: js.UndefOr[js.Array[SignatureReflection]] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
    
    var typeHierarchy: js.UndefOr[DeclarationHierarchy] = js.native
    
    var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
  }
  
  trait DeclarationHierarchy extends StObject {
    
    var isTarget: js.UndefOr[Boolean] = js.undefined
    
    var next: js.UndefOr[DeclarationHierarchy] = js.undefined
    
    var types: js.Array[Type]
  }
  object DeclarationHierarchy {
    
    inline def apply(types: js.Array[Type]): DeclarationHierarchy = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationHierarchy]
    }
    
    extension [Self <: DeclarationHierarchy](x: Self) {
      
      inline def setIsTarget(value: Boolean): Self = StObject.set(x, "isTarget", value.asInstanceOf[js.Any])
      
      inline def setIsTargetUndefined: Self = StObject.set(x, "isTarget", js.undefined)
      
      inline def setNext(value: DeclarationHierarchy): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setTypes(value: js.Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
