package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifierFlags extends StObject
@JSImport("typescript", "ModifierFlags")
@js.native
object ModifierFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierFlags & Double] = js.native
  
  @js.native
  sealed trait Abstract
    extends StObject
       with ModifierFlags
  /* 128 */ val Abstract: typings.typescript.mod.ModifierFlags.Abstract & Double = js.native
  
  @js.native
  sealed trait AccessibilityModifier
    extends StObject
       with ModifierFlags
  /* 28 */ val AccessibilityModifier: typings.typescript.mod.ModifierFlags.AccessibilityModifier & Double = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ModifierFlags
  /* 257023 */ val All: typings.typescript.mod.ModifierFlags.All & Double = js.native
  
  @js.native
  sealed trait Ambient
    extends StObject
       with ModifierFlags
  /* 2 */ val Ambient: typings.typescript.mod.ModifierFlags.Ambient & Double = js.native
  
  @js.native
  sealed trait Async
    extends StObject
       with ModifierFlags
  /* 256 */ val Async: typings.typescript.mod.ModifierFlags.Async & Double = js.native
  
  @js.native
  sealed trait Const
    extends StObject
       with ModifierFlags
  /* 2048 */ val Const: typings.typescript.mod.ModifierFlags.Const & Double = js.native
  
  @js.native
  sealed trait Decorator
    extends StObject
       with ModifierFlags
  /* 131072 */ val Decorator: typings.typescript.mod.ModifierFlags.Decorator & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with ModifierFlags
  /* 512 */ val Default: typings.typescript.mod.ModifierFlags.Default & Double = js.native
  
  @js.native
  sealed trait Deprecated
    extends StObject
       with ModifierFlags
  /* 8192 */ val Deprecated: typings.typescript.mod.ModifierFlags.Deprecated & Double = js.native
  
  @js.native
  sealed trait Export
    extends StObject
       with ModifierFlags
  /* 1 */ val Export: typings.typescript.mod.ModifierFlags.Export & Double = js.native
  
  @js.native
  sealed trait ExportDefault
    extends StObject
       with ModifierFlags
  /* 513 */ val ExportDefault: typings.typescript.mod.ModifierFlags.ExportDefault & Double = js.native
  
  @js.native
  sealed trait HasComputedFlags
    extends StObject
       with ModifierFlags
  /* 536870912 */ val HasComputedFlags: typings.typescript.mod.ModifierFlags.HasComputedFlags & Double = js.native
  
  @js.native
  sealed trait HasComputedJSDocModifiers
    extends StObject
       with ModifierFlags
  /* 4096 */ val HasComputedJSDocModifiers: typings.typescript.mod.ModifierFlags.HasComputedJSDocModifiers & Double = js.native
  
  @js.native
  sealed trait In
    extends StObject
       with ModifierFlags
  /* 32768 */ val In: typings.typescript.mod.ModifierFlags.In & Double = js.native
  
  @js.native
  sealed trait Modifier
    extends StObject
       with ModifierFlags
  /* 125951 */ val Modifier: typings.typescript.mod.ModifierFlags.Modifier & Double = js.native
  
  @js.native
  sealed trait NonPublicAccessibilityModifier
    extends StObject
       with ModifierFlags
  /* 24 */ val NonPublicAccessibilityModifier: typings.typescript.mod.ModifierFlags.NonPublicAccessibilityModifier & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ModifierFlags
  /* 0 */ val None: typings.typescript.mod.ModifierFlags.None & Double = js.native
  
  @js.native
  sealed trait Out
    extends StObject
       with ModifierFlags
  /* 65536 */ val Out: typings.typescript.mod.ModifierFlags.Out & Double = js.native
  
  @js.native
  sealed trait Override
    extends StObject
       with ModifierFlags
  /* 16384 */ val Override: typings.typescript.mod.ModifierFlags.Override & Double = js.native
  
  @js.native
  sealed trait ParameterPropertyModifier
    extends StObject
       with ModifierFlags
  /* 16476 */ val ParameterPropertyModifier: typings.typescript.mod.ModifierFlags.ParameterPropertyModifier & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with ModifierFlags
  /* 8 */ val Private: typings.typescript.mod.ModifierFlags.Private & Double = js.native
  
  @js.native
  sealed trait Protected
    extends StObject
       with ModifierFlags
  /* 16 */ val Protected: typings.typescript.mod.ModifierFlags.Protected & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with ModifierFlags
  /* 4 */ val Public: typings.typescript.mod.ModifierFlags.Public & Double = js.native
  
  @js.native
  sealed trait Readonly
    extends StObject
       with ModifierFlags
  /* 64 */ val Readonly: typings.typescript.mod.ModifierFlags.Readonly & Double = js.native
  
  @js.native
  sealed trait Static
    extends StObject
       with ModifierFlags
  /* 32 */ val Static: typings.typescript.mod.ModifierFlags.Static & Double = js.native
  
  @js.native
  sealed trait TypeScriptModifier
    extends StObject
       with ModifierFlags
  /* 116958 */ val TypeScriptModifier: typings.typescript.mod.ModifierFlags.TypeScriptModifier & Double = js.native
}
