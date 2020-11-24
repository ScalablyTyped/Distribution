package typings.yeomanGenerator.storageMod

import typings.memFsEditor.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Storage instances handle a json file where Generator authors can store data.
  *
  * The `Generator` class instantiate the storage named `config` by default.
  */
@JSImport("yeoman-generator/lib/util/storage", JSImport.Namespace)
@js.native
class ^ protected () extends Storage {
  /**
    * Initializes a new instance of the `Storage` class.
    *
    * @param name The name of the new storage (this is a namespace).
    * @param fs A mem-fs editor instance.
    * @param configPath The filepath used as a storage.
    * @param options Storage options.
    */
  def this(name: String, fs: Editor, configPath: String) = this()
  def this(name: String, fs: Editor, configPath: String, options: StorageOptions) = this()
}
