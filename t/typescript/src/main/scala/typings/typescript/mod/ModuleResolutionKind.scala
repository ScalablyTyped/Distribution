package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleResolutionKind extends StObject
@JSImport("typescript", "ModuleResolutionKind")
@js.native
object ModuleResolutionKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleResolutionKind & Double] = js.native
  
  @js.native
  sealed trait Classic
    extends StObject
       with ModuleResolutionKind
  /* 1 */ val Classic: typings.typescript.mod.ModuleResolutionKind.Classic & Double = js.native
  
  @js.native
  sealed trait NodeJs
    extends StObject
       with ModuleResolutionKind
  /* 2 */ val NodeJs: typings.typescript.mod.ModuleResolutionKind.NodeJs & Double = js.native
}
