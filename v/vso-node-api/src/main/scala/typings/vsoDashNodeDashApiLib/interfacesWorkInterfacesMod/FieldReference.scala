package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldReference extends js.Object {
  /**
    * fieldRefName for the field
    */
  var referenceName: java.lang.String
  /**
    * Full http link to more information about the field
    */
  var url: java.lang.String
}

object FieldReference {
  @scala.inline
  def apply(referenceName: java.lang.String, url: java.lang.String): FieldReference = {
    val __obj = js.Dynamic.literal(referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[FieldReference]
  }
}

