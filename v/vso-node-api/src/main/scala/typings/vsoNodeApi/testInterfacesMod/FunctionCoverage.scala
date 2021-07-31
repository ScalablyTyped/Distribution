package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCoverage extends StObject {
  
  var `class`: String
  
  var name: String
  
  var namespace: String
  
  var sourceFile: String
  
  var statistics: CoverageStatistics
}
object FunctionCoverage {
  
  @scala.inline
  def apply(
    `class`: String,
    name: String,
    namespace: String,
    sourceFile: String,
    statistics: CoverageStatistics
  ): FunctionCoverage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCoverage]
  }
  
  @scala.inline
  implicit class FunctionCoverageMutableBuilder[Self <: FunctionCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistics(value: CoverageStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
