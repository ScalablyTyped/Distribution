package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change[T] extends js.Object {
  /**
    * The type of change that was made to the item.
    */
  var changeType: VersionControlChangeType
  /**
    * Current version.
    */
  var item: T
  /**
    * Content of the item after the change.
    */
  var newContent: ItemContent
  /**
    * Path of the item on the server.
    */
  var sourceServerItem: java.lang.String
  /**
    * URL to retrieve the item.
    */
  var url: java.lang.String
}

