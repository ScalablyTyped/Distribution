package typings
package wonderDotJsLib.distEs2015RendererShaderSourceBuilderShaderSourceBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceDefine extends js.Object {
  var name: java.lang.String
  var value: js.Any
}

object SourceDefine {
  @scala.inline
  def apply(name: java.lang.String, value: js.Any): SourceDefine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SourceDefine]
  }
}

