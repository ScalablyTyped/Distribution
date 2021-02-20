package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifierFlags extends StObject
@JSImport("typescript", "ModifierFlags")
@js.native
object ModifierFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierFlags with Double] = js.native
  
  @js.native
  sealed trait Abstract extends ModifierFlags
  /* 128 */ val Abstract: typings.typescript.mod.ModifierFlags.Abstract with Double = js.native
  
  @js.native
  sealed trait AccessibilityModifier extends ModifierFlags
  /* 28 */ val AccessibilityModifier: typings.typescript.mod.ModifierFlags.AccessibilityModifier with Double = js.native
  
  @js.native
  sealed trait All extends ModifierFlags
  /* 11263 */ val All: typings.typescript.mod.ModifierFlags.All with Double = js.native
  
  @js.native
  sealed trait Ambient extends ModifierFlags
  /* 2 */ val Ambient: typings.typescript.mod.ModifierFlags.Ambient with Double = js.native
  
  @js.native
  sealed trait Async extends ModifierFlags
  /* 256 */ val Async: typings.typescript.mod.ModifierFlags.Async with Double = js.native
  
  @js.native
  sealed trait Const extends ModifierFlags
  /* 2048 */ val Const: typings.typescript.mod.ModifierFlags.Const with Double = js.native
  
  @js.native
  sealed trait Default extends ModifierFlags
  /* 512 */ val Default: typings.typescript.mod.ModifierFlags.Default with Double = js.native
  
  @js.native
  sealed trait Deprecated extends ModifierFlags
  /* 8192 */ val Deprecated: typings.typescript.mod.ModifierFlags.Deprecated with Double = js.native
  
  @js.native
  sealed trait Export extends ModifierFlags
  /* 1 */ val Export: typings.typescript.mod.ModifierFlags.Export with Double = js.native
  
  @js.native
  sealed trait ExportDefault extends ModifierFlags
  /* 513 */ val ExportDefault: typings.typescript.mod.ModifierFlags.ExportDefault with Double = js.native
  
  @js.native
  sealed trait HasComputedFlags extends ModifierFlags
  /* 536870912 */ val HasComputedFlags: typings.typescript.mod.ModifierFlags.HasComputedFlags with Double = js.native
  
  @js.native
  sealed trait HasComputedJSDocModifiers extends ModifierFlags
  /* 4096 */ val HasComputedJSDocModifiers: typings.typescript.mod.ModifierFlags.HasComputedJSDocModifiers with Double = js.native
  
  @js.native
  sealed trait NonPublicAccessibilityModifier extends ModifierFlags
  /* 24 */ val NonPublicAccessibilityModifier: typings.typescript.mod.ModifierFlags.NonPublicAccessibilityModifier with Double = js.native
  
  @js.native
  sealed trait None extends ModifierFlags
  /* 0 */ val None: typings.typescript.mod.ModifierFlags.None with Double = js.native
  
  @js.native
  sealed trait ParameterPropertyModifier extends ModifierFlags
  /* 92 */ val ParameterPropertyModifier: typings.typescript.mod.ModifierFlags.ParameterPropertyModifier with Double = js.native
  
  @js.native
  sealed trait Private extends ModifierFlags
  /* 8 */ val Private: typings.typescript.mod.ModifierFlags.Private with Double = js.native
  
  @js.native
  sealed trait Protected extends ModifierFlags
  /* 16 */ val Protected: typings.typescript.mod.ModifierFlags.Protected with Double = js.native
  
  @js.native
  sealed trait Public extends ModifierFlags
  /* 4 */ val Public: typings.typescript.mod.ModifierFlags.Public with Double = js.native
  
  @js.native
  sealed trait Readonly extends ModifierFlags
  /* 64 */ val Readonly: typings.typescript.mod.ModifierFlags.Readonly with Double = js.native
  
  @js.native
  sealed trait Static extends ModifierFlags
  /* 32 */ val Static: typings.typescript.mod.ModifierFlags.Static with Double = js.native
  
  @js.native
  sealed trait TypeScriptModifier extends ModifierFlags
  /* 2270 */ val TypeScriptModifier: typings.typescript.mod.ModifierFlags.TypeScriptModifier with Double = js.native
}
