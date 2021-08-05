package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncOperationNotFound extends StObject {
  
  var asyncOperationNotFound: scala.Double
  
  var createBranchPermissionRequired: scala.Double
  
  var gitObjectTooLarge: scala.Double
  
  var invalidRefName: scala.Double
  
  var none: scala.Double
  
  var operationIndentityNotFound: scala.Double
  
  var other: scala.Double
  
  var refNameConflict: scala.Double
  
  var targetBranchDeleted: scala.Double
  
  var writePermissionRequired: scala.Double
}
object AsyncOperationNotFound {
  
  inline def apply(
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
  
  extension [Self <: AsyncOperationNotFound](x: Self) {
    
    inline def setAsyncOperationNotFound(value: scala.Double): Self = StObject.set(x, "asyncOperationNotFound", value.asInstanceOf[js.Any])
    
    inline def setCreateBranchPermissionRequired(value: scala.Double): Self = StObject.set(x, "createBranchPermissionRequired", value.asInstanceOf[js.Any])
    
    inline def setGitObjectTooLarge(value: scala.Double): Self = StObject.set(x, "gitObjectTooLarge", value.asInstanceOf[js.Any])
    
    inline def setInvalidRefName(value: scala.Double): Self = StObject.set(x, "invalidRefName", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOperationIndentityNotFound(value: scala.Double): Self = StObject.set(x, "operationIndentityNotFound", value.asInstanceOf[js.Any])
    
    inline def setOther(value: scala.Double): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setRefNameConflict(value: scala.Double): Self = StObject.set(x, "refNameConflict", value.asInstanceOf[js.Any])
    
    inline def setTargetBranchDeleted(value: scala.Double): Self = StObject.set(x, "targetBranchDeleted", value.asInstanceOf[js.Any])
    
    inline def setWritePermissionRequired(value: scala.Double): Self = StObject.set(x, "writePermissionRequired", value.asInstanceOf[js.Any])
  }
}
