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

