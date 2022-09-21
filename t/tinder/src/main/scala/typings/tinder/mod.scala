package typings.tinder

import typings.node.fsMod.ReadStream
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tinder", "TinderClient")
  @js.native
  open class TinderClient () extends StObject {
    
    /**
      * Authorize this tinder client
      * @param {String} fbToken the Facebook token. This will be obtained when authenticating the user
      * @param {String} fbId the Facebook user id.
      * @param {Function} callback the callback to invoke when the request completes
      */
    def authorize(fbToken: String, fbId: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Change a web username for the current account if it's already been set
      *
      * @param {String} userName the username to request be created
      * @param {Function} callback the callback to invoke when the request completes
      */
    def changeUsername(username: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Create a web username for the current account
      *
      * @param {String} userName the username to request be created
      * @param {Function} callback the callback to invoke when the request completes
      */
    def createUsername(username: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Delete the current account
      * @param {Function} callback the callback to invoke when the request completes
      */
    def deleteAccount(callback: Callback[Any]): Unit = js.native
    
    /**
      * Delete your current job
      * @param {Function} callback the callback to invoke when the request completes
      */
    def deleteJob(callback: Callback[Any]): Unit = js.native
    
    /**
      * Delete a picture from the current account
      * @param {String} pictureId the id of the picture
      * @param {Function} callback the callback to invoke when the request completes
      */
    def deletePicture(pictureId: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Delete your current school
      * @param {Function} callback the callback to invoke when the request completes
      */
    def deleteSchool(callback: Callback[Any]): Unit = js.native
    
    /**
      * Deletes the existing web username for the current account
      *
      * @param {Function} callback the callback to invoke when the request completes
      */
    def deleteUsername(username: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Gets the current account info
      * @param {Function} callback the callback to invoke when the request completes
      */
    def getAccount(callback: Callback[Any]): Unit = js.native
    
    /**
      * Returns the xAuthToken
      * @return xAuthToken
      */
    def getAuthToken(): String = js.native
    
    /**
      * Returns client information and globals
      * Globals are used for interacting with tinder api limits
      */
    def getDefaults(): Any = js.native
    
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
    def getProfile(callback: Callback[Any]): Unit = js.native
    
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
    def getShareLink(userId: String, callback: Callback[Any]): Unit = js.native
    
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
    def getUser(userId: String, callback: Callback[Any]): Unit = js.native
    
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
    def like(userId: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Passes (swipes left) on a user
      * @param {String} userId the id of the user
      * @param {Function} callback the callback to invoke when the request completes
      */
    def pass(userId: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Report a user
      *
      * @param {String} userId the id of the user
      * @param {Number} causeId one of 4 (inappropriate photos), 1 (spam), or 0 (other)
      * @param {String} causeText optional reason for report when causeId is 0 (other)
      * @param {Function} callback the callback to invoke when the request completes
      */
    def report(userId: String, causeId: Number, causeText: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Reset the passport location
      * @param {Function} callback the callback to invoke when the request completes
      */
    def resetPassport(callback: Callback[Any]): Unit = js.native
    
    /**
      * Sends a message to a user
      * @param {String} matchId the id of the match
      * @param {String} message the message to send
      * @param {Function} callback the callback to invoke when the request completes
      */
    def sendMessage(matchId: String, message: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Set auth token if you have it saved, no need to do fb login every time
      */
    def setAuthToken(xAuthToken: String): Unit = js.native
    
    /**
      * Superlikes a user
      * @param {String} userId the id of the user
      * @param {Function} callback the callback to invoke when the request completes
      */
    def superLike(userId: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Unmatch with a user
      * @param {String} matchID the id of the match
      * @param {Function} callback the callback to invoke when the request completes
      */
    def unmatch(matchId: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Update your bio
      * @param {String} bio is you bio (500 characters max.)
      * @param {Function} callback the callback to invoke when the request completes
      */
    def updateBio(bio: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Update your gender
      * @param {Number} gender is your gender (0 = Male, 1 = Female)
      * @param {Function} callback the callback to invoke when the request completes
      */
    def updateGender(gender: Double, callback: Callback[Any]): Unit = js.native
    
    /**
      * Update your job
      * @param {String} id is the facebook id of the job
      * @param {Function} callback the callback to invoke when the request completes
      */
    def updateJob(id: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Update the passport location
      * @param {Number} lon the longitude
      * @param {Number} lat the latitutde
      * @param {Function} callback the callback to invoke when the request completes
      */
    def updatePassport(latitude: String, longitude: String, callback: Callback[Any]): Unit = js.native
    
    /**
      * Updates the geographical position for the current account
      * @param {Number} lon the longitude
      * @param {Number} lat the latitutde
      * @param {Function} callback the callback to invoke when the request completes
      */
    def updatePosition(longitude: Number, latitude: Number, callback: Callback[Any]): Unit = js.native
    
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
      callback: Callback[Any]
    ): Unit = js.native
    
    /**
      * Update your school
      * @param {String} id is the facebook id of the school
      * @param {Function} callback the callback to invoke when the request completes
      */
    def updateSchool(id: String, callback: Callback[Any]): Unit = js.native
    
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
      callback: Callback[Any]
    ): Unit = js.native
    
    /**
      * Upload a new picture to the current account
      * @param {Buffer} file the picture that you want to upload
      * @param {Function} callback the callback to invoke when the request completes
      */
    def uploadPicture(file: ReadStream, callback: Callback[Any]): Unit = js.native
    
    /**
      * The current account's user id
      */
    var userId: String = js.native
  }
  
  type Callback[T] = js.Function2[/* error */ Any, /* data */ T, Any]
  
  trait TinderHistory extends StObject {
    
    var blocks: js.Array[String]
    
    // todo
    var deleted_lists: js.Array[Any]
    
    // todo
    var last_activity_date: String
    
    // todo
    var liked_messages: js.Array[TinderLikedMessage]
    
    var lists: js.Array[Any]
    
    var matches: js.Array[TinderMatch]
    
    var squads: js.Array[Any]
  }
  object TinderHistory {
    
    inline def apply(
      blocks: js.Array[String],
      deleted_lists: js.Array[Any],
      last_activity_date: String,
      liked_messages: js.Array[TinderLikedMessage],
      lists: js.Array[Any],
      matches: js.Array[TinderMatch],
      squads: js.Array[Any]
    ): TinderHistory = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], deleted_lists = deleted_lists.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], liked_messages = liked_messages.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], squads = squads.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderHistory]
    }
    
    extension [Self <: TinderHistory](x: Self) {
      
      inline def setBlocks(value: js.Array[String]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: String*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setDeleted_lists(value: js.Array[Any]): Self = StObject.set(x, "deleted_lists", value.asInstanceOf[js.Any])
      
      inline def setDeleted_listsVarargs(value: Any*): Self = StObject.set(x, "deleted_lists", js.Array(value*))
      
      inline def setLast_activity_date(value: String): Self = StObject.set(x, "last_activity_date", value.asInstanceOf[js.Any])
      
      inline def setLiked_messages(value: js.Array[TinderLikedMessage]): Self = StObject.set(x, "liked_messages", value.asInstanceOf[js.Any])
      
      inline def setLiked_messagesVarargs(value: TinderLikedMessage*): Self = StObject.set(x, "liked_messages", js.Array(value*))
      
      inline def setLists(value: js.Array[Any]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsVarargs(value: Any*): Self = StObject.set(x, "lists", js.Array(value*))
      
      inline def setMatches(value: js.Array[TinderMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: TinderMatch*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setSquads(value: js.Array[Any]): Self = StObject.set(x, "squads", value.asInstanceOf[js.Any])
      
      inline def setSquadsVarargs(value: Any*): Self = StObject.set(x, "squads", js.Array(value*))
    }
  }
  
  trait TinderLikedMessage extends StObject {
    
    var is_liked: Boolean
    
    var liker_id: String
    
    var match_id: String
    
    var message_id: String
    
    var updated_at: String
  }
  object TinderLikedMessage {
    
    inline def apply(is_liked: Boolean, liker_id: String, match_id: String, message_id: String, updated_at: String): TinderLikedMessage = {
      val __obj = js.Dynamic.literal(is_liked = is_liked.asInstanceOf[js.Any], liker_id = liker_id.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderLikedMessage]
    }
    
    extension [Self <: TinderLikedMessage](x: Self) {
      
      inline def setIs_liked(value: Boolean): Self = StObject.set(x, "is_liked", value.asInstanceOf[js.Any])
      
      inline def setLiker_id(value: String): Self = StObject.set(x, "liker_id", value.asInstanceOf[js.Any])
      
      inline def setMatch_id(value: String): Self = StObject.set(x, "match_id", value.asInstanceOf[js.Any])
      
      inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderMatch extends StObject {
    
    var _id: String
    
    var closed: Boolean
    
    var common_friend_count: Double
    
    var common_like_count: Double
    
    var created_date: String
    
    var dead: Boolean
    
    var following: Boolean
    
    var following_moments: Boolean
    
    var id: String
    
    var is_super_like: Boolean
    
    var last_activity_date: String
    
    var message_count: Double
    
    var messages: js.Array[TinderMessage]
    
    var muted: Boolean
    
    var participants: js.Array[String]
    
    var pending: Boolean
    
    var person: TinderPerson
  }
  object TinderMatch {
    
    inline def apply(
      _id: String,
      closed: Boolean,
      common_friend_count: Double,
      common_like_count: Double,
      created_date: String,
      dead: Boolean,
      following: Boolean,
      following_moments: Boolean,
      id: String,
      is_super_like: Boolean,
      last_activity_date: String,
      message_count: Double,
      messages: js.Array[TinderMessage],
      muted: Boolean,
      participants: js.Array[String],
      pending: Boolean,
      person: TinderPerson
    ): TinderMatch = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], common_friend_count = common_friend_count.asInstanceOf[js.Any], common_like_count = common_like_count.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_moments = following_moments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_super_like = is_super_like.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], person = person.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderMatch]
    }
    
    extension [Self <: TinderMatch](x: Self) {
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setCommon_friend_count(value: Double): Self = StObject.set(x, "common_friend_count", value.asInstanceOf[js.Any])
      
      inline def setCommon_like_count(value: Double): Self = StObject.set(x, "common_like_count", value.asInstanceOf[js.Any])
      
      inline def setCreated_date(value: String): Self = StObject.set(x, "created_date", value.asInstanceOf[js.Any])
      
      inline def setDead(value: Boolean): Self = StObject.set(x, "dead", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setFollowing_moments(value: Boolean): Self = StObject.set(x, "following_moments", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs_super_like(value: Boolean): Self = StObject.set(x, "is_super_like", value.asInstanceOf[js.Any])
      
      inline def setLast_activity_date(value: String): Self = StObject.set(x, "last_activity_date", value.asInstanceOf[js.Any])
      
      inline def setMessage_count(value: Double): Self = StObject.set(x, "message_count", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[TinderMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: TinderMessage*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setParticipants(value: js.Array[String]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsVarargs(value: String*): Self = StObject.set(x, "participants", js.Array(value*))
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPerson(value: TinderPerson): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderMessage extends StObject {
    
    var _id: String
    
    var created_date: String
    
    var from: String
    
    var match_id: String
    
    var message: String
    
    var sent_date: String
    
    var timestamp: Double
    
    var to: String
  }
  object TinderMessage {
    
    inline def apply(
      _id: String,
      created_date: String,
      from: String,
      match_id: String,
      message: String,
      sent_date: String,
      timestamp: Double,
      to: String
    ): TinderMessage = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], match_id = match_id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sent_date = sent_date.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderMessage]
    }
    
    extension [Self <: TinderMessage](x: Self) {
      
      inline def setCreated_date(value: String): Self = StObject.set(x, "created_date", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMatch_id(value: String): Self = StObject.set(x, "match_id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSent_date(value: String): Self = StObject.set(x, "sent_date", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderPerson extends StObject {
    
    var _id: String
    
    var badges: js.Array[Any]
    
    var bio: String
    
    var birth_date: String
    
    var gender: Double
    
    var name: String
    
    var photos: js.Array[TinderPhoto]
    
    var ping_time: String
    
    var user_number: Double
  }
  object TinderPerson {
    
    inline def apply(
      _id: String,
      badges: js.Array[Any],
      bio: String,
      birth_date: String,
      gender: Double,
      name: String,
      photos: js.Array[TinderPhoto],
      ping_time: String,
      user_number: Double
    ): TinderPerson = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], user_number = user_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderPerson]
    }
    
    extension [Self <: TinderPerson](x: Self) {
      
      inline def setBadges(value: js.Array[Any]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      inline def setBadgesVarargs(value: Any*): Self = StObject.set(x, "badges", js.Array(value*))
      
      inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
      
      inline def setGender(value: Double): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[TinderPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: TinderPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setPing_time(value: String): Self = StObject.set(x, "ping_time", value.asInstanceOf[js.Any])
      
      inline def setUser_number(value: Double): Self = StObject.set(x, "user_number", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderPhoto extends StObject {
    
    var `extension`: String
    
    var fileName: String
    
    var id: String
    
    var main: Boolean
    
    var processedFiles: js.Array[TinderPhotoProcessedFile]
    
    var url: String
    
    var xdistance_percent: Double
    
    var xoffset_percent: Double
    
    var ydistance_percent: Double
    
    var yoffset_percent: Double
  }
  object TinderPhoto {
    
    inline def apply(
      `extension`: String,
      fileName: String,
      id: String,
      main: Boolean,
      processedFiles: js.Array[TinderPhotoProcessedFile],
      url: String,
      xdistance_percent: Double,
      xoffset_percent: Double,
      ydistance_percent: Double,
      yoffset_percent: Double
    ): TinderPhoto = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], processedFiles = processedFiles.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xdistance_percent = xdistance_percent.asInstanceOf[js.Any], xoffset_percent = xoffset_percent.asInstanceOf[js.Any], ydistance_percent = ydistance_percent.asInstanceOf[js.Any], yoffset_percent = yoffset_percent.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderPhoto]
    }
    
    extension [Self <: TinderPhoto](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setProcessedFiles(value: js.Array[TinderPhotoProcessedFile]): Self = StObject.set(x, "processedFiles", value.asInstanceOf[js.Any])
      
      inline def setProcessedFilesVarargs(value: TinderPhotoProcessedFile*): Self = StObject.set(x, "processedFiles", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setXdistance_percent(value: Double): Self = StObject.set(x, "xdistance_percent", value.asInstanceOf[js.Any])
      
      inline def setXoffset_percent(value: Double): Self = StObject.set(x, "xoffset_percent", value.asInstanceOf[js.Any])
      
      inline def setYdistance_percent(value: Double): Self = StObject.set(x, "ydistance_percent", value.asInstanceOf[js.Any])
      
      inline def setYoffset_percent(value: Double): Self = StObject.set(x, "yoffset_percent", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderPhotoProcessedFile extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object TinderPhotoProcessedFile {
    
    inline def apply(height: Double, url: String, width: Double): TinderPhotoProcessedFile = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderPhotoProcessedFile]
    }
    
    extension [Self <: TinderPhotoProcessedFile](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderRecommendation extends StObject {
    
    // todo
    var _id: String
    
    var badges: js.Array[Any]
    
    // todo
    var bio: String
    
    var birth_date: String
    
    // todo
    var birth_date_info: String
    
    var common_connections: js.Array[Any]
    
    // todo
    var common_friends: js.Array[Any]
    
    // todo
    var common_interests: js.Array[Any]
    
    // todo
    var common_likes: js.Array[Any]
    
    var distance_mi: Number
    
    var gender: Double
    
    var jobs: js.Array[Any]
    
    var name: String
    
    var photos: js.Array[TinderPhoto]
    
    var ping_time: String
    
    // todo
    var schools: js.Array[Any]
    
    // todo
    var teaser: typings.tinder.anon.String
    
    // todo
    var uncommon_interests: js.Array[Any]
  }
  object TinderRecommendation {
    
    inline def apply(
      _id: String,
      badges: js.Array[Any],
      bio: String,
      birth_date: String,
      birth_date_info: String,
      common_connections: js.Array[Any],
      common_friends: js.Array[Any],
      common_interests: js.Array[Any],
      common_likes: js.Array[Any],
      distance_mi: Number,
      gender: Double,
      jobs: js.Array[Any],
      name: String,
      photos: js.Array[TinderPhoto],
      ping_time: String,
      schools: js.Array[Any],
      teaser: typings.tinder.anon.String,
      uncommon_interests: js.Array[Any]
    ): TinderRecommendation = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], badges = badges.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], birth_date_info = birth_date_info.asInstanceOf[js.Any], common_connections = common_connections.asInstanceOf[js.Any], common_friends = common_friends.asInstanceOf[js.Any], common_interests = common_interests.asInstanceOf[js.Any], common_likes = common_likes.asInstanceOf[js.Any], distance_mi = distance_mi.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], ping_time = ping_time.asInstanceOf[js.Any], schools = schools.asInstanceOf[js.Any], teaser = teaser.asInstanceOf[js.Any], uncommon_interests = uncommon_interests.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderRecommendation]
    }
    
    extension [Self <: TinderRecommendation](x: Self) {
      
      inline def setBadges(value: js.Array[Any]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      inline def setBadgesVarargs(value: Any*): Self = StObject.set(x, "badges", js.Array(value*))
      
      inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
      
      inline def setBirth_date_info(value: String): Self = StObject.set(x, "birth_date_info", value.asInstanceOf[js.Any])
      
      inline def setCommon_connections(value: js.Array[Any]): Self = StObject.set(x, "common_connections", value.asInstanceOf[js.Any])
      
      inline def setCommon_connectionsVarargs(value: Any*): Self = StObject.set(x, "common_connections", js.Array(value*))
      
      inline def setCommon_friends(value: js.Array[Any]): Self = StObject.set(x, "common_friends", value.asInstanceOf[js.Any])
      
      inline def setCommon_friendsVarargs(value: Any*): Self = StObject.set(x, "common_friends", js.Array(value*))
      
      inline def setCommon_interests(value: js.Array[Any]): Self = StObject.set(x, "common_interests", value.asInstanceOf[js.Any])
      
      inline def setCommon_interestsVarargs(value: Any*): Self = StObject.set(x, "common_interests", js.Array(value*))
      
      inline def setCommon_likes(value: js.Array[Any]): Self = StObject.set(x, "common_likes", value.asInstanceOf[js.Any])
      
      inline def setCommon_likesVarargs(value: Any*): Self = StObject.set(x, "common_likes", js.Array(value*))
      
      inline def setDistance_mi(value: Number): Self = StObject.set(x, "distance_mi", value.asInstanceOf[js.Any])
      
      inline def setGender(value: Double): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setJobs(value: js.Array[Any]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setJobsVarargs(value: Any*): Self = StObject.set(x, "jobs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: js.Array[TinderPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setPhotosVarargs(value: TinderPhoto*): Self = StObject.set(x, "photos", js.Array(value*))
      
      inline def setPing_time(value: String): Self = StObject.set(x, "ping_time", value.asInstanceOf[js.Any])
      
      inline def setSchools(value: js.Array[Any]): Self = StObject.set(x, "schools", value.asInstanceOf[js.Any])
      
      inline def setSchoolsVarargs(value: Any*): Self = StObject.set(x, "schools", js.Array(value*))
      
      inline def setTeaser(value: typings.tinder.anon.String): Self = StObject.set(x, "teaser", value.asInstanceOf[js.Any])
      
      inline def setUncommon_interests(value: js.Array[Any]): Self = StObject.set(x, "uncommon_interests", value.asInstanceOf[js.Any])
      
      inline def setUncommon_interestsVarargs(value: Any*): Self = StObject.set(x, "uncommon_interests", js.Array(value*))
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * When out of recommendations it is set to "out of recs", a possible value is also "recs timeout",
    * otherwise does not seem to be used
    */
  trait TinderRecommendationsResult extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var results: js.Array[TinderRecommendation]
    
    var status: Number
  }
  object TinderRecommendationsResult {
    
    inline def apply(results: js.Array[TinderRecommendation], status: Number): TinderRecommendationsResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderRecommendationsResult]
    }
    
    extension [Self <: TinderRecommendationsResult](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setResults(value: js.Array[TinderRecommendation]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: TinderRecommendation*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStatus(value: Number): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait TinderUpdates extends StObject {
    
    var blocks: js.Array[Any]
    
    var deleted_lists: js.Array[Any]
    
    var last_activity_date: String
    
    var liked_messages: js.Array[TinderMessage]
    
    var lists: js.Array[Any]
    
    var matches: js.Array[Any]
    
    var matchmaker: js.Array[Any]
    
    var squads: js.Array[Any]
  }
  object TinderUpdates {
    
    inline def apply(
      blocks: js.Array[Any],
      deleted_lists: js.Array[Any],
      last_activity_date: String,
      liked_messages: js.Array[TinderMessage],
      lists: js.Array[Any],
      matches: js.Array[Any],
      matchmaker: js.Array[Any],
      squads: js.Array[Any]
    ): TinderUpdates = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], deleted_lists = deleted_lists.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], liked_messages = liked_messages.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], matchmaker = matchmaker.asInstanceOf[js.Any], squads = squads.asInstanceOf[js.Any])
      __obj.asInstanceOf[TinderUpdates]
    }
    
    extension [Self <: TinderUpdates](x: Self) {
      
      inline def setBlocks(value: js.Array[Any]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: Any*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setDeleted_lists(value: js.Array[Any]): Self = StObject.set(x, "deleted_lists", value.asInstanceOf[js.Any])
      
      inline def setDeleted_listsVarargs(value: Any*): Self = StObject.set(x, "deleted_lists", js.Array(value*))
      
      inline def setLast_activity_date(value: String): Self = StObject.set(x, "last_activity_date", value.asInstanceOf[js.Any])
      
      inline def setLiked_messages(value: js.Array[TinderMessage]): Self = StObject.set(x, "liked_messages", value.asInstanceOf[js.Any])
      
      inline def setLiked_messagesVarargs(value: TinderMessage*): Self = StObject.set(x, "liked_messages", js.Array(value*))
      
      inline def setLists(value: js.Array[Any]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsVarargs(value: Any*): Self = StObject.set(x, "lists", js.Array(value*))
      
      inline def setMatches(value: js.Array[Any]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: Any*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setMatchmaker(value: js.Array[Any]): Self = StObject.set(x, "matchmaker", value.asInstanceOf[js.Any])
      
      inline def setMatchmakerVarargs(value: Any*): Self = StObject.set(x, "matchmaker", js.Array(value*))
      
      inline def setSquads(value: js.Array[Any]): Self = StObject.set(x, "squads", value.asInstanceOf[js.Any])
      
      inline def setSquadsVarargs(value: Any*): Self = StObject.set(x, "squads", js.Array(value*))
    }
  }
}
