package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ContentRestrictionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains all behavior and functionality related to a user's Family Safety content settings. */
@JSGlobal("Windows.Media.ContentRestrictions.RatedContentRestrictions")
@js.native
class RatedContentRestrictions () extends js.Object {
  /**
                   * Initializes a new instance of the RatedContentRestrictions class, with the specified age rating the app uses, to restrict content usage.
                   * @param maxAgeRating The max age rating.
                   */
  def this(maxAgeRating: scala.Double) = this()
  /** An event handler to notify apps when there are changes to the user's content settings. */
  @JSName("onrestrictionschanged")
  var onrestrictionschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_restrictionschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.restrictionschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Gets information that is used filter an app's content catalog.
                   * @return Returns a ContentRestrictionsBrowsePolicy object.
                   */
  def getBrowsePolicyAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContentRestrictionsBrowsePolicy] = js.native
  /**
                   * Gets the policy that applies to a piece of content, for content browsing and consumption.
                   * @param RatedContentDescription The rated content info.
                   * @return This method returns these values:
                   */
  def getRestrictionLevelAsync(RatedContentDescription: RatedContentDescription): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ContentAccessRestrictionLevel] = js.native
  /** An event handler to notify apps when there are changes to the user's content settings. */
  def onrestrictionschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_restrictionschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.restrictionschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]
  ): scala.Unit = js.native
  /**
                   * Determines whether the user is allowed to consume a piece of content.
                   * @param RatedContentDescription The rated content info.
                   * @return Returns true, if the user can consume the content. Otherwise, returns false.
                   */
  def requestContentAccessAsync(RatedContentDescription: RatedContentDescription): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

