package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKindModifier extends js.Object

@JSImport("typescript", "ScriptElementKindModifier")
@js.native
object ScriptElementKindModifier extends js.Object {
  @js.native
  sealed trait abstractModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait ambientModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait dtsModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait exportedModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait jsModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait jsonModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait jsxModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait none
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait optionalModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait privateMemberModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait protectedMemberModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait publicMemberModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait staticModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait tsModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  @js.native
  sealed trait tsxModifier
    extends typescriptLib.typescriptMod.ScriptElementKindModifier
  
  /* "abstract" */ val abstractModifier: abstractModifier with java.lang.String = js.native
  /* "declare" */ val ambientModifier: ambientModifier with java.lang.String = js.native
  /* ".d.ts" */ val dtsModifier: dtsModifier with java.lang.String = js.native
  /* "export" */ val exportedModifier: exportedModifier with java.lang.String = js.native
  /* ".js" */ val jsModifier: jsModifier with java.lang.String = js.native
  /* ".json" */ val jsonModifier: jsonModifier with java.lang.String = js.native
  /* ".jsx" */ val jsxModifier: jsxModifier with java.lang.String = js.native
  /* "" */ val none: none with java.lang.String = js.native
  /* "optional" */ val optionalModifier: optionalModifier with java.lang.String = js.native
  /* "private" */ val privateMemberModifier: privateMemberModifier with java.lang.String = js.native
  /* "protected" */ val protectedMemberModifier: protectedMemberModifier with java.lang.String = js.native
  /* "public" */ val publicMemberModifier: publicMemberModifier with java.lang.String = js.native
  /* "static" */ val staticModifier: staticModifier with java.lang.String = js.native
  /* ".ts" */ val tsModifier: tsModifier with java.lang.String = js.native
  /* ".tsx" */ val tsxModifier: tsxModifier with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[typescriptLib.typescriptMod.ScriptElementKindModifier with java.lang.String] = js.native
}

