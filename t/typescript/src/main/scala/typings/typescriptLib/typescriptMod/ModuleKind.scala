package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleKind extends js.Object

@JSImport("typescript", "ModuleKind")
@js.native
object ModuleKind extends js.Object {
  @js.native
  sealed trait AMD
    extends typescriptLib.typescriptMod.ModuleKind
  
  @js.native
  sealed trait CommonJS
    extends typescriptLib.typescriptMod.ModuleKind
  
  @js.native
  sealed trait ES2015
    extends typescriptLib.typescriptMod.ModuleKind
  
  @js.native
  sealed trait ESNext
    extends typescriptLib.typescriptMod.ModuleKind
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.ModuleKind
  
  @js.native
  sealed trait System
    extends typescriptLib.typescriptMod.ModuleKind
  
  @js.native
  sealed trait UMD
    extends typescriptLib.typescriptMod.ModuleKind
  
  /* 2 */ val AMD: AMD with scala.Double = js.native
  /* 1 */ val CommonJS: CommonJS with scala.Double = js.native
  /* 5 */ val ES2015: ES2015 with scala.Double = js.native
  /* 6 */ val ESNext: ESNext with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val System: System with scala.Double = js.native
  /* 3 */ val UMD: UMD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ModuleKind with scala.Double] = js.native
}

