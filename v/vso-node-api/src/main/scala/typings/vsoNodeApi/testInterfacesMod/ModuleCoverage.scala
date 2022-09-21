package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleCoverage extends StObject {
  
  var blockCount: Double
  
  var blockData: js.Array[Double]
  
  var functions: js.Array[FunctionCoverage]
  
  var name: String
  
  var signature: String
  
  var signatureAge: Double
  
  var statistics: CoverageStatistics
}
object ModuleCoverage {
  
  inline def apply(
    blockCount: Double,
    blockData: js.Array[Double],
    functions: js.Array[FunctionCoverage],
    name: String,
    signature: String,
    signatureAge: Double,
    statistics: CoverageStatistics
  ): ModuleCoverage = {
    val __obj = js.Dynamic.literal(blockCount = blockCount.asInstanceOf[js.Any], blockData = blockData.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAge = signatureAge.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleCoverage]
  }
  
  extension [Self <: ModuleCoverage](x: Self) {
    
    inline def setBlockCount(value: Double): Self = StObject.set(x, "blockCount", value.asInstanceOf[js.Any])
    
    inline def setBlockData(value: js.Array[Double]): Self = StObject.set(x, "blockData", value.asInstanceOf[js.Any])
    
    inline def setBlockDataVarargs(value: Double*): Self = StObject.set(x, "blockData", js.Array(value*))
    
    inline def setFunctions(value: js.Array[FunctionCoverage]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsVarargs(value: FunctionCoverage*): Self = StObject.set(x, "functions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAge(value: Double): Self = StObject.set(x, "signatureAge", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: CoverageStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
  }
}
