package typings.winrtUwp.global.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables applications to initiate renewal of components which need updating in order to play protected media content. */
@JSGlobal("Windows.Media.Protection.ComponentRenewal")
@js.native
abstract class ComponentRenewal ()
  extends typings.winrtUwp.Windows.Media.Protection.ComponentRenewal
object ComponentRenewal {
  
  /**
    * Initiates updating of critical content protection components after prompting the user.
    * @param information Revocation and renewal information.
    * @return An object that is used to control the asynchronous operation.
    */
  /* static member */
  @JSGlobal("Windows.Media.Protection.ComponentRenewal.renewSystemComponentsAsync")
  @js.native
  def renewSystemComponentsAsync(information: typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Media.Protection.RenewalStatus, Double] = js.native
}
