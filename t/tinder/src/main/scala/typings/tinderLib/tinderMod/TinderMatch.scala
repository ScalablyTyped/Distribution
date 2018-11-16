package typings
package tinderLib.tinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TinderMatch extends js.Object {
  var _id: java.lang.String
  var closed: scala.Boolean
  var common_friend_count: scala.Double
  var common_like_count: scala.Double
  var created_date: java.lang.String
  var dead: scala.Boolean
  var following: scala.Boolean
  var following_moments: scala.Boolean
  var id: java.lang.String
  var is_super_like: scala.Boolean
  var last_activity_date: java.lang.String
  var message_count: scala.Double
  var messages: js.Array[TinderMessage]
  var muted: scala.Boolean
  var participants: js.Array[java.lang.String]
  var pending: scala.Boolean
  var person: TinderPerson
}

