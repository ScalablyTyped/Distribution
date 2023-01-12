package typings.typeformEmbed

import typings.std.HTMLElement
import typings.typeformEmbed.typesBaseActionableOptionsMod.ActionableOptions
import typings.typeformEmbed.typesBaseBaseOptionsMod.BaseOptions
import typings.typeformEmbed.typesBaseIframeOptionsMod.IframeOptions
import typings.typeformEmbed.typesBaseSizeableOptionsMod.SizeableOptions
import typings.typeformEmbed.typesBaseUrlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreateWidgetWidgetOptionsMod {
  
  trait WidgetOptions
    extends StObject
       with BaseOptions
       with UrlOptions
       with ActionableOptions
       with SizeableOptions
       with IframeOptions {
    
    /**
      * Enabled form auto focus.
      *
      * @type {boolean}
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Element to place the widget into.
      *
      * @type {HTMLElement}
      */
    var container: HTMLElement
    
    /**
      * Overrides fullscreen modal on mobile.
      *
      * @type {boolean}
      */
    var inlineOnMobile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Lazy loads the widget element when it's visible
      *
      * @type {boolean}
      */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
  }
  object WidgetOptions {
    
    inline def apply(container: HTMLElement): WidgetOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WidgetOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setInlineOnMobile(value: Boolean): Self = StObject.set(x, "inlineOnMobile", value.asInstanceOf[js.Any])
      
      inline def setInlineOnMobileUndefined: Self = StObject.set(x, "inlineOnMobile", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    }
  }
}
