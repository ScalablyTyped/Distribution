package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionDataCollection extends js.Object {
  /**
    * The name of the collection
    */
  var collectionName: String
  /**
    * A list of documents belonging to the collection
    */
  var documents: js.Array[_]
  /**
    * The type of the collection's scope, such as Default or User
    */
  var scopeType: String
  /**
    * The value of the collection's scope, such as Current or Me
    */
  var scopeValue: String
}

object ExtensionDataCollection {
  @scala.inline
  def apply(collectionName: String, documents: js.Array[_], scopeType: String, scopeValue: String): ExtensionDataCollection = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], scopeType = scopeType.asInstanceOf[js.Any], scopeValue = scopeValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionDataCollection]
  }
}

