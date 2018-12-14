package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yeoman-generator", "Storage")
@js.native
class Storage protected ()
  extends yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.Storage {
  def this(name: java.lang.String, fs: yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs.MemFsEditor, configPath: java.lang.String) = this()
  /* CompleteClass */
  override def defaults(defaults: js.Object): js.Object = js.native
  /* CompleteClass */
  override def delete(key: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def get(key: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getAll(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def save(): scala.Unit = js.native
  /* CompleteClass */
  override def set(key: java.lang.String, value: js.Any): js.Any = js.native
}

