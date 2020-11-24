package typings.tediousConnectionPool

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Provides a connection or an error
    * @param err error if any
    * @param connection issued from the pool
    */
  type ConnectionCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* connection */ typings.tediousConnectionPool.mod.PooledConnection, 
    scala.Unit
  ]
}
