package typings.typedoc.anon

import typings.std.FlatArray
import typings.std.IterableIterator
import typings.typedoc.typedocStrings.ClassMember
import typings.typedoc.typedocStrings.ClassOrInterface
import typings.typedoc.typedocStrings.ContainsCallSignatures
import typings.typedoc.typedocStrings.ExportContainer
import typings.typedoc.typedocStrings.FunctionOrMethod
import typings.typedoc.typedocStrings.Inheritable
import typings.typedoc.typedocStrings.SignatureContainer
import typings.typedoc.typedocStrings.SomeExport
import typings.typedoc.typedocStrings.SomeMember
import typings.typedoc.typedocStrings.SomeModule
import typings.typedoc.typedocStrings.SomeSignature
import typings.typedoc.typedocStrings.SomeType
import typings.typedoc.typedocStrings.SomeValue
import typings.typedoc.typedocStrings.VariableOrProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>> */
trait PartialArraykeyofreadonly extends StObject {
  
  var at: js.UndefOr[
    js.Function1[
      /* index */ Double, 
      js.UndefOr[
        typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var concat: js.UndefOr[
    js.Function1[
      /* repeated */ js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ], 
      js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var copyWithin: js.UndefOr[js.Function2[/* target */ Double, /* start */ Double, this.type]] = js.undefined
  
  var entries: js.UndefOr[
    js.Function0[
      IterableIterator[
        js.Tuple2[
          Double, 
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
      ]
    ]
  ] = js.undefined
  
  var every: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Boolean
      ], 
      /* is std.Array<keyof typedoc.anon.TypeofReflectionKind> */ Boolean
    ]
  ] = js.undefined
  
  var fill: js.UndefOr[
    js.Function1[
      /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
      this.type
    ]
  ] = js.undefined
  
  var filter: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Boolean
      ], 
      js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var find: js.UndefOr[
    js.Function1[
      /* predicate */ js.ThisFunction3[
        /* this */ Unit, 
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* obj */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Boolean
      ], 
      js.UndefOr[
        typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var findIndex: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* obj */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Any
      ], 
      Double
    ]
  ] = js.undefined
  
  var flat: js.UndefOr[
    js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.typedoc.typedocInts.`1`]]]
  ] = js.undefined
  
  var flatMap: js.UndefOr[
    js.Function1[
      /* callback */ js.ThisFunction3[
        /* this */ Unit, 
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Any | js.Array[Any]
      ], 
      js.Array[Any]
    ]
  ] = js.undefined
  
  var forEach: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function3[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  var includes: js.UndefOr[
    js.Function1[
      /* keyof typedoc.anon.TypeofReflectionKind */ /* searchElement */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
      Boolean
    ]
  ] = js.undefined
  
  var indexOf: js.UndefOr[
    js.Function1[
      /* keyof typedoc.anon.TypeofReflectionKind */ /* searchElement */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
      Double
    ]
  ] = js.undefined
  
  var join: js.UndefOr[js.Function0[String]] = js.undefined
  
  var keys: js.UndefOr[js.Function0[IterableIterator[Double]]] = js.undefined
  
  var lastIndexOf: js.UndefOr[
    js.Function1[
      /* keyof typedoc.anon.TypeofReflectionKind */ /* searchElement */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
      Double
    ]
  ] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function3[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Any
      ], 
      js.Array[Any]
    ]
  ] = js.undefined
  
  var pop: js.UndefOr[
    js.Function0[
      js.UndefOr[
        typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var push: js.UndefOr[
    js.Function1[
      /* keyof typedoc.anon.TypeofReflectionKind */ /* repeated */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
      Double
    ]
  ] = js.undefined
  
  var reduce: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* previousValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* keyof typedoc.anon.TypeofReflectionKind */ /* currentValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* currentIndex */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ], 
      /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ]
  ] = js.undefined
  
  var reduceRight: js.UndefOr[
    js.Function1[
      /* callbackfn */ js.Function4[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* previousValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* keyof typedoc.anon.TypeofReflectionKind */ /* currentValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* currentIndex */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ], 
      /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ]
  ] = js.undefined
  
  var reverse: js.UndefOr[
    js.Function0[
      js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var shift: js.UndefOr[
    js.Function0[
      js.UndefOr[
        typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var slice: js.UndefOr[
    js.Function0[
      js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  var some: js.UndefOr[
    js.Function1[
      /* predicate */ js.Function3[
        /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
        /* index */ Double, 
        /* array */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ], 
        Any
      ], 
      Boolean
    ]
  ] = js.undefined
  
  var sort: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var splice: js.UndefOr[
    js.Function1[
      /* start */ Double, 
      js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
  
  @JSName("toLocaleString")
  var toLocaleString_FPartialArraykeyofreadonly: js.UndefOr[js.Function0[String]] = js.undefined
  
  @JSName("toString")
  var toString_FPartialArraykeyofreadonly: js.UndefOr[js.Function0[String]] = js.undefined
  
  var unshift: js.UndefOr[
    js.Function1[
      /* keyof typedoc.anon.TypeofReflectionKind */ /* repeated */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
      Double
    ]
  ] = js.undefined
  
  var values: js.UndefOr[
    js.Function0[
      IterableIterator[
        /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ]
  ] = js.undefined
}
object PartialArraykeyofreadonly {
  
  inline def apply(): PartialArraykeyofreadonly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArraykeyofreadonly]
  }
  
  extension [Self <: PartialArraykeyofreadonly](x: Self) {
    
    inline def setAt(
      value: /* index */ Double => js.UndefOr[
          typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setConcat(
      value: /* repeated */ js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ] => js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "concat", js.Any.fromFunction1(value))
    
    inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
    
    inline def setCopyWithin(value: (/* target */ Double, /* start */ Double) => PartialArraykeyofreadonly): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
    
    inline def setEntries(
      value: () => IterableIterator[
          js.Tuple2[
            Double, 
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ]
        ]
    ): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEvery(
      value: /* predicate */ js.Function3[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Boolean
        ] => /* is std.Array<keyof typedoc.anon.TypeofReflectionKind> */ Boolean
    ): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    inline def setFill(
      value: /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer => PartialArraykeyofreadonly
    ): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFilter(
      value: /* predicate */ js.Function3[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Boolean
        ] => js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFind(
      value: /* predicate */ js.ThisFunction3[
          /* this */ Unit, 
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* obj */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Boolean
        ] => js.UndefOr[
          typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(
      value: /* predicate */ js.Function3[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* obj */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Any
        ] => Double
    ): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFlat(value: js.ThisFunction0[/* this */ Any, js.Array[FlatArray[Any, typings.typedoc.typedocInts.`1`]]]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatMap(
      value: /* callback */ js.ThisFunction3[
          /* this */ Unit, 
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Any | js.Array[Any]
        ] => js.Array[Any]
    ): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
    
    inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setForEach(
      value: /* callbackfn */ js.Function3[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
    
    inline def setIncludes(
      value: /* keyof typedoc.anon.TypeofReflectionKind */ /* searchElement */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer => Boolean
    ): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    
    inline def setIndexOf(
      value: /* keyof typedoc.anon.TypeofReflectionKind */ /* searchElement */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer => Double
    ): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLastIndexOf(
      value: /* keyof typedoc.anon.TypeofReflectionKind */ /* searchElement */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer => Double
    ): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMap(
      value: /* callbackfn */ js.Function3[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Any
        ] => js.Array[Any]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPop(
      value: () => js.UndefOr[
          typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setPush(
      value: /* keyof typedoc.anon.TypeofReflectionKind */ /* repeated */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer => Double
    ): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setReduce(
      value: /* callbackfn */ js.Function4[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* previousValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* keyof typedoc.anon.TypeofReflectionKind */ /* currentValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* currentIndex */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ] => /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: /* callbackfn */ js.Function4[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* previousValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* keyof typedoc.anon.TypeofReflectionKind */ /* currentValue */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* currentIndex */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ] => /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
    
    inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
    
    inline def setReverse(
      value: () => js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setShift(
      value: () => js.UndefOr[
          typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    
    inline def setSlice(
      value: () => js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setSome(
      value: /* predicate */ js.Function3[
          /* keyof typedoc.anon.TypeofReflectionKind */ /* value */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer, 
          /* index */ Double, 
          /* array */ js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ], 
          Any
        ] => Boolean
    ): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
    
    inline def setSort(value: () => PartialArraykeyofreadonly): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSplice(
      value: /* start */ Double => js.Array[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "splice", js.Any.fromFunction1(value))
    
    inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
    
    inline def setToLocaleString(value: () => String): Self = StObject.set(x, "toLocaleString", js.Any.fromFunction0(value))
    
    inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setUnshift(
      value: /* keyof typedoc.anon.TypeofReflectionKind */ /* repeated */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer => Double
    ): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    
    inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
    
    inline def setValues(
      value: () => IterableIterator[
          /* keyof typedoc.anon.TypeofReflectionKind */ typings.typedoc.typedocStrings.All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
        ]
    ): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
