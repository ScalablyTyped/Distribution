package typings.typedoc.mod.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.ExitStatus")
@js.native
object ExitStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.ExitStatus & Double] = js.native
  
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typings.typescript.mod.ExitStatus.DiagnosticsPresent_OutputsGenerated & Double = js.native
  
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typings.typescript.mod.ExitStatus.DiagnosticsPresent_OutputsSkipped & Double = js.native
  
  /* 3 */ val InvalidProject_OutputsSkipped: typings.typescript.mod.ExitStatus.InvalidProject_OutputsSkipped & Double = js.native
  
  /* 4 */ val ProjectReferenceCycle_OutputsSkipped: typings.typescript.mod.ExitStatus.ProjectReferenceCycle_OutputsSkipped & Double = js.native
  
  /* 4 */ val ProjectReferenceCycle_OutputsSkupped: typings.typescript.mod.ExitStatus.ProjectReferenceCycle_OutputsSkupped & Double = js.native
  
  /* 0 */ val Success: typings.typescript.mod.ExitStatus.Success & Double = js.native
}
