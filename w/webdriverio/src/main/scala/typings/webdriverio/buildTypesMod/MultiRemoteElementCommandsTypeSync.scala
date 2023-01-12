package typings.webdriverio.buildTypesMod

import typings.std.Parameters
import typings.std.ReturnType
import typings.wdioTypes.mod.ThenArg
import typings.webdriverio.buildCommandsElementGetLocationMod.Location
import typings.webdriverio.buildCommandsElementGetSizeMod.Size
import typings.webdriverio.webdriverioStrings.height
import typings.webdriverio.webdriverioStrings.sync
import typings.webdriverio.webdriverioStrings.width
import typings.webdriverio.webdriverioStrings.x
import typings.webdriverio.webdriverioStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof std.Omit<webdriverio.webdriverio/build/types.ElementCommandsTypeSync, webdriverio.webdriverio/build/types.ElementCommandNames> ]: (args : std.Parameters<webdriverio.webdriverio/build/types.ElementCommandsTypeSync[K]>): std.Array<@wdio/types.@wdio/types.ThenArg<std.ReturnType<webdriverio.webdriverio/build/types.ElementCommandsTypeSync[K]>>>} & webdriverio.webdriverio/build/types.MultiRemoteElementCommandsSync */
trait MultiRemoteElementCommandsTypeSync extends StObject {
  
