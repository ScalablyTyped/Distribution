package typings.winrtUwp.global.Windows.Media.Protection

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about components that need to be revoked and renewed. */
@JSGlobal("Windows.Media.Protection.RevocationAndRenewalInformation")
@js.native
abstract class RevocationAndRenewalInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalInformation {
  
  /** Returns a list of components that need to be revoked and renewed with updated components. */
  /* CompleteClass */
  var items: IVector[typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalItem] = js.native
}
