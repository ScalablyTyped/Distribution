package typings.xk6SqlBrowser

import typings.xk6SqlBrowser.k6XSqlMod.sql.DatabaseConnection
import typings.xk6SqlBrowser.xk6SqlBrowserStrings.mysql
import typings.xk6SqlBrowser.xk6SqlBrowserStrings.postgres
import typings.xk6SqlBrowser.xk6SqlBrowserStrings.sqlite3
import typings.xk6SqlBrowser.xk6SqlBrowserStrings.sqlserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object k6XSqlMod {
  
  object default {
    
    @JSImport("k6/x/sql", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Opens a database connection.
      * @param type - the type of database (mysql, postgres, sqlite3, sqlserver)
      * @param connectionString - the connection string to connect to the database
      * @returns Connection to the database.
      * @example
      * const db = sql.open("sqlserver", "Server=127.0.0.1;Database=myDB;User Id=myUser;Password=myPassword;")
      */
    inline def open(`type`: mysql | postgres | sqlite3 | sqlserver, connectionString: String): DatabaseConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(`type`.asInstanceOf[js.Any], connectionString.asInstanceOf[js.Any])).asInstanceOf[DatabaseConnection]
    
    /**
      * Executes the provided query string against the database, while
      * providing results as a slice of KeyValue instance(s) if available.
      * @param db - Connection to database
      * @param query - SQL query
      * @param args - query parameters
      * @returns Array with query results
      * @example
      * const db = sql.open("sqlserver", "Server=127.0.0.1;Database=myDB;User Id=myUser;Password=myPassword;")
      * const results = sql.query(db, "SELECT Colour FROM Shapes WHERE Name=@p1 AND Type=@p2", "circle", "round")
      * for (const row of results) {
      *   console.log(`key: ${row.key}, value: ${row.value}`);
      * }
      */
    inline def query(db: DatabaseConnection, query: String, args: (String | Double | Boolean)*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")((scala.List(db.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
  }
  
  object sql {
    
    trait DatabaseConnection extends StObject {
      
      /**
        *  Closes the database connection
        */
      def close(): Unit
      
      /**
        *  Executes the provided query string against the database.
        * @param query - SQL query
        * @example
        * const db = sql.open("sqlserver", "Server=127.0.0.1;Database=myDB;User Id=myUser;Password=myPassword;")
        * db.exec("INSERT INTO Shapes(Name, Type, Colour) VALUES{'circle', 'round', 'red')}")
        */
      def exec(query: String): Unit
    }
    object DatabaseConnection {
      
      inline def apply(close: () => Unit, exec: String => Unit): DatabaseConnection = {
        val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), exec = js.Any.fromFunction1(exec))
        __obj.asInstanceOf[DatabaseConnection]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DatabaseConnection] (val x: Self) extends AnyVal {
        
        inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
        
        inline def setExec(value: String => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
      }
    }
  }
}
