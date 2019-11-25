package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo extends js.Object {
  /**
    * The additional field display name
    */
  var displayName: String
  /**
    * The additional field type
    */
  var fieldType: FieldType
  /**
    * Indicates if the field definition is for an identity field.
    */
  var isIdentity: Boolean
  /**
    * The additional field reference name
    */
  var referenceName: String
}

object FieldInfo {
  @scala.inline
  def apply(displayName: String, fieldType: FieldType, isIdentity: Boolean, referenceName: String): FieldInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldInfo]
  }
}

