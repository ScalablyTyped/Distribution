package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TestTag")
@js.native
open class TestTag protected () extends StObject {
  /**
  		 * Creates a new TestTag instance.
  		 * @param id ID of the test tag.
  		 */
  def this(id: String) = this()
  
  /**
  		 * ID of the test tag. `TestTag` instances with the same ID are considered
  		 * to be identical.
  		 */
  val id: String = js.native
}
