package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionPolicyFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionPolicyFlags")
@js.native
object ExtensionPolicyFlags extends js.Object {
  /**
    * Mask that defines all permissions
    */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /**
    * Permission in 1st party extensions
    */
  @js.native
  sealed trait FirstParty
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /**
    * No permission
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /**
    * Premission in extensions that are in preview
    */
  @js.native
  sealed trait Preview
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /**
    * Permission on private extensions
    */
  @js.native
  sealed trait Private
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /**
    * Permission on public extensions
    */
  @js.native
  sealed trait Public
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /**
    * Premission in relased extensions
    */
  @js.native
  sealed trait Released
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags
  
  /* 31 */ val All: All with scala.Double = js.native
  /* 16 */ val FirstParty: FirstParty with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Preview: Preview with scala.Double = js.native
  /* 1 */ val Private: Private with scala.Double = js.native
  /* 2 */ val Public: Public with scala.Double = js.native
  /* 8 */ val Released: Released with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionPolicyFlags with scala.Double
  ] = js.native
}

