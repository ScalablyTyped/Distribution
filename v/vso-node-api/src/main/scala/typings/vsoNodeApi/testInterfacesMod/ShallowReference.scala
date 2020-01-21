package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShallowReference extends js.Object {
  /**
    * Id of the resource
    */
  var id: String
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String
  /**
    * Full http link to the resource
    */
  var url: String
}

object ShallowReference {
  @scala.inline
  def apply(id: String, name: String, url: String): ShallowReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShallowReference]
  }
}

