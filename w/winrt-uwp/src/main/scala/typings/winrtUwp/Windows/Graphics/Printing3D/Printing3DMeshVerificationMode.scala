package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Printing3DMeshVerificationMode extends StObject
/** Specifies how the mesh is verified. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMeshVerificationMode")
@js.native
object Printing3DMeshVerificationMode extends StObject {
  
  /** Wait to return results until the verification is complete. */
  @js.native
  sealed trait findAllErrors
    extends StObject
       with Printing3DMeshVerificationMode
  
  /** Return results upon finding the first failure. */
  @js.native
  sealed trait findFirstError
    extends StObject
       with Printing3DMeshVerificationMode
}
