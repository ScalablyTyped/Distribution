package typings
package tarantoolDashDriverLib.tarantoolDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TarantoolConnection
  extends nodeLib.eventsMod.EventEmitter {
  def call(functionName: java.lang.String, args: js.Any*): js.Promise[_] = js.native
  /* Connection */
  def connect(): js.Promise[scala.Unit] = js.native
  def delete(spaceId: java.lang.String, indexId: java.lang.String, key: js.Array[_]): js.Promise[_] = js.native
  def delete(spaceId: java.lang.String, indexId: scala.Double, key: js.Array[_]): js.Promise[_] = js.native
  def delete(spaceId: scala.Double, indexId: java.lang.String, key: js.Array[_]): js.Promise[_] = js.native
  def delete(spaceId: scala.Double, indexId: scala.Double, key: js.Array[_]): js.Promise[_] = js.native
  def destroy(): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(reconnect: scala.Boolean): scala.Unit = js.native
  def eval(expression: java.lang.String, args: js.Any*): js.Promise[_] = js.native
  def flushQueue(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def insert(spaceId: java.lang.String, tuple: js.Array[_]): js.Promise[_] = js.native
  def insert(spaceId: scala.Double, tuple: js.Array[_]): js.Promise[_] = js.native
  def replace(spaceId: java.lang.String, tuple: js.Array[_]): js.Promise[_] = js.native
  def replace(spaceId: scala.Double, tuple: js.Array[_]): js.Promise[_] = js.native
  def select(
    spaceId: java.lang.String,
    indexId: java.lang.String,
    limit: scala.Double,
    offset: scala.Double,
    iterator: java.lang.String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  def select(
    spaceId: java.lang.String,
    indexId: scala.Double,
    limit: scala.Double,
    offset: scala.Double,
    iterator: java.lang.String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  def select(
    spaceId: scala.Double,
    indexId: java.lang.String,
    limit: scala.Double,
    offset: scala.Double,
    iterator: java.lang.String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  /* Commands */
  def select(
    spaceId: scala.Double,
    indexId: scala.Double,
    limit: scala.Double,
    offset: scala.Double,
    iterator: java.lang.String,
    key: js.Array[_]
  ): js.Promise[_] = js.native
  def update(spaceId: java.lang.String, indexId: java.lang.String, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def update(spaceId: java.lang.String, indexId: scala.Double, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def update(spaceId: scala.Double, indexId: java.lang.String, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def update(spaceId: scala.Double, indexId: scala.Double, key: js.Array[_], ops: js.Array[_]): js.Promise[_] = js.native
  def upsert(spaceId: java.lang.String, ops: js.Array[_], tuple: js.Array[_]): js.Promise[_] = js.native
  def upsert(spaceId: scala.Double, ops: js.Array[_], tuple: js.Array[_]): js.Promise[_] = js.native
}

