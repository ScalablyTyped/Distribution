package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionVersionFlags with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Validated extends TopLevel[Validated with Double]
  
}

