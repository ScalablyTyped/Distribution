package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLoader extends js.Object {
  var data: DataStore = js.native
  var waitData: js.Promise[_] = js.native
  def add(obj: js.Any): java.lang.String | scala.Double = js.native
  def add(obj: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(soft: scala.Boolean): scala.Unit = js.native
  def count(): scala.Double = js.native
  def exists(id: java.lang.String): scala.Boolean = js.native
  def exists(id: scala.Double): scala.Boolean = js.native
  def filter(text: webixLib.WebixCallback | webixLib.WebixTemplate): scala.Unit = js.native
  def filter(text: webixLib.WebixCallback | webixLib.WebixTemplate, value: java.lang.String): scala.Unit = js.native
  def filter(
    text: webixLib.WebixCallback | webixLib.WebixTemplate,
    value: java.lang.String,
    preserve: scala.Boolean
  ): scala.Unit = js.native
  def filter(text: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def filter(text: java.lang.String, value: java.lang.String, preserve: scala.Boolean): scala.Unit = js.native
  def find(criterion: webixLib.WebixCallback): js.Any = js.native
  def find(criterion: webixLib.WebixCallback, first: scala.Boolean): js.Any = js.native
  def getFirstId(): java.lang.String | scala.Double = js.native
  def getIdByIndex(index: scala.Double): java.lang.String | scala.Double = js.native
  def getIndexById(id: java.lang.String): scala.Double = js.native
  def getIndexById(id: scala.Double): scala.Double = js.native
  def getItem(id: java.lang.String): js.Any = js.native
  def getItem(id: scala.Double): js.Any = js.native
  def getLastId(): java.lang.String | scala.Double = js.native
  def getNextId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getNextId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: java.lang.String, step: scala.Double): java.lang.String | scala.Double = js.native
  def getPrevId(id: scala.Double, step: scala.Double): java.lang.String | scala.Double = js.native
  def load(url: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String): js.Promise[_] = js.native
  def load(url: java.lang.String, `type`: java.lang.String, callback: webixLib.WebixCallback): js.Promise[_] = js.native
  def loadNext(
    count: scala.Double,
    start: scala.Double,
    callback: webixLib.WebixCallback,
    url: java.lang.String,
    now: scala.Boolean
  ): scala.Unit = js.native
  def parse(data: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(id: java.lang.String): scala.Unit = js.native
  def refresh(id: scala.Double): scala.Unit = js.native
  def remove(id: java.lang.String): scala.Unit = js.native
  def remove(id: scala.Double): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
  def sort(by: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String): scala.Unit = js.native
  def sort(by: java.lang.String, dir: java.lang.String, as: java.lang.String): scala.Unit = js.native
  def sync(source: js.Any, filter: webixLib.WebixCallback, silent: scala.Boolean): scala.Unit = js.native
  def updateItem(id: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateItem(id: scala.Double, data: js.Any): scala.Unit = js.native
}

