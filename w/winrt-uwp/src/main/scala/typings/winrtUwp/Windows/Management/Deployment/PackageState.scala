package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackageState extends StObject
/** Represents the state of the package. */
@JSGlobal("Windows.Management.Deployment.PackageState")
@js.native
object PackageState extends StObject {
  
  /** The license of the package is not valid. */
  @js.native
  sealed trait licenseInvalid extends PackageState
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified extends PackageState
  
  /** The package is usable. */
  @js.native
  sealed trait normal extends PackageState
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered extends PackageState
}
