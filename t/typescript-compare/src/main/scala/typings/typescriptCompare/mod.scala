package typings.typescriptCompare

import typings.typescriptCompare.typescriptCompareBooleans.`true`
import typings.typescriptCompare.typescriptCompareNumbers.`0`
import typings.typescriptCompare.typescriptCompareNumbers.`1`
import typings.typescriptCompare.typescriptCompareStrings.broaderLeft
import typings.typescriptCompare.typescriptCompareStrings.broaderRight
import typings.typescriptCompare.typescriptCompareStrings.equal
import typings.typescriptCompare.typescriptCompareStrings.mismatch
import typings.typescriptLogic.mod.And
import typings.typescriptLogic.mod.If
import typings.typescriptLogic.mod.Not
import typings.typescriptLogic.mod.Or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Any[Type] = And[
    typings.typescriptCompare.mod.prv.Extends[Type, `0`], 
    typings.typescriptCompare.mod.prv.Extends[Type, `1`]
  ]
  
  object Compare {
    
    trait Options extends StObject {
      
      var broaderLeft: js.Any
      
      var broaderRight: js.Any
      
      var equal: js.Any
      
      var mismatch: js.Any
    }
    object Options {
      
      @scala.inline
      def apply(broaderLeft: js.Any, broaderRight: js.Any, equal: js.Any, mismatch: js.Any): Options = {
        val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      trait Default
        extends StObject
           with Options {
        
        @JSName("broaderLeft")
        var broaderLeft_Default: broaderLeft
        
        @JSName("broaderRight")
        var broaderRight_Default: broaderRight
        
        @JSName("equal")
        var equal_Default: equal
        
        @JSName("mismatch")
        var mismatch_Default: mismatch
      }
      object Default {
        
        @scala.inline
        def apply(): Default = {
          val __obj = js.Dynamic.literal(broaderLeft = "broaderLeft", broaderRight = "broaderRight", equal = "equal", mismatch = "mismatch")
          __obj.asInstanceOf[Default]
        }
        
        @scala.inline
        implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBroaderLeft(value: broaderLeft): Self = StObject.set(x, "broaderLeft", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBroaderRight(value: broaderRight): Self = StObject.set(x, "broaderRight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEqual(value: equal): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMismatch(value: mismatch): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
        }
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBroaderLeft(value: js.Any): Self = StObject.set(x, "broaderLeft", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBroaderRight(value: js.Any): Self = StObject.set(x, "broaderRight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEqual(value: js.Any): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMismatch(value: js.Any): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
      }
    }
    
    type Strict[A, B, Options /* <: typings.typescriptCompare.mod.Compare.Options */] = If[
        Extends[A, B], 
        If[
          Extends[B, A], 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['equal'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
        ], 
        If[
          Extends[B, A], 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
        ]
      ]
  }
  type Compare[A, B, Options /* <: typings.typescriptCompare.mod.Compare.Options */] = If[
    Extends[A, B], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  
  type Equal[A, B] = Or[
    And[Any[A], Any[B]], 
    And[
      And[NotAny[A, `true`, `true`], NotAny[B, `true`, `true`]], 
      And[Extends[A, B], Extends[B, A]]
    ]
  ]
  
  type Extends[A, B] = Or[Any[B], If[Any[A], Any[B], typings.typescriptCompare.mod.prv.Extends[A, B]]]
  
  type NotAny[Type, True, False] = Not[Any[Type]]
  
  type NotEqual[A, B] = Not[Equal[A, B]]
  
  object prv {
    
    /* Rewritten from type alias, can be one of: 
      - typings.typescriptCompare.typescriptCompareBooleans.`false`
      - typings.typescriptCompare.typescriptCompareBooleans.`true`
    */
    trait Extends[A, B] extends StObject
  }
}
