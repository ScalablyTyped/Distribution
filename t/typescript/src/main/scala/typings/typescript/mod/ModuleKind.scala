package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleKind extends StObject
@JSImport("typescript", "ModuleKind")
@js.native
object ModuleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind with Double] = js.native
  
  @js.native
  sealed trait AMD extends ModuleKind
  /* 2 */ val AMD: typings.typescript.mod.ModuleKind.AMD with Double = js.native
  
  @js.native
  sealed trait CommonJS extends ModuleKind
  /* 1 */ val CommonJS: typings.typescript.mod.ModuleKind.CommonJS with Double = js.native
  
  @js.native
  sealed trait ES2015 extends ModuleKind
  /* 5 */ val ES2015: typings.typescript.mod.ModuleKind.ES2015 with Double = js.native
  
  @js.native
  sealed trait ES2020 extends ModuleKind
  /* 6 */ val ES2020: typings.typescript.mod.ModuleKind.ES2020 with Double = js.native
  
  @js.native
  sealed trait ESNext extends ModuleKind
  /* 99 */ val ESNext: typings.typescript.mod.ModuleKind.ESNext with Double = js.native
  
  @js.native
  sealed trait None extends ModuleKind
  /* 0 */ val None: typings.typescript.mod.ModuleKind.None with Double = js.native
  
  @js.native
  sealed trait System extends ModuleKind
  /* 4 */ val System: typings.typescript.mod.ModuleKind.System with Double = js.native
  
  @js.native
  sealed trait UMD extends ModuleKind
  /* 3 */ val UMD: typings.typescript.mod.ModuleKind.UMD with Double = js.native
}
