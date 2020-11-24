package typings.stylefire

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ChangedValues = js.Array[java.lang.String]
  
  type CustomTemplate = js.Function2[
    /* state */ typings.stylefire.typesMod.ResolvedState, 
    /* prebuilt */ java.lang.String, 
    java.lang.String
  ]
  
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ResolvedState = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  
  type State = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[java.lang.String | scala.Double | typings.stylefire.typesMod.CustomTemplate]
  ]
}
