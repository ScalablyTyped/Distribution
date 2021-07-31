package typings.typeorm

import typings.typeorm.typesIsolationLevelMod.IsolationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsTransactionOptionsMod {
  
  trait TransactionOptions extends StObject {
    
    var connectionName: js.UndefOr[String] = js.undefined
    
    var isolation: js.UndefOr[IsolationLevel] = js.undefined
  }
  object TransactionOptions {
    
    @scala.inline
    def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    @scala.inline
    implicit class TransactionOptionsMutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionName(value: String): Self = StObject.set(x, "connectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionNameUndefined: Self = StObject.set(x, "connectionName", js.undefined)
      
      @scala.inline
      def setIsolation(value: IsolationLevel): Self = StObject.set(x, "isolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolationUndefined: Self = StObject.set(x, "isolation", js.undefined)
    }
  }
}
