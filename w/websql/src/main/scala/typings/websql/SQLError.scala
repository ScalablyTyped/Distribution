package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.6 Errors and exceptions - asynchronous database API error
  */
@JSGlobal("SQLError")
@js.native
class SQLError () extends js.Object {
   // = 7;
  var code: Double = js.native
  var message: DOMString = js.native
}

/* static members */
@JSGlobal("SQLError")
@js.native
object SQLError extends js.Object {
   // = 5;
  var CONSTRAINT_ERR: Double = js.native
   // = 0;
  var DATABASE_ERR: Double = js.native
   // = 3;
  var QUOTA_ERR: Double = js.native
   // = 4;
  var SYNTAX_ERR: Double = js.native
   // = 6;
  var TIMEOUT_ERR: Double = js.native
   // = 2;
  var TOO_LARGE_ERR: Double = js.native
  var UNKNOWN_ERR: Double = js.native
   // = 1;
  var VERSION_ERR: Double = js.native
}

