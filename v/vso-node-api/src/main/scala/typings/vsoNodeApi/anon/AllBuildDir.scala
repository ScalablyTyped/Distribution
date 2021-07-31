package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllBuildDir extends StObject {
  
  var allBuildDir: scala.Double
  
  var source: scala.Double
  
  var sourceAndOutputDir: scala.Double
  
  var sourceDir: scala.Double
}
object AllBuildDir {
  
  @scala.inline
  def apply(
    allBuildDir: scala.Double,
    source: scala.Double,
    sourceAndOutputDir: scala.Double,
    sourceDir: scala.Double
  ): AllBuildDir = {
    val __obj = js.Dynamic.literal(allBuildDir = allBuildDir.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceAndOutputDir = sourceAndOutputDir.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuildDir]
  }
  
  @scala.inline
  implicit class AllBuildDirMutableBuilder[Self <: AllBuildDir] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllBuildDir(value: scala.Double): Self = StObject.set(x, "allBuildDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: scala.Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAndOutputDir(value: scala.Double): Self = StObject.set(x, "sourceAndOutputDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDir(value: scala.Double): Self = StObject.set(x, "sourceDir", value.asInstanceOf[js.Any])
  }
}
