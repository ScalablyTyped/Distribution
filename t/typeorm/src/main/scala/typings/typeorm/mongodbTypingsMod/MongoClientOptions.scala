package typings.typeorm.mongodbTypingsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoClientOptions extends js.Object {
  
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
  implicit class MongoClientOptionsOps[Self <: MongoClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDb(value: DbCreateOptions): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    
    @scala.inline
    def setMongos(value: MongosOptions): Self = this.set("mongos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMongos: Self = this.set("mongos", js.undefined)
    
    @scala.inline
    def setPoolSize(value: scala.Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setPromiseLibrary(value: js.Object): Self = this.set("promiseLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromiseLibrary: Self = this.set("promiseLibrary", js.undefined)
    
    @scala.inline
    def setReplSet(value: ReplSetOptions): Self = this.set("replSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplSet: Self = this.set("replSet", js.undefined)
    
    @scala.inline
    def setServer(value: ServerOptions): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSslCA(value: Buffer): Self = this.set("sslCA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCA: Self = this.set("sslCA", js.undefined)
    
    @scala.inline
    def setUri_decode_auth(value: Boolean): Self = this.set("uri_decode_auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri_decode_auth: Self = this.set("uri_decode_auth", js.undefined)
  }
}
