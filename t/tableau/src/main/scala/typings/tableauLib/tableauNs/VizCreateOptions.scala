package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VizCreateOptions
  extends /**
         * Apply a filter that you specify to the view when it is first rendered.
         * For example, if you have an Academic Year filter and only want to display data for 2017,
         * you might enter "Academic Year": "2016". For more information, see Filtering.
         */
/* filter */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
           * Specifies a device layout for a dashboard, if it exists.
           * Values can be desktop, tablet, or phone.
           * If not specified, defaults to loading a layout based on the smallest dimension of the hosting iframe element.
           */
  var device: js.UndefOr[java.lang.String] = js.undefined
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Undoes action on sheet, defaults to a single undo unless optional parameters is specified. */
  var hideTabs: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the toolbar is hidden or shown. */
  var hideToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Specifies the ID of an existing instance to make a copy (clone) of.
           * This is useful if the user wants to continue analysis of an existing visualization without losing the state of the original.
           * If the ID does not refer to an existing visualization, the cloned version is derived from the original visualization.
           */
  var instanceIdToClone: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Callback function that is invoked when the Viz object first becomes interactive.
           * This is only called once, but it’s guaranteed to be called.
           * If the Viz object is already interactive, it will be called immediately, but on a separate "thread."
           */
  var onFirstInteractive: js.UndefOr[js.Function1[/* e */ TableauEvent, scala.Unit]] = js.undefined
  /**
           * Callback function that's invoked when the size of the Viz object is known.
           * You can use this callback to perform tasks such as resizing the elements surrounding the Viz object once the object's size has been established.
           */
  var onFirstVizSizeKnown: js.UndefOr[js.Function1[/* e */ VizResizeEvent, scala.Unit]] = js.undefined
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

