package typings.themeUiCss.typesMod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.MarginBottomProperty
import typings.csstype.mod.MarginLeftProperty
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.MarginRightProperty
import typings.csstype.mod.MarginTopProperty
import typings.csstype.mod.PaddingBottomProperty
import typings.csstype.mod.PaddingLeftProperty
import typings.csstype.mod.PaddingProperty
import typings.csstype.mod.PaddingRightProperty
import typings.csstype.mod.PaddingTopProperty
import typings.csstype.mod.ScrollPaddingLeftProperty
import typings.csstype.mod.ScrollPaddingTopProperty
import typings.csstype.mod.WidthProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasesCSSProperties extends StObject {
  
  /**
    * The **`background-color`** CSS property sets the background color of an element.
    *
    * **Initial value**: `transparent`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/background-color
    */
  var bg: js.UndefOr[BackgroundColorProperty] = js.undefined
  
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var m: js.UndefOr[MarginProperty[Double | String]] = js.undefined
  
  /**
    * The **`marginX`** is shorthand for using both **`margin-left`** and **`margin-right`** CSS properties. They set the margin area on the left and right side of an element. A positive value
    * places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var marginX: js.UndefOr[MarginLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`marginY`** is shorthard for using both **`margin-top`** and **`margin-bottom`** CSS properties. They set the margin area on the top and bottom of an element. A positive value places
    * it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var marginY: js.UndefOr[MarginTopProperty[Double | String]] = js.undefined
  
  /**
    * The **`margin-bottom`** CSS property sets the margin area on the bottom of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var mb: js.UndefOr[MarginBottomProperty[Double | String]] = js.undefined
  
  /**
    * The **`margin-left`** CSS property sets the margin area on the left side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    */
  var ml: js.UndefOr[MarginLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`margin-right`** CSS property sets the margin area on the right side of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var mr: js.UndefOr[MarginRightProperty[Double | String]] = js.undefined
  
  /**
    * The **`margin-top`** CSS property sets the margin area on the top of an element. A positive value places it farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    */
  var mt: js.UndefOr[MarginTopProperty[Double | String]] = js.undefined
  
  /**
    * The **`mx`** is shorthand for using both **`margin-left`** and **`margin-right`** CSS properties. They set the margin area on the left and right side of an element. A positive value placesit
    * farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-left
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-right
    */
  var mx: js.UndefOr[MarginLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`my`** is shorthard for using both **`margin-top`** and **`margin-bottom`** CSS properties. They set the margin area on the top and bottom of an element. A positive value places it
    * farther from its neighbors, while a negative value places it closer.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://styled-system.com/#margin-props
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-top
    * @see https://developer.mozilla.org/docs/Web/CSS/margin-bottom
    */
  var my: js.UndefOr[MarginTopProperty[Double | String]] = js.undefined
  
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var p: js.UndefOr[PaddingProperty[Double | String]] = js.undefined
  
  /**
    * The **`paddingX`** is shorthand property for CSS properties **`padding-left`** and **`padding-right`**. They set the width of the padding area on the left and right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var paddingX: js.UndefOr[PaddingLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`paddingY`** is shorthand property for CSS properties **`padding-top`** and **`padding-bottom`**. They set the width of the padding area on the top and bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var paddingY: js.UndefOr[PaddingTopProperty[Double | String]] = js.undefined
  
  /**
    * The **`padding-bottom`** CSS property sets the height of the padding area on the bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var pb: js.UndefOr[PaddingBottomProperty[Double | String]] = js.undefined
  
  /**
    * The **`padding-left`** CSS property sets the width of the padding area on the left side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    */
  var pl: js.UndefOr[PaddingLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`padding-right`** CSS property sets the width of the padding area on the right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var pr: js.UndefOr[PaddingRightProperty[Double | String]] = js.undefined
  
  /**
    * The **`padding-top`** padding area on the top of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    */
  var pt: js.UndefOr[PaddingTopProperty[Double | String]] = js.undefined
  
  /**
    * The **`px`** is shorthand property for CSS properties **`padding-left`** and **`padding-right`**. They set the width of the padding area on the left and right side of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-left
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-right
    */
  var px: js.UndefOr[PaddingLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`py`** is shorthand property for CSS properties **`padding-top`** and **`padding-bottom`**. They set the width of the padding area on the top and bottom of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://styled-system.com/#padding-props
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-top
    * @see https://developer.mozilla.org/docs/Web/CSS/padding-bottom
    */
  var py: js.UndefOr[PaddingTopProperty[Double | String]] = js.undefined
  
  /**
    * The **`size`** is a shorthand property for CSS properties **`width`** and **`height`**.
    *
    * @see https://theme-ui.com/sx-prop#theme-aware-properties
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  /**
    * The **`scrollPaddingX`** is shorthand property for CSS properties **`scroll-padding-left`** and **`scroll-padding-right`**. They set the width of the scroll padding area on the left and right side of an element.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/scroll-padding-left
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/scroll-padding-right
    */
  var scrollPaddingX: js.UndefOr[ScrollPaddingLeftProperty[Double | String]] = js.undefined
  
  /**
    * The **`scrollPaddingY`** is shorthand property for CSS properties **`scroll-padding-top`** and **`scroll-padding-bottom`**. They set the width of the scroll padding area on the top and bottom side of an element.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/scroll-padding-top
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/scroll-padding-bottom
    */
  var scrollPaddingY: js.UndefOr[ScrollPaddingTopProperty[Double | String]] = js.undefined
  
  var size: js.UndefOr[WidthProperty[Double | String]] = js.undefined
}
object AliasesCSSProperties {
  
  @scala.inline
  def apply(): AliasesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasesCSSProperties]
  }
  
  @scala.inline
  implicit class AliasesCSSPropertiesMutableBuilder[Self <: AliasesCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: BackgroundColorProperty): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setM(value: MarginProperty[Double | String]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    @scala.inline
    def setMarginX(value: MarginLeftProperty[Double | String]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
    
    @scala.inline
    def setMarginY(value: MarginTopProperty[Double | String]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
    
    @scala.inline
    def setMb(value: MarginBottomProperty[Double | String]): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    @scala.inline
    def setMl(value: MarginLeftProperty[Double | String]): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    
    @scala.inline
    def setMr(value: MarginRightProperty[Double | String]): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    @scala.inline
    def setMt(value: MarginTopProperty[Double | String]): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    @scala.inline
    def setMx(value: MarginLeftProperty[Double | String]): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
    
    @scala.inline
    def setMy(value: MarginTopProperty[Double | String]): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    @scala.inline
    def setP(value: PaddingProperty[Double | String]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setPaddingX(value: PaddingLeftProperty[Double | String]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: PaddingTopProperty[Double | String]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    @scala.inline
    def setPb(value: PaddingBottomProperty[Double | String]): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    @scala.inline
    def setPl(value: PaddingLeftProperty[Double | String]): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    @scala.inline
    def setPr(value: PaddingRightProperty[Double | String]): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setPt(value: PaddingTopProperty[Double | String]): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    @scala.inline
    def setPx(value: PaddingLeftProperty[Double | String]): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
    
    @scala.inline
    def setPy(value: PaddingTopProperty[Double | String]): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
    
    @scala.inline
    def setScrollPaddingX(value: ScrollPaddingLeftProperty[Double | String]): Self = StObject.set(x, "scrollPaddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingXUndefined: Self = StObject.set(x, "scrollPaddingX", js.undefined)
    
    @scala.inline
    def setScrollPaddingY(value: ScrollPaddingTopProperty[Double | String]): Self = StObject.set(x, "scrollPaddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPaddingYUndefined: Self = StObject.set(x, "scrollPaddingY", js.undefined)
    
    @scala.inline
    def setSize(value: WidthProperty[Double | String]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
