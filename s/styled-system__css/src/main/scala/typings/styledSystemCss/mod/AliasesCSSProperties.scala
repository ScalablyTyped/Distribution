package typings.styledSystemCss.mod

import typings.csstype.mod.Property.BackgroundColor
import typings.csstype.mod.Property.Margin
import typings.csstype.mod.Property.MarginBottom
import typings.csstype.mod.Property.MarginLeft
import typings.csstype.mod.Property.MarginRight
import typings.csstype.mod.Property.MarginTop
import typings.csstype.mod.Property.Padding
import typings.csstype.mod.Property.PaddingBottom
import typings.csstype.mod.Property.PaddingLeft
import typings.csstype.mod.Property.PaddingRight
import typings.csstype.mod.Property.PaddingTop
import typings.csstype.mod.Property.Width
import typings.std.NonNullable
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
  var bg: js.UndefOr[BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]] = js.undefined
  
  /**
    * The **`margin`** CSS property sets the margin area on all four sides of an element. It is a shorthand for `margin-top`, `margin-right`, `margin-bottom`, and `margin-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/margin
    */
  var m: js.UndefOr[
    (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])
  ] = js.undefined
  
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
  var marginX: js.UndefOr[
    (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
  ] = js.undefined
  
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
  var marginY: js.UndefOr[
    (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
  ] = js.undefined
  
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
  var mb: js.UndefOr[
    (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
  ] = js.undefined
  
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
  var ml: js.UndefOr[
    (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
  ] = js.undefined
  
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
  var mr: js.UndefOr[
    (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
  ] = js.undefined
  
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
  var mt: js.UndefOr[
    (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
  ] = js.undefined
  
  /**
    * The **`mx`** is shorthand for using both **`margin-left`** and **`margin-right`** CSS properties. They set the margin area on the left and right side of an element. A positive value places it
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
  var mx: js.UndefOr[
    (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
  ] = js.undefined
  
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
  var my: js.UndefOr[
    (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
  ] = js.undefined
  
  /**
    * The **`padding`** CSS property sets the padding area on all four sides of an element. It is a shorthand for `padding-top`, `padding-right`, `padding-bottom`, and `padding-left`.
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **4** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/padding
    */
  var p: js.UndefOr[
    (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])
  ] = js.undefined
  
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
  var paddingX: js.UndefOr[
    (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
  ] = js.undefined
  
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
  var paddingY: js.UndefOr[
    (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
  ] = js.undefined
  
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
  var pb: js.UndefOr[
    (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
  ] = js.undefined
  
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
  var pl: js.UndefOr[
    (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
  ] = js.undefined
  
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
  var pr: js.UndefOr[
    (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
  ] = js.undefined
  
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
  var pt: js.UndefOr[
    (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
  ] = js.undefined
  
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
  var px: js.UndefOr[
    (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
  ] = js.undefined
  
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
  var py: js.UndefOr[
    (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
  ] = js.undefined
  
  /**
    * The **`size`** is shorthand for using both **`width`** and **`height`** CSS properties. They set the width and height of an element.
    *
    * **Initial value**: `0`
    *
    * | Chrome | Firefox | Safari |  Edge  |  IE   |
    * | :----: | :-----: | :----: | :----: | :---: |
    * | **1**  |  **1**  | **1**  | **12** | **3** |
    *
    * @see https://developer.mozilla.org/docs/Web/CSS/width
    * @see https://developer.mozilla.org/docs/Web/CSS/height
    */
  var size: js.UndefOr[
    (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])
  ] = js.undefined
}
object AliasesCSSProperties {
  
  inline def apply(): AliasesCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasesCSSProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasesCSSProperties] (val x: Self) extends AnyVal {
    
    inline def setBg(value: BackgroundColor | js.Array[NonNullable[js.UndefOr[BackgroundColor]]]): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setBgVarargs(value: NonNullable[js.UndefOr[BackgroundColor]]*): Self = StObject.set(x, "bg", js.Array(value*))
    
    inline def setM(value: (Margin[Double | String]) | (js.Array[NonNullable[js.UndefOr[Margin[Double | String]]]])): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setMVarargs(value: (NonNullable[js.UndefOr[Margin[Double | String]]])*): Self = StObject.set(x, "m", js.Array(value*))
    
    inline def setMarginX(
      value: (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
    ): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
    
    inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
    
    inline def setMarginXVarargs(value: (NonNullable[js.UndefOr[MarginLeft[Double | String]]])*): Self = StObject.set(x, "marginX", js.Array(value*))
    
    inline def setMarginY(
      value: (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
    ): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
    
    inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
    
    inline def setMarginYVarargs(value: (NonNullable[js.UndefOr[MarginTop[Double | String]]])*): Self = StObject.set(x, "marginY", js.Array(value*))
    
    inline def setMb(
      value: (MarginBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginBottom[Double | String]]]])
    ): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMbUndefined: Self = StObject.set(x, "mb", js.undefined)
    
    inline def setMbVarargs(value: (NonNullable[js.UndefOr[MarginBottom[Double | String]]])*): Self = StObject.set(x, "mb", js.Array(value*))
    
    inline def setMl(
      value: (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
    ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    
    inline def setMlVarargs(value: (NonNullable[js.UndefOr[MarginLeft[Double | String]]])*): Self = StObject.set(x, "ml", js.Array(value*))
    
    inline def setMr(
      value: (MarginRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginRight[Double | String]]]])
    ): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMrUndefined: Self = StObject.set(x, "mr", js.undefined)
    
    inline def setMrVarargs(value: (NonNullable[js.UndefOr[MarginRight[Double | String]]])*): Self = StObject.set(x, "mr", js.Array(value*))
    
    inline def setMt(
      value: (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
    ): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtUndefined: Self = StObject.set(x, "mt", js.undefined)
    
    inline def setMtVarargs(value: (NonNullable[js.UndefOr[MarginTop[Double | String]]])*): Self = StObject.set(x, "mt", js.Array(value*))
    
    inline def setMx(
      value: (MarginLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginLeft[Double | String]]]])
    ): Self = StObject.set(x, "mx", value.asInstanceOf[js.Any])
    
    inline def setMxUndefined: Self = StObject.set(x, "mx", js.undefined)
    
    inline def setMxVarargs(value: (NonNullable[js.UndefOr[MarginLeft[Double | String]]])*): Self = StObject.set(x, "mx", js.Array(value*))
    
    inline def setMy(
      value: (MarginTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[MarginTop[Double | String]]]])
    ): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
    
    inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
    
    inline def setMyVarargs(value: (NonNullable[js.UndefOr[MarginTop[Double | String]]])*): Self = StObject.set(x, "my", js.Array(value*))
    
    inline def setP(value: (Padding[Double | String]) | (js.Array[NonNullable[js.UndefOr[Padding[Double | String]]]])): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setPVarargs(value: (NonNullable[js.UndefOr[Padding[Double | String]]])*): Self = StObject.set(x, "p", js.Array(value*))
    
    inline def setPaddingX(
      value: (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
    ): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    inline def setPaddingXVarargs(value: (NonNullable[js.UndefOr[PaddingLeft[Double | String]]])*): Self = StObject.set(x, "paddingX", js.Array(value*))
    
    inline def setPaddingY(
      value: (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
    ): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    inline def setPaddingYVarargs(value: (NonNullable[js.UndefOr[PaddingTop[Double | String]]])*): Self = StObject.set(x, "paddingY", js.Array(value*))
    
    inline def setPb(
      value: (PaddingBottom[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingBottom[Double | String]]]])
    ): Self = StObject.set(x, "pb", value.asInstanceOf[js.Any])
    
    inline def setPbUndefined: Self = StObject.set(x, "pb", js.undefined)
    
    inline def setPbVarargs(value: (NonNullable[js.UndefOr[PaddingBottom[Double | String]]])*): Self = StObject.set(x, "pb", js.Array(value*))
    
    inline def setPl(
      value: (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
    ): Self = StObject.set(x, "pl", value.asInstanceOf[js.Any])
    
    inline def setPlUndefined: Self = StObject.set(x, "pl", js.undefined)
    
    inline def setPlVarargs(value: (NonNullable[js.UndefOr[PaddingLeft[Double | String]]])*): Self = StObject.set(x, "pl", js.Array(value*))
    
    inline def setPr(
      value: (PaddingRight[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingRight[Double | String]]]])
    ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setPrVarargs(value: (NonNullable[js.UndefOr[PaddingRight[Double | String]]])*): Self = StObject.set(x, "pr", js.Array(value*))
    
    inline def setPt(
      value: (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
    ): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
    
    inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
    
    inline def setPtVarargs(value: (NonNullable[js.UndefOr[PaddingTop[Double | String]]])*): Self = StObject.set(x, "pt", js.Array(value*))
    
    inline def setPx(
      value: (PaddingLeft[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingLeft[Double | String]]]])
    ): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
    
    inline def setPxVarargs(value: (NonNullable[js.UndefOr[PaddingLeft[Double | String]]])*): Self = StObject.set(x, "px", js.Array(value*))
    
    inline def setPy(
      value: (PaddingTop[Double | String]) | (js.Array[NonNullable[js.UndefOr[PaddingTop[Double | String]]]])
    ): Self = StObject.set(x, "py", value.asInstanceOf[js.Any])
    
    inline def setPyUndefined: Self = StObject.set(x, "py", js.undefined)
    
    inline def setPyVarargs(value: (NonNullable[js.UndefOr[PaddingTop[Double | String]]])*): Self = StObject.set(x, "py", js.Array(value*))
    
    inline def setSize(value: (Width[Double | String]) | (js.Array[NonNullable[js.UndefOr[Width[Double | String]]]])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: (NonNullable[js.UndefOr[Width[Double | String]]])*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
