package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullAdditionalCallResolutionData extends StObject {
  
  var actualParametersContextTypeSymbols: js.Array[PullTypeSymbol] = js.native
  
  var candidateSignature: PullSignatureSymbol = js.native
  
  var diagnosticsFromOverloadResolution: js.Array[Diagnostic] = js.native
  
  var resolvedSignatures: js.Array[PullSignatureSymbol] = js.native
  
  var targetSymbol: PullSymbol = js.native
}
object PullAdditionalCallResolutionData {
  
  @scala.inline
  def apply(
    actualParametersContextTypeSymbols: js.Array[PullTypeSymbol],
    candidateSignature: PullSignatureSymbol,
    diagnosticsFromOverloadResolution: js.Array[Diagnostic],
    resolvedSignatures: js.Array[PullSignatureSymbol],
    targetSymbol: PullSymbol
  ): PullAdditionalCallResolutionData = {
    val __obj = js.Dynamic.literal(actualParametersContextTypeSymbols = actualParametersContextTypeSymbols.asInstanceOf[js.Any], candidateSignature = candidateSignature.asInstanceOf[js.Any], diagnosticsFromOverloadResolution = diagnosticsFromOverloadResolution.asInstanceOf[js.Any], resolvedSignatures = resolvedSignatures.asInstanceOf[js.Any], targetSymbol = targetSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalCallResolutionData]
  }
  
  @scala.inline
  implicit class PullAdditionalCallResolutionDataMutableBuilder[Self <: PullAdditionalCallResolutionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualParametersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = StObject.set(x, "actualParametersContextTypeSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualParametersContextTypeSymbolsVarargs(value: PullTypeSymbol*): Self = StObject.set(x, "actualParametersContextTypeSymbols", js.Array(value :_*))
    
    @scala.inline
    def setCandidateSignature(value: PullSignatureSymbol): Self = StObject.set(x, "candidateSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsFromOverloadResolution(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnosticsFromOverloadResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsFromOverloadResolutionVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnosticsFromOverloadResolution", js.Array(value :_*))
    
    @scala.inline
    def setResolvedSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "resolvedSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "resolvedSignatures", js.Array(value :_*))
    
    @scala.inline
    def setTargetSymbol(value: PullSymbol): Self = StObject.set(x, "targetSymbol", value.asInstanceOf[js.Any])
  }
}
