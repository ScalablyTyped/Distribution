package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection
import typings.typedoc.distLibModelsTypesMod.SomeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsParameterMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/parameter", "ParameterReflection")
  @js.native
  open class ParameterReflection protected () extends Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    var defaultValue: js.UndefOr[String] = js.native
    
    @JSName("parent")
    var parent_ParameterReflection: js.UndefOr[SignatureReflection] = js.native
    
    var `type`: js.UndefOr[SomeType] = js.native
  }
}
