package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionFlags extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionFlags")
@js.native
object ExtensionFlags extends js.Object {
  /**
    * A built-in extension is installed for all VSTS accounts by default
    */
  @js.native
  sealed trait BuiltIn extends ExtensionFlags
  
  /**
    * The extension comes from a fully-trusted publisher
    */
  @js.native
  sealed trait Trusted extends ExtensionFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionFlags with Double] = js.native
  /* 1 */ @js.native
  object BuiltIn extends TopLevel[BuiltIn with Double]
  
  /* 2 */ @js.native
  object Trusted extends TopLevel[Trusted with Double]
  
}

