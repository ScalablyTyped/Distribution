package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PublisherFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherFlags")
@js.native
object PublisherFlags extends js.Object {
  /**
       * The Disabled flag for a publisher means the publisher can't be changed and won't be used by consumers, this extends to extensions owned by the publisher as well. The disabled flag is managed by the service and can't be supplied by the Extension Developers.
       */
  @js.native
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherFlags
  
  /**
       * No flags exist for this publisher.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherFlags
  
  /**
       * This is the set of flags that can't be supplied by the developer and is managed by the service itself.
       */
  @js.native
  sealed trait ServiceFlags
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherFlags
  
  /**
       * This should never be returned, it is used to represent a publisher who's flags havent changed during update calls.
       */
  @js.native
  sealed trait UnChanged
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherFlags
  
  /**
       * A verified publisher is one that Microsoft has done some review of and ensured the publisher meets a set of requirements. The requirements to become a verified publisher are not listed here.  They can be found in public documentation (TBD).
       */
  @js.native
  sealed trait Verified
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherFlags
  
  /* 1 */ val Disabled: Disabled with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 3 */ val ServiceFlags: ServiceFlags with scala.Double = js.native
  /* 1073741824 */ val UnChanged: UnChanged with scala.Double = js.native
  /* 2 */ val Verified: Verified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherFlags with scala.Double
  ] = js.native
}

