package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullAdditionalCallResolutionData extends StObject {
  
  var actualParametersContextTypeSymbols: js.Array[PullTypeSymbol]
  
  var candidateSignature: PullSignatureSymbol
  
  var diagnosticsFromOverloadResolution: js.Array[Diagnostic]
  
  var resolvedSignatures: js.Array[PullSignatureSymbol]
  
  var targetSymbol: PullSymbol
}
object PullAdditionalCallResolutionData {
  
  inline def apply(
    actualParametersContextTypeSymbols: js.Array[PullTypeSymbol],
    candidateSignature: PullSignatureSymbol,
    diagnosticsFromOverloadResolution: js.Array[Diagnostic],
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullAdditionalCallResolutionData = {
    val __obj = js.Dynamic.literal(actualParametersContextTypeSymbols = actualParametersContextTypeSymbols.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], diagnosticsFromOverloadResolution = diagnosticsFromOverloadResolution.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalCallResolutionData]
  }
  
  extension [Self <: PullAdditionalCallResolutionData](x: Self) {
    
    inline def setActualParametersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = StObject.set(x, "actualParametersContextTypeSymbols", value.asInstanceOf[js.Any])
    
    inline def setActualParametersContextTypeSymbolsVarargs(value: PullTypeSymbol*): Self = StObject.set(x, "actualParametersContextTypeSymbols", js.Array(value :_*))
    
    inline def setCandidateSignature(value: PullSignatureSymbol): Self = StObject.set(x, "candidateSignature", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsFromOverloadResolution(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnosticsFromOverloadResolution", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsFromOverloadResolutionVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnosticsFromOverloadResolution", js.Array(value :_*))
    
    inline def setResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "resolvedSignatures", value.asInstanceOf[js.Any])
    
    inline def setResolvedSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "resolvedSignatures", js.Array(value :_*))
    
    inline def setTargetSymbol(value: PullSymbol): Self = StObject.set(x, "targetSymbol", value.asInstanceOf[js.Any])
  }
}
