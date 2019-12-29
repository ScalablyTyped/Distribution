package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionDeploymentTechnology with Double] = js.native
  /* 1 */ @js.native
  object Exe extends TopLevel[Exe with Double]
  
  /* 2 */ @js.native
  object Msi extends TopLevel[Msi with Double]
  
  /* 4 */ @js.native
  object ReferralLink extends TopLevel[ReferralLink with Double]
  
  /* 3 */ @js.native
  object Vsix extends TopLevel[Vsix with Double]
  
}

