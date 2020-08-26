package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.typedoc.abstractMod.Reflection
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/reference", JSImport.Namespace)
@js.native
object reflectionsReferenceMod extends js.Object {
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
  sealed trait ReferenceState extends js.Object
  
  @js.native
  object ReferenceState extends js.Object {
    @js.native
    sealed trait Resolved extends ReferenceState
    
    @js.native
    sealed trait Unresolved extends ReferenceState
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReferenceState with Double] = js.native
    /* 1 */ @js.native
    object Resolved extends TopLevel[Resolved with Double]
    
    /* 0 */ @js.native
    object Unresolved extends TopLevel[Unresolved with Double]
    
  }
  
}

