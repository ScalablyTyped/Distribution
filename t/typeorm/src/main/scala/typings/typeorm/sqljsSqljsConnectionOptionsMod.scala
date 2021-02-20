package typings.typeorm

import typings.std.Uint8Array
import typings.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.typeormStrings.sqljs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqljsSqljsConnectionOptionsMod {
  
  @js.native
  trait SqljsConnectionOptions
    extends BaseConnectionOptions
       with ConnectionOptions {
    
    /**
      * Enables the autoSave mechanism which either saves to location
      * or calls autoSaveCallback every time a change to the database is made.
      */
    val autoSave: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that gets called on every change instead of the internal autoSave function.
      * autoSave has to be enabled for this to work.
      */
    val autoSaveCallback: js.UndefOr[js.Function] = js.native
    
    /**
      * A Uint8Array that gets imported when the connection is opened.
      */
    val database: js.UndefOr[Uint8Array] = js.native
    
    /**
      * File path (Node.js) or local storage key (browser) to load and save database from.
      * If this is specified without autoSave, the database is loaded from the location
      * and can be saved manually via the SqljsEntityManager. If autoSave is enabled,
      * location is used to automatically save the database.
      */
    val location: js.UndefOr[String] = js.native
    
    /**
      * Config that's used to initialize sql.js.
      */
    val sqlJsConfig: js.UndefOr[js.Any] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_SqljsConnectionOptions: sqljs = js.native
    
    /**
      * Enables the usage of the localforage library to save & load the database asynchronously from the
      * indexedDB instead of using the synchron local storage methods in a browser environment.
      */
    val useLocalForage: js.UndefOr[Boolean] = js.native
  }
  object SqljsConnectionOptions {
    
    @scala.inline
    def apply(`type`: sqljs): SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqljsConnectionOptions]
    }
    
    @scala.inline
    implicit class SqljsConnectionOptionsMutableBuilder[Self <: SqljsConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveCallback(value: js.Function): Self = StObject.set(x, "autoSaveCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveCallbackUndefined: Self = StObject.set(x, "autoSaveCallback", js.undefined)
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setDatabase(value: Uint8Array): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setSqlJsConfig(value: js.Any): Self = StObject.set(x, "sqlJsConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlJsConfigUndefined: Self = StObject.set(x, "sqlJsConfig", js.undefined)
      
      @scala.inline
      def setType(value: sqljs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLocalForage(value: Boolean): Self = StObject.set(x, "useLocalForage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLocalForageUndefined: Self = StObject.set(x, "useLocalForage", js.undefined)
    }
  }
}
