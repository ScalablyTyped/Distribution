package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  sealed trait All extends ExtensionPolicyFlags
  
  /**
    * Permission in 1st party extensions
    */
  @js.native
  sealed trait FirstParty extends ExtensionPolicyFlags
  
  /**
    * No permission
    */
  @js.native
  sealed trait None extends ExtensionPolicyFlags
  
  /**
    * Premission in extensions that are in preview
    */
  @js.native
  sealed trait Preview extends ExtensionPolicyFlags
  
  /**
    * Permission on private extensions
    */
  @js.native
  sealed trait Private extends ExtensionPolicyFlags
  
  /**
    * Permission on public extensions
    */
  @js.native
  sealed trait Public extends ExtensionPolicyFlags
  
  /**
    * Premission in relased extensions
    */
  @js.native
  sealed trait Released extends ExtensionPolicyFlags
  
  /* 31 */ val All: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.All with Double = js.native
  /* 16 */ val FirstParty: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.FirstParty with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.None with Double = js.native
  /* 4 */ val Preview: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Preview with Double = js.native
  /* 1 */ val Private: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Private with Double = js.native
  /* 2 */ val Public: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Public with Double = js.native
  /* 8 */ val Released: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Released with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionPolicyFlags with Double] = js.native
}

