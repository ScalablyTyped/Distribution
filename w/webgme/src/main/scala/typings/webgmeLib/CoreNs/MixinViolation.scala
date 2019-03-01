package typings
package webgmeLib.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MixinViolation extends js.Object {
  /** The colliding mixin nodes (if any). */
  var collisionNodes: js.UndefOr[js.Array[Node]] = js.undefined
  /** The list of paths of colliding nodes (if any). */
  var collisionPaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Hint on how to resolve the issue. */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  /** The description of the violation. */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the affected rule definition (if available). */
  var ruleName: js.UndefOr[java.lang.String] = js.undefined
  /** The severity of the given error. */
  var severity: js.UndefOr[webgmeLib.webgmeLibStrings.error | webgmeLib.webgmeLibStrings.warning] = js.undefined
  /** The name of the affected rule definition (if available). */
  var targetInfo: js.UndefOr[java.lang.String] = js.undefined
  /** The target node of the violation (if available). */
  var targetNode: js.UndefOr[Node] = js.undefined
  /** What kind of violation */
  var `type`: js.UndefOr[
    webgmeLib.webgmeLibStrings.missing | (webgmeLib.webgmeLibStrings.`attribute collision`) | (webgmeLib.webgmeLibStrings.`set collision`) | (webgmeLib.webgmeLibStrings.`pointer collision`) | (webgmeLib.webgmeLibStrings.`containment collision`) | (webgmeLib.webgmeLibStrings.`aspect collision`) | (webgmeLib.webgmeLibStrings.`constraint collision`)
  ] = js.undefined
}

object MixinViolation {
  @scala.inline
  def apply(
    collisionNodes: js.Array[Node] = null,
    collisionPaths: js.Array[java.lang.String] = null,
    hint: java.lang.String = null,
    message: java.lang.String = null,
    ruleName: java.lang.String = null,
    severity: webgmeLib.webgmeLibStrings.error | webgmeLib.webgmeLibStrings.warning = null,
    targetInfo: java.lang.String = null,
    targetNode: Node = null,
    `type`: webgmeLib.webgmeLibStrings.missing | (webgmeLib.webgmeLibStrings.`attribute collision`) | (webgmeLib.webgmeLibStrings.`set collision`) | (webgmeLib.webgmeLibStrings.`pointer collision`) | (webgmeLib.webgmeLibStrings.`containment collision`) | (webgmeLib.webgmeLibStrings.`aspect collision`) | (webgmeLib.webgmeLibStrings.`constraint collision`) = null
  ): MixinViolation = {
    val __obj = js.Dynamic.literal()
    if (collisionNodes != null) __obj.updateDynamic("collisionNodes")(collisionNodes)
    if (collisionPaths != null) __obj.updateDynamic("collisionPaths")(collisionPaths)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (message != null) __obj.updateDynamic("message")(message)
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (targetInfo != null) __obj.updateDynamic("targetInfo")(targetInfo)
    if (targetNode != null) __obj.updateDynamic("targetNode")(targetNode)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixinViolation]
  }
}

