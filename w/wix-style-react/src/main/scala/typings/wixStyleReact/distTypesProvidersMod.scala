package typings.wixStyleReact

import typings.wixStyleReact.distTypesProvidersUseAtlasClientMod.AtlasClient
import typings.wixStyleReact.distTypesProvidersUseAtlasClientMod.AtlasInitOptions
import typings.wixStyleReact.distTypesProvidersUseCopyClipboardMod.useCopyClipboardProps
import typings.wixStyleReact.distTypesProvidersUseCopyClipboardMod.useCopyClipboardReturn
import typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteAutocompleteClientMod.UseAutocompleteClient
import typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteMod.UsePlacesAutocompleteProps
import typings.wixStyleReact.distTypesProvidersUsePlacesAutocompleteMod.UsePlacesAutocompleteReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersMod {
  
  @JSImport("wix-style-react/dist/types/providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/providers", "useAtlasClient")
  @js.native
  val useAtlasClient: UseAutocompleteClient[AtlasClient, AtlasInitOptions] = js.native
  
  inline def useCopyClipboard(props: useCopyClipboardProps): useCopyClipboardReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("useCopyClipboard")(props.asInstanceOf[js.Any]).asInstanceOf[useCopyClipboardReturn]
  
  inline def useDebouncedCallback[Callback](cb: Callback, dependencies: js.Array[Any]): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Callback]
  inline def useDebouncedCallback[Callback](cb: Callback, dependencies: js.Array[Any], debounceMs: Double): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any])).asInstanceOf[Callback]
  inline def useDebouncedCallback[Callback](
    cb: Callback,
    dependencies: js.Array[Any],
    debounceMs: Double,
    debounceFn: js.Function2[/* callback */ js.Function, /* debounceMs */ Double, js.Function]
  ): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any], debounceFn.asInstanceOf[js.Any])).asInstanceOf[Callback]
  inline def useDebouncedCallback[Callback](
    cb: Callback,
    dependencies: js.Array[Any],
    debounceMs: Unit,
    debounceFn: js.Function2[/* callback */ js.Function, /* debounceMs */ Double, js.Function]
  ): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebouncedCallback")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any], debounceFn.asInstanceOf[js.Any])).asInstanceOf[Callback]
  
  inline def useIsMounted(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMounted")().asInstanceOf[js.Function0[Boolean]]
  
  inline def usePlacesAutocomplete[Prediction, Address, RequestOptions](): UsePlacesAutocompleteReturn[Prediction, RequestOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlacesAutocomplete")().asInstanceOf[UsePlacesAutocompleteReturn[Prediction, RequestOptions]]
  inline def usePlacesAutocomplete[Prediction, Address, RequestOptions](props: UsePlacesAutocompleteProps[Prediction, Address, RequestOptions]): UsePlacesAutocompleteReturn[Prediction, RequestOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePlacesAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[UsePlacesAutocompleteReturn[Prediction, RequestOptions]]
}
