package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlineValueText")
@js.native
open class InlineValueText protected ()
  extends StObject
     with InlineValue {
  /**
  		 * Creates a new InlineValueText object.
  		 *
  		 * @param range The document line where to show the inline value.
  		 * @param text The value to be shown for the line.
  		 */
  def this(range: Range, text: String) = this()
  
  /**
  		 * The document range for which the inline value applies.
  		 */
  val range: Range = js.native
  
  /**
  		 * The text of the inline value.
  		 */
  val text: String = js.native
}
