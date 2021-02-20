package typings.typeorm.mongodbTypingsMod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoClientOptions extends StObject {
  
  /**
    * A hash of options to set on the db object, see Db constructor.
    */
  var db: js.UndefOr[DbCreateOptions] = js.native
  
  /**
    * A hash of options to set on the mongos object, see Mongos constructor**.
    */
  var mongos: js.UndefOr[MongosOptions] = js.native
  
  /**
    * The maximum size of the individual server pool.
    */
  var poolSize: js.UndefOr[scala.Double] = js.native
  
  /**
    * A Promise library class the application wishes to use such as Bluebird, must be ES6 compatible.
    */
  var promiseLibrary: js.UndefOr[js.Object] = js.native
  
  /**
    * A hash of options to set on the replSet object, see ReplSet constructor**.
    */
  var replSet: js.UndefOr[ReplSetOptions] = js.native
  
  /**
    * A hash of options to set on the server objects, see Server constructor**.
    */
  var server: js.UndefOr[ServerOptions] = js.native
  
  /**
    * Enable SSL connection.
    */
  var ssl: js.UndefOr[Boolean] = js.native
  
  /**
    * SSL Certificate store binary buffer.
    */
  var sslCA: js.UndefOr[Buffer] = js.native
  
  /**
    * Uri decode the user name and password for authentication.
    */
  var uri_decode_auth: js.UndefOr[Boolean] = js.native
}
object MongoClientOptions {
  
  @scala.inline
  def apply(): MongoClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoClientOptions]
  }
  
  @scala.inline
  implicit class MongoClientOptionsMutableBuilder[Self <: MongoClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb(value: DbCreateOptions): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
    
    @scala.inline
    def setMongos(value: MongosOptions): Self = StObject.set(x, "mongos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMongosUndefined: Self = StObject.set(x, "mongos", js.undefined)
    
    @scala.inline
    def setPoolSize(value: scala.Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    @scala.inline
    def setPromiseLibrary(value: js.Object): Self = StObject.set(x, "promiseLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseLibraryUndefined: Self = StObject.set(x, "promiseLibrary", js.undefined)
    
    @scala.inline
    def setReplSet(value: ReplSetOptions): Self = StObject.set(x, "replSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplSetUndefined: Self = StObject.set(x, "replSet", js.undefined)
    
    @scala.inline
    def setServer(value: ServerOptions): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCA(value: Buffer): Self = StObject.set(x, "sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCAUndefined: Self = StObject.set(x, "sslCA", js.undefined)
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setUri_decode_auth(value: Boolean): Self = StObject.set(x, "uri_decode_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri_decode_authUndefined: Self = StObject.set(x, "uri_decode_auth", js.undefined)
  }
}