  @JSName("$")
  def $(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
          ]
        ]
      ]
    ]
  ): MultiRemoteElement[sync]
  @JSName("$")
  var $_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
          ]
        ]
      ]
    ], 
    MultiRemoteElement[sync]
  ]
  
  @JSName("$$")
  def DollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[MultiRemoteElement[sync]]
  @JSName("$$")
  var DollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[MultiRemoteElement[sync]]
  ]
  
  def addValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("addValue")
  var addValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def clearValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("clearValue")
  var clearValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def click(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("click")
  var click_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("custom$")
  def custom$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
          ]
        ]
      ]
    ]
  ): MultiRemoteElement[sync]
  @JSName("custom$")
  var custom$_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
          ]
        ]
      ]
    ], 
    MultiRemoteElement[sync]
  ]
  
  @JSName("custom$$")
  def customDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[MultiRemoteElement[sync]]
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[MultiRemoteElement[sync]]
  ]
  
  def doubleClick(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("doubleClick")
  var doubleClick_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def dragAndDrop(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("dragAndDrop")
  var dragAndDrop_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getAttribute")
  var getAttribute_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getCSSProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getCSSProperty")
  var getCSSProperty_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getComputedLabel(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getComputedLabel")
  var getComputedLabel_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getComputedRole(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getComputedRole")
  var getComputedRole_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getHTML(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getHTML")
  var getHTML_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getLocation(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ x | y, Double]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ js.UndefOr[x | y], Location | Double])
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ x | y, Double]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ js.UndefOr[x | y], Location | Double])
      ]
    ]
  ]
  @JSName("getLocation")
  var getLocation_Original: js.Function1[
    /* args */ Parameters[
      (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ x | y, Double]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ js.UndefOr[x | y], Location | Double])
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ x | y, Double]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ js.UndefOr[x | y], Location | Double])
        ]
      ]
    ]
  ]
  
  def getProperty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getProperty")
  var getProperty_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getSize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
        /* this */ typings.std.Element, 
        /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ x | y | width | height, 
        Double
      ]) & (js.ThisFunction1[
        /* this */ typings.std.Element, 
        /* prop */ js.UndefOr[x | y | width | height], 
        Size | Double
      ])
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
          /* this */ typings.std.Element, 
          /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ x | y | width | height, 
          Double
        ]) & (js.ThisFunction1[
          /* this */ typings.std.Element, 
          /* prop */ js.UndefOr[x | y | width | height], 
          Size | Double
        ])
      ]
    ]
  ]
  @JSName("getSize")
  var getSize_Original: js.Function1[
    /* args */ Parameters[
      (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
        /* this */ typings.std.Element, 
        /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ x | y | width | height, 
        Double
      ]) & (js.ThisFunction1[
        /* this */ typings.std.Element, 
        /* prop */ js.UndefOr[x | y | width | height], 
        Size | Double
      ])
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ x | y | width | height, 
            Double
          ]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* prop */ js.UndefOr[x | y | width | height], 
            Size | Double
          ])
        ]
      ]
    ]
  ]
  
  def getTagName(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getTagName")
  var getTagName_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getText")
  var getText_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def getValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("getValue")
  var getValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isClickable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isClickable")
  var isClickable_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isDisplayedInViewport(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isDisplayedInViewport")
  var isDisplayedInViewport_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("isDisplayed")
  var isDisplayed_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isEnabled")
  var isEnabled_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isEqual(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isEqual")
  var isEqual_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isExisting(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isExisting")
  var isExisting_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isFocused(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isFocused")
  var isFocused_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def isSelected(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("isSelected")
  var isSelected_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def moveTo(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("moveTo")
  var moveTo_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def nextElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("nextElement")
  var nextElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def parentElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("parentElement")
  var parentElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def previousElement(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("previousElement")
  var previousElement_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("react$")
  def react$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
          ]
        ]
      ]
    ]
  ): MultiRemoteElement[sync]
  @JSName("react$")
  var react$_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
          ]
        ]
      ]
    ], 
    MultiRemoteElement[sync]
  ]
  
  @JSName("react$$")
  def reactDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<BrowserCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[MultiRemoteElement[sync]]
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[MultiRemoteElement[sync]]
  ]
  
  def saveScreenshot(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def scrollIntoView(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("scrollIntoView")
  var scrollIntoView_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def selectByAttribute(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("selectByAttribute")
  var selectByAttribute_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def selectByIndex(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("selectByIndex")
  var selectByIndex_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def selectByVisibleText(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("selectByVisibleText")
  var selectByVisibleText_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def setValue(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("setValue")
  var setValue_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("shadow$")
  def shadow$(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("shadow$")
  var shadow$_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  @JSName("shadow$$")
  def shadowDollarDollar(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("shadow$$")
  var shadowDollarDollar_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def touchAction(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("touchAction")
  var touchAction_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def waitForClickable(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("waitForClickable")
  var waitForClickable_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def waitForDisplayed(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("waitForDisplayed")
  var waitForDisplayed_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def waitForEnabled(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("waitForEnabled")
  var waitForEnabled_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def waitForExist(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("waitForExist")
  var waitForExist_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
  
  def waitUntil(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ElementCommandsTypeSync[K]> is not an array type */ args: Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
          ]
        ]
      ]
    ]
  ): js.Array[
    ThenArg[
      ReturnType[
        js.Function1[
          /* args */ Parameters[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
          ], 
          ThenArg[
            ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
            ]
          ]
        ]
      ]
    ]
  ]
  @JSName("waitUntil")
  var waitUntil_Original: js.Function1[
    /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
          ]
        ]
      ]
    ], 
    js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ]
}
object MultiRemoteElementCommandsTypeSync {
  
  inline def apply(
    $: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
          ]
        ]
      ]
    ] => MultiRemoteElement[sync],
    DollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
          ]
        ]
      ]
    ] => js.Array[MultiRemoteElement[sync]],
    addValue: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    clearValue: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    click: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    custom$: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
          ]
        ]
      ]
    ] => MultiRemoteElement[sync],
    customDollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
          ]
        ]
      ]
    ] => js.Array[MultiRemoteElement[sync]],
    doubleClick: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    dragAndDrop: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getAttribute: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getCSSProperty: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getComputedLabel: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getComputedRole: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getHTML: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getLocation: /* args */ Parameters[
      (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ x | y, Double]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ js.UndefOr[x | y], Location | Double])
    ] => js.Array[
      ThenArg[
        ReturnType[
          (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ x | y, Double]) & (js.ThisFunction1[/* this */ typings.std.Element, /* prop */ js.UndefOr[x | y], Location | Double])
        ]
      ]
    ],
    getProperty: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getSize: /* args */ Parameters[
      (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
        /* this */ typings.std.Element, 
        /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ x | y | width | height, 
        Double
      ]) & (js.ThisFunction1[
        /* this */ typings.std.Element, 
        /* prop */ js.UndefOr[x | y | width | height], 
        Size | Double
      ])
    ] => js.Array[
      ThenArg[
        ReturnType[
          (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ x | y | width | height, 
            Double
          ]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* prop */ js.UndefOr[x | y | width | height], 
            Size | Double
          ])
        ]
      ]
    ],
    getTagName: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getText: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    getValue: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isClickable: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isDisplayed: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isDisplayedInViewport: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isEnabled: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isEqual: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isExisting: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isFocused: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    isSelected: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    moveTo: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    nextElement: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    parentElement: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    previousElement: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    react$: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
          ]
        ]
      ]
    ] => MultiRemoteElement[sync],
    reactDollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
          ]
        ]
      ]
    ] => js.Array[MultiRemoteElement[sync]],
    saveScreenshot: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    scrollIntoView: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    selectByAttribute: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    selectByIndex: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    selectByVisibleText: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    setValue: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    shadow$: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    shadowDollarDollar: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    touchAction: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    waitForClickable: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    waitForDisplayed: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    waitForEnabled: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    waitForExist: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
              ]
            ]
          ]
        ]
      ]
    ],
    waitUntil: /* args */ Parameters[
      js.Function1[
        /* args */ Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
        ], 
        ThenArg[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
          ]
        ]
      ]
    ] => js.Array[
      ThenArg[
        ReturnType[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
              ]
            ]
          ]
        ]
      ]
    ]
  ): MultiRemoteElementCommandsTypeSync = {
    val __obj = js.Dynamic.literal($ = js.Any.fromFunction1($), addValue = js.Any.fromFunction1(addValue), clearValue = js.Any.fromFunction1(clearValue), click = js.Any.fromFunction1(click), custom$ = js.Any.fromFunction1(custom$), doubleClick = js.Any.fromFunction1(doubleClick), dragAndDrop = js.Any.fromFunction1(dragAndDrop), getAttribute = js.Any.fromFunction1(getAttribute), getCSSProperty = js.Any.fromFunction1(getCSSProperty), getComputedLabel = js.Any.fromFunction1(getComputedLabel), getComputedRole = js.Any.fromFunction1(getComputedRole), getHTML = js.Any.fromFunction1(getHTML), getLocation = js.Any.fromFunction1(getLocation), getProperty = js.Any.fromFunction1(getProperty), getSize = js.Any.fromFunction1(getSize), getTagName = js.Any.fromFunction1(getTagName), getText = js.Any.fromFunction1(getText), getValue = js.Any.fromFunction1(getValue), isClickable = js.Any.fromFunction1(isClickable), isDisplayed = js.Any.fromFunction1(isDisplayed), isDisplayedInViewport = js.Any.fromFunction1(isDisplayedInViewport), isEnabled = js.Any.fromFunction1(isEnabled), isEqual = js.Any.fromFunction1(isEqual), isExisting = js.Any.fromFunction1(isExisting), isFocused = js.Any.fromFunction1(isFocused), isSelected = js.Any.fromFunction1(isSelected), moveTo = js.Any.fromFunction1(moveTo), nextElement = js.Any.fromFunction1(nextElement), parentElement = js.Any.fromFunction1(parentElement), previousElement = js.Any.fromFunction1(previousElement), react$ = js.Any.fromFunction1(react$), saveScreenshot = js.Any.fromFunction1(saveScreenshot), scrollIntoView = js.Any.fromFunction1(scrollIntoView), selectByAttribute = js.Any.fromFunction1(selectByAttribute), selectByIndex = js.Any.fromFunction1(selectByIndex), selectByVisibleText = js.Any.fromFunction1(selectByVisibleText), setValue = js.Any.fromFunction1(setValue), shadow$ = js.Any.fromFunction1(shadow$), touchAction = js.Any.fromFunction1(touchAction), waitForClickable = js.Any.fromFunction1(waitForClickable), waitForDisplayed = js.Any.fromFunction1(waitForDisplayed), waitForEnabled = js.Any.fromFunction1(waitForEnabled), waitForExist = js.Any.fromFunction1(waitForExist), waitUntil = js.Any.fromFunction1(waitUntil))
    __obj.updateDynamic("$$")(js.Any.fromFunction1(DollarDollar))
    __obj.updateDynamic("custom$$")(js.Any.fromFunction1(customDollarDollar))
    __obj.updateDynamic("react$$")(js.Any.fromFunction1(reactDollarDollar))
    __obj.updateDynamic("shadow$$")(js.Any.fromFunction1(shadowDollarDollar))
    __obj.asInstanceOf[MultiRemoteElementCommandsTypeSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiRemoteElementCommandsTypeSync] (val x: Self) extends AnyVal {
    
    inline def set$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof $ */ js.Any
              ]
            ]
          ]
        ] => MultiRemoteElement[sync]
    ): Self = StObject.set(x, "$", js.Any.fromFunction1(value))
    
    inline def setAddValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof addValue */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "addValue", js.Any.fromFunction1(value))
    
    inline def setClearValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof clearValue */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "clearValue", js.Any.fromFunction1(value))
    
    inline def setClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof click */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setCustom$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$ */ js.Any
              ]
            ]
          ]
        ] => MultiRemoteElement[sync]
    ): Self = StObject.set(x, "custom$", js.Any.fromFunction1(value))
    
    inline def setCustomDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof custom$$ */ js.Any
              ]
            ]
          ]
        ] => js.Array[MultiRemoteElement[sync]]
    ): Self = StObject.set(x, "custom$$", js.Any.fromFunction1(value))
    
    inline def setDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof $$ */ js.Any
              ]
            ]
          ]
        ] => js.Array[MultiRemoteElement[sync]]
    ): Self = StObject.set(x, "$$", js.Any.fromFunction1(value))
    
    inline def setDoubleClick(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof doubleClick */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
    
    inline def setDragAndDrop(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof dragAndDrop */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "dragAndDrop", js.Any.fromFunction1(value))
    
    inline def setGetAttribute(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getAttribute */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetCSSProperty(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getCSSProperty */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getCSSProperty", js.Any.fromFunction1(value))
    
    inline def setGetComputedLabel(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedLabel */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getComputedLabel", js.Any.fromFunction1(value))
    
    inline def setGetComputedRole(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getComputedRole */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getComputedRole", js.Any.fromFunction1(value))
    
    inline def setGetHTML(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getHTML */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getHTML", js.Any.fromFunction1(value))
    
    inline def setGetLocation(
      value: /* args */ Parameters[
          (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* prop */ typings.webdriverio.webdriverioStrings.x | y, 
            Double
          ]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* prop */ js.UndefOr[typings.webdriverio.webdriverioStrings.x | y], 
            Location | Double
          ])
        ] => js.Array[
          ThenArg[
            ReturnType[
              (js.ThisFunction0[/* this */ typings.std.Element, Location]) & (js.ThisFunction1[
                /* this */ typings.std.Element, 
                /* prop */ typings.webdriverio.webdriverioStrings.x | y, 
                Double
              ]) & (js.ThisFunction1[
                /* this */ typings.std.Element, 
                /* prop */ js.UndefOr[typings.webdriverio.webdriverioStrings.x | y], 
                Location | Double
              ])
            ]
          ]
        ]
    ): Self = StObject.set(x, "getLocation", js.Any.fromFunction1(value))
    
    inline def setGetProperty(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getProperty */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setGetSize(
      value: /* args */ Parameters[
          (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ typings.webdriverio.webdriverioStrings.x | y | width | height, 
            Double
          ]) & (js.ThisFunction1[
            /* this */ typings.std.Element, 
            /* prop */ js.UndefOr[typings.webdriverio.webdriverioStrings.x | y | width | height], 
            Size | Double
          ])
        ] => js.Array[
          ThenArg[
            ReturnType[
              (js.ThisFunction0[/* this */ typings.std.Element, Size]) & (js.ThisFunction1[
                /* this */ typings.std.Element, 
                /* keyof @wdio/protocols.@wdio/protocols/build/types.RectReturn */ /* prop */ typings.webdriverio.webdriverioStrings.x | y | width | height, 
                Double
              ]) & (js.ThisFunction1[
                /* this */ typings.std.Element, 
                /* prop */ js.UndefOr[typings.webdriverio.webdriverioStrings.x | y | width | height], 
                Size | Double
              ])
            ]
          ]
        ]
    ): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetTagName(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getTagName */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getTagName", js.Any.fromFunction1(value))
    
    inline def setGetText(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getText */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
    
    inline def setGetValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof getValue */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setIsClickable(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isClickable */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isClickable", js.Any.fromFunction1(value))
    
    inline def setIsDisplayed(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayed */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction1(value))
    
    inline def setIsDisplayedInViewport(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isDisplayedInViewport */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isDisplayedInViewport", js.Any.fromFunction1(value))
    
    inline def setIsEnabled(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isEnabled */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
    
    inline def setIsEqual(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isEqual */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setIsExisting(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isExisting */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isExisting", js.Any.fromFunction1(value))
    
    inline def setIsFocused(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isFocused */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isFocused", js.Any.fromFunction1(value))
    
    inline def setIsSelected(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof isSelected */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setMoveTo(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof moveTo */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
    
    inline def setNextElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof nextElement */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "nextElement", js.Any.fromFunction1(value))
    
    inline def setParentElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof parentElement */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "parentElement", js.Any.fromFunction1(value))
    
    inline def setPreviousElement(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof previousElement */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "previousElement", js.Any.fromFunction1(value))
    
    inline def setReact$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof react$ */ js.Any
              ]
            ]
          ]
        ] => MultiRemoteElement[sync]
    ): Self = StObject.set(x, "react$", js.Any.fromFunction1(value))
    
    inline def setReactDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof react$$ */ js.Any
              ]
            ]
          ]
        ] => js.Array[MultiRemoteElement[sync]]
    ): Self = StObject.set(x, "react$$", js.Any.fromFunction1(value))
    
    inline def setSaveScreenshot(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof saveScreenshot */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "saveScreenshot", js.Any.fromFunction1(value))
    
    inline def setScrollIntoView(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof scrollIntoView */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction1(value))
    
    inline def setSelectByAttribute(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByAttribute */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectByAttribute", js.Any.fromFunction1(value))
    
    inline def setSelectByIndex(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByIndex */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectByIndex", js.Any.fromFunction1(value))
    
    inline def setSelectByVisibleText(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof selectByVisibleText */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "selectByVisibleText", js.Any.fromFunction1(value))
    
    inline def setSetValue(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof setValue */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setShadow$(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$ */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "shadow$", js.Any.fromFunction1(value))
    
    inline def setShadowDollarDollar(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof shadow$$ */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "shadow$$", js.Any.fromFunction1(value))
    
    inline def setTouchAction(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof touchAction */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "touchAction", js.Any.fromFunction1(value))
    
    inline def setWaitForClickable(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForClickable */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForClickable", js.Any.fromFunction1(value))
    
    inline def setWaitForDisplayed(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForDisplayed */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForDisplayed", js.Any.fromFunction1(value))
    
    inline def setWaitForEnabled(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForEnabled */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForEnabled", js.Any.fromFunction1(value))
    
    inline def setWaitForExist(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof waitForExist */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitForExist", js.Any.fromFunction1(value))
    
    inline def setWaitUntil(
      value: /* args */ Parameters[
          js.Function1[
            /* args */ Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
            ], 
            ThenArg[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
              ]
            ]
          ]
        ] => js.Array[
          ThenArg[
            ReturnType[
              js.Function1[
                /* args */ Parameters[
                  /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
                ], 
                ThenArg[
                  ReturnType[
                    /* import warning: importer.ImportType#apply Failed type conversion: typeof waitUntil */ js.Any
                  ]
                ]
              ]
            ]
          ]
        ]
    ): Self = StObject.set(x, "waitUntil", js.Any.fromFunction1(value))
  }
}
