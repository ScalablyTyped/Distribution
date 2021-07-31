package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKindModifier extends StObject
@JSImport("typescript", "ScriptElementKindModifier")
@js.native
object ScriptElementKindModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKindModifier & java.lang.String] = js.native
  
  @js.native
  sealed trait abstractModifier
    extends StObject
       with ScriptElementKindModifier
  /* "abstract" */ val abstractModifier: typings.typescript.mod.ScriptElementKindModifier.abstractModifier & java.lang.String = js.native
  
  @js.native
  sealed trait ambientModifier
    extends StObject
       with ScriptElementKindModifier
  /* "declare" */ val ambientModifier: typings.typescript.mod.ScriptElementKindModifier.ambientModifier & java.lang.String = js.native
  
  @js.native
  sealed trait deprecatedModifier
    extends StObject
       with ScriptElementKindModifier
  /* "deprecated" */ val deprecatedModifier: typings.typescript.mod.ScriptElementKindModifier.deprecatedModifier & java.lang.String = js.native
  
  @js.native
  sealed trait dtsModifier
    extends StObject
       with ScriptElementKindModifier
  /* ".d.ts" */ val dtsModifier: typings.typescript.mod.ScriptElementKindModifier.dtsModifier & java.lang.String = js.native
  
  @js.native
  sealed trait exportedModifier
    extends StObject
       with ScriptElementKindModifier
  /* "export" */ val exportedModifier: typings.typescript.mod.ScriptElementKindModifier.exportedModifier & java.lang.String = js.native
  
  @js.native
  sealed trait jsModifier
    extends StObject
       with ScriptElementKindModifier
  /* ".js" */ val jsModifier: typings.typescript.mod.ScriptElementKindModifier.jsModifier & java.lang.String = js.native
  
  @js.native
  sealed trait jsonModifier
    extends StObject
       with ScriptElementKindModifier
  /* ".json" */ val jsonModifier: typings.typescript.mod.ScriptElementKindModifier.jsonModifier & java.lang.String = js.native
  
  @js.native
  sealed trait jsxModifier
    extends StObject
       with ScriptElementKindModifier
  /* ".jsx" */ val jsxModifier: typings.typescript.mod.ScriptElementKindModifier.jsxModifier & java.lang.String = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with ScriptElementKindModifier
  /* "" */ val none: typings.typescript.mod.ScriptElementKindModifier.none & java.lang.String = js.native
  
  @js.native
  sealed trait optionalModifier
    extends StObject
       with ScriptElementKindModifier
  /* "optional" */ val optionalModifier: typings.typescript.mod.ScriptElementKindModifier.optionalModifier & java.lang.String = js.native
  
  @js.native
  sealed trait privateMemberModifier
    extends StObject
       with ScriptElementKindModifier
  /* "private" */ val privateMemberModifier: typings.typescript.mod.ScriptElementKindModifier.privateMemberModifier & java.lang.String = js.native
  
  @js.native
  sealed trait protectedMemberModifier
    extends StObject
       with ScriptElementKindModifier
  /* "protected" */ val protectedMemberModifier: typings.typescript.mod.ScriptElementKindModifier.protectedMemberModifier & java.lang.String = js.native
  
  @js.native
  sealed trait publicMemberModifier
    extends StObject
       with ScriptElementKindModifier
  /* "public" */ val publicMemberModifier: typings.typescript.mod.ScriptElementKindModifier.publicMemberModifier & java.lang.String = js.native
  
  @js.native
  sealed trait staticModifier
    extends StObject
       with ScriptElementKindModifier
  /* "static" */ val staticModifier: typings.typescript.mod.ScriptElementKindModifier.staticModifier & java.lang.String = js.native
  
  @js.native
  sealed trait tsModifier
    extends StObject
       with ScriptElementKindModifier
  /* ".ts" */ val tsModifier: typings.typescript.mod.ScriptElementKindModifier.tsModifier & java.lang.String = js.native
  
  @js.native
  sealed trait tsxModifier
    extends StObject
       with ScriptElementKindModifier
  /* ".tsx" */ val tsxModifier: typings.typescript.mod.ScriptElementKindModifier.tsxModifier & java.lang.String = js.native
}
