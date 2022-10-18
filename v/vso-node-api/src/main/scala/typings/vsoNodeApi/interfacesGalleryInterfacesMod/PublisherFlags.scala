package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublisherFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherFlags")
@js.native
object PublisherFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherFlags & Double] = js.native
  
  /**
    * The Disabled flag for a publisher means the publisher can't be changed and won't be used by consumers, this extends to extensions owned by the publisher as well. The disabled flag is managed by the service and can't be supplied by the Extension Developers.
    */
  @js.native
  sealed trait Disabled
    extends StObject
       with PublisherFlags
  /* 1 */ val Disabled: typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherFlags.Disabled & Double = js.native
  
  /**
    * No flags exist for this publisher.
    */
  @js.native
  sealed trait None
    extends StObject
       with PublisherFlags
  /* 0 */ val None: typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherFlags.None & Double = js.native
  
  /**
    * This is the set of flags that can't be supplied by the developer and is managed by the service itself.
    */
  @js.native
  sealed trait ServiceFlags
    extends StObject
       with PublisherFlags
  /* 3 */ val ServiceFlags: typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherFlags.ServiceFlags & Double = js.native
  
  /**
    * This should never be returned, it is used to represent a publisher who's flags havent changed during update calls.
    */
  @js.native
  sealed trait UnChanged
    extends StObject
       with PublisherFlags
  /* 1073741824 */ val UnChanged: typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherFlags.UnChanged & Double = js.native
  
  /**
    * A verified publisher is one that Microsoft has done some review of and ensured the publisher meets a set of requirements. The requirements to become a verified publisher are not listed here.  They can be found in public documentation (TBD).
    */
  @js.native
  sealed trait Verified
    extends StObject
       with PublisherFlags
  /* 2 */ val Verified: typings.vsoNodeApi.interfacesGalleryInterfacesMod.PublisherFlags.Verified & Double = js.native
}
