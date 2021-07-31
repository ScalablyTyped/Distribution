package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionVersionFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionVersionFlags")
@js.native
object ExtensionVersionFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionVersionFlags & Double] = js.native
  
  /**
    * No flags exist for this version.
    */
  @js.native
  sealed trait None
    extends StObject
       with ExtensionVersionFlags
  /* 0 */ val None: typings.vsoNodeApi.galleryInterfacesMod.ExtensionVersionFlags.None & Double = js.native
  
  /**
    * The Validated flag for a version means the extension version has passed validation and can be used..
    */
  @js.native
  sealed trait Validated
    extends StObject
       with ExtensionVersionFlags
  /* 1 */ val Validated: typings.vsoNodeApi.galleryInterfacesMod.ExtensionVersionFlags.Validated & Double = js.native
}
