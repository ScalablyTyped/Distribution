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

