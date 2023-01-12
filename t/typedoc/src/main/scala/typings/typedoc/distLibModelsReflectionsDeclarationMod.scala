package typings.typedoc

import typings.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart
import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection
import typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection
import typings.typedoc.distLibModelsTypesMod.ReferenceType
import typings.typedoc.distLibModelsTypesMod.SomeType
import typings.typedoc.distLibModelsTypesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsDeclarationMod {
  
  @js.native
  sealed trait ConversionFlags extends StObject
  @JSImport("typedoc/dist/lib/models/reflections/declaration", "ConversionFlags")
  @js.native
  object ConversionFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConversionFlags & Double] = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ConversionFlags
    /* 0 */ val None: typings.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags.None & Double = js.native
    
    @js.native
    sealed trait VariableSource
      extends StObject
         with ConversionFlags
    /* 1 */ val VariableSource: typings.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags.VariableSource & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections/declaration", "DeclarationReflection")
  @js.native
  open class DeclarationReflection protected () extends ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    /**
      * Flags for information about a reflection which is needed solely during conversion.
      * @internal
      */
    var conversionFlags: ConversionFlags = js.native
    
    /**
      * The default value of this reflection.
      *
      * Applies to function parameters, variables, and properties.
      */
    var defaultValue: js.UndefOr[String] = js.native
    
    /**
      * The escaped name of this declaration assigned by the TS compiler if there is an associated symbol.
      * This is used to retrieve properties for analyzing inherited members.
      * @internal
      */
    var escapedName: js.UndefOr[typings.typescript.mod.String] = js.native
    
    /**
      * A list of all types that extend this reflection (e.g. the subclasses).
      */
    var extendedBy: js.UndefOr[js.Array[ReferenceType]] = js.native
    
    /**
      * A list of all types this reflection extends (e.g. the parent classes).
      */
    var extendedTypes: js.UndefOr[js.Array[SomeType]] = js.native
    
    def getAllSignatures(): js.Array[SignatureReflection] = js.native
    
    /** @internal */
    def getNonIndexSignatures(): js.Array[SignatureReflection] = js.native
    
    /**
      * The get signature of this declaration.
      */
    var getSignature: js.UndefOr[SignatureReflection] = js.native
    
    /**
      * A type that points to the reflection this reflection is the implementation of.
      *
      * Applies to class members.
      */
    var implementationOf: js.UndefOr[ReferenceType] = js.native
    
    /**
      * A list of all types that implement this reflection.
      */
    var implementedBy: js.UndefOr[js.Array[ReferenceType]] = js.native
    
    /**
      * A list of all types this reflection implements.
      */
    var implementedTypes: js.UndefOr[js.Array[SomeType]] = js.native
    
    /**
      * The index signature of this declaration.
      */
    var indexSignature: js.UndefOr[SignatureReflection] = js.native
    
    /**
      * A type that points to the reflection this reflection has been inherited from.
      *
      * Applies to interface and class members.
      */
    var inheritedFrom: js.UndefOr[ReferenceType] = js.native
    
    /**
      * A type that points to the reflection that has been overwritten by this reflection.
      *
      * Applies to interface and class members.
      */
    var overwrites: js.UndefOr[ReferenceType] = js.native
    
    /**
      * The contents of the readme file of the module when found.
      */
    var readme: js.UndefOr[js.Array[CommentDisplayPart]] = js.native
    
    /**
      * The set signature of this declaration.
      */
    var setSignature: js.UndefOr[SignatureReflection] = js.native
    
    /**
      * A list of call signatures attached to this declaration.
      *
      * TypeDoc creates one declaration per function that may contain one or more
      * signature reflections.
      */
    var signatures: js.UndefOr[js.Array[SignatureReflection]] = js.native
    
    /**
      * The type of the reflection.
      *
      * If the reflection represents a variable or a property, this is the value type.<br />
      * If the reflection represents a signature, this is the return type.
      */
    var `type`: js.UndefOr[SomeType] = js.native
    
    /**
      * Contains a simplified representation of the type hierarchy suitable for being
      * rendered in templates.
      */
    var typeHierarchy: js.UndefOr[DeclarationHierarchy] = js.native
    
    var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
    
    /**
      * The version of the module when found.
      */
    var version: js.UndefOr[String] = js.native
  }
  
  trait DeclarationHierarchy extends StObject {
    
    /**
      * Is this the entry containing the target type?
      */
    var isTarget: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The next hierarchy level.
      */
    var next: js.UndefOr[DeclarationHierarchy] = js.undefined
    
    /**
      * The types represented by this node in the hierarchy.
      */
    var types: js.Array[Type]
  }
  object DeclarationHierarchy {
    
    inline def apply(types: js.Array[Type]): DeclarationHierarchy = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationHierarchy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeclarationHierarchy] (val x: Self) extends AnyVal {
      
      inline def setIsTarget(value: Boolean): Self = StObject.set(x, "isTarget", value.asInstanceOf[js.Any])
      
      inline def setIsTargetUndefined: Self = StObject.set(x, "isTarget", js.undefined)
      
      inline def setNext(value: DeclarationHierarchy): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setTypes(value: js.Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}
