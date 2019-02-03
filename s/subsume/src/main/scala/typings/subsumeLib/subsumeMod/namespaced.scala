package typings
package subsumeLib.subsumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subsume", JSImport.Namespace)
@js.native
class namespaced () extends Subsume {
  def this(id: java.lang.String) = this()
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var postfix: java.lang.String = js.native
  /* CompleteClass */
  override var prefix: java.lang.String = js.native
  /* CompleteClass */
  override var regex: stdLib.RegExp = js.native
  /* CompleteClass */
  override def compose(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def parse(text: java.lang.String): subsumeLib.subsumeMod.SubsumeNs.ParseResult = js.native
}

/* static members */
@JSImport("subsume", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def parse(text: java.lang.String, id: java.lang.String): subsumeLib.subsumeMod.SubsumeNs.ParseResult = js.native
  def parseAll(text: java.lang.String): subsumeLib.subsumeMod.SubsumeNs.ParseResults = js.native
  def parseAll(text: java.lang.String, ids: js.Array[java.lang.String]): subsumeLib.subsumeMod.SubsumeNs.ParseResults = js.native
}

