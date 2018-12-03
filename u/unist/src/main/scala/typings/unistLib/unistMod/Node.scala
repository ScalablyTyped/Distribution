package typings
package unistLib.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Node extends js.Object {
  /**
       * Information from the ecosystem.
       */
  var data: js.UndefOr[Data] = js.undefined
  /**
       * Location of a node in a source document.
       * Must not be present if a node is generated.
       */
  var position: js.UndefOr[Position] = js.undefined
  /**
       * The variant of a node.
       */
  var `type`: java.lang.String
}

