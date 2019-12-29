package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(value: String): js.UndefOr[ScriptElementKindModifier with String] = js.native
  /* "abstract" */ @js.native
  object abstractModifier extends TopLevel[abstractModifier with String]
  
  /* "declare" */ @js.native
  object ambientModifier extends TopLevel[ambientModifier with String]
  
  /* ".d.ts" */ @js.native
  object dtsModifier extends TopLevel[dtsModifier with String]
  
  /* "export" */ @js.native
  object exportedModifier extends TopLevel[exportedModifier with String]
  
  /* ".js" */ @js.native
  object jsModifier extends TopLevel[jsModifier with String]
  
  /* ".json" */ @js.native
  object jsonModifier extends TopLevel[jsonModifier with String]
  
  /* ".jsx" */ @js.native
  object jsxModifier extends TopLevel[jsxModifier with String]
  
  /* "" */ @js.native
  object none extends TopLevel[none with String]
  
  /* "optional" */ @js.native
  object optionalModifier extends TopLevel[optionalModifier with String]
  
  /* "private" */ @js.native
  object privateMemberModifier extends TopLevel[privateMemberModifier with String]
  
  /* "protected" */ @js.native
  object protectedMemberModifier extends TopLevel[protectedMemberModifier with String]
  
  /* "public" */ @js.native
  object publicMemberModifier extends TopLevel[publicMemberModifier with String]
  
  /* "static" */ @js.native
  object staticModifier extends TopLevel[staticModifier with String]
  
  /* ".ts" */ @js.native
  object tsModifier extends TopLevel[tsModifier with String]
  
  /* ".tsx" */ @js.native
  object tsxModifier extends TopLevel[tsxModifier with String]
  
}

