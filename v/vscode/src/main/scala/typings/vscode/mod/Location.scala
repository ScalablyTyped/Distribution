package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Location")
@js.native
class Location protected () extends js.Object {
  def this(uri: Uri, rangeOrPosition: Position) = this()
  /**
  		 * Creates a new location object.
  		 *
  		 * @param uri The resource identifier.
  		 * @param rangeOrPosition The range or position. Positions will be converted to an empty range.
  		 */
  def this(uri: Uri, rangeOrPosition: Range) = this()
  /**
  		 * The document range of this location.
  		 */
  var range: Range = js.native
  /**
  		 * The resource identifier of this location.
  		 */
  var uri: Uri = js.native
}

