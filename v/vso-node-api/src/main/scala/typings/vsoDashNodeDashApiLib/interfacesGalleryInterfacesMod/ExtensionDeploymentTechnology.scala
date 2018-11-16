package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionDeploymentTechnology extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionDeploymentTechnology")
@js.native
object ExtensionDeploymentTechnology extends js.Object {
  @js.native
  sealed trait Exe
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology
  
  @js.native
  sealed trait Msi
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology
  
  @js.native
  sealed trait ReferralLink
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology
  
  @js.native
  sealed trait Vsix
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology
  
  /* 1 */ val Exe: Exe with scala.Double = js.native
  /* 2 */ val Msi: Msi with scala.Double = js.native
  /* 4 */ val ReferralLink: ReferralLink with scala.Double = js.native
  /* 3 */ val Vsix: Vsix with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology with scala.Double
  ] = js.native
}

