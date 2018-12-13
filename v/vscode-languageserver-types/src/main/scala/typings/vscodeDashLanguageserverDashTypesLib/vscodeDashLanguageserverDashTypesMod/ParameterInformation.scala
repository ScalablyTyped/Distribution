package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParameterInformation extends js.Object {
  /**
       * The human-readable doc-comment of this signature. Will be shown
       * in the UI but can be omitted.
       */
  var documentation: js.UndefOr[java.lang.String | MarkupContent] = js.undefined
  /**
       * The label of this parameter information.
       *
       * Either a string or inclusive start and exclusive end offsets within its containing
       * [signature label](#SignatureInformation.label). *Note*: A label of type string must be
       * a substring of its containing signature information's [label](#SignatureInformation.label).
       */
  var label: java.lang.String | (js.Tuple2[scala.Double, scala.Double])
}

