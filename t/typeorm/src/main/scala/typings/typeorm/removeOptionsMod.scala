package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeOptionsMod {
  
  @js.native
  trait RemoveOptions extends StObject {
    
    /**
      * Breaks save execution into given number of chunks.
      * For example, if you want to save 100,000 objects but you have issues with saving them,
      * you can break them into 10 groups of 10,000 objects (by setting { chunk: 10000 }) and save each group separately.
      * This option is needed to perform very big insertions when you have issues with underlying driver parameter number limitation.
      */
    var chunk: js.UndefOr[Double] = js.native
    
    /**
      * Additional data to be passed with remove method.
      * This data can be used in subscribers then.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * Indicates if listeners and subscribers are called for this operation.
      * By default they are enabled, you can disable them by setting { listeners: false } in save/remove options.
      */
    var listeners: js.UndefOr[Boolean] = js.native
    
    /**
      * By default transactions are enabled and all queries in persistence operation are wrapped into the transaction.
      * You can disable this behaviour by setting { transaction: false } in the persistence options.
      */
    var transaction: js.UndefOr[Boolean] = js.native
  }
  object RemoveOptions {
    
    @scala.inline
    def apply(): RemoveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveOptions]
    }
    
    @scala.inline
    implicit class RemoveOptionsMutableBuilder[Self <: RemoveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunk(value: Double): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setListeners(value: Boolean): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setTransaction(value: Boolean): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
}
