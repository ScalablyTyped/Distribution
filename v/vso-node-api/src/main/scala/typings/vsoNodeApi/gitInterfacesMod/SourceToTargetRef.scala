package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceToTargetRef extends js.Object {
  /**
    * The source ref to copy. For example, refs/heads/master.
    */
  var sourceRef: String
  /**
    * The target ref to update. For example, refs/heads/master.
    */
  var targetRef: String
}

object SourceToTargetRef {
  @scala.inline
  def apply(sourceRef: String, targetRef: String): SourceToTargetRef = {
    val __obj = js.Dynamic.literal(sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceToTargetRef]
  }
}

