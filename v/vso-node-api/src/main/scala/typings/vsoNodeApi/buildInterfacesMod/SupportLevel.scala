package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportLevel extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "SupportLevel")
@js.native
object SupportLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportLevel with Double] = js.native
  
  /**
    * The functionality is required.
    */
  @js.native
  sealed trait Required extends SupportLevel
  /* 2 */ @js.native
  object Required extends TopLevel[Required with Double]
  
  /**
    * The functionality is supported.
    */
  @js.native
  sealed trait Supported extends SupportLevel
  /* 1 */ @js.native
  object Supported extends TopLevel[Supported with Double]
  
  /**
    * The functionality is not supported.
    */
  @js.native
  sealed trait Unsupported extends SupportLevel
  /* 0 */ @js.native
  object Unsupported extends TopLevel[Unsupported with Double]
}
