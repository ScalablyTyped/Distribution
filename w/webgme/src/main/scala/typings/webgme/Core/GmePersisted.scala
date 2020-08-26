package typings.webgme.Core

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmePersisted extends js.Object {
  var objects: StringDictionary[DataObject] = js.native
  var rootHash: ObjectHash = js.native
}

object GmePersisted {
  @scala.inline
  def apply(objects: StringDictionary[DataObject], rootHash: ObjectHash): GmePersisted = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], rootHash = rootHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GmePersisted]
  }
  @scala.inline
  implicit class GmePersistedOps[Self <: GmePersisted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObjects(value: StringDictionary[DataObject]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootHash(value: ObjectHash): Self = this.set("rootHash", value.asInstanceOf[js.Any])
  }
  
}

