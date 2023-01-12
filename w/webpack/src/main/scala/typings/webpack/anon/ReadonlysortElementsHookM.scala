package typings.webpack.anon

import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.PrintedElement
import typings.webpack.mod.StatsPrinterContext
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  sortElements :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<string>, webpack.webpack.StatsPrinterContext], true, tapable.tapable.UnsetAdditionalOptions>>,   printElements :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<webpack.webpack.PrintedElement>, webpack.webpack.StatsPrinterContext], string, tapable.tapable.UnsetAdditionalOptions>>,   sortItems :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<any>, webpack.webpack.StatsPrinterContext], true, tapable.tapable.UnsetAdditionalOptions>>,   getItemName :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[any, webpack.webpack.StatsPrinterContext], string, tapable.tapable.UnsetAdditionalOptions>>,   printItems :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[std.Array<string>, webpack.webpack.StatsPrinterContext], string, tapable.tapable.UnsetAdditionalOptions>>,   print :tapable.tapable.HookMap<tapable.tapable.SyncBailHook<[{}, webpack.webpack.StatsPrinterContext], string, tapable.tapable.UnsetAdditionalOptions>>,   result :tapable.tapable.HookMap<tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.StatsPrinterContext], tapable.tapable.UnsetAdditionalOptions>>}> */
trait ReadonlysortElementsHookM extends StObject {
  
  val getItemName: HookMap[
    SyncBailHook[js.Tuple2[Any, StatsPrinterContext], String, UnsetAdditionalOptions]
  ]
  
  val print: HookMap[
    SyncBailHook[js.Tuple2[js.Object, StatsPrinterContext], String, UnsetAdditionalOptions]
  ]
  
  val printElements: HookMap[
    SyncBailHook[
      js.Tuple2[js.Array[PrintedElement], StatsPrinterContext], 
      String, 
      UnsetAdditionalOptions
    ]
  ]
  
  val printItems: HookMap[
    SyncBailHook[js.Tuple2[js.Array[String], StatsPrinterContext], String, UnsetAdditionalOptions]
  ]
  
  val result: HookMap[
    SyncWaterfallHook[js.Tuple2[String, StatsPrinterContext], UnsetAdditionalOptions]
  ]
  
  val sortElements: HookMap[
    SyncBailHook[js.Tuple2[js.Array[String], StatsPrinterContext], `true`, UnsetAdditionalOptions]
  ]
  
  val sortItems: HookMap[
    SyncBailHook[js.Tuple2[js.Array[Any], StatsPrinterContext], `true`, UnsetAdditionalOptions]
  ]
}
object ReadonlysortElementsHookM {
  
  inline def apply(
    getItemName: HookMap[
      SyncBailHook[js.Tuple2[Any, StatsPrinterContext], String, UnsetAdditionalOptions]
    ],
    print: HookMap[
      SyncBailHook[js.Tuple2[js.Object, StatsPrinterContext], String, UnsetAdditionalOptions]
    ],
    printElements: HookMap[
      SyncBailHook[
        js.Tuple2[js.Array[PrintedElement], StatsPrinterContext], 
        String, 
        UnsetAdditionalOptions
      ]
    ],
    printItems: HookMap[
      SyncBailHook[js.Tuple2[js.Array[String], StatsPrinterContext], String, UnsetAdditionalOptions]
    ],
    result: HookMap[
      SyncWaterfallHook[js.Tuple2[String, StatsPrinterContext], UnsetAdditionalOptions]
    ],
    sortElements: HookMap[
      SyncBailHook[js.Tuple2[js.Array[String], StatsPrinterContext], `true`, UnsetAdditionalOptions]
    ],
    sortItems: HookMap[
      SyncBailHook[js.Tuple2[js.Array[Any], StatsPrinterContext], `true`, UnsetAdditionalOptions]
    ]
  ): ReadonlysortElementsHookM = {
    val __obj = js.Dynamic.literal(getItemName = getItemName.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], printElements = printElements.asInstanceOf[js.Any], printItems = printItems.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], sortElements = sortElements.asInstanceOf[js.Any], sortItems = sortItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlysortElementsHookM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlysortElementsHookM] (val x: Self) extends AnyVal {
    
    inline def setGetItemName(
      value: HookMap[
          SyncBailHook[js.Tuple2[Any, StatsPrinterContext], String, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "getItemName", value.asInstanceOf[js.Any])
    
    inline def setPrint(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Object, StatsPrinterContext], String, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def setPrintElements(
      value: HookMap[
          SyncBailHook[
            js.Tuple2[js.Array[PrintedElement], StatsPrinterContext], 
            String, 
            UnsetAdditionalOptions
          ]
        ]
    ): Self = StObject.set(x, "printElements", value.asInstanceOf[js.Any])
    
    inline def setPrintItems(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Array[String], StatsPrinterContext], String, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "printItems", value.asInstanceOf[js.Any])
    
    inline def setResult(
      value: HookMap[
          SyncWaterfallHook[js.Tuple2[String, StatsPrinterContext], UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setSortElements(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Array[String], StatsPrinterContext], `true`, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "sortElements", value.asInstanceOf[js.Any])
    
    inline def setSortItems(
      value: HookMap[
          SyncBailHook[js.Tuple2[js.Array[Any], StatsPrinterContext], `true`, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "sortItems", value.asInstanceOf[js.Any])
  }
}
