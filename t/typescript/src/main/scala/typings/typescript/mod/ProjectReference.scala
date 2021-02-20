package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectReference extends StObject {
  
  /** True if it is intended that this reference form a circularity */
  var circular: js.UndefOr[Boolean] = js.native
  
  /** The path as the user originally wrote it */
  var originalPath: js.UndefOr[java.lang.String] = js.native
  
  /** A normalized path on disk */
  var path: java.lang.String = js.native
  
  /** True if the output of this reference should be prepended to the output of this project. Only valid for --outFile compilations */
  var prepend: js.UndefOr[Boolean] = js.native
}
object ProjectReference {
  
  @scala.inline
  def apply(path: java.lang.String): ProjectReference = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReference]
  }
  
  @scala.inline
  implicit class ProjectReferenceMutableBuilder[Self <: ProjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    
    @scala.inline
    def setOriginalPath(value: java.lang.String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
    
    @scala.inline
    def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
  }
}
