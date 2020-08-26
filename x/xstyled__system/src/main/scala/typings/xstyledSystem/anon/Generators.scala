package typings.xstyledSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generators extends js.Object {
  var generators: js.UndefOr[js.Array[_]] = js.native
  var getStyle: js.Any = js.native
  var props: js.Array[String] = js.native
}

object Generators {
  @scala.inline
  def apply(getStyle: js.Any, props: js.Array[String]): Generators = {
    val __obj = js.Dynamic.literal(getStyle = getStyle.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generators]
  }
  @scala.inline
  implicit class GeneratorsOps[Self <: Generators] (val x: Self) extends AnyVal {
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
    def setGetStyle(value: js.Any): Self = this.set("getStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropsVarargs(value: String*): Self = this.set("props", js.Array(value :_*))
    @scala.inline
    def setProps(value: js.Array[String]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneratorsVarargs(value: js.Any*): Self = this.set("generators", js.Array(value :_*))
    @scala.inline
    def setGenerators(value: js.Array[_]): Self = this.set("generators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerators: Self = this.set("generators", js.undefined)
  }
  
}

