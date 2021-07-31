package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValidationResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ValidationResult")
@js.native
object ValidationResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValidationResult & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with ValidationResult
  /* 2 */ val Error: typings.vsoNodeApi.buildInterfacesMod.ValidationResult.Error & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with ValidationResult
  /* 0 */ val OK: typings.vsoNodeApi.buildInterfacesMod.ValidationResult.OK & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with ValidationResult
  /* 1 */ val Warning: typings.vsoNodeApi.buildInterfacesMod.ValidationResult.Warning & Double = js.native
}
