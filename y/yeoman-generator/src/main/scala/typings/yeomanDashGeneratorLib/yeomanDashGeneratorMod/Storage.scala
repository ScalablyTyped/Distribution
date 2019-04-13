package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-generator", "Storage")
@js.native
class Storage protected () extends js.Object {
  def this(name: java.lang.String, fs: MemFsEditor, configPath: java.lang.String) = this()
  def defaults(defaults: js.Object): js.Object = js.native
  def delete(key: java.lang.String): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def getAll(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def save(): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): js.Any = js.native
}

