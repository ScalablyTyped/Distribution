package typings.webgme.Core

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmePersisted extends js.Object {
  var objects: StringDictionary[DataObject]
  var rootHash: ObjectHash
}

object GmePersisted {
  @scala.inline
  def apply(objects: StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GmePersisted]
  }
}

