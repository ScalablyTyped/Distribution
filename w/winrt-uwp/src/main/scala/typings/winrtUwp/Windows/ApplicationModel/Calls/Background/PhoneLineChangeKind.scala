package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneLineChangeKind extends StObject
/** Indicates the type of change for a background phone line change trigger. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind")
@js.native
object PhoneLineChangeKind extends StObject {
  
  /** A new phone line was added. */
  @js.native
  sealed trait added
    extends StObject
       with PhoneLineChangeKind
  
  /** A phone line has updated properties. */
  @js.native
  sealed trait propertiesChanged
    extends StObject
       with PhoneLineChangeKind
  
  /** A phone line was removed. */
  @js.native
  sealed trait removed
    extends StObject
       with PhoneLineChangeKind
}
