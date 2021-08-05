package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branch extends StObject {
  
  var branch: scala.Double
  
  var commit: scala.Double
  
  var tag: scala.Double
}
object Branch {
  
  inline def apply(branch: scala.Double, commit: scala.Double, tag: scala.Double): Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  
  extension [Self <: Branch](x: Self) {
    
    inline def setBranch(value: scala.Double): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: scala.Double): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setTag(value: scala.Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
