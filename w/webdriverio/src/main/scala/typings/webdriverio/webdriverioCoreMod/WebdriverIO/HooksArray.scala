package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof std.Pick<webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions, 'onPrepare' | 'onWorkerStart' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> ]: webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions[K] | std.Array<webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions[K]>} */
trait HooksArray extends StObject {
  
  var after: js.UndefOr[
    (js.Function3[
      /* result */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* result */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.undefined
  
  var afterSession: js.UndefOr[
    (js.Function3[
      /* config */ Config, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.undefined
  
  var before: js.UndefOr[
    (js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.undefined
  
  var beforeSession: js.UndefOr[
    (js.Function3[
      /* config */ Config, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* specs */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function3[
          /* config */ Config, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.undefined
  
  var onComplete: js.UndefOr[
    (js.Function4[
      /* exitCode */ Double, 
      /* config */ Config, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
      /* results */ Results, 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function4[
          /* exitCode */ Double, 
          /* config */ Config, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* results */ Results, 
          Unit
        ]
      ]
    ])
  ] = js.undefined
  
  var onPrepare: js.UndefOr[
    (js.Function2[
      /* config */ Config, 
      /* capabilities */ js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
      ], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function2[
          /* config */ Config, 
          /* capabilities */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
          ], 
          Unit
        ]
      ]
    ])
  ] = js.undefined
  
  var onWorkerStart: js.UndefOr[
    (js.Function5[
      /* cid */ String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, 
      /* specs */ js.Array[String], 
      /* args */ Config, 
      /* execArgv */ js.Array[String], 
      Unit
    ]) | (js.Array[
      js.UndefOr[
        js.Function5[
          /* cid */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, 
          /* specs */ js.Array[String], 
          /* args */ Config, 
          /* execArgv */ js.Array[String], 
          Unit
        ]
      ]
    ])
  ] = js.undefined
}
object HooksArray {
  
  inline def apply(): HooksArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksArray]
  }
  
  extension [Self <: HooksArray](x: Self) {
    
    inline def setAfter(
      value: (js.Function3[
          /* result */ Double, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* result */ Double, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterFunction3(
      value: (/* result */ Double, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
    
    inline def setAfterSession(
      value: (js.Function3[
          /* config */ Config, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* config */ Config, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "afterSession", value.asInstanceOf[js.Any])
    
    inline def setAfterSessionFunction3(
      value: (/* config */ Config, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "afterSession", js.Any.fromFunction3(value))
    
    inline def setAfterSessionUndefined: Self = StObject.set(x, "afterSession", js.undefined)
    
    inline def setAfterSessionVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* config */ Config, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterSession", js.Array(value :_*))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* result */ Double, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "after", js.Array(value :_*))
    
    inline def setBefore(
      value: (js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function2[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    inline def setBeforeSession(
      value: (js.Function3[
          /* config */ Config, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function3[
              /* config */ Config, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
              /* specs */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "beforeSession", value.asInstanceOf[js.Any])
    
    inline def setBeforeSessionFunction3(
      value: (/* config */ Config, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* specs */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "beforeSession", js.Any.fromFunction3(value))
    
    inline def setBeforeSessionUndefined: Self = StObject.set(x, "beforeSession", js.undefined)
    
    inline def setBeforeSessionVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* config */ Config, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeSession", js.Array(value :_*))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBeforeVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
            /* specs */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "before", js.Array(value :_*))
    
    inline def setOnComplete(
      value: (js.Function4[
          /* exitCode */ Double, 
          /* config */ Config, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
          /* results */ Results, 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function4[
              /* exitCode */ Double, 
              /* config */ Config, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
              /* results */ Results, 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteFunction4(
      value: (/* exitCode */ Double, /* config */ Config, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, /* results */ Results) => Unit
    ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnCompleteVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* exitCode */ Double, 
            /* config */ Config, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* capabilities */ js.Any, 
            /* results */ Results, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "onComplete", js.Array(value :_*))
    
    inline def setOnPrepare(
      value: (js.Function2[
          /* config */ Config, 
          /* capabilities */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
          ], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function2[
              /* config */ Config, 
              /* capabilities */ js.Array[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
              ], 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "onPrepare", value.asInstanceOf[js.Any])
    
    inline def setOnPrepareFunction2(
      value: (/* config */ Config, /* capabilities */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
        ]) => Unit
    ): Self = StObject.set(x, "onPrepare", js.Any.fromFunction2(value))
    
    inline def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
    
    inline def setOnPrepareVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* config */ Config, 
            /* capabilities */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ js.Any
            ], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "onPrepare", js.Array(value :_*))
    
    inline def setOnWorkerStart(
      value: (js.Function5[
          /* cid */ String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, 
          /* specs */ js.Array[String], 
          /* args */ Config, 
          /* execArgv */ js.Array[String], 
          Unit
        ]) | (js.Array[
          js.UndefOr[
            js.Function5[
              /* cid */ String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, 
              /* specs */ js.Array[String], 
              /* args */ Config, 
              /* execArgv */ js.Array[String], 
              Unit
            ]
          ]
        ])
    ): Self = StObject.set(x, "onWorkerStart", value.asInstanceOf[js.Any])
    
    inline def setOnWorkerStartFunction5(
      value: (/* cid */ String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, /* specs */ js.Array[String], /* args */ Config, /* execArgv */ js.Array[String]) => Unit
    ): Self = StObject.set(x, "onWorkerStart", js.Any.fromFunction5(value))
    
    inline def setOnWorkerStartUndefined: Self = StObject.set(x, "onWorkerStart", js.undefined)
    
    inline def setOnWorkerStartVarargs(
      value: (js.UndefOr[
          js.Function5[
            /* cid */ String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.DesiredCapabilities */ /* caps */ js.Any, 
            /* specs */ js.Array[String], 
            /* args */ Config, 
            /* execArgv */ js.Array[String], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "onWorkerStart", js.Array(value :_*))
  }
}
