package typings.yjs.distSrcInternalsMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YXmlEvent")
@js.native
open class YXmlEvent protected ()
  extends typings.yjs.distSrcTypesYxmleventMod.YXmlEvent {
  /**
    * @param {YXmlElement|YXmlText|YXmlFragment} target The target on which the event is created.
    * @param {Set<string|null>} subs The set of changed attributes. `null` is included if the
    *                   child list changed.
    * @param {Transaction} transaction The transaction instance with wich the
    *                                  change was created.
    */
  def this(
    target: typings.yjs.distSrcTypesYxmlelementMod.YXmlElement,
    subs: Set[String | Null],
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
  def this(
    target: typings.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment,
    subs: Set[String | Null],
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
  def this(
    target: typings.yjs.distSrcTypesYxmltextMod.YXmlText,
    subs: Set[String | Null],
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
}
