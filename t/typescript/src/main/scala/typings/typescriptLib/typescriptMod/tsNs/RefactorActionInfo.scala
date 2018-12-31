package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single refactoring action - for example, the "Extract Method..." refactor might
  * offer several actions, each corresponding to a surround class or closure to extract into.
  */
trait RefactorActionInfo extends js.Object {
  /**
    * A description of this refactoring action to show to the user.
    * If the parent refactoring is inlined away, this will be the only text shown,
    * so this description should make sense by itself if the parent is inlineable=true
    */
  var description: java.lang.String
  /**
    * The programmatic name of the refactoring action
    */
  var name: java.lang.String
}

