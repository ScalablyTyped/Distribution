package typings.typedoc.mod.TypeScript

import typings.typescript.mod.InputFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createInputFiles")
@js.native
object createInputFiles extends js.Object {
  def apply(javascriptText: String, declarationText: String): InputFiles = js.native
  def apply(javascriptText: String, declarationText: String, javascriptMapPath: String): InputFiles = js.native
  def apply(
    javascriptText: String,
    declarationText: String,
    javascriptMapPath: String,
    javascriptMapText: String
  ): InputFiles = js.native
  def apply(
    javascriptText: String,
    declarationText: String,
    javascriptMapPath: String,
    javascriptMapText: String,
    declarationMapPath: String
  ): InputFiles = js.native
  def apply(
    javascriptText: String,
    declarationText: String,
    javascriptMapPath: String,
    javascriptMapText: String,
    declarationMapPath: String,
    declarationMapText: String
  ): InputFiles = js.native
  def apply(
    readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
    javascriptPath: String,
    javascriptMapPath: js.UndefOr[String],
    declarationPath: String
  ): InputFiles = js.native
  def apply(
    readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
    javascriptPath: String,
    javascriptMapPath: js.UndefOr[String],
    declarationPath: String,
    declarationMapPath: String
  ): InputFiles = js.native
  def apply(
    readFileText: js.Function1[/* path */ String, js.UndefOr[String]],
    javascriptPath: String,
    javascriptMapPath: js.UndefOr[String],
    declarationPath: String,
    declarationMapPath: String,
    buildInfoPath: String
  ): InputFiles = js.native
}

