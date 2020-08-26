package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEffectiveTypeRootsHost extends js.Object {
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, Boolean]] = js.native
  var getCurrentDirectory: js.UndefOr[js.Function0[java.lang.String]] = js.native
}

object GetEffectiveTypeRootsHost {
  @scala.inline
  def apply(): GetEffectiveTypeRootsHost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectiveTypeRootsHost]
  }
  @scala.inline
  implicit class GetEffectiveTypeRootsHostOps[Self <: GetEffectiveTypeRootsHost] (val x: Self) extends AnyVal {
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
    def setDirectoryExists(value: /* directoryName */ java.lang.String => Boolean): Self = this.set("directoryExists", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDirectoryExists: Self = this.set("directoryExists", js.undefined)
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = this.set("getCurrentDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrentDirectory: Self = this.set("getCurrentDirectory", js.undefined)
  }
  
}

