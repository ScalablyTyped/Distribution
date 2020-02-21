package typings.yawnYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yawn-yaml", JSImport.Default)
@js.native
class default protected () extends YAWN {
  def this(content: String) = this()
  /* CompleteClass */
  override var json: js.Any = js.native
  /* CompleteClass */
  override var yaml: String = js.native
  /* CompleteClass */
  override def getRemark(path: String): String = js.native
  /* CompleteClass */
  override def setRemark(path: String, remark: String): Boolean = js.native
}

