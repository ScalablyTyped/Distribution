package typings.swiper

import typings.std.HTMLElement
import typings.swiper.swiperStrings.bullets
import typings.swiper.swiperStrings.custom
import typings.swiper.swiperStrings.fraction
import typings.swiper.swiperStrings.progressbar
import typings.swiper.typesSharedMod.CSSSelector
import typings.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesPaginationMod {
  
  trait PaginationEvents extends StObject {
    
    /**
      * Event will be fired on pagination hide
      */
    def paginationHide(swiper: default): Unit
    
    /**
      * Event will be fired after pagination rendered
      */
    def paginationRender(swiper: default, paginationEl: HTMLElement): Unit
    
    /**
      * Event will be fired on pagination show
      */
    def paginationShow(swiper: default): Unit
    
    /**
      * Event will be fired when pagination updated
      */
    def paginationUpdate(swiper: default, paginationEl: HTMLElement): Unit
  }
  object PaginationEvents {
    
    inline def apply(
      paginationHide: default => Unit,
      paginationRender: (default, HTMLElement) => Unit,
      paginationShow: default => Unit,
      paginationUpdate: (default, HTMLElement) => Unit
    ): PaginationEvents = {
      val __obj = js.Dynamic.literal(paginationHide = js.Any.fromFunction1(paginationHide), paginationRender = js.Any.fromFunction2(paginationRender), paginationShow = js.Any.fromFunction1(paginationShow), paginationUpdate = js.Any.fromFunction2(paginationUpdate))
      __obj.asInstanceOf[PaginationEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationEvents] (val x: Self) extends AnyVal {
      
      inline def setPaginationHide(value: default => Unit): Self = StObject.set(x, "paginationHide", js.Any.fromFunction1(value))
      
      inline def setPaginationRender(value: (default, HTMLElement) => Unit): Self = StObject.set(x, "paginationRender", js.Any.fromFunction2(value))
      
      inline def setPaginationShow(value: default => Unit): Self = StObject.set(x, "paginationShow", js.Any.fromFunction1(value))
      
      inline def setPaginationUpdate(value: (default, HTMLElement) => Unit): Self = StObject.set(x, "paginationUpdate", js.Any.fromFunction2(value))
    }
  }
  
  trait PaginationMethods extends StObject {
    
    /**
      * Array of pagination bullets
      * HTML elements. To get specific slide HTMLElement
      * use `swiper.pagination.bullets[1]`.
      */
    var bullets: js.Array[HTMLElement]
    
    /**
      * Destroy pagination
      */
    def destroy(): Unit
    
    /**
      * HTMLElement of pagination container element
      */
    var el: HTMLElement
    
    /**
      * Initialize pagination
      */
    def init(): Unit
    
    /**
      * Render pagination layout
      */
    def render(): Unit
    
    /**
      * Update pagination state (enabled/disabled/active)
      */
    def update(): Unit
  }
  object PaginationMethods {
    
    inline def apply(
      bullets: js.Array[HTMLElement],
      destroy: () => Unit,
      el: HTMLElement,
      init: () => Unit,
      render: () => Unit,
      update: () => Unit
    ): PaginationMethods = {
      val __obj = js.Dynamic.literal(bullets = bullets.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), render = js.Any.fromFunction0(render), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[PaginationMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationMethods] (val x: Self) extends AnyVal {
      
      inline def setBullets(value: js.Array[HTMLElement]): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
      
      inline def setBulletsVarargs(value: HTMLElement*): Self = StObject.set(x, "bullets", js.Array(value*))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait PaginationOptions extends StObject {
    
    /**
      * CSS class name of currently active pagination bullet
      *
      * @default 'swiper-pagination-bullet-active'
      */
    var bulletActiveClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of single pagination bullet
      *
      * @default 'swiper-pagination-bullet'
      */
    var bulletClass: js.UndefOr[String] = js.undefined
    
    /**
      * Defines which HTML tag will be used to represent single pagination bullet. Only for `'bullets'` pagination type.
      *
      * @default 'span'
      */
    var bulletElement: js.UndefOr[String] = js.undefined
    
    /**
      * If `true` then clicking on pagination button will cause transition to appropriate slide. Only for bullets pagination type
      *
      * @default false
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name set to pagination when it is clickable
      *
      * @default 'swiper-pagination-clickable'
      */
    var clickableClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of the element with currently active index in "fraction" pagination
      *
      * @default 'swiper-pagination-current'
      */
    var currentClass: js.UndefOr[String] = js.undefined
    
    /**
      * Good to enable if you use bullets pagination with a lot of slides. So it will keep only few bullets visible at the same time.
      *
      * @default false
      */
    var dynamicBullets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of main bullets visible when `dynamicBullets` enabled.
      *
      * @default 1
      */
    var dynamicMainBullets: js.UndefOr[Double] = js.undefined
    
    /**
      * String with CSS selector or HTML element of the container with pagination
      *
      * @default null
      */
    var el: js.UndefOr[CSSSelector | HTMLElement | Null] = js.undefined
    
    /**
      * Boolean property to use with breakpoints to enable/disable pagination on certain breakpoints
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * format fraction pagination current number. Function receives current number,
      * and you need to return formatted value
      */
    var formatFractionCurrent: js.UndefOr[js.Function1[/* number */ Double, Double | String]] = js.undefined
    
    /**
      * format fraction pagination total number. Function receives total number, and you
      * need to return formatted value
      */
    var formatFractionTotal: js.UndefOr[js.Function1[/* number */ Double, Double | String]] = js.undefined
    
    /**
      * CSS class name of pagination when it becomes inactive
      *
      * @default 'swiper-pagination-hidden'
      */
    var hiddenClass: js.UndefOr[String] = js.undefined
    
    /**
      * Toggle (hide/show) pagination container visibility after click on Slider's container
      *
      * @default true
      */
    var hideOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name set to pagination in horizontal Swiper
      *
      * @default 'swiper-pagination-horizontal'
      */
    var horizontalClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name set to pagination when it is disabled
      *
      * @default 'swiper-pagination-lock'
      */
    var lockClass: js.UndefOr[String] = js.undefined
    
    /**
      * The beginning of the modifier CSS class name that will be added to pagination depending on parameters
      *
      * @default 'swiper-pagination-'
      */
    var modifierClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name added on swiper container and pagination element when pagination is disabled by breakpoint
      *
      * @default 'swiper-pagination-disabled'
      */
    var paginationDisabledClass: js.UndefOr[String] = js.undefined
    
    /**
      * CSS class name of pagination progressbar fill element
      *
      * @default 'swiper-pagination-progressbar-fill'
      */
    var progressbarFillClass: js.UndefOr[String] = js.undefined
    
    /**
      * Makes pagination progressbar opposite to Swiper's `direction` parameter, means vertical progressbar for horizontal swiper
      * direction and horizontal progressbar for vertical swiper direction
      *
      * @default false
      */
    var progressbarOpposite: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CSS class name of pagination progressbar opposite
      *
      * @default 'swiper-pagination-progressbar-opposite'
      */
    var progressbarOppositeClass: js.UndefOr[String] = js.undefined
    
    /**
      * This parameter allows totally customize pagination bullets, you need to pass here a function that accepts `index` number of
      * pagination bullet and required element class name (`className`). Only for `'bullets'` pagination type
      *
      * @default null
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   //...
      *   renderBullet: function (index, className) {
      *     return '<span class="' + className + '">' + (index + 1) + '</span>';
      *   }
      * });
      * ```
      */
    var renderBullet: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, String]] = js.undefined
    
    /**
      * This parameter is required for `'custom'` pagination type where you have to specify
      * how it should be rendered.
      *
      * @default null
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   //...
      *   renderCustom: function (swiper, current, total) {
      *     return current + ' of ' + total;
      *   }
      * });
      * ```
      */
    var renderCustom: js.UndefOr[
        js.Function3[/* swiper */ default, /* current */ Double, /* total */ Double, String]
      ] = js.undefined
    
    /**
      * This parameter allows to customize "fraction" pagination html. Only for `'fraction'` pagination type
      *
      * @default null
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   //...
      *   renderFraction: function (currentClass, totalClass) {
      *       return '<span class="' + currentClass + '"></span>' +
      *               ' of ' +
      *               '<span class="' + totalClass + '"></span>';
      *   }
      * });
      * ```
      */
    var renderFraction: js.UndefOr[js.Function2[/* currentClass */ String, /* totalClass */ String, String]] = js.undefined
    
    /**
      * This parameter allows to customize "progress" pagination. Only for `'progress'` pagination type
      *
      * @default null
      *
      * @example
      * ```js
      * const swiper = new Swiper('.swiper', {
      *   //...
      *   renderProgressbar: function (progressbarFillClass) {
      *       return '<span class="' + progressbarFillClass + '"></span>';
      *   }
      * });
      * ```
      */
    var renderProgressbar: js.UndefOr[js.Function1[/* progressbarFillClass */ String, String]] = js.undefined
    
    /**
      * CSS class name of the element with total number of "snaps" in "fraction" pagination
      *
      * @default 'swiper-pagination-total'
      */
    var totalClass: js.UndefOr[String] = js.undefined
    
    /**
      * String with type of pagination. Can be `'bullets'`, `'fraction'`, `'progressbar'` or `'custom'`
      *
      * @default 'bullets'
      */
    var `type`: js.UndefOr[bullets | fraction | progressbar | custom] = js.undefined
    
    /**
      * CSS class name set to pagination in vertical Swiper
      *
      * @default 'swiper-pagination-vertical'
      */
    var verticalClass: js.UndefOr[String] = js.undefined
  }
  object PaginationOptions {
    
    inline def apply(): PaginationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
      
      inline def setBulletActiveClass(value: String): Self = StObject.set(x, "bulletActiveClass", value.asInstanceOf[js.Any])
      
      inline def setBulletActiveClassUndefined: Self = StObject.set(x, "bulletActiveClass", js.undefined)
      
      inline def setBulletClass(value: String): Self = StObject.set(x, "bulletClass", value.asInstanceOf[js.Any])
      
      inline def setBulletClassUndefined: Self = StObject.set(x, "bulletClass", js.undefined)
      
      inline def setBulletElement(value: String): Self = StObject.set(x, "bulletElement", value.asInstanceOf[js.Any])
      
      inline def setBulletElementUndefined: Self = StObject.set(x, "bulletElement", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableClass(value: String): Self = StObject.set(x, "clickableClass", value.asInstanceOf[js.Any])
      
      inline def setClickableClassUndefined: Self = StObject.set(x, "clickableClass", js.undefined)
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setCurrentClass(value: String): Self = StObject.set(x, "currentClass", value.asInstanceOf[js.Any])
      
      inline def setCurrentClassUndefined: Self = StObject.set(x, "currentClass", js.undefined)
      
      inline def setDynamicBullets(value: Boolean): Self = StObject.set(x, "dynamicBullets", value.asInstanceOf[js.Any])
      
      inline def setDynamicBulletsUndefined: Self = StObject.set(x, "dynamicBullets", js.undefined)
      
      inline def setDynamicMainBullets(value: Double): Self = StObject.set(x, "dynamicMainBullets", value.asInstanceOf[js.Any])
      
      inline def setDynamicMainBulletsUndefined: Self = StObject.set(x, "dynamicMainBullets", js.undefined)
      
      inline def setEl(value: CSSSelector | HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElNull: Self = StObject.set(x, "el", null)
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormatFractionCurrent(value: /* number */ Double => Double | String): Self = StObject.set(x, "formatFractionCurrent", js.Any.fromFunction1(value))
      
      inline def setFormatFractionCurrentUndefined: Self = StObject.set(x, "formatFractionCurrent", js.undefined)
      
      inline def setFormatFractionTotal(value: /* number */ Double => Double | String): Self = StObject.set(x, "formatFractionTotal", js.Any.fromFunction1(value))
      
      inline def setFormatFractionTotalUndefined: Self = StObject.set(x, "formatFractionTotal", js.undefined)
      
      inline def setHiddenClass(value: String): Self = StObject.set(x, "hiddenClass", value.asInstanceOf[js.Any])
      
      inline def setHiddenClassUndefined: Self = StObject.set(x, "hiddenClass", js.undefined)
      
      inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      inline def setHorizontalClass(value: String): Self = StObject.set(x, "horizontalClass", value.asInstanceOf[js.Any])
      
      inline def setHorizontalClassUndefined: Self = StObject.set(x, "horizontalClass", js.undefined)
      
      inline def setLockClass(value: String): Self = StObject.set(x, "lockClass", value.asInstanceOf[js.Any])
      
      inline def setLockClassUndefined: Self = StObject.set(x, "lockClass", js.undefined)
      
      inline def setModifierClass(value: String): Self = StObject.set(x, "modifierClass", value.asInstanceOf[js.Any])
      
      inline def setModifierClassUndefined: Self = StObject.set(x, "modifierClass", js.undefined)
      
      inline def setPaginationDisabledClass(value: String): Self = StObject.set(x, "paginationDisabledClass", value.asInstanceOf[js.Any])
      
      inline def setPaginationDisabledClassUndefined: Self = StObject.set(x, "paginationDisabledClass", js.undefined)
      
      inline def setProgressbarFillClass(value: String): Self = StObject.set(x, "progressbarFillClass", value.asInstanceOf[js.Any])
      
      inline def setProgressbarFillClassUndefined: Self = StObject.set(x, "progressbarFillClass", js.undefined)
      
      inline def setProgressbarOpposite(value: Boolean): Self = StObject.set(x, "progressbarOpposite", value.asInstanceOf[js.Any])
      
      inline def setProgressbarOppositeClass(value: String): Self = StObject.set(x, "progressbarOppositeClass", value.asInstanceOf[js.Any])
      
      inline def setProgressbarOppositeClassUndefined: Self = StObject.set(x, "progressbarOppositeClass", js.undefined)
      
      inline def setProgressbarOppositeUndefined: Self = StObject.set(x, "progressbarOpposite", js.undefined)
      
      inline def setRenderBullet(value: (/* index */ Double, /* className */ String) => String): Self = StObject.set(x, "renderBullet", js.Any.fromFunction2(value))
      
      inline def setRenderBulletUndefined: Self = StObject.set(x, "renderBullet", js.undefined)
      
      inline def setRenderCustom(value: (/* swiper */ default, /* current */ Double, /* total */ Double) => String): Self = StObject.set(x, "renderCustom", js.Any.fromFunction3(value))
      
      inline def setRenderCustomUndefined: Self = StObject.set(x, "renderCustom", js.undefined)
      
      inline def setRenderFraction(value: (/* currentClass */ String, /* totalClass */ String) => String): Self = StObject.set(x, "renderFraction", js.Any.fromFunction2(value))
      
      inline def setRenderFractionUndefined: Self = StObject.set(x, "renderFraction", js.undefined)
      
      inline def setRenderProgressbar(value: /* progressbarFillClass */ String => String): Self = StObject.set(x, "renderProgressbar", js.Any.fromFunction1(value))
      
      inline def setRenderProgressbarUndefined: Self = StObject.set(x, "renderProgressbar", js.undefined)
      
      inline def setTotalClass(value: String): Self = StObject.set(x, "totalClass", value.asInstanceOf[js.Any])
      
      inline def setTotalClassUndefined: Self = StObject.set(x, "totalClass", js.undefined)
      
      inline def setType(value: bullets | fraction | progressbar | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerticalClass(value: String): Self = StObject.set(x, "verticalClass", value.asInstanceOf[js.Any])
      
      inline def setVerticalClassUndefined: Self = StObject.set(x, "verticalClass", js.undefined)
    }
  }
}
