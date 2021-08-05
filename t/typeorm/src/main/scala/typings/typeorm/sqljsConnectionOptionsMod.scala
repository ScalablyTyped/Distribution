package typings.typeorm

import typings.std.Uint8Array
import typings.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.sqljs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqljsConnectionOptionsMod {
  
  trait SqljsConnectionOptions
    extends StObject
       with BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Enables the autoSave mechanism which either saves to location
      * or calls autoSaveCallback every time a change to the database is made.
      */
    val autoSave: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that gets called on every change instead of the internal autoSave function.
      * autoSave has to be enabled for this to work.
      */
    val autoSaveCallback: js.UndefOr[js.Function] = js.undefined
    
    /**
      * A Uint8Array that gets imported when the connection is opened.
      */
    val database: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * File path (Node.js) or local storage key (browser) to load and save database from.
      * If this is specified without autoSave, the database is loaded from the location
      * and can be saved manually via the SqljsEntityManager. If autoSave is enabled,
      * location is used to automatically save the database.
      */
    val location: js.UndefOr[String] = js.undefined
    
    /**
      * Config that's used to initialize sql.js.
      */
    val sqlJsConfig: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_SqljsConnectionOptions: sqljs
    
    /**
      * Enables the usage of the localforage library to save & load the database asynchronously from the
      * indexedDB instead of using the synchron local storage methods in a browser environment.
      */
    val useLocalForage: js.UndefOr[Boolean] = js.undefined
  }
  object SqljsConnectionOptions {
    
    inline def apply(): SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sqljs")
      __obj.asInstanceOf[SqljsConnectionOptions]
    }
    
    extension [Self <: SqljsConnectionOptions](x: Self) {
      
      inline def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveCallback(value: js.Function): Self = StObject.set(x, "autoSaveCallback", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveCallbackUndefined: Self = StObject.set(x, "autoSaveCallback", js.undefined)
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setDatabase(value: Uint8Array): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setSqlJsConfig(value: js.Any): Self = StObject.set(x, "sqlJsConfig", value.asInstanceOf[js.Any])
      
      inline def setSqlJsConfigUndefined: Self = StObject.set(x, "sqlJsConfig", js.undefined)
      
      inline def setType(value: sqljs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUseLocalForage(value: Boolean): Self = StObject.set(x, "useLocalForage", value.asInstanceOf[js.Any])
      
      inline def setUseLocalForageUndefined: Self = StObject.set(x, "useLocalForage", js.undefined)
    }
  }
}
