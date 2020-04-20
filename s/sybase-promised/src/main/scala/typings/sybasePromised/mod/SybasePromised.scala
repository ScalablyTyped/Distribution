package typings.sybasePromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SybasePromised extends js.Object {
  def connect(): js.Promise[this.type]
  def disconnect(): Unit
  def query(sql: String): js.Promise[js.Array[_]]
}

object SybasePromised {
  @scala.inline
  def apply(
    connect: () => js.Promise[SybasePromised],
    disconnect: () => Unit,
    query: String => js.Promise[js.Array[_]]
  ): SybasePromised = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[SybasePromised]
  }
}

