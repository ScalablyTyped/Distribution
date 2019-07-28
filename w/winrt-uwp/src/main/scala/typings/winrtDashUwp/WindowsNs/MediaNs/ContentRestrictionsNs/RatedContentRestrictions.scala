package typings.winrtDashUwp.WindowsNs.MediaNs.ContentRestrictionsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.restrictionschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains all behavior and functionality related to a user's Family Safety content settings. */
@JSGlobal("Windows.Media.ContentRestrictions.RatedContentRestrictions")
@js.native
/** Initializes a new instance of the RatedContentRestrictions class. */
class RatedContentRestrictions () extends js.Object {
  /**
    * Initializes a new instance of the RatedContentRestrictions class, with the specified age rating the app uses, to restrict content usage.
    * @param maxAgeRating The max age rating.
    */
  def this(maxAgeRating: Double) = this()
  /** An event handler to notify apps when there are changes to the user's content settings. */
  @JSName("onrestrictionschanged")
  var onrestrictionschanged_Original: EventHandler[_] = js.native
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

