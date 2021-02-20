package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ValidationResult")
@js.native
object ValidationResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult with Double] = js.native
  
  @js.native
  sealed trait Error extends ValidationResult
  /* 2 */ val Error: typings.vsoNodeApi.buildInterfacesMod.ValidationResult.Error with Double = js.native
  
  @js.native
  sealed trait OK extends ValidationResult
  /* 0 */ val OK: typings.vsoNodeApi.buildInterfacesMod.ValidationResult.OK with Double = js.native
  
  @js.native
  sealed trait Warning extends ValidationResult
  /* 1 */ val Warning: typings.vsoNodeApi.buildInterfacesMod.ValidationResult.Warning with Double = js.native
}
