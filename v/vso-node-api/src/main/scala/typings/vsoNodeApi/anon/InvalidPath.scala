package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidPath extends StObject {
  
  var invalidPath: scala.Double
  
  var mergeContentNotFound: scala.Double
  
  var none: scala.Double
  
  var otherError: scala.Double
  
  var pathInUse: scala.Double
  
  var unknownAction: scala.Double
  
  var unknownMergeType: scala.Double
}
object InvalidPath {
  
  @scala.inline
  def apply(
    invalidPath: scala.Double,
    mergeContentNotFound: scala.Double,
    none: scala.Double,
    otherError: scala.Double,
    pathInUse: scala.Double,
    unknownAction: scala.Double,
    unknownMergeType: scala.Double
  ): InvalidPath = {
    val __obj = js.Dynamic.literal(invalidPath = invalidPath.asInstanceOf[js.Any], mergeContentNotFound = mergeContentNotFound.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], otherError = otherError.asInstanceOf[js.Any], pathInUse = pathInUse.asInstanceOf[js.Any], unknownAction = unknownAction.asInstanceOf[js.Any], unknownMergeType = unknownMergeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPath]
  }
  
  @scala.inline
  implicit class InvalidPathMutableBuilder[Self <: InvalidPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidPath(value: scala.Double): Self = StObject.set(x, "invalidPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeContentNotFound(value: scala.Double): Self = StObject.set(x, "mergeContentNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherError(value: scala.Double): Self = StObject.set(x, "otherError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathInUse(value: scala.Double): Self = StObject.set(x, "pathInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownAction(value: scala.Double): Self = StObject.set(x, "unknownAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownMergeType(value: scala.Double): Self = StObject.set(x, "unknownMergeType", value.asInstanceOf[js.Any])
  }
}
