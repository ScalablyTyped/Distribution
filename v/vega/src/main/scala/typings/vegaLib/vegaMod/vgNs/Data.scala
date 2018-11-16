package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Data extends js.Object {
  /**
      * An object that specifies the format for the data file, if loaded from a
      * URL.
      */
  var format: js.UndefOr[vegaLib.vegaMod.vgNs.DataNs.Format] = js.undefined
  /**
      * A unique name for the data set.
      */
  var name: java.lang.String
  /**
      * The name of another data set to use as the source for this data set. The
      * source property is particularly useful in combination with a transform
      * pipeline to derive new data.
      */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
      * An array of transforms to perform on the data. Transform operators will be
      * run on the default data, as provided by late-binding or as specified by the
      *   source, values, or url properties.
      */
  var transform: js.UndefOr[js.Array[vegaLib.vegaMod.vgNs.DataNs.Transform]] = js.undefined
  /**
      * A URL from which to load the data set. Use the format property to ensure
      * the loaded data is correctly parsed. If the format property is not specified,
      * the data is assumed to be in a row-oriented JSON format.
      */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
      * The actual data set to use. The values property allows data to be inlined
      * directly within the specification itself.
      */
  var values: js.UndefOr[js.Any] = js.undefined
}

