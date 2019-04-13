package typings
package xmldsigjsLib.xmldsigjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithm extends IAlgorithm {
  def Digest(xml: java.lang.String): js.Thenable[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.BufferSource): js.Thenable[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.Node): js.Thenable[stdLib.Uint8Array] = js.native
}

