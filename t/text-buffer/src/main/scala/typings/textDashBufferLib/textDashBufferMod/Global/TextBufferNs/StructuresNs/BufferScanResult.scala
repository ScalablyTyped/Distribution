package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferScanResult extends js.Object {
  var buffer: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.TextBuffer
  var lineText: java.lang.String
  var `match`: stdLib.RegExpExecArray
  var matchText: java.lang.String
  var range: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.Range
  var stopped: scala.Boolean
  def replace(replacementText: java.lang.String): scala.Unit
  def stop(): scala.Unit
}

