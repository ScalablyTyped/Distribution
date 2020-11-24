package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSizeReadPreference extends js.Object {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var readPreference: js.UndefOr[typings.typeorm.mongodbTypingsMod.ReadPreference | String] = js.native
}
object BatchSizeReadPreference {
  
  @scala.inline
  def apply(): BatchSizeReadPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSizeReadPreference]
  }
  
  @scala.inline
  implicit class BatchSizeReadPreferenceOps[Self <: BatchSizeReadPreference] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setReadPreference(value: typings.typeorm.mongodbTypingsMod.ReadPreference | String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
  }
}
