package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionPolicyFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionPolicyFlags")
@js.native
object ExtensionPolicyFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionPolicyFlags & Double] = js.native
  
  /**
    * Mask that defines all permissions
    */
  @js.native
  sealed trait All
    extends StObject
       with ExtensionPolicyFlags
  /* 31 */ val All: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.All & Double = js.native
  
  /**
    * Permission in 1st party extensions
    */
  @js.native
  sealed trait FirstParty
    extends StObject
       with ExtensionPolicyFlags
  /* 16 */ val FirstParty: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.FirstParty & Double = js.native
  
  /**
    * No permission
    */
  @js.native
  sealed trait None
    extends StObject
       with ExtensionPolicyFlags
  /* 0 */ val None: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.None & Double = js.native
  
  /**
    * Premission in extensions that are in preview
    */
  @js.native
  sealed trait Preview
    extends StObject
       with ExtensionPolicyFlags
  /* 4 */ val Preview: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Preview & Double = js.native
  
  /**
    * Permission on private extensions
    */
  @js.native
  sealed trait Private
    extends StObject
       with ExtensionPolicyFlags
  /* 1 */ val Private: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Private & Double = js.native
  
  /**
    * Permission on public extensions
    */
  @js.native
  sealed trait Public
    extends StObject
       with ExtensionPolicyFlags
  /* 2 */ val Public: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Public & Double = js.native
  
  /**
    * Premission in relased extensions
    */
  @js.native
  sealed trait Released
    extends StObject
       with ExtensionPolicyFlags
  /* 8 */ val Released: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionPolicyFlags.Released & Double = js.native
}
