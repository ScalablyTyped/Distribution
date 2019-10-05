package typings.winrtDashUwp.Windows.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for managing apps in an enterprise. */
@JSGlobal("Windows.Management.Workplace")
@js.native
object Workplace extends js.Object {
  /** MDM (Mobile Device Management) policy. */
  @js.native
  abstract class MdmPolicy () extends js.Object
  
  /** Enables Windows Store apps to access select enterprise settings that are managed through group policy or other management services. */
  @js.native
  abstract class WorkplaceSettings () extends js.Object
  
  /* static members */
  @js.native
  object MdmPolicy extends js.Object {
    /**
      * Returns true if a browser is allowed.
      * @return true if a browser is allowed.
      */
    def isBrowserAllowed(): Boolean = js.native
    /**
      * Returns true if a camera is allowed.
      * @return true if a camera is allowed.
      */
    def isCameraAllowed(): Boolean = js.native
    /**
      * Returns true if a Microsoft Account is allowed.
      * @return true if a Microsoft Account is allowed.
      */
    def isMicrosoftAccountAllowed(): Boolean = js.native
    /**
      * Returns true if a Store is allowed.
      * @return true if a Store is allowed.
      */
    def isStoreAllowed(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WorkplaceSettings extends js.Object {
    /** Gets a value that indicates whether an enterprise ID can be used instead of a Microsoft account. */
    var isMicrosoftAccountOptional: Boolean = js.native
  }
  
}

