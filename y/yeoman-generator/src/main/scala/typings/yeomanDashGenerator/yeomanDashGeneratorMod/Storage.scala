package typings.yeomanDashGenerator.yeomanDashGeneratorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-generator", "Storage")
@js.native
class Storage protected () extends js.Object {
  def this(name: String, fs: MemFsEditor, configPath: String) = this()
  def defaults(defaults: js.Object): js.Object = js.native
  def delete(key: String): Unit = js.native
  def get(key: String): js.Any = js.native
  def getAll(): StringDictionary[js.Any] = js.native
  def save(): Unit = js.native
  def set(key: String, value: js.Any): js.Any = js.native
}

