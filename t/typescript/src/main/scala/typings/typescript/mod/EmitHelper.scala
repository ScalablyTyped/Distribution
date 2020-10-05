package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitHelper extends js.Object {
  val dependencies: js.UndefOr[js.Array[EmitHelper]] = js.native
  val name: java.lang.String = js.native
  val priority: js.UndefOr[Double] = js.native
  val scoped: Boolean = js.native
  val text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String]) = js.native
}

object EmitHelper {
  @scala.inline
  def apply(
    name: java.lang.String,
    scoped: Boolean,
    text: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
  ): EmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitHelper]
  }
  @scala.inline
  implicit class EmitHelperOps[Self <: EmitHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextFunction1(value: /* node */ EmitHelperUniqueNameCallback => java.lang.String): Self = this.set("text", js.Any.fromFunction1(value))
    @scala.inline
    def setText(
      value: java.lang.String | (js.Function1[/* node */ EmitHelperUniqueNameCallback, java.lang.String])
    ): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setDependenciesVarargs(value: EmitHelper*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[EmitHelper]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

