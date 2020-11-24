package typings.writeFileWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserOptionsType extends js.Object {
  
  /**
    * Atomically replace files content (i.e., to prevent programs like test watchers from seeing partial files).
    * @default true
    */
  var atomicReplace: js.UndefOr[Boolean] = js.native
  
  /**
    * Stop writing files on webpack errors
    * @default true
    */
  var exitOnErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * Forces the execution of the plugin regardless of being using `webpack-dev-server` or not
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.native
  
  /**
    * Logs names of the files that are being written (or skipped because they have not changed)
    * @default true
    */
  var log: js.UndefOr[Boolean] = js.native
  
  /**
    * A regular expression or function used to test if file should be written.
    * When not present, all bundle will be written.
    */
  var test: js.UndefOr[RegExp] = js.native
  
  /**
    * Use hash index to write only files that have changed since the last iteration.
    * @default true
    */
  var useHashIndex: js.UndefOr[Boolean] = js.native
}
object UserOptionsType {
  
  @scala.inline
  def apply(): UserOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOptionsType]
  }
  
  @scala.inline
  implicit class UserOptionsTypeOps[Self <: UserOptionsType] (val x: Self) extends AnyVal {
    
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
    def setAtomicReplace(value: Boolean): Self = this.set("atomicReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtomicReplace: Self = this.set("atomicReplace", js.undefined)
    
    @scala.inline
    def setExitOnErrors(value: Boolean): Self = this.set("exitOnErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnErrors: Self = this.set("exitOnErrors", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setTest(value: RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setUseHashIndex(value: Boolean): Self = this.set("useHashIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHashIndex: Self = this.set("useHashIndex", js.undefined)
  }
}
