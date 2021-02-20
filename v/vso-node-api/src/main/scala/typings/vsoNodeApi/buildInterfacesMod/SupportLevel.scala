package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportLevel extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "SupportLevel")
@js.native
object SupportLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportLevel with Double] = js.native
  
  /**
    * The functionality is required.
    */
  @js.native
  sealed trait Required extends SupportLevel
  /* 2 */ val Required: typings.vsoNodeApi.buildInterfacesMod.SupportLevel.Required with Double = js.native
  
  /**
    * The functionality is supported.
    */
  @js.native
  sealed trait Supported extends SupportLevel
  /* 1 */ val Supported: typings.vsoNodeApi.buildInterfacesMod.SupportLevel.Supported with Double = js.native
  
  /**
    * The functionality is not supported.
    */
  @js.native
  sealed trait Unsupported extends SupportLevel
  /* 0 */ val Unsupported: typings.vsoNodeApi.buildInterfacesMod.SupportLevel.Unsupported with Double = js.native
}
