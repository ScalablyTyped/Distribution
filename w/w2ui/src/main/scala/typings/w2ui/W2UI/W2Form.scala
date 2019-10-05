package typings.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Form
  extends W2Common
     with _W2Object {
  var actions: js.Object = js.native
  var fields: js.Array[js.Object] = js.native
  var focus: Double = js.native
  var formHTML: String = js.native
  var formURL: String = js.native
  var header: String = js.native
  var isGenerated: Boolean = js.native
  var last: js.Object = js.native
  var msgAJAXerror: String = js.native
  var msgNotJSON: String = js.native
  var msgRefresh: String = js.native
  var msgSaving: String = js.native
  var original: js.Object = js.native
  var page: Double = js.native
  var postData: js.Object = js.native
  var recid: Double = js.native
  var record: js.Object = js.native
  var routeData: String = js.native
  var tabs: js.Object = js.native
  var toolbar: js.Object = js.native
  var url: String = js.native
  def action(action: String): Unit = js.native
  def action(action: String, event: js.Object): Unit = js.native
  def clear(): Unit = js.native
  def error(msg: String): Unit = js.native
  def generateHTML(): String = js.native
  def get(): js.Object | Double | Unit = js.native
  def get(field: String): js.Object | Double | Unit = js.native
  def get(field: String, returnIndex: Boolean): js.Object | Double | Unit = js.native
  def getChanges(): js.Object = js.native
  def goto(page: Double): Unit = js.native
  def lock(message: String): Unit = js.native
  def lock(message: String, showSpinner: Boolean): Unit = js.native
  def reload(): Unit = js.native
  def reload(callback: js.Function): Unit = js.native
  def request(): Unit = js.native
  def request(postData: js.Object): Unit = js.native
  def request(postData: js.Object, callback: js.Function): Unit = js.native
  def save(): Unit = js.native
  def save(postData: js.Object): Unit = js.native
  def save(postData: js.Object, callback: js.Function): Unit = js.native
  def set(field: String, obj: js.Object): Boolean = js.native
  def submit(): Unit = js.native
  def submit(postData: js.Object): Unit = js.native
  def submit(postData: js.Object, callback: js.Function): Unit = js.native
  def unlock(): Unit = js.native
  def validate(): js.Array[js.Object] = js.native
  def validate(showErrors: Boolean): js.Array[js.Object] = js.native
}

