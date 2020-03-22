package typings.wxServerSdk.mod

import typings.wxServerSdk.AnonDataAny
import typings.wxServerSdk.AnonId
import typings.wxServerSdk.AnonStats
import typings.wxServerSdk.AnonStatsAnon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def get(): js.Promise[AnonDataAny]
  def remove(): js.Promise[AnonStatsAnon1]
  def set(options: CommonOption[_]): js.Promise[AnonId]
  def update(options: CommonOption[_]): js.Promise[AnonStats]
}

object Document {
  @scala.inline
  def apply(
    get: () => js.Promise[AnonDataAny],
    remove: () => js.Promise[AnonStatsAnon1],
    set: CommonOption[_] => js.Promise[AnonId],
    update: CommonOption[_] => js.Promise[AnonStats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Document]
  }
}

