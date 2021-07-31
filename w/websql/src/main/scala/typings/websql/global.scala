package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /** 4.6 Errors and exceptions - asynchronous database API error
    */
  @JSGlobal("SQLError")
  @js.native
  class SQLError ()
    extends StObject
       with typings.websql.SQLError {
    
    // = 7;
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var message: DOMString = js.native
  }
  object SQLError {
    
    @JSGlobal("SQLError")
    @js.native
    val ^ : js.Any = js.native
    
    // = 5;
    /* static member */
    @JSGlobal("SQLError.CONSTRAINT_ERR")
    @js.native
    def CONSTRAINT_ERR: Double = js.native
    @scala.inline
    def CONSTRAINT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTRAINT_ERR")(x.asInstanceOf[js.Any])
    
    // = 0;
    /* static member */
    @JSGlobal("SQLError.DATABASE_ERR")
    @js.native
    def DATABASE_ERR: Double = js.native
    @scala.inline
    def DATABASE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATABASE_ERR")(x.asInstanceOf[js.Any])
    
    // = 3;
    /* static member */
    @JSGlobal("SQLError.QUOTA_ERR")
    @js.native
    def QUOTA_ERR: Double = js.native
    @scala.inline
    def QUOTA_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_ERR")(x.asInstanceOf[js.Any])
    
    // = 4;
    /* static member */
    @JSGlobal("SQLError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    @scala.inline
    def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    // = 6;
    /* static member */
    @JSGlobal("SQLError.TIMEOUT_ERR")
    @js.native
    def TIMEOUT_ERR: Double = js.native
    @scala.inline
    def TIMEOUT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(x.asInstanceOf[js.Any])
    
    // = 2;
    /* static member */
    @JSGlobal("SQLError.TOO_LARGE_ERR")
    @js.native
    def TOO_LARGE_ERR: Double = js.native
    @scala.inline
    def TOO_LARGE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_LARGE_ERR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("SQLError.UNKNOWN_ERR")
    @js.native
    def UNKNOWN_ERR: Double = js.native
    @scala.inline
    def UNKNOWN_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERR")(x.asInstanceOf[js.Any])
    
    // = 1;
    /* static member */
    @JSGlobal("SQLError.VERSION_ERR")
    @js.native
    def VERSION_ERR: Double = js.native
    @scala.inline
    def VERSION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION_ERR")(x.asInstanceOf[js.Any])
  }
  
  // synchronous database API error
  @JSGlobal("SQLException")
  @js.native
  class SQLException ()
    extends StObject
       with typings.websql.SQLException {
    
    // = 7;
    /* CompleteClass */
    var code: Double = js.native
    
    /* CompleteClass */
    var message: DOMString = js.native
  }
  object SQLException {
    
    @JSGlobal("SQLException")
    @js.native
    val ^ : js.Any = js.native
    
    // = 5;
    /** Code 6 - An INSERT, UPDATE, or REPLACE statement failed due to a constraint failure.
      * For example, because a row was being inserted and the value given for the primary
      * key column duplicated the value of an existing row. */
    /* static member */
    @JSGlobal("SQLException.CONSTRAINT_ERR")
    @js.native
    def CONSTRAINT_ERR: Double = js.native
    @scala.inline
    def CONSTRAINT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONSTRAINT_ERR")(x.asInstanceOf[js.Any])
    
    // = 0;
    /** Code 1 - The statement failed for database reasons not covered by any other error code. */
    /* static member */
    @JSGlobal("SQLException.DATABASE_ERR")
    @js.native
    def DATABASE_ERR: Double = js.native
    @scala.inline
    def DATABASE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATABASE_ERR")(x.asInstanceOf[js.Any])
    
    // = 3;
    /** Code 4 - The statement failed because there was not enough remaining storage space,
      * or the storage quota was reached and the user declined to give more space to the database.
      */
    /* static member */
    @JSGlobal("SQLException.QUOTA_ERR")
    @js.native
    def QUOTA_ERR: Double = js.native
    @scala.inline
    def QUOTA_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_ERR")(x.asInstanceOf[js.Any])
    
    // = 4;
    /** Code 5 - The statement failed because of a syntax error, or the number of arguments did
      * not match the number of ? placeholders in the statement, or the statement tried to use a
      * statement that is not allowed, such as BEGIN, COMMIT, or ROLLBACK, or the statement tried
      * to use a verb that could modify the database but the transaction was read-only. */
    /* static member */
    @JSGlobal("SQLException.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    @scala.inline
    def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    // = 6;
    /** Code 7 - A lock for the transaction could not be obtained in a reasonable time. */
    /* static member */
    @JSGlobal("SQLException.TIMEOUT_ERR")
    @js.native
    def TIMEOUT_ERR: Double = js.native
    @scala.inline
    def TIMEOUT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(x.asInstanceOf[js.Any])
    
    // = 2;
    /** Code 3 - The statement failed because the data returned from the database was too large.
      * The SQL "LIMIT" modifier might be useful to reduce the size of the result set.
      */
    /* static member */
    @JSGlobal("SQLException.TOO_LARGE_ERR")
    @js.native
    def TOO_LARGE_ERR: Double = js.native
    @scala.inline
    def TOO_LARGE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOO_LARGE_ERR")(x.asInstanceOf[js.Any])
    
    /** Code 0 - The transaction failed for reasons unrelated to the database itself
      * and not covered by any other error code.
      */
    /* static member */
    @JSGlobal("SQLException.UNKNOWN_ERR")
    @js.native
    def UNKNOWN_ERR: Double = js.native
    @scala.inline
    def UNKNOWN_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERR")(x.asInstanceOf[js.Any])
    
    // = 1;
    /** Code 2 - The operation failed because the actual database version was not what it should be.
      * For example, a statement found that the actual database version no longer matched the
      * expected version of the Database or DatabaseSync object, or the Database.changeVersion()
      * or DatabaseSync.changeVersion() methods were passed a version that doesn't match the actual database version.
      */
    /* static member */
    @JSGlobal("SQLException.VERSION_ERR")
    @js.native
    def VERSION_ERR: Double = js.native
    @scala.inline
    def VERSION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION_ERR")(x.asInstanceOf[js.Any])
  }
}
