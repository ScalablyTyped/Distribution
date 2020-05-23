package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createInputFiles")
@js.native
object createInputFiles extends js.Object {
  def apply(javascriptText: java.lang.String, declarationText: java.lang.String): InputFiles = js.native
  def apply(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String
  ): InputFiles = js.native
  def apply(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String
  ): InputFiles = js.native
  def apply(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def apply(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def apply(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[java.lang.String],
    declarationPath: java.lang.String
  ): InputFiles = js.native
  def apply(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[java.lang.String],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def apply(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[java.lang.String],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String,
    buildInfoPath: java.lang.String
  ): InputFiles = js.native
}

