package typings.webidl2js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttributeProcessor = js.ThisFunction2[
    /* this */ typings.webidl2js.mod.ProcessorContext, 
    /* idl */ typings.webidl2.mod.AttributeMemberType, 
    /* implName */ java.lang.String, 
    typings.webidl2js.anon.Get
  ]
  type CodeProcessor = js.ThisFunction1[
    /* this */ typings.webidl2js.mod.ProcessorContext, 
    /* code */ java.lang.String, 
    java.lang.String
  ]
}
