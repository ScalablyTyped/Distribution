package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PublisherQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherQueryFlags")
@js.native
object PublisherQueryFlags extends js.Object {
  /**
       * Is used to include email address of all the users who are marked as owners for the publisher
       */
  @js.native
  sealed trait IncludeEmailAddress
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherQueryFlags
  
  /**
       * Is used to include a list of basic extension details for all extensions published by the requested publisher.
       */
  @js.native
  sealed trait IncludeExtensions
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherQueryFlags
  
  /**
       * None is used to retrieve only the basic publisher details.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherQueryFlags
  
  /* 2 */ val IncludeEmailAddress: IncludeEmailAddress with scala.Double = js.native
  /* 1 */ val IncludeExtensions: IncludeExtensions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherQueryFlags with scala.Double
  ] = js.native
}

