package typings.winrtUwp.Windows.Media.ContentRestrictions

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.restrictionschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains all behavior and functionality related to a user's Family Safety content settings. */
@js.native
trait RatedContentRestrictions extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_restrictionschanged(`type`: restrictionschanged, listener: EventHandler[_]): Unit = js.native
  
  /**
    * Gets information that is used filter an app's content catalog.
    * @return Returns a ContentRestrictionsBrowsePolicy object.
    */
  def getBrowsePolicyAsync(): IPromiseWithIAsyncOperation[ContentRestrictionsBrowsePolicy] = js.native
  
  /**
    * Gets the policy that applies to a piece of content, for content browsing and consumption.
    * @param RatedContentDescription The rated content info.
    * @return This method returns these values:
    */
  def getRestrictionLevelAsync(RatedContentDescription: RatedContentDescription): IPromiseWithIAsyncOperation[ContentAccessRestrictionLevel] = js.native
  
  /** An event handler to notify apps when there are changes to the user's content settings. */
  def onrestrictionschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
  /** An event handler to notify apps when there are changes to the user's content settings. */
  @JSName("onrestrictionschanged")
  var onrestrictionschanged_Original: EventHandler[_] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_restrictionschanged(`type`: restrictionschanged, listener: EventHandler[_]): Unit = js.native
  
  /**
    * Determines whether the user is allowed to consume a piece of content.
    * @param RatedContentDescription The rated content info.
    * @return Returns true, if the user can consume the content. Otherwise, returns false.
    */
  def requestContentAccessAsync(RatedContentDescription: RatedContentDescription): IPromiseWithIAsyncOperation[Boolean] = js.native
}
