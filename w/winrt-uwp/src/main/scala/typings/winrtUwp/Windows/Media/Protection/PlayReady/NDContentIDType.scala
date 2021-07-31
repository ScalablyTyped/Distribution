package typings.winrtUwp.Windows.Media.Protection.PlayReady

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NDContentIDType extends StObject
/** Indicates the types of content that PlayReady can use in different scenarios. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDContentIDType")
@js.native
object NDContentIDType extends StObject {
  
  /** Custom object specific to the transmitter. It is expected that the transmitter will understand the data contained therein. PlayReady does not define a standard format for custom content identifiers. */
  @js.native
  sealed trait custom
    extends StObject
       with NDContentIDType
  
  /** License key identifier. */
  @js.native
  sealed trait keyID
    extends StObject
       with NDContentIDType
  
  /** PlayReadyObject can be one of the following two objects. */
  @js.native
  sealed trait playReadyObject
    extends StObject
       with NDContentIDType
}
