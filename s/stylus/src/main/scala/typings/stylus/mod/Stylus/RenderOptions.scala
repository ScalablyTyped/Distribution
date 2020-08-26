package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderOptions extends js.Object {
  var Evaluator: js.UndefOr[Instantiable0[typings.stylus.mod.Stylus.Evaluator]] = js.native
  var filename: js.UndefOr[String] = js.native
  var functions: js.UndefOr[Dictionary[_]] = js.native
  var globals: js.UndefOr[Dictionary[_]] = js.native
  var imports: js.UndefOr[js.Array[String]] = js.native
  var paths: js.UndefOr[js.Array[String]] = js.native
}

object RenderOptions {
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  @scala.inline
  implicit class RenderOptionsOps[Self <: RenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvaluator(value: Instantiable0[Evaluator]): Self = this.set("Evaluator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluator: Self = this.set("Evaluator", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFunctions(value: Dictionary[_]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setGlobals(value: Dictionary[_]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setImportsVarargs(value: String*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[String]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
  }
  
}

