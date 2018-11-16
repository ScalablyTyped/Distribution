package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Board extends BoardReference {
  var _links: js.Any
  var allowedMappings: ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]]
  var canEdit: scala.Boolean
  var columns: js.Array[BoardColumn]
  var fields: BoardFields
  var isValid: scala.Boolean
  var revision: scala.Double
  var rows: js.Array[BoardRow]
}

