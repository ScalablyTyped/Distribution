package typings.universalCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ChangeListenerCallback = js.Function3[
    /* name */ java.lang.String, 
    /* value */ java.lang.String | js.Object, 
    /* options */ typings.universalCookie.mod.CookieOpts, 
    scala.Unit
  ]
  
  type CookiesByName = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
