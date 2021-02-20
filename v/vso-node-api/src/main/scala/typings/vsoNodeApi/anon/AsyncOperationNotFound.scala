package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncOperationNotFound extends StObject {
  
  var asyncOperationNotFound: scala.Double = js.native
  
  var createBranchPermissionRequired: scala.Double = js.native
  
  var gitObjectTooLarge: scala.Double = js.native
  
  var invalidRefName: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var operationIndentityNotFound: scala.Double = js.native
  
  var other: scala.Double = js.native
  
  var refNameConflict: scala.Double = js.native
  
  var targetBranchDeleted: scala.Double = js.native
  
  var writePermissionRequired: scala.Double = js.native
}
object AsyncOperationNotFound {
  
  @scala.inline
  def apply(
    asyncOperationNotFound: scala.Double,
    createBranchPermissionRequired: scala.Double,
    gitObjectTooLarge: scala.Double,
    invalidRefName: scala.Double,
    none: scala.Double,
    operationIndentityNotFound: scala.Double,
    other: scala.Double,
    refNameConflict: scala.Double,
    targetBranchDeleted: scala.Double,
    writePermissionRequired: scala.Double
  ): AsyncOperationNotFound = {
    val __obj = js.Dynamic.literal(asyncOperationNotFound = asyncOperationNotFound.asInstanceOf[js.Any], createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], gitObjectTooLarge = gitObjectTooLarge.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], operationIndentityNotFound = operationIndentityNotFound.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], targetBranchDeleted = targetBranchDeleted.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncOperationNotFound]
  }
  
  @scala.inline
  implicit class AsyncOperationNotFoundMutableBuilder[Self <: AsyncOperationNotFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncOperationNotFound(value: scala.Double): Self = StObject.set(x, "asyncOperationNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateBranchPermissionRequired(value: scala.Double): Self = StObject.set(x, "createBranchPermissionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitObjectTooLarge(value: scala.Double): Self = StObject.set(x, "gitObjectTooLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidRefName(value: scala.Double): Self = StObject.set(x, "invalidRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIndentityNotFound(value: scala.Double): Self = StObject.set(x, "operationIndentityNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: scala.Double): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNameConflict(value: scala.Double): Self = StObject.set(x, "refNameConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetBranchDeleted(value: scala.Double): Self = StObject.set(x, "targetBranchDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritePermissionRequired(value: scala.Double): Self = StObject.set(x, "writePermissionRequired", value.asInstanceOf[js.Any])
  }
}
