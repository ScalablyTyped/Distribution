package typings.tress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TressJobCallback = js.ThisFunction1[/* this */ typings.tress.mod.TressJobData, /* repeated */ js.Any, scala.Unit]
  
  type TressJobData = org.scalablytyped.runtime.StringDictionary[js.Object]
  
  type TressWorkerDoneCallback = js.Function2[
    /* err */ js.UndefOr[scala.Boolean | typings.std.Error | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
