package typings.webpack.anon

import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.GroupConfig
import typings.webpack.mod.StatsFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  extract :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Object, any, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   filter :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[any, webpack.webpack.StatsFactoryContext, number, number], any, tapable.tapable.UnsetAdditionalOptions>>,   sort :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<(arg0 : any | undefined, arg1 : any | undefined): number>, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   filterSorted :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[any, webpack.webpack.StatsFactoryContext, number, number], any, tapable.tapable.UnsetAdditionalOptions>>,   groupResults :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<webpack.webpack.GroupConfig>, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   sortResults :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<(arg0 : any | undefined, arg1 : any | undefined): number>, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   filterResults :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[any, webpack.webpack.StatsFactoryContext, number, number], any, tapable.tapable.UnsetAdditionalOptions>>,   merge :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<any>, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   result :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<any>, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   getItemName :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[any, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>,   getItemFactory :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[any, webpack.webpack.StatsFactoryContext], any, tapable.tapable.UnsetAdditionalOptions>>}> */
trait ReadonlyextractHookMapSyn extends StObject {
  
  val extract: HookMap[
    SyncBailHook[js.Tuple3[js.Object, Any, StatsFactoryContext], Any, UnsetAdditionalOptions]
  ]
  
  val filter: HookMap[
    SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
  ]
  
  val filterResults: HookMap[
    SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
  ]
  
  val filterSorted: HookMap[
    SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
  ]
  
  val getItemFactory: HookMap[SyncBailHook[js.Tuple2[Any, StatsFactoryContext], Any, UnsetAdditionalOptions]]
  
  val getItemName: HookMap[SyncBailHook[js.Tuple2[Any, StatsFactoryContext], Any, UnsetAdditionalOptions]]
  
  val groupResults: HookMap[
    SyncBailHook[js.Tuple2[js.Array[GroupConfig], StatsFactoryContext], Any, UnsetAdditionalOptions]
  ]
  
  val merge: HookMap[
    SyncBailHook[js.Tuple2[js.Array[Any], StatsFactoryContext], Any, UnsetAdditionalOptions]
  ]
  
  val result: HookMap[
    SyncBailHook[js.Tuple2[js.Array[Any], StatsFactoryContext], Any, UnsetAdditionalOptions]
  ]
  
  val sort: HookMap[
    SyncBailHook[
      js.Tuple2[
        js.Array[js.Function2[/* arg0 */ js.UndefOr[Any], /* arg1 */ js.UndefOr[Any], Double]], 
        StatsFactoryContext
      ], 
      Any, 
      UnsetAdditionalOptions
    ]
  ]
  
  val sortResults: HookMap[
    SyncBailHook[
      js.Tuple2[
        js.Array[js.Function2[/* arg0 */ js.UndefOr[Any], /* arg1 */ js.UndefOr[Any], Double]], 
        StatsFactoryContext
      ], 
      Any, 
      UnsetAdditionalOptions
    ]
  ]
}
object ReadonlyextractHookMapSyn {
  
  inline def apply(
    extract: HookMap[
      SyncBailHook[js.Tuple3[js.Object, Any, StatsFactoryContext], Any, UnsetAdditionalOptions]
    ],
    filter: HookMap[
      SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
    ],
    filterResults: HookMap[
      SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
    ],
    filterSorted: HookMap[
      SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
    ],
    getItemFactory: HookMap[SyncBailHook[js.Tuple2[Any, StatsFactoryContext], Any, UnsetAdditionalOptions]],
    getItemName: HookMap[SyncBailHook[js.Tuple2[Any, StatsFactoryContext], Any, UnsetAdditionalOptions]],
    groupResults: HookMap[
      SyncBailHook[js.Tuple2[js.Array[GroupConfig], StatsFactoryContext], Any, UnsetAdditionalOptions]
    ],
    merge: HookMap[
      SyncBailHook[js.Tuple2[js.Array[Any], StatsFactoryContext], Any, UnsetAdditionalOptions]
    ],
    result: HookMap[
      SyncBailHook[js.Tuple2[js.Array[Any], StatsFactoryContext], Any, UnsetAdditionalOptions]
    ],
    sort: HookMap[
      SyncBailHook[
        js.Tuple2[
          js.Array[js.Function2[/* arg0 */ js.UndefOr[Any], /* arg1 */ js.UndefOr[Any], Double]], 
          StatsFactoryContext
        ], 
        Any, 
        UnsetAdditionalOptions
      ]
    ],
    sortResults: HookMap[
      SyncBailHook[
        js.Tuple2[
          js.Array[js.Function2[/* arg0 */ js.UndefOr[Any], /* arg1 */ js.UndefOr[Any], Double]], 
          StatsFactoryContext
        ], 
        Any, 
        UnsetAdditionalOptions
      ]
    ]
  ): ReadonlyextractHookMapSyn = {
    val __obj = js.Dynamic.literal(extract = extract.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterResults = filterResults.asInstanceOf[js.Any], filterSorted = filterSorted.asInstanceOf[js.Any], getItemFactory = getItemFactory.asInstanceOf[js.Any], getItemName = getItemName.asInstanceOf[js.Any], groupResults = groupResults.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortResults = sortResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyextractHookMapSyn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyextractHookMapSyn] (val x: Self) extends AnyVal {
    
    inline def setExtract(
      value: HookMap[
          SyncBailHook[js.Tuple3[js.Object, Any, StatsFactoryContext], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setFilter(
      value: HookMap[
          SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterResults(
      value: HookMap[
          SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "filterResults", value.asInstanceOf[js.Any])
    
    inline def setFilterSorted(
      value: HookMap[
          SyncBailHook[js.Tuple4[Any, StatsFactoryContext, Double, Double], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "filterSorted", value.asInstanceOf[js.Any])
    
    inline def setGetItemFactory(value: HookMap[SyncBailHook[js.Tuple2[Any, StatsFactoryContext], Any, UnsetAdditionalOptions]]): Self = StObject.set(x, "getItemFactory", value.asInstanceOf[js.Any])
    
    inline def setGetItemName(value: HookMap[SyncBailHook[js.Tuple2[Any, StatsFactoryContext], Any, UnsetAdditionalOptions]]): Self = StObject.set(x, "getItemName", value.asInstanceOf[js.Any])
    
    inline def setGroupResults(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Array[GroupConfig], StatsFactoryContext], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "groupResults", value.asInstanceOf[js.Any])
    
    inline def setMerge(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Array[Any], StatsFactoryContext], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setResult(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Array[Any], StatsFactoryContext], Any, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSort(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[
              js.Array[js.Function2[/* arg0 */ js.UndefOr[Any], /* arg1 */ js.UndefOr[Any], Double]], 
              StatsFactoryContext
            ], 
            Any, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortResults(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[
              js.Array[js.Function2[/* arg0 */ js.UndefOr[Any], /* arg1 */ js.UndefOr[Any], Double]], 
              StatsFactoryContext
            ], 
            Any, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "sortResults", value.asInstanceOf[js.Any])
  }
}
