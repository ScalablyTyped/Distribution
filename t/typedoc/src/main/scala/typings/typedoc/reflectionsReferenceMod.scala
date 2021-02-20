package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsReferenceMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/reference", "ReferenceReflection")
  @js.native
  class ReferenceReflection protected () extends DeclarationReflection {
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_state'] */ js.Any
    ) = this()
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_state'] */ js.Any,
      parent: Reflection
    ) = this()
    
    var _ensureProject: js.Any = js.native
    
    var _ensureResolved: js.Any = js.native
    
    var _project: js.Any = js.native
    
    var _state: js.Any = js.native
    
    def getTargetReflection(): Reflection = js.native
    
    def getTargetReflectionDeep(): Reflection = js.native
    
    def isReference: Boolean = js.native
    
    def tryGetTargetReflection(): js.UndefOr[Reflection] = js.native
    
    def tryGetTargetReflectionDeep(): js.UndefOr[Reflection] = js.native
  }
  
  @js.native
  sealed trait ReferenceState extends StObject
  @JSImport("typedoc/dist/lib/models/reflections/reference", "ReferenceState")
  @js.native
  object ReferenceState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReferenceState with Double] = js.native
    
    @js.native
    sealed trait Resolved extends ReferenceState
    /* 1 */ val Resolved: typings.typedoc.reflectionsReferenceMod.ReferenceState.Resolved with Double = js.native
    
    @js.native
    sealed trait Unresolved extends ReferenceState
    /* 0 */ val Unresolved: typings.typedoc.reflectionsReferenceMod.ReferenceState.Unresolved with Double = js.native
  }
}
