package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "Breakpoint")
@js.native
/* protected */ open class Breakpoint () extends StObject {
  /* protected */ def this(enabled: Boolean) = this()
  /* protected */ def this(enabled: Boolean, condition: String) = this()
  /* protected */ def this(enabled: Unit, condition: String) = this()
  /* protected */ def this(enabled: Boolean, condition: String, hitCondition: String) = this()
  /* protected */ def this(enabled: Boolean, condition: Unit, hitCondition: String) = this()
  /* protected */ def this(enabled: Unit, condition: String, hitCondition: String) = this()
  /* protected */ def this(enabled: Unit, condition: Unit, hitCondition: String) = this()
  /* protected */ def this(enabled: Boolean, condition: String, hitCondition: String, logMessage: String) = this()
  /* protected */ def this(enabled: Boolean, condition: String, hitCondition: Unit, logMessage: String) = this()
  /* protected */ def this(enabled: Boolean, condition: Unit, hitCondition: String, logMessage: String) = this()
  /* protected */ def this(enabled: Boolean, condition: Unit, hitCondition: Unit, logMessage: String) = this()
  /* protected */ def this(enabled: Unit, condition: String, hitCondition: String, logMessage: String) = this()
  /* protected */ def this(enabled: Unit, condition: String, hitCondition: Unit, logMessage: String) = this()
  /* protected */ def this(enabled: Unit, condition: Unit, hitCondition: String, logMessage: String) = this()
  /* protected */ def this(enabled: Unit, condition: Unit, hitCondition: Unit, logMessage: String) = this()
  
  /**
  		 * An optional expression for conditional breakpoints.
  		 */
  val condition: js.UndefOr[String] = js.native
  
  /**
  		 * Is breakpoint enabled.
  		 */
  val enabled: Boolean = js.native
  
  /**
  		 * An optional expression that controls how many hits of the breakpoint are ignored.
  		 */
  val hitCondition: js.UndefOr[String] = js.native
  
  /**
  		 * The unique ID of the breakpoint.
  		 */
  val id: String = js.native
  
  /**
  		 * An optional message that gets logged when this breakpoint is hit. Embedded expressions within {} are interpolated by the debug adapter.
  		 */
  val logMessage: js.UndefOr[String] = js.native
}
