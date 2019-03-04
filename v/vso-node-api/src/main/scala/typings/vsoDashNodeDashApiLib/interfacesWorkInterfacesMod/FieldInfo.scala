package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo extends js.Object {
  /**
    * The additional field display name
    */
  var displayName: java.lang.String
  /**
    * The additional field type
    */
  var fieldType: FieldType
  /**
    * Indicates if the field definition is for an identity field.
    */
  var isIdentity: scala.Boolean
  /**
    * The additional field reference name
    */
  var referenceName: java.lang.String
}

object FieldInfo {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    fieldType: FieldType,
    isIdentity: scala.Boolean,
    referenceName: java.lang.String
  ): FieldInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, fieldType = fieldType, isIdentity = isIdentity, referenceName = referenceName)
  
    __obj.asInstanceOf[FieldInfo]
  }
}

