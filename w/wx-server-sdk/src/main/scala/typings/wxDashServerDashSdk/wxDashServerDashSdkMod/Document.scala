package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import typings.wxDashServerDashSdk.Anon_DataAny
import typings.wxDashServerDashSdk.Anon_Id
import typings.wxDashServerDashSdk.Anon_Stats
import typings.wxDashServerDashSdk.Anon_StatsAnon01Removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def get(): js.Promise[Anon_DataAny]
  def remove(): js.Promise[Anon_StatsAnon01Removed]
  def set(options: CommonOption[_]): js.Promise[Anon_Id]
  def update(options: CommonOption[_]): js.Promise[Anon_Stats]
}

object Document {
  @scala.inline
  def apply(
    get: () => js.Promise[Anon_DataAny],
    remove: () => js.Promise[Anon_StatsAnon01Removed],
    set: CommonOption[_] => js.Promise[Anon_Id],
    update: CommonOption[_] => js.Promise[Anon_Stats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Document]
  }
}

