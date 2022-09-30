package typings.typeFest.anon

import typings.std.IterableIterator
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.ReadonlySet<infer ItemType>> */
trait ReadonlyReadonlySetinferI extends StObject {
  
  def entries(): IterableIterator[
    js.Tuple2[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
    ]
  ]
  
  def forEach(
    callbackfn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ /* value2 */ js.Any, 
      /* set */ ReadonlySet[
        /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
      ], 
      Unit
    ]
  ): Unit
  
  def has(
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
  ): Boolean
  
  def keys(): IterableIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
  ]
  
  val size: Double
  
  def values(): IterableIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
  ]
}
object ReadonlyReadonlySetinferI {
  
  inline def apply(
    entries: () => IterableIterator[
      js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
      ]
    ],
    forEach: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ /* value2 */ js.Any, 
      /* set */ ReadonlySet[
        /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
      ], 
      Unit
    ] => Unit,
    has: /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any => Boolean,
    keys: () => IterableIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
    ],
    size: Double,
    values: () => IterableIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
    ]
  ): ReadonlyReadonlySetinferI = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyReadonlySetinferI]
  }
  
  extension [Self <: ReadonlyReadonlySetinferI](x: Self) {
    
    inline def setEntries(
      value: () => IterableIterator[
          js.Tuple2[
            /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setForEach(
      value: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ /* value2 */ js.Any, 
          /* set */ ReadonlySet[
            /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
          ], 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setHas(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any => Boolean
    ): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(
      value: () => IterableIterator[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
        ]
    ): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValues(
      value: () => IterableIterator[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ItemType */ js.Any
        ]
    ): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
