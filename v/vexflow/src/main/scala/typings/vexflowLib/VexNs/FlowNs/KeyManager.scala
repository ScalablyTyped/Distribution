package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeyManager")
@js.native
class KeyManager protected () extends js.Object {
  def this(key: java.lang.String) = this()
  def getAccidental(key: java.lang.String): vexflowLib.Anon_NoteAccidentalString = js.native
  def getKey(): java.lang.String = js.native
  def reset(): KeyManager = js.native
  def selectNote(note: java.lang.String): vexflowLib.Anon_NoteAccidental = js.native
  def setKey(key: java.lang.String): KeyManager = js.native
}

