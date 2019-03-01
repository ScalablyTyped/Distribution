package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeList[T] extends js.Object {
  var allChangesIncluded: scala.Boolean
  var changeCounts: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var changes: js.Array[Change[T]]
  var comment: java.lang.String
  var commentTruncated: scala.Boolean
  var creationDate: stdLib.Date
  var notes: js.Array[CheckinNote]
  var owner: java.lang.String
  var ownerDisplayName: java.lang.String
  var ownerId: java.lang.String
  var sortDate: stdLib.Date
  var version: java.lang.String
}

object ChangeList {
  @scala.inline
  def apply[T](
    allChangesIncluded: scala.Boolean,
    changeCounts: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    changes: js.Array[Change[T]],
    comment: java.lang.String,
    commentTruncated: scala.Boolean,
    creationDate: stdLib.Date,
    notes: js.Array[CheckinNote],
    owner: java.lang.String,
    ownerDisplayName: java.lang.String,
    ownerId: java.lang.String,
    sortDate: stdLib.Date,
    version: java.lang.String
  ): ChangeList[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allChangesIncluded")(allChangesIncluded)
    __obj.updateDynamic("changeCounts")(changeCounts)
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("commentTruncated")(commentTruncated)
    __obj.updateDynamic("creationDate")(creationDate)
    __obj.updateDynamic("notes")(notes)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("ownerDisplayName")(ownerDisplayName)
    __obj.updateDynamic("ownerId")(ownerId)
    __obj.updateDynamic("sortDate")(sortDate)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ChangeList[T]]
  }
}

