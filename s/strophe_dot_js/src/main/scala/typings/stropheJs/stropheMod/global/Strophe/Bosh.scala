package typings.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Class: Strophe.Bosh
  *  _Private_ helper class that handles BOSH Connections
  *
  *  The Strophe.Bosh class is used internally by Strophe.Connection
  *  to encapsulate BOSH sessions. It is not meant to be used from user's code.
  */
@JSGlobal("Strophe.Bosh")
@js.native
open class Bosh protected () extends StObject {
  /** PrivateConstructor: Strophe.Bosh
    *  Create and initialize a Strophe.Bosh object.
    *
    *  Parameters:
    *    @param connection connection - The Strophe.Connection that will use BOSH.
    *
    *  Returns:
    *    @returns A new Strophe.Bosh object.
    */
  def this(connection: Connection) = this()
  
  /** PrivateFunction: _connect
    *  _Private_ function that initializes the BOSH connection.
    *
    *  Creates and sends the Request that initializes the BOSH connection.
    *
    * @param wait - The optional HTTPBIND wait value.  This is the
    *      time the server will wait before returning an empty result for
    *      a request.  The default setting of 60 seconds is recommended.
    * @param hold - The optional HTTPBIND hold value.  This is the
    *      number of connections the server will hold at one time.  This
    *      should almost always be set to 1 (the default).
    * @param route - The optional route value.
    */
  /* private */ def _connect(): Any = js.native
  /* private */ def _connect(wait: Double): Any = js.native
  /* private */ def _connect(wait: Double, hold: Double): Any = js.native
  /* private */ def _connect(wait: Double, hold: Double, route: String): Any = js.native
  /* private */ def _connect(wait: Double, hold: Unit, route: String): Any = js.native
  /* private */ def _connect(wait: Unit, hold: Double): Any = js.native
  /* private */ def _connect(wait: Unit, hold: Double, route: String): Any = js.native
  /* private */ def _connect(wait: Unit, hold: Unit, route: String): Any = js.native
}
