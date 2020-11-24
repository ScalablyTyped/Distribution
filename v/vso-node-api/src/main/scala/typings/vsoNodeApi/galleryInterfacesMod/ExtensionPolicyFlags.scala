package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionPolicyFlags extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionPolicyFlags")
@js.native
object ExtensionPolicyFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionPolicyFlags with Double] = js.native
  
  /**
    * Mask that defines all permissions
    */
  @js.native
  sealed trait All extends ExtensionPolicyFlags
  /* 31 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * Permission in 1st party extensions
    */
  @js.native
  sealed trait FirstParty extends ExtensionPolicyFlags
  /* 16 */ @js.native
  object FirstParty extends TopLevel[FirstParty with Double]
  
  /**
    * No permission
    */
  @js.native
  sealed trait None extends ExtensionPolicyFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Premission in extensions that are in preview
    */
  @js.native
  sealed trait Preview extends ExtensionPolicyFlags
  /* 4 */ @js.native
  object Preview extends TopLevel[Preview with Double]
  
  /**
    * Permission on private extensions
    */
  @js.native
  sealed trait Private extends ExtensionPolicyFlags
  /* 1 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /**
    * Permission on public extensions
    */
  @js.native
  sealed trait Public extends ExtensionPolicyFlags
  /* 2 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  /**
    * Premission in relased extensions
    */
  @js.native
  sealed trait Released extends ExtensionPolicyFlags
  /* 8 */ @js.native
  object Released extends TopLevel[Released with Double]
}
