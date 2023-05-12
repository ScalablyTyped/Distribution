package typings.wordpressData

import typings.wordpressData.anon.Args
import typings.wordpressData.anon.ArgsSelectorName
import typings.wordpressData.anon.Error
import typings.wordpressData.anon.Errors
import typings.wordpressData.anon.SelectorName
import typings.wordpressData.anon.SelectorNameString
import typings.wordpressData.anon.SelectorNameType
import typings.wordpressData.anon.Type
import typings.wordpressData.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesReduxStoreMetadataActionsMod {
  
  @JSImport("@wordpress/data/build-types/redux-store/metadata/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def failResolution(selectorName: String, args: js.Array[Any], error: js.Error): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("failResolution")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Error]
  inline def failResolution(selectorName: String, args: js.Array[Any], error: Any): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("failResolution")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def failResolutions(selectorName: String, args: js.Array[Any], errors: js.Array[js.Error | Any]): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("failResolutions")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[Errors]
  
  inline def finishResolution(selectorName: String, args: js.Array[Any]): SelectorName = (^.asInstanceOf[js.Dynamic].applyDynamic("finishResolution")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SelectorName]
  
  inline def finishResolutions(selectorName: String, args: js.Array[js.Array[Any]]): ArgsSelectorName = (^.asInstanceOf[js.Dynamic].applyDynamic("finishResolutions")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ArgsSelectorName]
  
  inline def invalidateResolution(selectorName: String, args: js.Array[Any]): SelectorNameType = (^.asInstanceOf[js.Dynamic].applyDynamic("invalidateResolution")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SelectorNameType]
  
  inline def invalidateResolutionForStore(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateResolutionForStore")().asInstanceOf[`0`]
  
  inline def invalidateResolutionForStoreSelector(selectorName: String): SelectorNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateResolutionForStoreSelector")(selectorName.asInstanceOf[js.Any]).asInstanceOf[SelectorNameString]
  
  inline def startResolution(selectorName: String, args: js.Array[Any]): Args = (^.asInstanceOf[js.Dynamic].applyDynamic("startResolution")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Args]
  
  inline def startResolutions(selectorName: String, args: js.Array[js.Array[Any]]): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("startResolutions")(selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Type]
}
