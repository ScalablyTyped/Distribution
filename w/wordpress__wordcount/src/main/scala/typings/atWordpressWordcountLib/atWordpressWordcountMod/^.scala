package typings
package atWordpressWordcountLib.atWordpressWordcountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/wordcount", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def count(text: java.lang.String, `type`: CountType): scala.Double = js.native
  def count(text: java.lang.String, `type`: CountType, userSettings: stdLib.Partial[Settings]): scala.Double = js.native
}

