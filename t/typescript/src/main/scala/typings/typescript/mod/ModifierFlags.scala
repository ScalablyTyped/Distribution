package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifierFlags extends js.Object
@JSImport("typescript", "ModifierFlags")
@js.native
object ModifierFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierFlags with Double] = js.native
  
  @js.native
  sealed trait Abstract extends ModifierFlags
  /* 128 */ @js.native
  object Abstract extends TopLevel[Abstract with Double]
  
  @js.native
  sealed trait AccessibilityModifier extends ModifierFlags
  /* 28 */ @js.native
  object AccessibilityModifier
    extends TopLevel[typings.typescript.mod.ModifierFlags.AccessibilityModifier with Double]
  
  @js.native
  sealed trait All extends ModifierFlags
  /* 11263 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Ambient extends ModifierFlags
  /* 2 */ @js.native
  object Ambient extends TopLevel[Ambient with Double]
  
  @js.native
  sealed trait Async extends ModifierFlags
  /* 256 */ @js.native
  object Async extends TopLevel[Async with Double]
  
  @js.native
  sealed trait Const extends ModifierFlags
  /* 2048 */ @js.native
  object Const extends TopLevel[Const with Double]
  
  @js.native
  sealed trait Default extends ModifierFlags
  /* 512 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  @js.native
  sealed trait Deprecated extends ModifierFlags
  /* 8192 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
  
  @js.native
  sealed trait Export extends ModifierFlags
  /* 1 */ @js.native
  object Export extends TopLevel[Export with Double]
  
  @js.native
  sealed trait ExportDefault extends ModifierFlags
  /* 513 */ @js.native
  object ExportDefault extends TopLevel[ExportDefault with Double]
  
  @js.native
  sealed trait HasComputedFlags extends ModifierFlags
  /* 536870912 */ @js.native
  object HasComputedFlags extends TopLevel[HasComputedFlags with Double]
  
  @js.native
  sealed trait HasComputedJSDocModifiers extends ModifierFlags
  /* 4096 */ @js.native
  object HasComputedJSDocModifiers extends TopLevel[HasComputedJSDocModifiers with Double]
  
  @js.native
  sealed trait NonPublicAccessibilityModifier extends ModifierFlags
  /* 24 */ @js.native
  object NonPublicAccessibilityModifier extends TopLevel[NonPublicAccessibilityModifier with Double]
  
  @js.native
  sealed trait None extends ModifierFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait ParameterPropertyModifier extends ModifierFlags
  /* 92 */ @js.native
  object ParameterPropertyModifier
    extends TopLevel[typings.typescript.mod.ModifierFlags.ParameterPropertyModifier with Double]
  
  @js.native
  sealed trait Private extends ModifierFlags
  /* 8 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Protected extends ModifierFlags
  /* 16 */ @js.native
  object Protected extends TopLevel[Protected with Double]
  
  @js.native
  sealed trait Public extends ModifierFlags
  /* 4 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  @js.native
  sealed trait Readonly extends ModifierFlags
  /* 64 */ @js.native
  object Readonly extends TopLevel[Readonly with Double]
  
  @js.native
  sealed trait Static extends ModifierFlags
  /* 32 */ @js.native
  object Static extends TopLevel[Static with Double]
  
  @js.native
  sealed trait TypeScriptModifier extends ModifierFlags
  /* 2270 */ @js.native
  object TypeScriptModifier extends TopLevel[TypeScriptModifier with Double]
}
