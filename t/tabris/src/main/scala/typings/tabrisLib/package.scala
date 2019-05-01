package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabrisLib {
  // TODO: enable when Blob support is added
  // declare type BodyInit = Blob | FormData | string;
  type BodyInit = java.lang.String
  /**
    * Colors are specified as strings using one of the following formats:
    *
    * - **"#xxxxxx"**
    * - **"#xxx"**
    * - **"#xxxxxxxx"**
    * - **"#xxxx"**
    * - **"rgb(r, g, b)"** with **r**, **g** and **b** being numbers in the range 0..255.
    * - **"rgba(r, g, b, a)"** with **a** being a number in the range 0..1.
    * - a color name from the CSS3 specification.
    * - **"transparent"** sets a fully transparent color. This is a shortcut for **"rgba(0, 0, 0, 0)"**.
    * - **"initial"** resets the color to its (platform-dependent) default.
    */
  type Color = java.lang.String
  type CustomEvent = Event
  type EventListener = js.Function1[/* evt */ Event, scala.Unit]
  /**
    * Fonts are specified as strings using the shorthand syntax known from CSS, specifically **"[font-style] [font-weight] font-size [font-family[, font-family]*]"**. The font family may be omitted, in this case the default system font will be used. Generic font families supported across all platforms are **"serif"**, **"sans-serif"**, **"condensed"** and **"monospace"**. Supported font weights are **"light"**, **"thin"**, **"normal"**, **"medium"**, **"bold"** and **"black"**. The value **"initial"** represents the platform default.
    */
  type Font = java.lang.String
  type HeaderInit = Headers | js.Array[java.lang.String]
  type Image = tabrisLib.tabrisMod.Image
  type RequestInfo = Request | java.lang.String
  type Selector = tabrisLib.tabrisMod.Selector
  /**
    * A positive float, or 0, representing device independent pixels.
    */
  type dimension = scala.Double
  /**
    * Distance to a parent's or sibling's opposing edge in one of these formats:
    * - **offset** the distance from the parent's opposing edge in device independent pixels
    * - **percentage** the distance from the parent's opposing edge in percent of the parent's width
    * - **Widget** attach this edge to the given siblings's opposing edge
    * - **"selector"**
    * - **"prev()"** Same as above, but as space-separated string list instead of array
    * - **"selector offset"**
    * - **"prev() offset"**
    * - **[Widget, offset]** the distance from the given widget's opposing edge in pixel
    * - **"Widget, offset"**Same as above, but as space-separated string list instead of array.
    * - **[percentage, offset]** the distance from the parent's opposing edge in percent of the parent's width plus a fixed offset in pixels
    * - **"percentage offset"** Same as above, but as space-separated string list instead of array
    * - **[selector, offset]**
    * - **["prev()", offset]**
    */
  type margin = js.Any
  /**
    * A positive or negative float, or 0, representing device independent pixels.
    */
  type offset = scala.Double
}
