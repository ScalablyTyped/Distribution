package typings.typeorm.metadataArgsTransactionEntityMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionEntityMetadataArgs extends js.Object {
  
  /**
    * Index of the parameter on which decorator is used.
    */
  val index: Double = js.native
  
  /**
    * Method on which decorator is used.
    */
  val methodName: String = js.native
  
  /**
    * Target class on which decorator is used.
    */
  val target: js.Function = js.native
}
object TransactionEntityMetadataArgs {
  
  @scala.inline
  def apply(index: Double, methodName: String, target: js.Function): TransactionEntityMetadataArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionEntityMetadataArgs]
  }
  
  @scala.inline
  implicit class TransactionEntityMetadataArgsOps[Self <: TransactionEntityMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
