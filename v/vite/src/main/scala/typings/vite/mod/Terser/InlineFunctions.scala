package typings.vite.mod.Terser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineFunctions extends StObject
@JSImport("vite", "Terser.InlineFunctions")
@js.native
object InlineFunctions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineFunctions & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with InlineFunctions
  /* 0 */ val Disabled: typings.vite.mod.Terser.InlineFunctions.Disabled & Double = js.native
  
  @js.native
  sealed trait SimpleFunctions
    extends StObject
       with InlineFunctions
  /* 1 */ val SimpleFunctions: typings.vite.mod.Terser.InlineFunctions.SimpleFunctions & Double = js.native
  
  @js.native
  sealed trait WithArguments
    extends StObject
       with InlineFunctions
  /* 2 */ val WithArguments: typings.vite.mod.Terser.InlineFunctions.WithArguments & Double = js.native
  
  @js.native
  sealed trait WithArgumentsAndVariables
    extends StObject
       with InlineFunctions
  /* 3 */ val WithArgumentsAndVariables: typings.vite.mod.Terser.InlineFunctions.WithArgumentsAndVariables & Double = js.native
}
