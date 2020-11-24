package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Tampermonkey {
  
  type NotificationOnClick = js.ThisFunction0[/* this */ typings.tampermonkey.Tampermonkey.NotificationThis, scala.Unit]
  
  /** `clicked` is `true` when `text` was set */
  type NotificationOnDone = js.ThisFunction1[
    /* this */ typings.tampermonkey.Tampermonkey.NotificationThis, 
    /* clicked */ scala.Boolean, 
    scala.Unit
  ]
  
  type RequestEventListener[TResponse] = js.ThisFunction1[/* this */ TResponse, /* response */ TResponse, scala.Unit]
  
  // Request
  type RequestHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ValueChangeListener = js.Function4[
    /* name */ java.lang.String, 
    /* oldValue */ js.Any, 
    /* newValue */ js.Any, 
    /* remote */ scala.Boolean, 
    scala.Unit
  ]
}
