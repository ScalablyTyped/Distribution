package typings.typescriptServices

import typings.typescriptServices.TypeScript.EnclosingTypeWalkerState
import typings.typescriptServices.TypeScript.GetAccessor
import typings.typescriptServices.TypeScript.IndexSignatureInfo
import typings.typescriptServices.TypeScript.PullSignatureSymbol
import typings.typescriptServices.TypeScript.SetAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActualText extends StObject {
    
    var actualText: String
    
    var memberName: String
  }
  object ActualText {
    
    inline def apply(actualText: String, memberName: String): ActualText = {
      val __obj = js.Dynamic.literal(actualText = actualText.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActualText]
    }
    
    extension [Self <: ActualText](x: Self) {
      
      inline def setActualText(value: String): Self = StObject.set(x, "actualText", value.asInstanceOf[js.Any])
      
      inline def setMemberName(value: String): Self = StObject.set(x, "memberName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllSignatures extends StObject {
    
    var allSignatures: js.Array[PullSignatureSymbol]
    
    var signature: PullSignatureSymbol
  }
  object AllSignatures {
    
    inline def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): AllSignatures = {
      val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllSignatures]
    }
    
    extension [Self <: AllSignatures](x: Self) {
      
      inline def setAllSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "allSignatures", value.asInstanceOf[js.Any])
      
      inline def setAllSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "allSignatures", js.Array(value*))
      
      inline def setSignature(value: PullSignatureSymbol): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowAutomaticSemicolonInsertion extends StObject {
    
    var allowAutomaticSemicolonInsertion: Boolean
  }
  object AllowAutomaticSemicolonInsertion {
    
    inline def apply(allowAutomaticSemicolonInsertion: Boolean): AllowAutomaticSemicolonInsertion = {
      val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowAutomaticSemicolonInsertion]
    }
    
    extension [Self <: AllowAutomaticSemicolonInsertion](x: Self) {
      
      inline def setAllowAutomaticSemicolonInsertion(value: Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyList extends StObject {
    
    var dependencyList: String
    
    var importList: String
  }
  object DependencyList {
    
    inline def apply(dependencyList: String, importList: String): DependencyList = {
      val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], importList = importList.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyList]
    }
    
    extension [Self <: DependencyList](x: Self) {
      
      inline def setDependencyList(value: String): Self = StObject.set(x, "dependencyList", value.asInstanceOf[js.Any])
      
      inline def setImportList(value: String): Self = StObject.set(x, "importList", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnclosingTypeWalkerState1 extends StObject {
    
    var enclosingTypeWalkerState1: EnclosingTypeWalkerState
    
    var enclosingTypeWalkerState2: EnclosingTypeWalkerState
  }
  object EnclosingTypeWalkerState1 {
    
    inline def apply(
      enclosingTypeWalkerState1: EnclosingTypeWalkerState,
      enclosingTypeWalkerState2: EnclosingTypeWalkerState
    ): EnclosingTypeWalkerState1 = {
      val __obj = js.Dynamic.literal(enclosingTypeWalkerState1 = enclosingTypeWalkerState1.asInstanceOf[js.Any], enclosingTypeWalkerState2 = enclosingTypeWalkerState2.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnclosingTypeWalkerState1]
    }
    
    extension [Self <: EnclosingTypeWalkerState1](x: Self) {
      
      inline def setEnclosingTypeWalkerState1(value: EnclosingTypeWalkerState): Self = StObject.set(x, "enclosingTypeWalkerState1", value.asInstanceOf[js.Any])
      
      inline def setEnclosingTypeWalkerState2(value: EnclosingTypeWalkerState): Self = StObject.set(x, "enclosingTypeWalkerState2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Getter extends StObject {
    
    var getter: GetAccessor
    
    var setter: SetAccessor
  }
  object Getter {
    
    inline def apply(getter: GetAccessor, setter: SetAccessor): Getter = {
      val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Getter]
    }
    
    extension [Self <: Getter](x: Self) {
      
      inline def setGetter(value: GetAccessor): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      inline def setSetter(value: SetAccessor): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexSigs1 extends StObject {
    
    var indexSigs1: IndexSignatureInfo
    
    var indexSigs2: IndexSignatureInfo
  }
  object IndexSigs1 {
    
    inline def apply(indexSigs1: IndexSignatureInfo, indexSigs2: IndexSignatureInfo): IndexSigs1 = {
      val __obj = js.Dynamic.literal(indexSigs1 = indexSigs1.asInstanceOf[js.Any], indexSigs2 = indexSigs2.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexSigs1]
    }
    
    extension [Self <: IndexSigs1](x: Self) {
      
      inline def setIndexSigs1(value: IndexSignatureInfo): Self = StObject.set(x, "indexSigs1", value.asInstanceOf[js.Any])
      
      inline def setIndexSigs2(value: IndexSignatureInfo): Self = StObject.set(x, "indexSigs2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
    
    var lineStarts: js.Array[Double]
  }
  object Length {
    
    inline def apply(length: Double, lineStarts: js.Array[Double]): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lineStarts = lineStarts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLineStarts(value: js.Array[Double]): Self = StObject.set(x, "lineStarts", value.asInstanceOf[js.Any])
      
      inline def setLineStartsVarargs(value: Double*): Self = StObject.set(x, "lineStarts", js.Array(value*))
    }
  }
  
  trait Recursive extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Recursive {
    
    inline def apply(): Recursive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recursive]
    }
    
    extension [Self <: Recursive](x: Self) {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait Rest extends StObject {
    
    var rest: String
    
    var value: Double
  }
  object Rest {
    
    inline def apply(rest: String, value: Double): Rest = {
      val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rest]
    }
    
    extension [Self <: Rest](x: Self) {
      
      inline def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateWhenStartedWalkingTypes1 extends StObject {
    
    var stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState
    
    var stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState
  }
  object StateWhenStartedWalkingTypes1 {
    
    inline def apply(
      stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState,
      stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState
    ): StateWhenStartedWalkingTypes1 = {
      val __obj = js.Dynamic.literal(stateWhenStartedWalkingTypes1 = stateWhenStartedWalkingTypes1.asInstanceOf[js.Any], stateWhenStartedWalkingTypes2 = stateWhenStartedWalkingTypes2.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateWhenStartedWalkingTypes1]
    }
    
    extension [Self <: StateWhenStartedWalkingTypes1](x: Self) {
      
      inline def setStateWhenStartedWalkingTypes1(value: EnclosingTypeWalkerState): Self = StObject.set(x, "stateWhenStartedWalkingTypes1", value.asInstanceOf[js.Any])
      
      inline def setStateWhenStartedWalkingTypes2(value: EnclosingTypeWalkerState): Self = StObject.set(x, "stateWhenStartedWalkingTypes2", value.asInstanceOf[js.Any])
    }
  }
}
