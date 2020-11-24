package typings.typeorm.transactionRepositoryMetadataArgsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionRepositoryMetadataArgs extends js.Object {
  
  /**
    * Argument of generic Repository<T> class if it's not custom repository class.
    */
  val entityType: js.UndefOr[js.Function] = js.native
  
  /**
    * Index of the parameter on which decorator is used.
    */
  val index: Double = js.native
  
  /**
    * Method on which decorator is used.
    */
  val methodName: String = js.native
  
  /**
    * Type of the repository class (Repository, TreeRepository or MongoRepository) or custom repository class.
    */
  val repositoryType: js.Function = js.native
  
  /**
    * Target class on which decorator is used.
    */
  val target: js.Function = js.native
}
object TransactionRepositoryMetadataArgs {
  
  @scala.inline
  def apply(index: Double, methodName: String, repositoryType: js.Function, target: js.Function): TransactionRepositoryMetadataArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRepositoryMetadataArgs]
  }
  
  @scala.inline
  implicit class TransactionRepositoryMetadataArgsOps[Self <: TransactionRepositoryMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setRepositoryType(value: js.Function): Self = this.set("repositoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: js.Function): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
  }
}
