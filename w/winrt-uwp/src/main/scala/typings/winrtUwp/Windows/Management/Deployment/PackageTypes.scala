package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PackageTypes extends StObject
/** Defines the types of packages to be included in the result set of a query. */
@JSGlobal("Windows.Management.Deployment.PackageTypes")
@js.native
object PackageTypes extends StObject {
  
  /** Include the bundle packages when you enumerate the package repository. */
  @js.native
  sealed trait bundle
    extends StObject
       with PackageTypes
  
  /** Include the framework packages when you enumerate the package repository. */
  @js.native
  sealed trait framework
    extends StObject
       with PackageTypes
  
  /** Include the main packages when you enumerate the package repository. */
  @js.native
  sealed trait main
    extends StObject
       with PackageTypes
  
  /** Default inventorying behavior. */
  @js.native
  sealed trait none
    extends StObject
       with PackageTypes
  
  /** Include the resource packages when you enumerate the package repository. */
  @js.native
  sealed trait resource
    extends StObject
       with PackageTypes
  
  /** Include the XAP packages when you enumerate the package repository. */
  @js.native
  sealed trait xap
    extends StObject
       with PackageTypes
}
