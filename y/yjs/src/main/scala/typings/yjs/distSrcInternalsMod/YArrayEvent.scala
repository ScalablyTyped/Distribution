package typings.yjs.distSrcInternalsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YArrayEvent")
@js.native
open class YArrayEvent[T] protected ()
  extends typings.yjs.distSrcTypesYarrayMod.YArrayEvent[T] {
  /**
    * @param {YArray<T>} yarray The changed type
    * @param {Transaction} transaction The transaction object
    */
  def this(
    yarray: typings.yjs.distSrcTypesYarrayMod.YArray[T],
    transaction: typings.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
}
