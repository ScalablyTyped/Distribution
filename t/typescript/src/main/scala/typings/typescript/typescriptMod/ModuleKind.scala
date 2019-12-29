package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleKind extends js.Object

@JSImport("typescript", "ModuleKind")
@js.native
object ModuleKind extends js.Object {
  @js.native
  sealed trait AMD extends ModuleKind
  
  @js.native
  sealed trait CommonJS extends ModuleKind
  
  @js.native
  sealed trait ES2015 extends ModuleKind
  
  @js.native
  sealed trait ESNext extends ModuleKind
  
  @js.native
  sealed trait None extends ModuleKind
  
  @js.native
  sealed trait System extends ModuleKind
  
  @js.native
  sealed trait UMD extends ModuleKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind with Double] = js.native
  /* 2 */ @js.native
  object AMD extends TopLevel[AMD with Double]
  
  /* 1 */ @js.native
  object CommonJS extends TopLevel[CommonJS with Double]
  
  /* 5 */ @js.native
  object ES2015 extends TopLevel[ES2015 with Double]
  
  /* 99 */ @js.native
  object ESNext extends TopLevel[ESNext with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object System
    extends TopLevel[typings.typescript.typescriptMod.ModuleKind.System with Double]
  
  /* 3 */ @js.native
  object UMD extends TopLevel[UMD with Double]
  
}

