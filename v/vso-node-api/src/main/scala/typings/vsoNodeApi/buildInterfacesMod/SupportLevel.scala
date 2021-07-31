package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportLevel extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "SupportLevel")
@js.native
object SupportLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportLevel & Double] = js.native
  
  /**
    * The functionality is required.
    */
  @js.native
  sealed trait Required
    extends StObject
       with SupportLevel
  /* 2 */ val Required: typings.vsoNodeApi.buildInterfacesMod.SupportLevel.Required & Double = js.native
  
  /**
    * The functionality is supported.
    */
  @js.native
  sealed trait Supported
    extends StObject
       with SupportLevel
  /* 1 */ val Supported: typings.vsoNodeApi.buildInterfacesMod.SupportLevel.Supported & Double = js.native
  
  /**
    * The functionality is not supported.
    */
  @js.native
  sealed trait Unsupported
    extends StObject
       with SupportLevel
  /* 0 */ val Unsupported: typings.vsoNodeApi.buildInterfacesMod.SupportLevel.Unsupported & Double = js.native
}
