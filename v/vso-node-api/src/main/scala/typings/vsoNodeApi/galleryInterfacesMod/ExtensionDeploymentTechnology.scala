package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionDeploymentTechnology extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionDeploymentTechnology")
@js.native
object ExtensionDeploymentTechnology extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionDeploymentTechnology & Double] = js.native
  
  @js.native
  sealed trait Exe
    extends StObject
       with ExtensionDeploymentTechnology
  /* 1 */ val Exe: typings.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.Exe & Double = js.native
  
  @js.native
  sealed trait Msi
    extends StObject
       with ExtensionDeploymentTechnology
  /* 2 */ val Msi: typings.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.Msi & Double = js.native
  
  @js.native
  sealed trait ReferralLink
    extends StObject
       with ExtensionDeploymentTechnology
  /* 4 */ val ReferralLink: typings.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.ReferralLink & Double = js.native
  
  @js.native
  sealed trait Vsix
    extends StObject
       with ExtensionDeploymentTechnology
  /* 3 */ val Vsix: typings.vsoNodeApi.galleryInterfacesMod.ExtensionDeploymentTechnology.Vsix & Double = js.native
}
