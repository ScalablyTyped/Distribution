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
    
    @scala.inline
    def apply(actualText: String, memberName: String): ActualText = {
      val __obj = js.Dynamic.literal(actualText = actualText.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActualText]
    }
    
    @scala.inline
    implicit class ActualTextMutableBuilder[Self <: ActualText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualText(value: String): Self = StObject.set(x, "actualText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberName(value: String): Self = StObject.set(x, "memberName", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllSignatures extends StObject {
    
    var allSignatures: js.Array[PullSignatureSymbol]
    
    var signature: PullSignatureSymbol
  }
  object AllSignatures {
    
    @scala.inline
    def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): AllSignatures = {
      val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllSignatures]
    }
    
    @scala.inline
    implicit class AllSignaturesMutableBuilder[Self <: AllSignatures] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllSignatures(value: js.Array[PullSignatureSymbol]): Self = StObject.set(x, "allSignatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllSignaturesVarargs(value: PullSignatureSymbol*): Self = StObject.set(x, "allSignatures", js.Array(value :_*))
      
      @scala.inline
      def setSignature(value: PullSignatureSymbol): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllowAutomaticSemicolonInsertion extends StObject {
    
    var allowAutomaticSemicolonInsertion: Boolean
  }
  object AllowAutomaticSemicolonInsertion {
    
    @scala.inline
    def apply(allowAutomaticSemicolonInsertion: Boolean): AllowAutomaticSemicolonInsertion = {
      val __obj = js.Dynamic.literal(allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowAutomaticSemicolonInsertion]
    }
    
    @scala.inline
    implicit class AllowAutomaticSemicolonInsertionMutableBuilder[Self <: AllowAutomaticSemicolonInsertion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAutomaticSemicolonInsertion(value: Boolean): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyList extends StObject {
    
    var dependencyList: String
    
    var importList: String
  }
  object DependencyList {
    
    @scala.inline
    def apply(dependencyList: String, importList: String): DependencyList = {
      val __obj = js.Dynamic.literal(dependencyList = dependencyList.asInstanceOf[js.Any], importList = importList.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyList]
    }
    
    @scala.inline
    implicit class DependencyListMutableBuilder[Self <: DependencyList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencyList(value: String): Self = StObject.set(x, "dependencyList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportList(value: String): Self = StObject.set(x, "importList", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnclosingTypeWalkerState1 extends StObject {
    
    var enclosingTypeWalkerState1: EnclosingTypeWalkerState
    
    var enclosingTypeWalkerState2: EnclosingTypeWalkerState
  }
  object EnclosingTypeWalkerState1 {
    
    @scala.inline
    def apply(
      enclosingTypeWalkerState1: EnclosingTypeWalkerState,
      enclosingTypeWalkerState2: EnclosingTypeWalkerState
    ): EnclosingTypeWalkerState1 = {
      val __obj = js.Dynamic.literal(enclosingTypeWalkerState1 = enclosingTypeWalkerState1.asInstanceOf[js.Any], enclosingTypeWalkerState2 = enclosingTypeWalkerState2.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnclosingTypeWalkerState1]
    }
    
    @scala.inline
    implicit class EnclosingTypeWalkerState1MutableBuilder[Self <: EnclosingTypeWalkerState1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnclosingTypeWalkerState1(value: EnclosingTypeWalkerState): Self = StObject.set(x, "enclosingTypeWalkerState1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnclosingTypeWalkerState2(value: EnclosingTypeWalkerState): Self = StObject.set(x, "enclosingTypeWalkerState2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Getter extends StObject {
    
    var getter: GetAccessor
    
    var setter: SetAccessor
  }
  object Getter {
    
    @scala.inline
    def apply(getter: GetAccessor, setter: SetAccessor): Getter = {
      val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Getter]
    }
    
    @scala.inline
    implicit class GetterMutableBuilder[Self <: Getter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetter(value: GetAccessor): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetter(value: SetAccessor): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexSigs1 extends StObject {
    
    var indexSigs1: IndexSignatureInfo
    
    var indexSigs2: IndexSignatureInfo
  }
  object IndexSigs1 {
    
    @scala.inline
    def apply(indexSigs1: IndexSignatureInfo, indexSigs2: IndexSignatureInfo): IndexSigs1 = {
      val __obj = js.Dynamic.literal(indexSigs1 = indexSigs1.asInstanceOf[js.Any], indexSigs2 = indexSigs2.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexSigs1]
    }
    
    @scala.inline
    implicit class IndexSigs1MutableBuilder[Self <: IndexSigs1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexSigs1(value: IndexSignatureInfo): Self = StObject.set(x, "indexSigs1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexSigs2(value: IndexSignatureInfo): Self = StObject.set(x, "indexSigs2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
    
    var lineStarts: js.Array[Double]
  }
  object Length {
    
    @scala.inline
    def apply(length: Double, lineStarts: js.Array[Double]): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], lineStarts = lineStarts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStarts(value: js.Array[Double]): Self = StObject.set(x, "lineStarts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineStartsVarargs(value: Double*): Self = StObject.set(x, "lineStarts", js.Array(value :_*))
    }
  }
  
  trait Recursive extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Recursive {
    
    @scala.inline
    def apply(): Recursive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recursive]
    }
    
    @scala.inline
    implicit class RecursiveMutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait Rest extends StObject {
    
    var rest: String
    
    var value: Double
  }
  object Rest {
    
    @scala.inline
    def apply(rest: String, value: Double): Rest = {
      val __obj = js.Dynamic.literal(rest = rest.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rest]
    }
    
    @scala.inline
    implicit class RestMutableBuilder[Self <: Rest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateWhenStartedWalkingTypes1 extends StObject {
    
    var stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState
    
    var stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState
  }
  object StateWhenStartedWalkingTypes1 {
    
    @scala.inline
    def apply(
      stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState,
      stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState
    ): StateWhenStartedWalkingTypes1 = {
      val __obj = js.Dynamic.literal(stateWhenStartedWalkingTypes1 = stateWhenStartedWalkingTypes1.asInstanceOf[js.Any], stateWhenStartedWalkingTypes2 = stateWhenStartedWalkingTypes2.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateWhenStartedWalkingTypes1]
    }
    
    @scala.inline
    implicit class StateWhenStartedWalkingTypes1MutableBuilder[Self <: StateWhenStartedWalkingTypes1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStateWhenStartedWalkingTypes1(value: EnclosingTypeWalkerState): Self = StObject.set(x, "stateWhenStartedWalkingTypes1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateWhenStartedWalkingTypes2(value: EnclosingTypeWalkerState): Self = StObject.set(x, "stateWhenStartedWalkingTypes2", value.asInstanceOf[js.Any])
    }
  }
}
