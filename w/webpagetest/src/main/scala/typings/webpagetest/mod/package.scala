package typings.webpagetest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[R] = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* data */ js.UndefOr[R], 
    /* info */ js.Any, 
    scala.Unit
  ]
  
  type TestScript = js.Array[typings.webpagetest.mod.TestScriptCommand]
  
  type TestScriptCommand = java.lang.String | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String])])
}
