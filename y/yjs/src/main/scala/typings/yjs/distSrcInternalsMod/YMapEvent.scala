package typings.yjs.distSrcInternalsMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YMapEvent")
@js.native
open class YMapEvent[T] protected ()
  extends typings.yjs.distSrcTypesYmapMod.YMapEvent[T] {
  /**
    * @param {YMap<T>} ymap The YArray that changed.
    * @param {Transaction} transaction
    * @param {Set<any>} subs The keys that changed.
    */
  def this(
    ymap: typings.yjs.distSrcTypesYmapMod.YMap[T],
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction,
    subs: Set[Any]
  ) = this()
}
