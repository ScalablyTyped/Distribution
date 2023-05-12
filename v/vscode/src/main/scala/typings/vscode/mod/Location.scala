package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Location")
@js.native
open class Location protected () extends StObject {
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
