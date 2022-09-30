package typings.typeFest.anon

import typings.std.IterableIterator
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.ReadonlyMap<infer KeyType, infer ValueType>> */
trait ReadonlyReadonlyMapinferK extends StObject {
  
  def entries(): IterableIterator[
    js.Tuple2[
      /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
    ]
  ]
  
  def forEach(
    callbackfn: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ /* key */ js.Any, 
      /* map */ ReadonlyMap[
        /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
      ], 
      Unit
    ]
  ): Unit
  
  def get(key: /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
  ]
  
  def has(key: /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any): Boolean
  
  def keys(): IterableIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any
  ]
  
  val size: Double
  
  def values(): IterableIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
  ]
}
object ReadonlyReadonlyMapinferK {
  
  inline def apply(
    entries: () => IterableIterator[
      js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
      ]
    ],
    forEach: js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ /* key */ js.Any, 
      /* map */ ReadonlyMap[
        /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
      ], 
      Unit
    ] => Unit,
    get: /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any => js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
    ],
    has: /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any => Boolean,
    keys: () => IterableIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any
    ],
    size: Double,
    values: () => IterableIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
    ]
  ): ReadonlyReadonlyMapinferK = {
    val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyReadonlyMapinferK]
  }
  
  extension [Self <: ReadonlyReadonlyMapinferK](x: Self) {
    
    inline def setEntries(
      value: () => IterableIterator[
          js.Tuple2[
            /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setForEach(
      value: js.Function3[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ /* value */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ /* key */ js.Any, 
          /* map */ ReadonlyMap[
            /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
          ], 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setGet(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any => js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
        ]
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any => Boolean
    ): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(
      value: () => IterableIterator[
          /* import warning: importer.ImportType#apply Failed type conversion: infer KeyType */ js.Any
        ]
    ): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setValues(
      value: () => IterableIterator[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ValueType */ js.Any
        ]
    ): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
