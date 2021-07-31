package typings.typeorm

import typings.typeorm.anon.CheckInterval
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.sapConnectionCredentialsOptionsMod.SapConnectionCredentialsOptions
import typings.typeorm.typeormStrings.sap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapConnectionOptionsMod {
  
  trait SapConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with SapConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * Pool options.
      */
    val pool: js.UndefOr[CheckInterval] = js.undefined
    
    /**
      * Database schema.
      */
    val schema: js.UndefOr[String] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_SapConnectionOptions: sap
  }
  object SapConnectionOptions {
    
    @scala.inline
    def apply(): SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sap")
      __obj.asInstanceOf[SapConnectionOptions]
    }
    
    @scala.inline
    implicit class SapConnectionOptionsMutableBuilder[Self <: SapConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPool(value: CheckInterval): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setType(value: sap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
