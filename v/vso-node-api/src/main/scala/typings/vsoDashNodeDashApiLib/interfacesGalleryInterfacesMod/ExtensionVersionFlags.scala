package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionVersionFlags
  
  /**
    * The Validated flag for a version means the extension version has passed validation and can be used..
    */
  @js.native
  sealed trait Validated
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionVersionFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Validated: Validated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionVersionFlags with scala.Double
  ] = js.native
}

