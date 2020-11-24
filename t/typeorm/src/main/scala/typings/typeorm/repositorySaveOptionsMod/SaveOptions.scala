package typings.typeorm.repositorySaveOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveOptions extends js.Object {
  
  /**
    * Breaks save execution into chunks of a given size.
    * For example, if you want to save 100,000 objects but you have issues with saving them,
    * you can break them into 10 groups of 10,000 objects (by setting { chunk: 10000 }) and save each group separately.
    * This option is needed to perform very big insertions when you have issues with underlying driver parameter number limitation.
    */
  var chunk: js.UndefOr[Double] = js.native
  
  /**
    * Additional data to be passed with persist method.
    * This data can be used in subscribers then.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates if listeners and subscribers are called for this operation.
    * By default they are enabled, you can disable them by setting { listeners: false } in save/remove options.
    */
  var listeners: js.UndefOr[Boolean] = js.native
  
  /**
    * Flag to determine whether the entity that is being persisted
    * should be reloaded during the persistence operation.
    *
    * It will work only on databases which does not support RETURNING / OUTPUT statement.
    * Enabled by default.
    */
  var reload: js.UndefOr[Boolean] = js.native
  
  /**
    * By default transactions are enabled and all queries in persistence operation are wrapped into the transaction.
    * You can disable this behaviour by setting { transaction: false } in the persistence options.
    */
  var transaction: js.UndefOr[Boolean] = js.native
}
object SaveOptions {
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit class SaveOptionsOps[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
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
    def setChunk(value: Double): Self = this.set("chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setListeners(value: Boolean): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    
    @scala.inline
    def setTransaction(value: Boolean): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
