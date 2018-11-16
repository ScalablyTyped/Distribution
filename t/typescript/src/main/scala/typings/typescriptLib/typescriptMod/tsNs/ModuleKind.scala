package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleKind extends js.Object

@JSImport("typescript/ts", "ModuleKind")
@js.native
object ModuleKind extends js.Object {
  @js.native
  sealed trait AMD
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
  @js.native
  sealed trait CommonJS
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
  @js.native
  sealed trait ES2015
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
  @js.native
  sealed trait ESNext
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
  @js.native
  sealed trait System
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
  @js.native
  sealed trait UMD
    extends typescriptLib.typescriptMod.tsNs.ModuleKind
  
}

