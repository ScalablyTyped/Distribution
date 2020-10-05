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
  @js.native
  sealed trait abstractModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait ambientModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait dtsModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait exportedModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait jsModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait jsonModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait jsxModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait none extends ScriptElementKindModifier
  
  @js.native
  sealed trait optionalModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait privateMemberModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait protectedMemberModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait publicMemberModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait staticModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait tsModifier extends ScriptElementKindModifier
  
  @js.native
  sealed trait tsxModifier extends ScriptElementKindModifier
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKindModifier with java.lang.String] = js.native
  /* "abstract" */ @js.native
  object abstractModifier
    extends TopLevel[abstractModifier with java.lang.String]
  
  /* "declare" */ @js.native
  object ambientModifier
    extends TopLevel[ambientModifier with java.lang.String]
  
  /* ".d.ts" */ @js.native
  object dtsModifier
    extends TopLevel[dtsModifier with java.lang.String]
  
  /* "export" */ @js.native
  object exportedModifier
    extends TopLevel[exportedModifier with java.lang.String]
  
  /* ".js" */ @js.native
  object jsModifier
    extends TopLevel[jsModifier with java.lang.String]
  
  /* ".json" */ @js.native
  object jsonModifier
    extends TopLevel[jsonModifier with java.lang.String]
  
  /* ".jsx" */ @js.native
  object jsxModifier
    extends TopLevel[jsxModifier with java.lang.String]
  
  /* "" */ @js.native
  object none
    extends TopLevel[none with java.lang.String]
  
  /* "optional" */ @js.native
  object optionalModifier
    extends TopLevel[optionalModifier with java.lang.String]
  
  /* "private" */ @js.native
  object privateMemberModifier
    extends TopLevel[privateMemberModifier with java.lang.String]
  
  /* "protected" */ @js.native
  object protectedMemberModifier
    extends TopLevel[protectedMemberModifier with java.lang.String]
  
  /* "public" */ @js.native
  object publicMemberModifier
    extends TopLevel[publicMemberModifier with java.lang.String]
  
  /* "static" */ @js.native
  object staticModifier
    extends TopLevel[staticModifier with java.lang.String]
  
  /* ".ts" */ @js.native
  object tsModifier
    extends TopLevel[tsModifier with java.lang.String]
  
  /* ".tsx" */ @js.native
  object tsxModifier
    extends TopLevel[tsxModifier with java.lang.String]
  
}

