package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.declarationMod.DeclarationReflection
import typings.typedoc.kindMod.ReflectionKind.CallSignature
import typings.typedoc.kindMod.ReflectionKind.ConstructorSignature
import typings.typedoc.kindMod.ReflectionKind.GetSignature
import typings.typedoc.kindMod.ReflectionKind.IndexSignature
import typings.typedoc.kindMod.ReflectionKind.SetSignature
import typings.typedoc.modelsTypesMod.ReferenceType
import typings.typedoc.modelsTypesMod.SomeType
import typings.typedoc.parameterMod.ParameterReflection
import typings.typedoc.typeParameterMod.TypeParameterReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsSignatureMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/signature", "SignatureReflection")
  @js.native
  open class SignatureReflection protected () extends Reflection {
    def this(name: String, kind: CallSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: ConstructorSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: GetSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: IndexSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: SetSignature, parent: DeclarationReflection) = this()
    
    /**
      * A type that points to the reflection this reflection is the implementation of.
      *
      * Applies to class members.
      */
    var implementationOf: js.UndefOr[ReferenceType] = js.native
    
    /**
      * A type that points to the reflection this reflection has been inherited from.
      *
      * Applies to interface and class members.
      */
    var inheritedFrom: js.UndefOr[ReferenceType] = js.native
    
    @JSName("kind")
    var kind_SignatureReflection: SetSignature | GetSignature | IndexSignature | CallSignature | ConstructorSignature = js.native
    
    /**
      * A type that points to the reflection that has been overwritten by this reflection.
      *
      * Applies to interface and class members.
      */
    var overwrites: js.UndefOr[ReferenceType] = js.native
    
    var parameters: js.UndefOr[js.Array[ParameterReflection]] = js.native
    
    @JSName("parent")
    var parent_SignatureReflection: DeclarationReflection = js.native
    
    var `type`: js.UndefOr[SomeType] = js.native
    
    var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
  }
}
