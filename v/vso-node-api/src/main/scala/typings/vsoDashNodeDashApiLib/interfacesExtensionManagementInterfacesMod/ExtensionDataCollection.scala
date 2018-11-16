package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExtensionDataCollection extends js.Object {
  /**
       * The name of the collection
       */
  var collectionName: java.lang.String
  /**
       * A list of documents belonging to the collection
       */
  var documents: js.Array[_]
  /**
       * The type of the collection's scope, such as Default or User
       */
  var scopeType: java.lang.String
  /**
       * The value of the collection's scope, such as Current or Me
       */
  var scopeValue: java.lang.String
}

