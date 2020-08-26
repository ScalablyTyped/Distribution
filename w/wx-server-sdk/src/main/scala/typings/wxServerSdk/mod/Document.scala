package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.DataAny
import typings.wxServerSdk.anon.Id
import typings.wxServerSdk.anon.Stats
import typings.wxServerSdk.anon.Stats1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def get(): js.Promise[DataAny] = js.native
  def remove(): js.Promise[Stats1] = js.native
  def set(options: CommonOption[_]): js.Promise[Id] = js.native
  def update(options: CommonOption[_]): js.Promise[Stats] = js.native
}

object Document {
  @scala.inline
  def apply(
    get: () => js.Promise[DataAny],
    remove: () => js.Promise[Stats1],
    set: CommonOption[_] => js.Promise[Id],
    update: CommonOption[_] => js.Promise[Stats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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
    def setGet(value: () => js.Promise[DataAny]): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => js.Promise[Stats1]): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: CommonOption[_] => js.Promise[Id]): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: CommonOption[_] => js.Promise[Stats]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

