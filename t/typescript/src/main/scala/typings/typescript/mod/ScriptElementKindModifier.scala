package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKindModifier extends js.Object
@JSImport("typescript", "ScriptElementKindModifier")
@js.native
object ScriptElementKindModifier extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKindModifier with java.lang.String] = js.native
  
  @js.native
  sealed trait abstractModifier extends ScriptElementKindModifier
  /* "abstract" */ @js.native
  object abstractModifier
    extends TopLevel[abstractModifier with java.lang.String]
  
  @js.native
  sealed trait ambientModifier extends ScriptElementKindModifier
  /* "declare" */ @js.native
  object ambientModifier
    extends TopLevel[ambientModifier with java.lang.String]
  
  @js.native
  sealed trait deprecatedModifier extends ScriptElementKindModifier
  /* "deprecated" */ @js.native
  object deprecatedModifier
    extends TopLevel[deprecatedModifier with java.lang.String]
  
  @js.native
  sealed trait dtsModifier extends ScriptElementKindModifier
  /* ".d.ts" */ @js.native
  object dtsModifier
    extends TopLevel[dtsModifier with java.lang.String]
  
  @js.native
  sealed trait exportedModifier extends ScriptElementKindModifier
  /* "export" */ @js.native
  object exportedModifier
    extends TopLevel[exportedModifier with java.lang.String]
  
  @js.native
  sealed trait jsModifier extends ScriptElementKindModifier
  /* ".js" */ @js.native
  object jsModifier
    extends TopLevel[jsModifier with java.lang.String]
  
  @js.native
  sealed trait jsonModifier extends ScriptElementKindModifier
  /* ".json" */ @js.native
  object jsonModifier
    extends TopLevel[jsonModifier with java.lang.String]
  
  @js.native
  sealed trait jsxModifier extends ScriptElementKindModifier
  /* ".jsx" */ @js.native
  object jsxModifier
    extends TopLevel[jsxModifier with java.lang.String]
  
  @js.native
  sealed trait none extends ScriptElementKindModifier
  /* "" */ @js.native
  object none
    extends TopLevel[none with java.lang.String]
  
  @js.native
  sealed trait optionalModifier extends ScriptElementKindModifier
  /* "optional" */ @js.native
  object optionalModifier
    extends TopLevel[optionalModifier with java.lang.String]
  
  @js.native
  sealed trait privateMemberModifier extends ScriptElementKindModifier
  /* "private" */ @js.native
  object privateMemberModifier
    extends TopLevel[privateMemberModifier with java.lang.String]
  
  @js.native
  sealed trait protectedMemberModifier extends ScriptElementKindModifier
  /* "protected" */ @js.native
  object protectedMemberModifier
    extends TopLevel[protectedMemberModifier with java.lang.String]
  
  @js.native
  sealed trait publicMemberModifier extends ScriptElementKindModifier
  /* "public" */ @js.native
  object publicMemberModifier
    extends TopLevel[publicMemberModifier with java.lang.String]
  
  @js.native
  sealed trait staticModifier extends ScriptElementKindModifier
  /* "static" */ @js.native
  object staticModifier
    extends TopLevel[staticModifier with java.lang.String]
  
  @js.native
  sealed trait tsModifier extends ScriptElementKindModifier
  /* ".ts" */ @js.native
  object tsModifier
    extends TopLevel[tsModifier with java.lang.String]
  
  @js.native
  sealed trait tsxModifier extends ScriptElementKindModifier
  /* ".tsx" */ @js.native
  object tsxModifier
    extends TopLevel[tsxModifier with java.lang.String]
}
