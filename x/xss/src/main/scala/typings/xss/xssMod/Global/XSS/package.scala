package typings.xss.xssMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object XSS {
  type EscapeHandler = js.Function1[/* str */ String, String]
  type OnTagAttrHandler = js.Function4[
    /* tag */ String, 
    /* name */ String, 
    /* value */ String, 
    /* isWhiteAttr */ Boolean, 
    String | Unit
  ]
  type OnTagHandler = js.Function3[/* tag */ String, /* html */ String, /* options */ js.Object, String | Unit]
  type SafeAttrValueHandler = js.Function4[
    /* tag */ String, 
    /* name */ String, 
    /* value */ String, 
    /* cssFilter */ typings.xss.xssMod.Global.XSS.ICSSFilter, 
    String
  ]
}
