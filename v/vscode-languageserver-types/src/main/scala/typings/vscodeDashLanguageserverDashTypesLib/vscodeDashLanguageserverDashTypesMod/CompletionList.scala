package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompletionList extends js.Object {
  /**
       * This list it not complete. Further typing results in recomputing this list.
       */
  var isIncomplete: scala.Boolean
  /**
       * The completion items.
       */
  var items: js.Array[CompletionItem]
}

