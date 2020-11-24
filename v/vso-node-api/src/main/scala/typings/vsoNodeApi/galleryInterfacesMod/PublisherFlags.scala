package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublisherFlags extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherFlags")
@js.native
object PublisherFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherFlags with Double] = js.native
  
  /**
    * The Disabled flag for a publisher means the publisher can't be changed and won't be used by consumers, this extends to extensions owned by the publisher as well. The disabled flag is managed by the service and can't be supplied by the Extension Developers.
    */
  @js.native
  sealed trait Disabled extends PublisherFlags
  /* 1 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /**
    * No flags exist for this publisher.
    */
  @js.native
  sealed trait None extends PublisherFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * This is the set of flags that can't be supplied by the developer and is managed by the service itself.
    */
  @js.native
  sealed trait ServiceFlags extends PublisherFlags
  /* 3 */ @js.native
  object ServiceFlags extends TopLevel[ServiceFlags with Double]
  
  /**
    * This should never be returned, it is used to represent a publisher who's flags havent changed during update calls.
    */
  @js.native
  sealed trait UnChanged extends PublisherFlags
  /* 1073741824 */ @js.native
  object UnChanged extends TopLevel[UnChanged with Double]
  
  /**
    * A verified publisher is one that Microsoft has done some review of and ensured the publisher meets a set of requirements. The requirements to become a verified publisher are not listed here.  They can be found in public documentation (TBD).
    */
  @js.native
  sealed trait Verified extends PublisherFlags
  /* 2 */ @js.native
  object Verified extends TopLevel[Verified with Double]
}
