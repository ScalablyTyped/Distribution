package typings.xss.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object XSS {
  
  type EscapeHandler = js.Function1[/* str */ java.lang.String, java.lang.String]
  
  type OnTagAttrHandler = js.Function4[
    /* tag */ java.lang.String, 
    /* name */ java.lang.String, 
    /* value */ java.lang.String, 
    /* isWhiteAttr */ scala.Boolean, 
    java.lang.String | scala.Unit
  ]
  
  type OnTagHandler = js.Function3[
    /* tag */ java.lang.String, 
    /* html */ java.lang.String, 
    /* options */ js.Object, 
    java.lang.String | scala.Unit
  ]
  
  type SafeAttrValueHandler = js.Function4[
    /* tag */ java.lang.String, 
    /* name */ java.lang.String, 
    /* value */ java.lang.String, 
    /* cssFilter */ typings.xss.mod.global.XSS.ICSSFilter, 
    java.lang.String
  ]
}
