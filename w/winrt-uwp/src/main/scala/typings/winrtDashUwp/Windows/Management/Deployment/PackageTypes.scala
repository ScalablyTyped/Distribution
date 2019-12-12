package typings.winrtDashUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Management.Deployment.PackageTypes.bundle
import typings.winrtDashUwp.Windows.Management.Deployment.PackageTypes.framework
import typings.winrtDashUwp.Windows.Management.Deployment.PackageTypes.main
import typings.winrtDashUwp.Windows.Management.Deployment.PackageTypes.none
import typings.winrtDashUwp.Windows.Management.Deployment.PackageTypes.resource
import typings.winrtDashUwp.Windows.Management.Deployment.PackageTypes.xap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageTypes extends js.Object

/** Defines the types of packages to be included in the result set of a query. */
@JSGlobal("Windows.Management.Deployment.PackageTypes")
@js.native
object PackageTypes extends js.Object {
  /** Include the bundle packages when you enumerate the package repository. */
  @js.native
  sealed trait bundle extends PackageTypes
  
  /** Include the framework packages when you enumerate the package repository. */
  @js.native
  sealed trait framework extends PackageTypes
  
  /** Include the main packages when you enumerate the package repository. */
  @js.native
  sealed trait main extends PackageTypes
  
  /** Default inventorying behavior. */
  @js.native
  sealed trait none extends PackageTypes
  
  /** Include the resource packages when you enumerate the package repository. */
  @js.native
  sealed trait resource extends PackageTypes
  
  /** Include the XAP packages when you enumerate the package repository. */
  @js.native
  sealed trait xap extends PackageTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageTypes with Double] = js.native
  /* 4 */ @js.native
  object bundle extends TopLevel[bundle with Double]
  
  /* 2 */ @js.native
  object framework extends TopLevel[framework with Double]
  
  /* 1 */ @js.native
  object main extends TopLevel[main with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object resource extends TopLevel[resource with Double]
  
  /* 5 */ @js.native
  object xap extends TopLevel[xap with Double]
  
}

