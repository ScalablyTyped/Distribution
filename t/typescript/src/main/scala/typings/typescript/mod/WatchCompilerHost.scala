package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchCompilerHost[T /* <: BuilderProgram */]
  extends ProgramHost[T]
     with WatchHost {
  
  /** If provided, callback to invoke after every new program creation */
  var afterProgramCreate: js.UndefOr[js.Function1[/* program */ T, Unit]] = js.native
  
  /** Instead of using output d.ts file from project reference, use its source file */
  var useSourceOfProjectReferenceRedirect: js.UndefOr[js.Function0[Boolean]] = js.native
}
