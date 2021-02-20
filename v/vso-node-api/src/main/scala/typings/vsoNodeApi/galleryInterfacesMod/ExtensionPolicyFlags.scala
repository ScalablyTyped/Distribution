package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionPolicyFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionPolicyFlags")
@js.native
object ExtensionPolicyFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionPolicyFlags with Double] = js.native
  
  /**
    * Mask that defines all permissions
    */
  @js.native
  sealed trait All extends ExtensionPolicyFlags
  /* 31 */ val All: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.All with Double = js.native
  
  /**
    * Permission in 1st party extensions
    */
  @js.native
  sealed trait FirstParty extends ExtensionPolicyFlags
  /* 16 */ val FirstParty: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.FirstParty with Double = js.native
  
  /**
    * No permission
    */
  @js.native
  sealed trait None extends ExtensionPolicyFlags
  /* 0 */ val None: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.None with Double = js.native
  
  /**
    * Premission in extensions that are in preview
    */
  @js.native
  sealed trait Preview extends ExtensionPolicyFlags
  /* 4 */ val Preview: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.Preview with Double = js.native
  
  /**
    * Permission on private extensions
    */
  @js.native
  sealed trait Private extends ExtensionPolicyFlags
  /* 1 */ val Private: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.Private with Double = js.native
  
  /**
    * Permission on public extensions
    */
  @js.native
  sealed trait Public extends ExtensionPolicyFlags
  /* 2 */ val Public: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.Public with Double = js.native
  
  /**
    * Premission in relased extensions
    */
  @js.native
  sealed trait Released extends ExtensionPolicyFlags
  /* 8 */ val Released: typings.vsoNodeApi.galleryInterfacesMod.ExtensionPolicyFlags.Released with Double = js.native
}
