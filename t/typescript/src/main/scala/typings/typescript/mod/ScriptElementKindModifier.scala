package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKindModifier extends StObject
@JSImport("typescript", "ScriptElementKindModifier")
@js.native
object ScriptElementKindModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKindModifier with java.lang.String] = js.native
  
  @js.native
  sealed trait abstractModifier extends ScriptElementKindModifier
  /* "abstract" */ val abstractModifier: typings.typescript.mod.ScriptElementKindModifier.abstractModifier with java.lang.String = js.native
  
  @js.native
  sealed trait ambientModifier extends ScriptElementKindModifier
  /* "declare" */ val ambientModifier: typings.typescript.mod.ScriptElementKindModifier.ambientModifier with java.lang.String = js.native
  
  @js.native
  sealed trait deprecatedModifier extends ScriptElementKindModifier
  /* "deprecated" */ val deprecatedModifier: typings.typescript.mod.ScriptElementKindModifier.deprecatedModifier with java.lang.String = js.native
  
  @js.native
  sealed trait dtsModifier extends ScriptElementKindModifier
  /* ".d.ts" */ val dtsModifier: typings.typescript.mod.ScriptElementKindModifier.dtsModifier with java.lang.String = js.native
  
  @js.native
  sealed trait exportedModifier extends ScriptElementKindModifier
  /* "export" */ val exportedModifier: typings.typescript.mod.ScriptElementKindModifier.exportedModifier with java.lang.String = js.native
  
  @js.native
  sealed trait jsModifier extends ScriptElementKindModifier
  /* ".js" */ val jsModifier: typings.typescript.mod.ScriptElementKindModifier.jsModifier with java.lang.String = js.native
  
  @js.native
  sealed trait jsonModifier extends ScriptElementKindModifier
  /* ".json" */ val jsonModifier: typings.typescript.mod.ScriptElementKindModifier.jsonModifier with java.lang.String = js.native
  
  @js.native
  sealed trait jsxModifier extends ScriptElementKindModifier
  /* ".jsx" */ val jsxModifier: typings.typescript.mod.ScriptElementKindModifier.jsxModifier with java.lang.String = js.native
  
  @js.native
  sealed trait none extends ScriptElementKindModifier
  /* "" */ val none: typings.typescript.mod.ScriptElementKindModifier.none with java.lang.String = js.native
  
  @js.native
  sealed trait optionalModifier extends ScriptElementKindModifier
  /* "optional" */ val optionalModifier: typings.typescript.mod.ScriptElementKindModifier.optionalModifier with java.lang.String = js.native
  
  @js.native
  sealed trait privateMemberModifier extends ScriptElementKindModifier
  /* "private" */ val privateMemberModifier: typings.typescript.mod.ScriptElementKindModifier.privateMemberModifier with java.lang.String = js.native
  
  @js.native
  sealed trait protectedMemberModifier extends ScriptElementKindModifier
  /* "protected" */ val protectedMemberModifier: typings.typescript.mod.ScriptElementKindModifier.protectedMemberModifier with java.lang.String = js.native
  
  @js.native
  sealed trait publicMemberModifier extends ScriptElementKindModifier
  /* "public" */ val publicMemberModifier: typings.typescript.mod.ScriptElementKindModifier.publicMemberModifier with java.lang.String = js.native
  
  @js.native
  sealed trait staticModifier extends ScriptElementKindModifier
  /* "static" */ val staticModifier: typings.typescript.mod.ScriptElementKindModifier.staticModifier with java.lang.String = js.native
  
  @js.native
  sealed trait tsModifier extends ScriptElementKindModifier
  /* ".ts" */ val tsModifier: typings.typescript.mod.ScriptElementKindModifier.tsModifier with java.lang.String = js.native
  
  @js.native
  sealed trait tsxModifier extends ScriptElementKindModifier
  /* ".tsx" */ val tsxModifier: typings.typescript.mod.ScriptElementKindModifier.tsxModifier with java.lang.String = js.native
}
