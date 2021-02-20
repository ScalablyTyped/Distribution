package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublisherQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherQueryFlags")
@js.native
object PublisherQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherQueryFlags with Double] = js.native
  
  /**
    * Is used to include email address of all the users who are marked as owners for the publisher
    */
  @js.native
  sealed trait IncludeEmailAddress extends PublisherQueryFlags
  /* 2 */ val IncludeEmailAddress: typings.vsoNodeApi.galleryInterfacesMod.PublisherQueryFlags.IncludeEmailAddress with Double = js.native
  
  /**
    * Is used to include a list of basic extension details for all extensions published by the requested publisher.
    */
  @js.native
  sealed trait IncludeExtensions extends PublisherQueryFlags
  /* 1 */ val IncludeExtensions: typings.vsoNodeApi.galleryInterfacesMod.PublisherQueryFlags.IncludeExtensions with Double = js.native
  
  /**
    * None is used to retrieve only the basic publisher details.
    */
  @js.native
  sealed trait None extends PublisherQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.galleryInterfacesMod.PublisherQueryFlags.None with Double = js.native
}
