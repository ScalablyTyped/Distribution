package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.All
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.FirstParty
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.None
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Preview
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Private
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Public
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Released
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionPolicyFlags with Double] = js.native
  /* 31 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 16 */ @js.native
  object FirstParty extends TopLevel[FirstParty with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Preview extends TopLevel[Preview with Double]
  
  /* 1 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 2 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  /* 8 */ @js.native
  object Released extends TopLevel[Released with Double]
  
}

