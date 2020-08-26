package typings.sybasePromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SybasePromised extends js.Object {
  def connect(): js.Promise[this.type] = js.native
  def disconnect(): Unit = js.native
  def query(sql: String): js.Promise[js.Array[_]] = js.native
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
  @scala.inline
  implicit class SybasePromisedOps[Self <: SybasePromised] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnect(value: () => js.Promise[SybasePromised]): Self = this.set("connect", js.Any.fromFunction0(value))
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setQuery(value: String => js.Promise[js.Array[_]]): Self = this.set("query", js.Any.fromFunction1(value))
  }
  
}

