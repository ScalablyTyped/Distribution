package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositorySaveOptionsMod {
  
  trait SaveOptions extends StObject {
    
    /**
      * Breaks save execution into chunks of a given size.
      * For example, if you want to save 100,000 objects but you have issues with saving them,
      * you can break them into 10 groups of 10,000 objects (by setting { chunk: 10000 }) and save each group separately.
      * This option is needed to perform very big insertions when you have issues with underlying driver parameter number limitation.
      */
    var chunk: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional data to be passed with persist method.
      * This data can be used in subscribers then.
      */
    var data: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Indicates if listeners and subscribers are called for this operation.
      * By default they are enabled, you can disable them by setting { listeners: false } in save/remove options.
      */
    var listeners: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag to determine whether the entity that is being persisted
      * should be reloaded during the persistence operation.
      *
      * It will work only on databases which does not support RETURNING / OUTPUT statement.
      * Enabled by default.
      */
    var reload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default transactions are enabled and all queries in persistence operation are wrapped into the transaction.
      * You can disable this behaviour by setting { transaction: false } in the persistence options.
      */
    var transaction: js.UndefOr[Boolean] = js.undefined
  }
  object SaveOptions {
    
    @scala.inline
    def apply(): SaveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SaveOptions]
    }
    
    @scala.inline
    implicit class SaveOptionsMutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
      
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
      def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      @scala.inline
      def setTransaction(value: Boolean): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
}
