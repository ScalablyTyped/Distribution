package typings.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbCollectionOptions extends js.Object {
  
  /**
    * Specify a journal write concern.
    */
  var j: js.UndefOr[Boolean] = js.native
  
  /**
    * A primary key factory object for generation of custom _id keys.
    */
  var pkFactory: js.UndefOr[js.Object] = js.native
  
  /**
    * Return document results as raw BSON buffers.
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify a read concern for the collection. (only MongoDB 3.2 or higher supported).
    */
  var readConcern: js.UndefOr[ReadConcern] = js.native
  
  /**
    * The preferred read preference (ReadPreference.PRIMARY, ReadPreference.PRIMARY_PREFERRED, ReadPreference.SECONDARY, ReadPreference.SECONDARY_PREFERRED, ReadPreference.NEAREST).
    */
  var readPreference: js.UndefOr[ReadPreference | String] = js.native
  
  /**
    * Serialize functions on any object.
    */
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns an error if the collection does not exist.
    */
  var strict: js.UndefOr[Boolean] = js.native
  
  /**
    * The write concern.
    */
  var w: js.UndefOr[scala.Double | String] = js.native
  
  /**
    * The write concern timeout.
    */
  var wtimeout: js.UndefOr[scala.Double] = js.native
}
object DbCollectionOptions {
  
  @scala.inline
  def apply(): DbCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCollectionOptions]
  }
  
  @scala.inline
  implicit class DbCollectionOptionsOps[Self <: DbCollectionOptions] (val x: Self) extends AnyVal {
    
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
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = this.set("pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkFactory: Self = this.set("pkFactory", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadConcern(value: ReadConcern): Self = this.set("readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadConcern: Self = this.set("readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setW(value: scala.Double | String): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWtimeout(value: scala.Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
}
