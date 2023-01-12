package typings.uifabricUtilities

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.reactTestRenderer.mod.ReactTestRenderer
import typings.reactTestRenderer.mod.TestRendererOptions
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCustomizationsCustomizationsMod.ICustomizations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsyncPlaceholder extends StObject {
    
    var asyncPlaceholder: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.uifabricUtilities.uifabricUtilitiesStrings.symbol, typings.uifabricUtilities.uifabricUtilitiesStrings.`object`, typings.uifabricUtilities.uifabricUtilitiesStrings.text */ Any
      ] = js.undefined
  }
  object AsyncPlaceholder {
    
    inline def apply(): AsyncPlaceholder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncPlaceholder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncPlaceholder] (val x: Self) extends AnyVal {
      
      inline def setAsyncPlaceholder(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.uifabricUtilities.uifabricUtilitiesStrings.symbol, typings.uifabricUtilities.uifabricUtilitiesStrings.`object`, typings.uifabricUtilities.uifabricUtilitiesStrings.text */ Any
      ): Self = StObject.set(x, "asyncPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setAsyncPlaceholderUndefined: Self = StObject.set(x, "asyncPlaceholder", js.undefined)
    }
  }
  
  trait CachedInputs[TStyleProps, TStyleSet] extends StObject {
    
    /** Cache for all style functions. */
    var __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]
    
    /** True if no styles prop or styles from Customizer is passed to wrapped component. */
    var __noStyleOverride__ : Boolean
  }
  object CachedInputs {
    
    inline def apply[TStyleProps, TStyleSet](
      __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]],
      __noStyleOverride__ : Boolean
    ): CachedInputs[TStyleProps, TStyleSet] = {
      val __obj = js.Dynamic.literal(__cachedInputs__ = __cachedInputs__.asInstanceOf[js.Any], __noStyleOverride__ = __noStyleOverride__.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedInputs[TStyleProps, TStyleSet]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CachedInputs[?, ?], TStyleProps, TStyleSet] (val x: Self & (CachedInputs[TStyleProps, TStyleSet])) extends AnyVal {
      
      inline def set__cachedInputs__(value: js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]): Self = StObject.set(x, "__cachedInputs__", value.asInstanceOf[js.Any])
      
      inline def set__cachedInputs__Varargs(value: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Self = StObject.set(x, "__cachedInputs__", js.Array(value*))
      
      inline def set__noStyleOverride__(value: Boolean): Self = StObject.set(x, "__noStyleOverride__", value.asInstanceOf[js.Any])
    }
  }
  
  trait Configurable[T /* <: js.Function */] extends StObject {
    
    var configurable: Boolean
    
    def get(): T
  }
  object Configurable {
    
    inline def apply[T /* <: js.Function */](configurable: Boolean, get: () => T): Configurable[T] = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Configurable[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configurable[?], T /* <: js.Function */] (val x: Self & Configurable[T]) extends AnyVal {
      
      inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  trait DefaultRender[T] extends StObject {
    
    var defaultRender: js.UndefOr[ComponentType[T]] = js.undefined
  }
  object DefaultRender {
    
    inline def apply[T](): DefaultRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRender[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultRender[?], T] (val x: Self & DefaultRender[T]) extends AnyVal {
      
      inline def setDefaultRender(value: ComponentType[T]): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      inline def setDefaultRenderUndefined: Self = StObject.set(x, "defaultRender", js.undefined)
    }
  }
  
  trait Delay extends StObject {
    
    var delay: Double
  }
  object Delay {
    
    inline def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(nextElement: ReactElement): ReactTestRenderer = js.native
    def apply(nextElement: ReactElement, options: TestRendererOptions): ReactTestRenderer = js.native
  }
  
  trait Focus extends StObject {
    
    def focus(): Unit
  }
  object Focus {
    
    inline def apply(focus: () => Unit): Focus = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[Focus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Focus] (val x: Self) extends AnyVal {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait Leading extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object Leading {
    
    inline def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  trait MaxWait extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var maxWait: js.UndefOr[Double] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object MaxWait {
    
    inline def apply(): MaxWait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxWait]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxWait] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext> */
  trait ReadonlyICustomizerContex extends StObject {
    
    val customizations: ICustomizations
  }
  object ReadonlyICustomizerContex {
    
    inline def apply(customizations: ICustomizations): ReadonlyICustomizerContex = {
      val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyICustomizerContex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyICustomizerContex] (val x: Self) extends AnyVal {
      
      inline def setCustomizations(value: ICustomizations): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    }
  }
  
  trait RootRef extends StObject {
    
    var rootRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
  }
  object RootRef {
    
    inline def apply(): RootRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootRef] (val x: Self) extends AnyVal {
      
      inline def setRootRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    }
  }
  
  trait Rtl extends StObject {
    
    var rtl: js.UndefOr[Boolean] = js.undefined
  }
  object Rtl {
    
    inline def apply(): Rtl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rtl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rtl] (val x: Self) extends AnyVal {
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
}
