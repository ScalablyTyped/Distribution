package typings
package w2uiLib.W2UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait W2Form
  extends W2Common
     with W2Object {
  var actions: js.Object = js.native
  var fields: js.Array[js.Object] = js.native
  var focus: scala.Double = js.native
  var formHTML: java.lang.String = js.native
  var formURL: java.lang.String = js.native
  var header: java.lang.String = js.native
  var isGenerated: scala.Boolean = js.native
  var last: js.Object = js.native
  var msgAJAXerror: java.lang.String = js.native
  var msgNotJSON: java.lang.String = js.native
  var msgRefresh: java.lang.String = js.native
  var msgSaving: java.lang.String = js.native
  var original: js.Object = js.native
  var page: scala.Double = js.native
  var postData: js.Object = js.native
  var recid: scala.Double = js.native
  var record: js.Object = js.native
  var routeData: java.lang.String = js.native
  var tabs: js.Object = js.native
  var toolbar: js.Object = js.native
  var url: java.lang.String = js.native
  def action(action: java.lang.String): scala.Unit = js.native
  def action(action: java.lang.String, event: js.Object): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def error(msg: java.lang.String): scala.Unit = js.native
  def generateHTML(): java.lang.String = js.native
  def get(): js.Object | scala.Double | scala.Unit = js.native
  def get(field: java.lang.String): js.Object | scala.Double | scala.Unit = js.native
  def get(field: java.lang.String, returnIndex: scala.Boolean): js.Object | scala.Double | scala.Unit = js.native
  def getChanges(): js.Object = js.native
  def goto(page: scala.Double): scala.Unit = js.native
  def lock(message: java.lang.String): scala.Unit = js.native
  def lock(message: java.lang.String, showSpinner: scala.Boolean): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def reload(callback: js.Function): scala.Unit = js.native
  def request(): scala.Unit = js.native
  def request(postData: js.Object): scala.Unit = js.native
  def request(postData: js.Object, callback: js.Function): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def save(postData: js.Object): scala.Unit = js.native
  def save(postData: js.Object, callback: js.Function): scala.Unit = js.native
  def set(field: java.lang.String, obj: js.Object): scala.Boolean = js.native
  def submit(): scala.Unit = js.native
  def submit(postData: js.Object): scala.Unit = js.native
  def submit(postData: js.Object, callback: js.Function): scala.Unit = js.native
  def unlock(): scala.Unit = js.native
  def validate(): js.Array[js.Object] = js.native
  def validate(showErrors: scala.Boolean): js.Array[js.Object] = js.native
}

