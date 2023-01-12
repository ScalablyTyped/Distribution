package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesDocumentInterceptorMod.ImplReturn
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyNative[ElementType /* <: Element */, PropName /* <: /* keyof ElementType */ String */] extends StObject {
  
  /**
    * React tracks the changes on element properties.
    * This workaround tries to alter the DOM element without React noticing,
    * so that it later picks up the change.
    *
    * @see https://github.com/facebook/react/blob/148f8e497c7d37a3c7ab99f01dec2692427272b1/packages/react-dom/src/client/inputValueTracking.js#L51-L104
    */
  var applyNative: js.UndefOr[Boolean] = js.undefined
  
  var realArgs: js.UndefOr[
    ImplReturn[
      /* import warning: importer.ImportType#apply Failed type conversion: ElementType[PropName] */ js.Any
    ]
  ] = js.undefined
  
  var `then`: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ApplyNative {
  
  inline def apply[ElementType /* <: Element */, PropName /* <: /* keyof ElementType */ String */](): ApplyNative[ElementType, PropName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyNative[ElementType, PropName]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyNative[?, ?], ElementType /* <: Element */, PropName /* <: /* keyof ElementType */ String */] (val x: Self & (ApplyNative[ElementType, PropName])) extends AnyVal {
    
    inline def setApplyNative(value: Boolean): Self = StObject.set(x, "applyNative", value.asInstanceOf[js.Any])
    
    inline def setApplyNativeUndefined: Self = StObject.set(x, "applyNative", js.undefined)
    
    inline def setRealArgs(
      value: ImplReturn[
          /* import warning: importer.ImportType#apply Failed type conversion: ElementType[PropName] */ js.Any
        ]
    ): Self = StObject.set(x, "realArgs", value.asInstanceOf[js.Any])
    
    inline def setRealArgsUndefined: Self = StObject.set(x, "realArgs", js.undefined)
    
    inline def setThen(value: () => Unit): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
