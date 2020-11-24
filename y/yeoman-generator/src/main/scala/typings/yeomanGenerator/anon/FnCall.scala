package typings.yeomanGenerator.anon

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.memFsEditor.mod.CopyOptions
import typings.memFsEditor.mod.FilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends js.Object {
  
  def apply(from: FilePaths, to: String): Unit = js.native
  def apply(
    from: FilePaths,
    to: String,
    options: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    templateOptions: Options
  ): Unit = js.native
  def apply(from: FilePaths, to: String, options: js.UndefOr[scala.Nothing], context: Data): Unit = js.native
  def apply(
    from: FilePaths,
    to: String,
    options: js.UndefOr[scala.Nothing],
    context: Data,
    templateOptions: Options
  ): Unit = js.native
  def apply(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
  def apply(
    from: FilePaths,
    to: String,
    options: CopyOptions,
    context: js.UndefOr[scala.Nothing],
    templateOptions: Options
  ): Unit = js.native
  def apply(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
  def apply(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
}
