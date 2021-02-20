package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QnAItemStatus extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "QnAItemStatus")
@js.native
object QnAItemStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QnAItemStatus with Double] = js.native
  
  @js.native
  sealed trait None extends QnAItemStatus
  /* 0 */ val None: typings.vsoNodeApi.galleryInterfacesMod.QnAItemStatus.None with Double = js.native
  
  /**
    * The PublisherCreated flag indicates whether the item has been created by extension publisher.
    */
  @js.native
  sealed trait PublisherCreated extends QnAItemStatus
  /* 2 */ val PublisherCreated: typings.vsoNodeApi.galleryInterfacesMod.QnAItemStatus.PublisherCreated with Double = js.native
  
  /**
    * The UserEditable flag indicates whether the item is editable by the logged in user.
    */
  @js.native
  sealed trait UserEditable extends QnAItemStatus
  /* 1 */ val UserEditable: typings.vsoNodeApi.galleryInterfacesMod.QnAItemStatus.UserEditable with Double = js.native
}
