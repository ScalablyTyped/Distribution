package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceToTargetRef extends js.Object {
  /**
    * The source ref to copy. For example, refs/heads/master.
    */
  var sourceRef: java.lang.String
  /**
    * The target ref to update. For example, refs/heads/master.
    */
  var targetRef: java.lang.String
}

object SourceToTargetRef {
  @scala.inline
  def apply(sourceRef: java.lang.String, targetRef: java.lang.String): SourceToTargetRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sourceRef")(sourceRef)
    __obj.updateDynamic("targetRef")(targetRef)
    __obj.asInstanceOf[SourceToTargetRef]
  }
}

