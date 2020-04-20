package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamProjectCollectionReference extends js.Object {
  /**
    * Collection Id.
    */
  var id: String
  /**
    * Collection Name.
    */
  var name: String
  /**
    * Collection REST Url.
    */
  var url: String
}

object TeamProjectCollectionReference {
  @scala.inline
  def apply(id: String, name: String, url: String): TeamProjectCollectionReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectCollectionReference]
  }
}

