package typings.tinder.tinderMod

import typings.node.fsMod.ReadStream
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinder", "TinderClient")
@js.native
class TinderClient () extends js.Object {
  /**
    * The current account's user id
    */
  var userId: String = js.native
  /**
    * Authorize this tinder client
    * @param {String} fbToken the Facebook token. This will be obtained when authenticating the user
    * @param {String} fbId the Facebook user id.
    * @param {Function} callback the callback to invoke when the request completes
    */
  def authorize(fbToken: String, fbId: String, callback: Callback[_]): Unit = js.native
  /**
    * Change a web username for the current account if it's already been set
    *
    * @param {String} userName the username to request be created
    * @param {Function} callback the callback to invoke when the request completes
    */
  def changeUsername(username: String, callback: Callback[_]): Unit = js.native
  /**
    * Create a web username for the current account
    *
    * @param {String} userName the username to request be created
    * @param {Function} callback the callback to invoke when the request completes
    */
  def createUsername(username: String, callback: Callback[_]): Unit = js.native
  /**
    * Delete the current account
    * @param {Function} callback the callback to invoke when the request completes
    */
  def deleteAccount(callback: Callback[_]): Unit = js.native
  /**
    * Delete your current job
    * @param {Function} callback the callback to invoke when the request completes
    */
  def deleteJob(callback: Callback[_]): Unit = js.native
  /**
    * Delete a picture from the current account
    * @param {String} pictureId the id of the picture
    * @param {Function} callback the callback to invoke when the request completes
    */
  def deletePicture(pictureId: String, callback: Callback[_]): Unit = js.native
  /**
    * Delete your current school
    * @param {Function} callback the callback to invoke when the request completes
    */
  def deleteSchool(callback: Callback[_]): Unit = js.native
  /**
    * Deletes the existing web username for the current account
    *
    * @param {Function} callback the callback to invoke when the request completes
    */
  def deleteUsername(username: String, callback: Callback[_]): Unit = js.native
  /**
    * Gets the current account info
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getAccount(callback: Callback[_]): Unit = js.native
  /**
    * Returns the xAuthToken
    * @return xAuthToken
    */
  def getAuthToken(): String = js.native
  /**
    * Returns client information and globals
    * Globals are used for interacting with tinder api limits
    */
  def getDefaults(): js.Any = js.native
  /**
    * Gets the entire history for the current account (all matches, messages, blocks, etc.)
    *
    * NOTE: Old messages seem to not be returned after a certain threshold. Not yet
    * sure what exactly that timeout is. The official client seems to get this update
    * once when the app is installed then cache the results and only rely on the
    * incremental updates
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getHistory(callback: Callback[TinderHistory]): Unit = js.native
  /**
    * @deprecated
    * Get authenticated user info
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getProfile(callback: Callback[_]): Unit = js.native
  /**
    * Gets a list of nearby users
    * @param {Number} limit the maximum number of profiles to fetch
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getRecommendations(limit: Double, callback: Callback[TinderRecommendationsResult]): Unit = js.native
  /**
    * Get a share URL for a user
    *
    * @param {String} userId the id of the user
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getShareLink(userId: String, callback: Callback[_]): Unit = js.native
  /**
    * Gets a list of new updates. This will be things like new messages, users who liked you, etc.
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getUpdates(callback: Callback[TinderUpdates]): Unit = js.native
  /**
    * Gets a user by id
    * @param {String} userId the id of the user
    * @param {Function} callback the callback to invoke when the request completes
    */
  def getUser(userId: String, callback: Callback[_]): Unit = js.native
  /**
    * Returns whether this client is authorized
    * @return whether or not this client is authorized
    */
  def isAuthorized(): Boolean = js.native
  /**
    * Likes (swipes right) on a user
    * @param {String} userId the id of the user
    * @param {Function} callback the callback to invoke when the request completes
    */
  def like(userId: String, callback: Callback[_]): Unit = js.native
  /**
    * Passes (swipes left) on a user
    * @param {String} userId the id of the user
    * @param {Function} callback the callback to invoke when the request completes
    */
  def pass(userId: String, callback: Callback[_]): Unit = js.native
  /**
    * Report a user
    *
    * @param {String} userId the id of the user
    * @param {Number} causeId one of 4 (inappropriate photos), 1 (spam), or 0 (other)
    * @param {String} causeText optional reason for report when causeId is 0 (other)
    * @param {Function} callback the callback to invoke when the request completes
    */
  def report(userId: String, causeId: Number, causeText: String, callback: Callback[_]): Unit = js.native
  /**
    * Reset the passport location
    * @param {Function} callback the callback to invoke when the request completes
    */
  def resetPassport(callback: Callback[_]): Unit = js.native
  /**
    * Sends a message to a user
    * @param {String} matchId the id of the match
    * @param {String} message the message to send
    * @param {Function} callback the callback to invoke when the request completes
    */
  def sendMessage(matchId: String, message: String, callback: Callback[_]): Unit = js.native
  /**
    * Set auth token if you have it saved, no need to do fb login every time
    */
  def setAuthToken(xAuthToken: String): Unit = js.native
  /**
    * Superlikes a user
    * @param {String} userId the id of the user
    * @param {Function} callback the callback to invoke when the request completes
    */
  def superLike(userId: String, callback: Callback[_]): Unit = js.native
  /**
    * Unmatch with a user
    * @param {String} matchID the id of the match
    * @param {Function} callback the callback to invoke when the request completes
    */
  def unmatch(matchId: String, callback: Callback[_]): Unit = js.native
  /**
    * Update your bio
    * @param {String} bio is you bio (500 characters max.)
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updateBio(bio: String, callback: Callback[_]): Unit = js.native
  /**
    * Update your gender
    * @param {Number} gender is your gender (0 = Male, 1 = Female)
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updateGender(gender: Double, callback: Callback[_]): Unit = js.native
  /**
    * Update your job
    * @param {String} id is the facebook id of the job
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updateJob(id: String, callback: Callback[_]): Unit = js.native
  /**
    * Update the passport location
    * @param {Number} lon the longitude
    * @param {Number} lat the latitutde
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updatePassport(latitude: String, longitude: String, callback: Callback[_]): Unit = js.native
  /**
    * Updates the geographical position for the current account
    * @param {Number} lon the longitude
    * @param {Number} lat the latitutde
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updatePosition(longitude: Number, latitude: Number, callback: Callback[_]): Unit = js.native
  /**
    * Updates the preferences for the current account
    * @param {Boolean} discovery whether or not to show user's card
    * @param {Number} ageMin the minimum age to show recommendations
    * @param {Number} ageMax the maximum age to show recommendations
    * @param {Number} gender the gender to show recommentations (0 = Male, 1 = Female, -1 = Both)
    * @param {Number} distance the distance in miles to show recommendations
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updatePreferences(
    discovery: Boolean,
    ageMin: Double,
    ageMax: Double,
    gender: Double,
    distance: Double,
    callback: Callback[_]
  ): Unit = js.native
  /**
    * Update your school
    * @param {String} id is the facebook id of the school
    * @param {Function} callback the callback to invoke when the request completes
    */
  def updateSchool(id: String, callback: Callback[_]): Unit = js.native
  /**
    * Post a new picture to the current account from Facebook
    * @param {String} pictureId is the facebook id of the picture
    * @param {Float} xdistance_percent is the zoom percentage in x 0 full Zoom 1 no Zoom
    * @param {Float} ydistance_percent is the zoom percentage in x 0 full Zoom 1 no Zoom
    * @param {Float} xoffset_percent is the offset from the left corner in percentage
    * @param {Float} yoffset_percent is the offset from the top corner in percentage
    * @param {Function} callback the callback to invoke when the request completes
    */
  def uploadFBPicture(
    pictureId: String,
    xdistance_percent: Double,
    ydistance_percent: Double,
    xoffset_percent: Double,
    yoffset_percent: Double,
    callback: Callback[_]
  ): Unit = js.native
  /**
    * Upload a new picture to the current account
    * @param {Buffer} file the picture that you want to upload
    * @param {Function} callback the callback to invoke when the request completes
    */
  def uploadPicture(file: ReadStream, callback: Callback[_]): Unit = js.native
}

