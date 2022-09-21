package typings.stronciumProcfs.mod

import typings.std.Error
import typings.stronciumProcfs.stronciumProcfsStrings.ENOENT
import typings.stronciumProcfs.stronciumProcfsStrings.EPARSE
import typings.stronciumProcfs.stronciumProcfsStrings.EUNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stroncium/procfs", "ProcfsError")
@js.native
open class ProcfsError protected ()
  extends StObject
     with Error {
  def this(code: ProcfsErrorCode) = this()
  def this(code: ProcfsErrorCode, message: String) = this()
  def this(code: ProcfsErrorCode, message: String, sourceError: String) = this()
  def this(code: ProcfsErrorCode, message: Unit, sourceError: String) = this()
  
  var code: ProcfsErrorCode = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var sourceError: js.UndefOr[String] = js.native
  
  var sourceText: js.UndefOr[String] = js.native
}
/* static members */
object ProcfsError {
  
  @JSImport("@stroncium/procfs", "ProcfsError")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stroncium/procfs", "ProcfsError.ERR_NOT_FOUND")
  @js.native
  def ERR_NOT_FOUND: ENOENT = js.native
  inline def ERR_NOT_FOUND_=(x: ENOENT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_NOT_FOUND")(x.asInstanceOf[js.Any])
  
  @JSImport("@stroncium/procfs", "ProcfsError.ERR_PARSING_FAILED")
  @js.native
  def ERR_PARSING_FAILED: EPARSE = js.native
  inline def ERR_PARSING_FAILED_=(x: EPARSE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_PARSING_FAILED")(x.asInstanceOf[js.Any])
  
  @JSImport("@stroncium/procfs", "ProcfsError.ERR_UNKNOWN")
  @js.native
  def ERR_UNKNOWN: EUNKNOWN = js.native
  inline def ERR_UNKNOWN_=(x: EUNKNOWN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNKNOWN")(x.asInstanceOf[js.Any])
}
