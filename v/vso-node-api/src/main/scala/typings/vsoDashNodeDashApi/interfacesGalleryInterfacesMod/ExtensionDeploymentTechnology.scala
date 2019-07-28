package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionDeploymentTechnology extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionDeploymentTechnology")
@js.native
object ExtensionDeploymentTechnology extends js.Object {
  @js.native
  sealed trait Exe extends ExtensionDeploymentTechnology
  
  @js.native
  sealed trait Msi extends ExtensionDeploymentTechnology
  
  @js.native
  sealed trait ReferralLink extends ExtensionDeploymentTechnology
  
  @js.native
  sealed trait Vsix extends ExtensionDeploymentTechnology
  
  /* 1 */ val Exe: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.Exe with Double = js.native
  /* 2 */ val Msi: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.Msi with Double = js.native
  /* 4 */ val ReferralLink: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.ReferralLink with Double = js.native
  /* 3 */ val Vsix: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionDeploymentTechnology.Vsix with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionDeploymentTechnology with Double] = js.native
}

