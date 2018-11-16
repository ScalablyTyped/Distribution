package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Spec extends js.Object {
  /**
      * Axis definitions.
      */
  var axes: js.UndefOr[js.Array[Axis]] = js.undefined
   // string is "auto" or "strict"
  /**
      * Definitions of data to visualize.
      */
  var data: js.Array[Data]
  /**
      * The total height, in pixels, of the data rectangle. Default is 500 if
      * undefined.
      */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
      * Legend definitions.
      */
  var legends: js.UndefOr[js.Array[Legend]] = js.undefined
  /**
      * Graphical mark definitions.
      */
  var marks: js.Array[Mark | GroupMark]
  /**
      * A unique name for the visualization specification.
      */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
      * [Number | Object | String]
      * The internal padding, in pixels, from the edge of the visualization
      * canvas to the data rectangle. If an object is provided, it must include
      * {top, left, right, bottom} properties. Two string values are also
      * acceptable: "auto" (the default) and "strict". Auto-padding computes the
      * padding dynamically based on the contents of the visualization. All
      * marks, including axes and legends, are used to compute the necessary
      * padding. "Strict" auto-padding attempts to adjust the padding such that
      * the overall width and height of the visualization is unchanged. This mode
      * can cause the visualization's width and height parameters to be adjusted
      * such that the total size, including padding, remains constant. Note that
      * in some cases strict padding is not possible; for example, if the axis
      * labels are much larger than the data rectangle.
      */
  var padding: js.UndefOr[scala.Double | java.lang.String | vegaLib.Anon_Bottom] = js.undefined
  /**
      * Scale transform definitions.
      */
  var scales: js.UndefOr[js.Array[Scale]] = js.undefined
  /**
      * The width and height of the on-screen viewport, in pixels. If necessary,
      * clipping and scrolling will be applied.
      */
  var viewport: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
      * The total width, in pixels, of the data rectangle. Default is 500 if
      * undefined.
      */
  var width: js.UndefOr[scala.Double] = js.undefined
}

