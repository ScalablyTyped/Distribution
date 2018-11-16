package typings
package tinycopyLib.tinycopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinycopy", JSImport.Default)
@js.native
class default protected () extends TinyCopy {
  def this(trigger: stdLib.Element, target: java.lang.String) = this()
  def this(trigger: stdLib.Element, target: stdLib.Element) = this()
  def this(trigger: stdLib.Element, target: stdLib.NodeListOf[stdLib.Element]) = this()
}

@JSImport("tinycopy", JSImport.Default)
@js.native
object default extends js.Object {
  def exec(
    value: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[stdLib.Error], 
      /* data */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

