package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "FileDecoration")
@js.native
/**
		 * Creates a new decoration.
		 *
		 * @param badge A letter that represents the decoration.
		 * @param tooltip The tooltip of the decoration.
		 * @param color The color of the decoration.
		 */
open class FileDecoration () extends StObject {
  def this(badge: String) = this()
  def this(badge: String, tooltip: String) = this()
  def this(badge: Unit, tooltip: String) = this()
  def this(badge: String, tooltip: String, color: ThemeColor) = this()
  def this(badge: String, tooltip: Unit, color: ThemeColor) = this()
  def this(badge: Unit, tooltip: String, color: ThemeColor) = this()
  def this(badge: Unit, tooltip: Unit, color: ThemeColor) = this()
  
  /**
  		 * A very short string that represents this decoration.
  		 */
  var badge: js.UndefOr[String] = js.native
  
  /**
  		 * The color of this decoration.
  		 */
  var color: js.UndefOr[ThemeColor] = js.native
  
  /**
  		 * A flag expressing that this decoration should be
  		 * propagated to its parents.
  		 */
  var propagate: js.UndefOr[Boolean] = js.native
  
  /**
  		 * A human-readable tooltip for this decoration.
  		 */
  var tooltip: js.UndefOr[String] = js.native
}
