package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModifierFlags extends js.Object

@JSImport("typescript", "ModifierFlags")
@js.native
object ModifierFlags extends js.Object {
  @js.native
  sealed trait Abstract
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait AccessibilityModifier
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait All
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Ambient
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Async
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Const
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Default
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Export
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait ExportDefault
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait HasComputedFlags
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait NonPublicAccessibilityModifier
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait ParameterPropertyModifier
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Private
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Protected
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Public
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Readonly
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait Static
    extends typescriptLib.typescriptMod.ModifierFlags
  
  @js.native
  sealed trait TypeScriptModifier
    extends typescriptLib.typescriptMod.ModifierFlags
  
  /* 128 */ val Abstract: Abstract with scala.Double = js.native
  /* 28 */ val AccessibilityModifier: AccessibilityModifier with scala.Double = js.native
  /* 3071 */ val All: All with scala.Double = js.native
  /* 2 */ val Ambient: Ambient with scala.Double = js.native
  /* 256 */ val Async: Async with scala.Double = js.native
  /* 2048 */ val Const: Const with scala.Double = js.native
  /* 512 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Export: Export with scala.Double = js.native
  /* 513 */ val ExportDefault: ExportDefault with scala.Double = js.native
  /* 536870912 */ val HasComputedFlags: HasComputedFlags with scala.Double = js.native
  /* 24 */ val NonPublicAccessibilityModifier: NonPublicAccessibilityModifier with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 92 */ val ParameterPropertyModifier: ParameterPropertyModifier with scala.Double = js.native
  /* 8 */ val Private: Private with scala.Double = js.native
  /* 16 */ val Protected: Protected with scala.Double = js.native
  /* 4 */ val Public: Public with scala.Double = js.native
  /* 64 */ val Readonly: Readonly with scala.Double = js.native
  /* 32 */ val Static: Static with scala.Double = js.native
  /* 2270 */ val TypeScriptModifier: TypeScriptModifier with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ModifierFlags with scala.Double] = js.native
}

