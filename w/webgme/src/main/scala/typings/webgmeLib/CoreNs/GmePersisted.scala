package typings
package webgmeLib.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmePersisted extends js.Object {
  var objects: org.scalablytyped.runtime.StringDictionary[DataObject]
  var rootHash: ObjectHash
}

object GmePersisted {
  @scala.inline
  def apply(objects: org.scalablytyped.runtime.StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("rootHash")(rootHash)
    __obj.asInstanceOf[GmePersisted]
  }
}

