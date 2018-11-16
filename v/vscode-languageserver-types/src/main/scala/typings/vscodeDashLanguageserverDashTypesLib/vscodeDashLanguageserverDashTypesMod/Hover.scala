package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Hover extends js.Object {
  /**
       * The hover's content
       */
  var contents: MarkupContent | MarkedString | js.Array[MarkedString]
  /**
       * An optional range
       */
  var range: js.UndefOr[Range] = js.undefined
}

