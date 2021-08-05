package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<webdriverio.webdriverio/webdriverio-core.WebdriverIO.HookFunctions, 'onPrepare' | 'onWorkerStart' | 'onComplete' | 'before' | 'after' | 'beforeSession' | 'afterSession'> */
trait _Hooks extends StObject {
  
  var afterCommand: js.UndefOr[
    js.Function4[
      /* commandName */ String, 
      /* args */ js.Array[js.Any], 
      /* result */ js.Any, 
      /* error */ js.UndefOr[Error], 
      Unit
    ]
  ] = js.undefined
  
  var afterHook: js.UndefOr[
    js.Function5[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* result */ TestResult, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var afterSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  
  var afterTest: js.UndefOr[
    js.Function3[/* test */ Test, /* context */ js.Any, /* result */ TestResult, Unit]
  ] = js.undefined
  
  var beforeCommand: js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[js.Any], Unit]] = js.undefined
  
  var beforeHook: js.UndefOr[
    js.Function4[
      /* test */ js.Any, 
      /* context */ js.Any, 
      /* stepData */ js.UndefOr[js.Any], 
      /* world */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var beforeSuite: js.UndefOr[js.Function1[/* suite */ Suite, Unit]] = js.undefined
  
  var beforeTest: js.UndefOr[js.Function2[/* test */ Test, /* context */ js.Any, Unit]] = js.undefined
  
  var onReload: js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]] = js.undefined
}
object _Hooks {
  
  inline def apply(): _Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_Hooks]
  }
  
  extension [Self <: _Hooks](x: Self) {
    
    inline def setAfterCommand(
      value: (/* commandName */ String, /* args */ js.Array[js.Any], /* result */ js.Any, /* error */ js.UndefOr[Error]) => Unit
    ): Self = StObject.set(x, "afterCommand", js.Any.fromFunction4(value))
    
    inline def setAfterCommandUndefined: Self = StObject.set(x, "afterCommand", js.undefined)
    
    inline def setAfterHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* result */ TestResult, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "afterHook", js.Any.fromFunction5(value))
    
    inline def setAfterHookUndefined: Self = StObject.set(x, "afterHook", js.undefined)
    
    inline def setAfterSuite(value: /* suite */ Suite => Unit): Self = StObject.set(x, "afterSuite", js.Any.fromFunction1(value))
    
    inline def setAfterSuiteUndefined: Self = StObject.set(x, "afterSuite", js.undefined)
    
    inline def setAfterTest(value: (/* test */ Test, /* context */ js.Any, /* result */ TestResult) => Unit): Self = StObject.set(x, "afterTest", js.Any.fromFunction3(value))
    
    inline def setAfterTestUndefined: Self = StObject.set(x, "afterTest", js.undefined)
    
    inline def setBeforeCommand(value: (/* commandName */ String, /* args */ js.Array[js.Any]) => Unit): Self = StObject.set(x, "beforeCommand", js.Any.fromFunction2(value))
    
    inline def setBeforeCommandUndefined: Self = StObject.set(x, "beforeCommand", js.undefined)
    
    inline def setBeforeHook(
      value: (/* test */ js.Any, /* context */ js.Any, /* stepData */ js.UndefOr[js.Any], /* world */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "beforeHook", js.Any.fromFunction4(value))
    
    inline def setBeforeHookUndefined: Self = StObject.set(x, "beforeHook", js.undefined)
    
    inline def setBeforeSuite(value: /* suite */ Suite => Unit): Self = StObject.set(x, "beforeSuite", js.Any.fromFunction1(value))
    
    inline def setBeforeSuiteUndefined: Self = StObject.set(x, "beforeSuite", js.undefined)
    
    inline def setBeforeTest(value: (/* test */ Test, /* context */ js.Any) => Unit): Self = StObject.set(x, "beforeTest", js.Any.fromFunction2(value))
    
    inline def setBeforeTestUndefined: Self = StObject.set(x, "beforeTest", js.undefined)
    
    inline def setOnReload(value: (/* oldSessionId */ String, /* newSessionId */ String) => Unit): Self = StObject.set(x, "onReload", js.Any.fromFunction2(value))
    
    inline def setOnReloadUndefined: Self = StObject.set(x, "onReload", js.undefined)
  }
}
