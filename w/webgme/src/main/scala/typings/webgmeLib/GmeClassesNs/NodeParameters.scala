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

