package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptKind extends js.Object

@JSImport("typescript/ts", "ScriptKind")
@js.native
object ScriptKind extends js.Object {
  /**
    * Used on extensions that doesn't define the ScriptKind but the content defines it.
    * Deferred extensions are going to be included in all project contexts.
    */
  @js.native
  sealed trait Deferred
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait External
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait JS
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait JSON
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait JSX
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait TS
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait TSX
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
  @js.native
  sealed trait Unknown
    extends typescriptLib.typescriptMod.tsNs.ScriptKind
  
}

