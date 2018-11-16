package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodeLens extends js.Object {
  /**
       * The command this code lens represents.
       */
  var command: js.UndefOr[Command] = js.undefined
  /**
       * An data entry field that is preserved on a code lens item between
       * a [CodeLensRequest](#CodeLensRequest) and a [CodeLensResolveRequest]
       * (#CodeLensResolveRequest)
       */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
       * The range in which this code lens is valid. Should only span a single line.
       */
  var range: Range
}

