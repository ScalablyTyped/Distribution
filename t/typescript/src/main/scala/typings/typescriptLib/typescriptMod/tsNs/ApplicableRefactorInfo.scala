package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of one or more available refactoring actions, grouped under a parent refactoring.
  */
trait ApplicableRefactorInfo extends js.Object {
  var actions: js.Array[RefactorActionInfo]
  /**
    * A description of this refactoring category to show to the user.
    * If the refactoring gets inlined (see below), this text will not be visible.
    */
  var description: java.lang.String
  /**
    * Inlineable refactorings can have their actions hoisted out to the top level
    * of a context menu. Non-inlineanable refactorings should always be shown inside
    * their parent grouping.
    *
    * If not specified, this value is assumed to be 'true'
    */
  var inlineable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The programmatic name of the refactoring
    */
  var name: java.lang.String
}

object ApplicableRefactorInfo {
  @scala.inline
  def apply(
    actions: js.Array[RefactorActionInfo],
    description: java.lang.String,
    name: java.lang.String,
    inlineable: js.UndefOr[scala.Boolean] = js.undefined
  ): ApplicableRefactorInfo = {
    val __obj = js.Dynamic.literal(actions = actions, description = description, name = name)
    if (!js.isUndefined(inlineable)) __obj.updateDynamic("inlineable")(inlineable)
    __obj.asInstanceOf[ApplicableRefactorInfo]
  }
}

