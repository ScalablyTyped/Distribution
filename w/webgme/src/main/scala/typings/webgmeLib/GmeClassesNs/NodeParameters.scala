package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeParameters extends js.Object {
  /** the base of the node to be created. */
  var base: js.UndefOr[webgmeLib.CoreNs.Node | scala.Null] = js.undefined
  /** the GUID of the node to be created */
  var guid: js.UndefOr[webgmeLib.CoreNs.GUID] = js.undefined
  /** the parent of the node to be created. */
  var parent: js.UndefOr[webgmeLib.CoreNs.Node | scala.Null] = js.undefined
  /** the relative id of the node to be created 
    * (if reserved, the function returns the node behind the relative id) */
  var relid: js.UndefOr[webgmeLib.GmeCommonNs.RelId] = js.undefined
}

object NodeParameters {
  @scala.inline
  def apply(
    base: webgmeLib.CoreNs.Node = null,
    guid: webgmeLib.CoreNs.GUID = null,
    parent: webgmeLib.CoreNs.Node = null,
    relid: webgmeLib.GmeCommonNs.RelId = null
  ): NodeParameters = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (relid != null) __obj.updateDynamic("relid")(relid)
    __obj.asInstanceOf[NodeParameters]
  }
}

