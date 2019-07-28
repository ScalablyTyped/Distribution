package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionVersionFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionVersionFlags")
@js.native
object ExtensionVersionFlags extends js.Object {
  /**
    * No flags exist for this version.
    */
  @js.native
  sealed trait None extends ExtensionVersionFlags
  
  /**
    * The Validated flag for a version means the extension version has passed validation and can be used..
    */
  @js.native
  sealed trait Validated extends ExtensionVersionFlags
  
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionVersionFlags.None with Double = js.native
  /* 1 */ val Validated: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionVersionFlags.Validated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionVersionFlags with Double] = js.native
}

