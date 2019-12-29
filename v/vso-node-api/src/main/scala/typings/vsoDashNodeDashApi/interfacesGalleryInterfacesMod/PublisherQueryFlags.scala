package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherQueryFlags with Double] = js.native
  /* 2 */ @js.native
  object IncludeEmailAddress extends TopLevel[IncludeEmailAddress with Double]
  
  /* 1 */ @js.native
  object IncludeExtensions extends TopLevel[IncludeExtensions with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

