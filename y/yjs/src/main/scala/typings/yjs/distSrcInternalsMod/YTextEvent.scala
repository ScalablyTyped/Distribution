package typings.yjs.distSrcInternalsMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YTextEvent")
@js.native
open class YTextEvent protected ()
  extends typings.yjs.distSrcTypesYtextMod.YTextEvent {
  /**
    * @param {YText} ytext
    * @param {Transaction} transaction
    * @param {Set<any>} subs The keys that changed
    */
  def this(
    ytext: typings.yjs.distSrcTypesYtextMod.YText,
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
    subs: Set[Any]
  ) = this()
}
