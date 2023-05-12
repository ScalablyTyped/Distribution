package typings.wordpressCompose

import typings.react.mod.FocusEvent
import typings.react.mod.RefCallback
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.ReturnType
import typings.wordpressCompose.anon.PickHTMLElementtabIndex
import typings.wordpressCompose.buildTypesHooksUseFocusOutsideMod.UseFocusOutsideReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseDialogMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a ref and props to apply to a dialog wrapper to enable the following behaviors:
    *  - constrained tabbing.
    *  - focus on mount.
    *  - return focus on unmount.
    *  - focus outside.
    *
    * @param options Dialog Options.
    */
  inline def default(options: DialogOptions): useDialogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[useDialogReturn]
  
  trait DialogOptions extends StObject {
    
    /**
      * Use the `onClose` prop instead.
      *
      * @deprecated
      */
    var __unstableOnClose: js.UndefOr[
        js.Function2[/* type */ js.UndefOr[String], /* event */ SyntheticEvent[Element, Event], Unit]
      ] = js.undefined
    
    var focusOnMount: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(focusOnMount : boolean | 'firstElement' | undefined): react.react.RefCallback<std.HTMLElement>>[0] */ js.Any
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object DialogOptions {
    
    inline def apply(): DialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
      
      inline def setFocusOnMount(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(focusOnMount : boolean | 'firstElement' | undefined): react.react.RefCallback<std.HTMLElement>>[0] */ js.Any
      ): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
      
      inline def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def set__unstableOnClose(value: (/* type */ js.UndefOr[String], /* event */ SyntheticEvent[Element, Event]) => Unit): Self = StObject.set(x, "__unstableOnClose", js.Any.fromFunction2(value))
      
      inline def set__unstableOnCloseUndefined: Self = StObject.set(x, "__unstableOnClose", js.undefined)
    }
  }
  
  type useDialogReturn = js.Tuple2[
    RefCallback[HTMLElement], 
    (ReturnType[
      js.Function1[
        /* onFocusOutside */ js.Function1[/* event */ FocusEvent[Element, Element], Unit], 
        UseFocusOutsideReturn
      ]
    ]) & PickHTMLElementtabIndex
  ]
}
