package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithm extends IAlgorithm {
  def Digest(xml: java.lang.String): stdLib.PromiseLike[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.BufferSource): stdLib.PromiseLike[stdLib.Uint8Array] = js.native
  def Digest(xml: stdLib.Node): stdLib.PromiseLike[stdLib.Uint8Array] = js.native
}

