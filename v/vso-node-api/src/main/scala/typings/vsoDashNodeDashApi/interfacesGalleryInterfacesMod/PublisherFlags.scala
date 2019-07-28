package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  sealed trait Disabled extends PublisherFlags
  
  /**
    * No flags exist for this publisher.
    */
  @js.native
  sealed trait None extends PublisherFlags
  
  /**
    * This is the set of flags that can't be supplied by the developer and is managed by the service itself.
    */
  @js.native
  sealed trait ServiceFlags extends PublisherFlags
  
  /**
    * This should never be returned, it is used to represent a publisher who's flags havent changed during update calls.
    */
  @js.native
  sealed trait UnChanged extends PublisherFlags
  
  /**
    * A verified publisher is one that Microsoft has done some review of and ensured the publisher meets a set of requirements. The requirements to become a verified publisher are not listed here.  They can be found in public documentation (TBD).
    */
  @js.native
  sealed trait Verified extends PublisherFlags
  
  /* 1 */ val Disabled: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherFlags.Disabled with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherFlags.None with Double = js.native
  /* 3 */ val ServiceFlags: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherFlags.ServiceFlags with Double = js.native
  /* 1073741824 */ val UnChanged: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherFlags.UnChanged with Double = js.native
  /* 2 */ val Verified: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherFlags.Verified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherFlags with Double] = js.native
}

