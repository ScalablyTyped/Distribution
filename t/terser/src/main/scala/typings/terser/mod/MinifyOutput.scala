package typings.terser.mod

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinifyOutput extends js.Object {
  var ast: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AST_Node */ js.Any
  ] = js.native
  var code: js.UndefOr[String] = js.native
  var map: js.UndefOr[RawSourceMap | String] = js.native
}

object MinifyOutput {
  @scala.inline
  def apply(): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOutput]
  }
  @scala.inline
  implicit class MinifyOutputOps[Self <: MinifyOutput] (val x: Self) extends AnyVal {
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
    def setAst(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AST_Node */ js.Any
    ): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMap(value: RawSourceMap | String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

