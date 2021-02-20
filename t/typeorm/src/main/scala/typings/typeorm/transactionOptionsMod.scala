package typings.typeorm

import typings.typeorm.isolationLevelMod.IsolationLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionOptionsMod {
  
  @js.native
  trait TransactionOptions extends StObject {
    
    var connectionName: js.UndefOr[String] = js.native
    
    var isolation: js.UndefOr[IsolationLevel] = js.native
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
