package typings.winrtUwp.global.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a component that is being revoked and renewed with a trusted component. */
/* note: abstract class */ @JSGlobal("Windows.Media.Protection.RevocationAndRenewalItem")
@js.native
open class RevocationAndRenewalItem ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalItem {
  
  /** Returns the header hash for the component being revoked. */
  /* CompleteClass */
  var headerHash: String = js.native
  
  /** Returns the name for the component being revoked. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Returns the public key hash for the component. */
  /* CompleteClass */
  var publicKeyHash: String = js.native
  
  /** Returns the reason for revocation of component. */
  /* CompleteClass */
  var reasons: typings.winrtUwp.Windows.Media.Protection.RevocationAndRenewalReasons = js.native
  
  /** Returns the GUID for the renewal object. */
  /* CompleteClass */
  var renewalId: String = js.native
}
