package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.declarationMod.DeclarationReflection
import typings.typedoc.modelsTypesMod.SomeType
import typings.typedoc.typedocStrings.`in out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeParameterMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/type-parameter", "TypeParameterReflection")
  @js.native
  open class TypeParameterReflection protected () extends Reflection {
    def this(name: String, constraint: Unit, defaultType: Unit, parent: Reflection) = this()
    def this(name: String, constraint: Unit, defaultType: SomeType, parent: Reflection) = this()
    def this(name: String, constraint: SomeType, defaultType: Unit, parent: Reflection) = this()
    def this(name: String, constraint: SomeType, defaultType: SomeType, parent: Reflection) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: Unit,
      parent: Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    
    var default: js.UndefOr[SomeType] = js.native
    
    @JSName("parent")
    var parent_TypeParameterReflection: js.UndefOr[DeclarationReflection] = js.native
    
    var `type`: js.UndefOr[SomeType] = js.native
    
    var varianceModifier: js.UndefOr[VarianceModifier] = js.native
  }
  
  /* Inlined { readonly in :'in',  readonly out :'out',  readonly inOut :'in out'}[keyof { readonly in :'in',  readonly out :'out',  readonly inOut :'in out'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.in
    - typings.typedoc.typedocStrings.out
    - typings.typedoc.typedocStrings.`in out`
  */
  trait VarianceModifier extends StObject
  object VarianceModifier {
    
    @JSImport("typedoc/dist/lib/models/reflections/type-parameter", "VarianceModifier.in")
    @js.native
    val in: typings.typedoc.typedocStrings.in = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections/type-parameter", "VarianceModifier.inOut")
    @js.native
    val inOut: `in out` = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections/type-parameter", "VarianceModifier.out")
    @js.native
    val out: typings.typedoc.typedocStrings.out = js.native
  }
}
