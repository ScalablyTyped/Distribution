package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptionManager
  extends IFreezable
     with IChild[IOptionManager] {
  def get(key: java.lang.String, defaultValue: js.Object): js.Object = js.native
  def getAll(): js.Object = js.native
  def getName(): java.lang.String = js.native
  def getNative(key: java.lang.String): js.Object = js.native
  /* InferMemberOverrides */
  override def getParent(): js.Object | scala.Null = js.native
  def resolve(key: java.lang.String): js.Object = js.native
  def resolve(key: java.lang.String, name: java.lang.String): js.Object = js.native
  def setName(name: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setParent(): this.type = js.native
  //remove(types: string[][] | string[] | string, callback: (event: object | IEvent) => void, context?: object, priority?: number): this;
  /* InferMemberOverrides */
  override def setParent(parent: js.Object): this.type = js.native
}

