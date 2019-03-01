package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamProjectCollectionReference extends js.Object {
  /**
    * Collection Id.
    */
  var id: java.lang.String
  /**
    * Collection Name.
    */
  var name: java.lang.String
  /**
    * Collection REST Url.
    */
  var url: java.lang.String
}

object TeamProjectCollectionReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, url: java.lang.String): TeamProjectCollectionReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TeamProjectCollectionReference]
  }
}

