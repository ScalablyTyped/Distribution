package typings.yeomanGenerator.anon

import typings.memFsEditor.mod.WriteJsonReplacer
import typings.memFsEditor.mod.WriteJsonSpace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallFilepathContentsReplacerSpace extends js.Object {
  
  def apply(filepath: String, contents: js.Any): String = js.native
  def apply(filepath: String, contents: js.Any, replacer: js.UndefOr[WriteJsonReplacer], space: WriteJsonSpace): String = js.native
  def apply(filepath: String, contents: js.Any, replacer: WriteJsonReplacer): String = js.native
}
