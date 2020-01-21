package typings.sybasePromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sybase-promised", JSImport.Namespace)
@js.native
class ^ protected () extends SybasePromised {
  def this(options: ConnectionOptions) = this()
  /* CompleteClass */
  override def connect(): js.Promise[this.type] = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def query(sql: String): js.Promise[js.Array[_]] = js.native
}

