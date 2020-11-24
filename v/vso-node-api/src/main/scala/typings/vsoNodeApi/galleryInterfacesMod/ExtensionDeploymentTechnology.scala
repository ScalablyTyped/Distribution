package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionDeploymentTechnology extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionDeploymentTechnology")
@js.native
object ExtensionDeploymentTechnology extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionDeploymentTechnology with Double] = js.native
  
  @js.native
  sealed trait Exe extends ExtensionDeploymentTechnology
  /* 1 */ @js.native
  object Exe extends TopLevel[Exe with Double]
  
  @js.native
  sealed trait Msi extends ExtensionDeploymentTechnology
  /* 2 */ @js.native
  object Msi extends TopLevel[Msi with Double]
  
  @js.native
  sealed trait ReferralLink extends ExtensionDeploymentTechnology
  /* 4 */ @js.native
  object ReferralLink extends TopLevel[ReferralLink with Double]
  
  @js.native
  sealed trait Vsix extends ExtensionDeploymentTechnology
  /* 3 */ @js.native
  object Vsix extends TopLevel[Vsix with Double]
}
