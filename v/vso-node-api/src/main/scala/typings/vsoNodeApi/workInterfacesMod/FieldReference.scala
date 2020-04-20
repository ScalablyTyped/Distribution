package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldReference extends js.Object {
  /**
    * fieldRefName for the field
    */
  var referenceName: String
  /**
    * Full http link to more information about the field
    */
  var url: String
}

object FieldReference {
  @scala.inline
  def apply(referenceName: String, url: String): FieldReference = {
    val __obj = js.Dynamic.literal(referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldReference]
  }
}

