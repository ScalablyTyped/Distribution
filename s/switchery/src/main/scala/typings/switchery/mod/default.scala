package typings.switchery.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Node
import typings.switchery.mod.Switchery.Options
import typings.switchery.mod.Switchery.SwitcheryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("switchery", JSImport.Default)
@js.native
class default protected () extends Switchery {
  def this(node: Node) = this()
  def this(node: Node, options: Options) = this()
}

@JSImport("switchery", JSImport.Default)
@js.native
object default extends TopLevel[SwitcheryStatic]

