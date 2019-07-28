package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  sealed trait IncludeEmailAddress extends PublisherQueryFlags
  
  /**
    * Is used to include a list of basic extension details for all extensions published by the requested publisher.
    */
  @js.native
  sealed trait IncludeExtensions extends PublisherQueryFlags
  
  /**
    * None is used to retrieve only the basic publisher details.
    */
  @js.native
  sealed trait None extends PublisherQueryFlags
  
  /* 2 */ val IncludeEmailAddress: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherQueryFlags.IncludeEmailAddress with Double = js.native
  /* 1 */ val IncludeExtensions: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherQueryFlags.IncludeExtensions with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherQueryFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherQueryFlags with Double] = js.native
}

