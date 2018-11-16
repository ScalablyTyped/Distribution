package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

@JSGlobal("WebdriverIO.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait left
    extends webdriverioLib.WebdriverIONs.Button
  
  @js.native
  sealed trait middle
    extends webdriverioLib.WebdriverIONs.Button
  
  @js.native
  sealed trait right
    extends webdriverioLib.WebdriverIONs.Button
  
  /* 0 */ val left: left with scala.Double = js.native
  /* 1 */ val middle: middle with scala.Double = js.native
  /* 2 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webdriverioLib.WebdriverIONs.Button with scala.Double] = js.native
}

