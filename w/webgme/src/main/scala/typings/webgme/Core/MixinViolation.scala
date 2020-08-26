package typings.webgme.Core

import typings.webgme.webgmeStrings.`aspect collision`
import typings.webgme.webgmeStrings.`attribute collision`
import typings.webgme.webgmeStrings.`constraint collision`
import typings.webgme.webgmeStrings.`containment collision`
import typings.webgme.webgmeStrings.`pointer collision`
import typings.webgme.webgmeStrings.`set collision`
import typings.webgme.webgmeStrings.error
import typings.webgme.webgmeStrings.missing
import typings.webgme.webgmeStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixinViolation extends js.Object {
  /** The colliding mixin nodes (if any). */
  var collisionNodes: js.UndefOr[js.Array[Node]] = js.native
  /** The list of paths of colliding nodes (if any). */
  var collisionPaths: js.UndefOr[js.Array[String]] = js.native
  /** Hint on how to resolve the issue. */
  var hint: js.UndefOr[String] = js.native
  /** The description of the violation. */
  var message: js.UndefOr[String] = js.native
  /** The name of the affected rule definition (if available). */
  var ruleName: js.UndefOr[String] = js.native
  /** The severity of the given error. */
  var severity: js.UndefOr[error | warning] = js.native
  /** The name of the affected rule definition (if available). */
  var targetInfo: js.UndefOr[String] = js.native
  /** The target node of the violation (if available). */
  var targetNode: js.UndefOr[Node] = js.native
  /** What kind of violation */
  var `type`: js.UndefOr[
    missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
  ] = js.native
}

object MixinViolation {
  @scala.inline
  def apply(): MixinViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixinViolation]
  }
  @scala.inline
  implicit class MixinViolationOps[Self <: MixinViolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollisionNodesVarargs(value: Node*): Self = this.set("collisionNodes", js.Array(value :_*))
    @scala.inline
    def setCollisionNodes(value: js.Array[Node]): Self = this.set("collisionNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionNodes: Self = this.set("collisionNodes", js.undefined)
    @scala.inline
    def setCollisionPathsVarargs(value: String*): Self = this.set("collisionPaths", js.Array(value :_*))
    @scala.inline
    def setCollisionPaths(value: js.Array[String]): Self = this.set("collisionPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollisionPaths: Self = this.set("collisionPaths", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setRuleName(value: String): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
    @scala.inline
    def setSeverity(value: error | warning): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setTargetInfo(value: String): Self = this.set("targetInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetInfo: Self = this.set("targetInfo", js.undefined)
    @scala.inline
    def setTargetNode(value: Node): Self = this.set("targetNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetNode: Self = this.set("targetNode", js.undefined)
    @scala.inline
    def setType(
      value: missing | (`attribute collision`) | (`set collision`) | (`pointer collision`) | (`containment collision`) | (`aspect collision`) | (`constraint collision`)
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

