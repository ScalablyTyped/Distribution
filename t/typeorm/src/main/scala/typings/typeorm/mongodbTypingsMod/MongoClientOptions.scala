package typings.typeorm.mongodbTypingsMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoClientOptions extends StObject {
  
  /**
    * A hash of options to set on the db object, see Db constructor.
    */
  var db: js.UndefOr[DbCreateOptions] = js.undefined
  
  /**
    * A hash of options to set on the mongos object, see Mongos constructor**.
    */
  var mongos: js.UndefOr[MongosOptions] = js.undefined
  
  /**
    * The maximum size of the individual server pool.
    */
  var poolSize: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * A Promise library class the application wishes to use such as Bluebird, must be ES6 compatible.
    */
  var promiseLibrary: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A hash of options to set on the replSet object, see ReplSet constructor**.
    */
  var replSet: js.UndefOr[ReplSetOptions] = js.undefined
  
  /**
    * A hash of options to set on the server objects, see Server constructor**.
    */
  var server: js.UndefOr[ServerOptions] = js.undefined
  
  /**
    * Enable SSL connection.
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SSL Certificate store binary buffer.
    */
  var sslCA: js.UndefOr[Buffer] = js.undefined
  
  /**
    * Uri decode the user name and password for authentication.
    */
  var uri_decode_auth: js.UndefOr[Boolean] = js.undefined
}
object MongoClientOptions {
  
  inline def apply(): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientOptions]
  }
  
  extension [Self <: MongoClientOptions](x: Self) {
    
    inline def setDb(value: DbCreateOptions): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    inline def setMongos(value: MongosOptions): Self = StObject.set(x, "mongos", value.asInstanceOf[js.Any])
    
    inline def setMongosUndefined: Self = StObject.set(x, "mongos", js.undefined)
    
    inline def setPoolSize(value: scala.Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    inline def setPromiseLibrary(value: js.Object): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
    
    inline def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
    
    inline def setReplSet(value: ReplSetOptions): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
    
    inline def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    
    inline def setServer(value: ServerOptions): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslCA(value: Buffer): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
    
    inline def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setUri_decode_auth(value: Boolean): Self = StObject.set(x, "uri_decode_auth", value.asInstanceOf[js.Any])
    
    inline def setUri_decode_authUndefined: Self = StObject.set(x, "uri_decode_auth", js.undefined)
  }
}
