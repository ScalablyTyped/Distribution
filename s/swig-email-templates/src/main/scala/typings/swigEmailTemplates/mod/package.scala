package typings.swigEmailTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SwigRender[T] = js.Function3[
    /* file */ java.lang.String, 
    /* context */ T, 
    /* callback */ js.Function3[/* err */ js.Any, /* html */ java.lang.String, /* text */ java.lang.String, js.Any], 
    js.Any
  ]
}
