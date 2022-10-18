package typings.webdriverio.buildTypesMod

import typings.webdriverio.buildUtilsInterceptionTypesMod.Matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @wdio/types.@wdio/types.FunctionPropertyNames<webdriverio.webdriverio/build/utils/interception/devtools.default> ]: webdriverio.webdriverio/build/utils/interception/devtools.default[P]} */ trait Mock
  extends StObject
     with MockProperties
object Mock {
  
  inline def apply(calls: js.Array[Matches] | js.Promise[js.Array[Matches]]): Mock = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mock]
  }
}
